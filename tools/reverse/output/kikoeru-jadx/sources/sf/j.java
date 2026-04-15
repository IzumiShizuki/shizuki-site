package sf;

import java.util.List;
import pc.v;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f20025b;

    public /* synthetic */ j(int i10, List list) {
        this.f20024a = i10;
        this.f20025b = list;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f20024a) {
            case 0:
                return ((v) this.f20025b.get(0)).c();
            case 1:
                return ((v) this.f20025b.get(0)).c();
            default:
                return this.f20025b;
        }
    }
}
