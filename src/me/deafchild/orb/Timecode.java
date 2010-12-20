package me.deafchild.orb;

public class Timecode implements Comparable<Timecode> {
	protected Entity context;
	protected double beats;
	
	public Timecode(Entity context, double beats)
	{
		this.context = context;
		this.beats = beats;
	}
	
	public double getBeats()
	{
		return beats;
	}	
	
	public double getSeconds()
	{
		return context.getTempo() * this.getBeats();
	}
	
	public Entity getContext()
	{
		return context;
	}
	
	public double getSamples()
	{
		return this.beats * 44100;		//TODO: magic number
	}

	@Override
	public int compareTo(Timecode other) {
		return new Double(this.beats).compareTo(new Double(other.beats));
	}
}
