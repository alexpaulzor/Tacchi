package me.deafchild.orb.entities;

import me.deafchild.orb.Timecode;

public interface SoundSink {
	public void processAudio(Sample audio, Timecode start);
	public void addSource(SoundSource source);
	public void removeSource(SoundSource source);
}
