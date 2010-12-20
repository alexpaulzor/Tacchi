package me.deafchild.orb.entities;

import me.deafchild.orb.Entity;
import me.deafchild.orb.Timecode;

public class Effect implements Entity, SoundSink, SoundSource {

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

	@Override
	public void processAudio(Sample audio, Timecode start) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addSource(SoundSource source) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeSource(SoundSource source) {
		// TODO Auto-generated method stub
		
	}

}
