package s4;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class j extends IOException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f19426b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19427a;

    public j(int i10) {
        this.f19427a = i10;
    }

    public j(Exception exc, int i10) {
        super(exc);
        this.f19427a = i10;
    }

    public j(String str, Exception exc, int i10) {
        super(str, exc);
        this.f19427a = i10;
    }
}
