package j2;

import android.graphics.Outline;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f2 f9814a = new f2();

    public final void a(Outline outline, q1.e0 e0Var) {
        if (!(e0Var instanceof q1.h)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        outline.setPath(((q1.h) e0Var).f17511a);
    }
}
