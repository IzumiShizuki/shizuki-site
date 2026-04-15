package androidx.media;

import android.media.AudioAttributes;
import g8.b;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(b bVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f835a = (AudioAttributes) bVar.g(audioAttributesImplApi26.f835a, 1);
        audioAttributesImplApi26.f836b = bVar.f(audioAttributesImplApi26.f836b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, b bVar) {
        bVar.getClass();
        bVar.k(audioAttributesImplApi26.f835a, 1);
        bVar.j(audioAttributesImplApi26.f836b, 2);
    }
}
