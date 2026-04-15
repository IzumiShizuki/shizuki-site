package q1;

import android.graphics.PathMeasure;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PathMeasure f17519a;

    public i(PathMeasure pathMeasure) {
        this.f17519a = pathMeasure;
    }

    public final void a(float f10, float f11, h hVar) {
        if (!t0.M(hVar)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        this.f17519a.getSegment(f10, f11, hVar.f17511a, true);
    }
}
