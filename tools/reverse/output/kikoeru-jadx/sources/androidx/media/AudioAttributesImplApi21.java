package androidx.media;

import android.media.AudioAttributes;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AudioAttributes f835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f836b = -1;

    public final boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f835a.equals(((AudioAttributesImplApi21) obj).f835a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f835a.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f835a;
    }
}
