package androidx.media;

import g8.b;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(b bVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f837a = bVar.f(audioAttributesImplBase.f837a, 1);
        audioAttributesImplBase.f838b = bVar.f(audioAttributesImplBase.f838b, 2);
        audioAttributesImplBase.f839c = bVar.f(audioAttributesImplBase.f839c, 3);
        audioAttributesImplBase.f840d = bVar.f(audioAttributesImplBase.f840d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, b bVar) {
        bVar.getClass();
        bVar.j(audioAttributesImplBase.f837a, 1);
        bVar.j(audioAttributesImplBase.f838b, 2);
        bVar.j(audioAttributesImplBase.f839c, 3);
        bVar.j(audioAttributesImplBase.f840d, 4);
    }
}
