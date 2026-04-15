package a2;

import android.view.KeyEvent;
import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KeyEvent f188a;

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return l.a(this.f188a, ((b) obj).f188a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f188a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.f188a + ')';
    }
}
