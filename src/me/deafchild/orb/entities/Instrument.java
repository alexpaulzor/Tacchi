package me.deafchild.orb.entities;

import me.deafchild.orb.Entity;
import me.deafchild.orb.Timecode;

public class Instrument implements Entity, SoundSource {

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addSink(SoundSink s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeSink(SoundSink s) {
		// TODO Auto-generated method stub
		
	}

}
