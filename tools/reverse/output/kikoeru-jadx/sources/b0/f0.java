package b0;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ah.j f1239b;

    public /* synthetic */ f0(ah.j jVar, int i10) {
        this.f1238a = i10;
        this.f1239b = jVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f1238a) {
            case 0:
                Object key = ((r0) obj).getKey();
                ah.j jVar = this.f1239b;
                return ud.b.j(Integer.valueOf(jVar.s(key)), Integer.valueOf(jVar.s(((r0) obj2).getKey())));
            case 1:
                Object key2 = ((r0) obj).getKey();
                ah.j jVar2 = this.f1239b;
                return ud.b.j(Integer.valueOf(jVar2.s(key2)), Integer.valueOf(jVar2.s(((r0) obj2).getKey())));
            case 2:
                Object key3 = ((r0) obj2).getKey();
                ah.j jVar3 = this.f1239b;
                return ud.b.j(Integer.valueOf(jVar3.s(key3)), Integer.valueOf(jVar3.s(((r0) obj).getKey())));
            default:
                Object key4 = ((r0) obj2).getKey();
                ah.j jVar4 = this.f1239b;
                return ud.b.j(Integer.valueOf(jVar4.s(key4)), Integer.valueOf(jVar4.s(((r0) obj).getKey())));
        }
    }
}
