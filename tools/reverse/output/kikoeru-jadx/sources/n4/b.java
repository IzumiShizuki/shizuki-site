package n4;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;
import p4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AudioManager.OnAudioFocusChangeListener f15257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f15258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m4.d f15259d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f15260e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f15261f;

    public b(int i10, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, m4.d dVar, boolean z10) {
        this.f15256a = i10;
        this.f15258c = handler;
        this.f15259d = dVar;
        this.f15260e = z10;
        int i11 = c0.f16548a;
        if (i11 >= 26 || handler.getLooper() == Looper.getMainLooper()) {
            this.f15257b = onAudioFocusChangeListener;
        } else {
            this.f15257b = new a(onAudioFocusChangeListener, handler);
        }
        if (i11 >= 26) {
            this.f15261f = k1.g.d(i10).setAudioAttributes((AudioAttributes) dVar.b().f14586a).setWillPauseWhenDucked(z10).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
        } else {
            this.f15261f = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f15256a == bVar.f15256a && this.f15260e == bVar.f15260e && Objects.equals(this.f15257b, bVar.f15257b) && Objects.equals(this.f15258c, bVar.f15258c) && Objects.equals(this.f15259d, bVar.f15259d);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f15256a), this.f15257b, this.f15258c, this.f15259d, Boolean.valueOf(this.f15260e));
    }
}
