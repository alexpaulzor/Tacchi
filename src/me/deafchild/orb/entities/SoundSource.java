package me.deafchild.orb.entities;

import me.deafchild.orb.Timecode;

public interface SoundSource {
	public Sample[] getAudio(Timecode start, Timecode end);
	public void addSink(SoundSink s);
	public void removeSink(SoundSink s);
}
