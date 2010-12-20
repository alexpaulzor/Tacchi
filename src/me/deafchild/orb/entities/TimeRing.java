package me.deafchild.orb.entities;

import java.util.List;
import java.util.Set;

import me.deafchild.orb.Entity;
import me.deafchild.orb.Timecode;

public class TimeRing implements Entity, SoundSource {
	protected List<EntityEntry> entities;
	protected Set<SoundSink> sinks;
	protected Timecode length;
	
	public TimeRing(Timecode length)
	{
		this.length = length;
	}
	
	public void resize(Timecode newlength)
	{
		
	}
	
	public void simplify()
	{
		
	}
	
	public void add(Entity e, Timecode startPosition)
	{
		entities.add(new EntityEntry(e, startPosition));
	}
	
	public void remove(Entity entity)
	{
		EntityEntry entryToRemove = null;
		for (EntityEntry entry : entities)
		{
			if (entry.entity.equals(entity))
			{
				entryToRemove = entry;
				break;
			}
		}
		if (entryToRemove != null)
		{
			entities.remove(entryToRemove);
		}
	}
	
	protected class EntityEntry
	{
		public Entity entity;
		public Timecode start;
		public Timecode duration;
		
		public EntityEntry(Entity entity, Timecode start, Timecode duration)
		{
			this.entity = entity;
			this.start = start;
			this.duration = duration;
		}
		
		public EntityEntry(Entity entity, Timecode start)
		{
			this(entity, start, entity.getDuration());
		}
	}

	@Override
	public double getTempo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Timecode getDuration() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Sample[] getAudio(Timecode start, Timecode end) {
		Sample[] samples = new Sample[(int) (end.getSamples() - start.getSamples())];
		
		for (EntityEntry e : entities)
		{
			if (e.start.compareTo(end) <= 0)
			{
				for (int i = 0; i < samples.length; i++)
				{
					//TODO: finish
				}
			}
		}
		
		return samples;
	}

	@Override
	public void addSink(SoundSink s) {
		sinks.add(s);
	}

	@Override
	public void removeSink(SoundSink s) {
		sinks.remove(s);
	}
}
