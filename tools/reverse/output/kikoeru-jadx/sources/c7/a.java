package c7;

import android.media.AudioAttributes;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AudioAttributes f3579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3580b = -1;

    public a(AudioAttributes audioAttributes, int i10) {
        this.f3579a = audioAttributes;
    }

    public final int a() {
        AudioAttributes audioAttributes = this.f3579a;
        audioAttributes.getClass();
        return audioAttributes.getFlags();
    }

    public final int b() {
        AudioAttributes audioAttributes = this.f3579a;
        audioAttributes.getClass();
        return audioAttributes.getUsage();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return Objects.equals(this.f3579a, ((a) obj).f3579a);
        }
        return false;
    }

    public final int hashCode() {
        AudioAttributes audioAttributes = this.f3579a;
        audioAttributes.getClass();
        return audioAttributes.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f3579a;
    }
}
