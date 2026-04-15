package i7;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l2 extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p2 f9197a;

    public l2(p2 p2Var) {
        super("Cancelled isolated runner");
        this.f9197a = p2Var;
    }
}
