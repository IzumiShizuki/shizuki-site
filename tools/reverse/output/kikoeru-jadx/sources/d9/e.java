package d9;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements ic.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n7.w f5557b;

    public /* synthetic */ e(n7.w wVar, int i10) {
        this.f5556a = i10;
        this.f5557b = wVar;
    }

    @Override // ic.k
    public final Object a(Object obj) throws Exception {
        z7.c cVarD0;
        switch (this.f5556a) {
            case 0:
                z7.a aVar = (z7.a) obj;
                jc.l.e(aVar, "_connection");
                n7.w wVar = this.f5557b;
                cVarD0 = aVar.d0(wVar.f15586a);
                wVar.f15587b.a(cVarD0);
                try {
                    int iJ = vb.w.j(cVarD0, "id");
                    int iJ2 = vb.w.j(cVarD0, "server");
                    int iJ3 = vb.w.j(cVarD0, "username");
                    int iJ4 = vb.w.j(cVarD0, "password");
                    int iJ5 = vb.w.j(cVarD0, "token");
                    int iJ6 = vb.w.j(cVarD0, "timestamp");
                    ArrayList arrayList = new ArrayList();
                    while (cVarD0.Z()) {
                        arrayList.add(new c9.a((int) cVarD0.getLong(iJ), cVarD0.M(iJ2), cVarD0.M(iJ3), cVarD0.M(iJ4), cVarD0.M(iJ5), cVarD0.getLong(iJ6)));
                        break;
                    }
                    return arrayList;
                } finally {
                }
            case 1:
                z7.a aVar2 = (z7.a) obj;
                jc.l.e(aVar2, "_connection");
                n7.w wVar2 = this.f5557b;
                cVarD0 = aVar2.d0(wVar2.f15586a);
                wVar2.f15587b.a(cVarD0);
                try {
                    int iJ7 = vb.w.j(cVarD0, "id");
                    int iJ8 = vb.w.j(cVarD0, "type");
                    int iJ9 = vb.w.j(cVarD0, "value");
                    ArrayList arrayList2 = new ArrayList();
                    while (cVarD0.Z()) {
                        arrayList2.add(new c9.b((int) cVarD0.getLong(iJ7), cVarD0.M(iJ8), cVarD0.M(iJ9)));
                        break;
                    }
                    return arrayList2;
                } finally {
                }
            case 2:
                z7.a aVar3 = (z7.a) obj;
                jc.l.e(aVar3, "_connection");
                n7.w wVar3 = this.f5557b;
                cVarD0 = aVar3.d0(wVar3.f15586a);
                wVar3.f15587b.a(cVarD0);
                try {
                    int iJ10 = vb.w.j(cVarD0, "id");
                    int iJ11 = vb.w.j(cVarD0, "timestamp");
                    int iJ12 = vb.w.j(cVarD0, "rj");
                    int iJ13 = vb.w.j(cVarD0, "sourceId");
                    int iJ14 = vb.w.j(cVarD0, "releaseTime");
                    int iJ15 = vb.w.j(cVarD0, "tags");
                    int iJ16 = vb.w.j(cVarD0, "vas");
                    int iJ17 = vb.w.j(cVarD0, "circle");
                    int iJ18 = vb.w.j(cVarD0, "nsfw");
                    int iJ19 = vb.w.j(cVarD0, "has_subtitle");
                    int iJ20 = vb.w.j(cVarD0, "icon");
                    int iJ21 = vb.w.j(cVarD0, "name");
                    int iJ22 = vb.w.j(cVarD0, "workJson");
                    ArrayList arrayList3 = new ArrayList();
                    while (cVarD0.Z()) {
                        int i10 = iJ22;
                        ArrayList arrayList4 = arrayList3;
                        int i11 = iJ12;
                        int i12 = iJ13;
                        arrayList3 = arrayList4;
                        arrayList3.add(new c9.c((int) cVarD0.getLong(iJ10), cVarD0.getLong(iJ11), cVarD0.getLong(iJ12), cVarD0.M(iJ13), cVarD0.M(iJ14), cVarD0.M(iJ15), cVarD0.M(iJ16), cVarD0.M(iJ17), ((int) cVarD0.getLong(iJ18)) != 0, ((int) cVarD0.getLong(iJ19)) != 0, cVarD0.M(iJ20), cVarD0.M(iJ21), cVarD0.M(i10)));
                        iJ22 = i10;
                        iJ12 = i11;
                        iJ13 = i12;
                        break;
                    }
                    return arrayList3;
                } finally {
                }
            case 3:
                z7.a aVar4 = (z7.a) obj;
                jc.l.e(aVar4, "_connection");
                n7.w wVar4 = this.f5557b;
                cVarD0 = aVar4.d0(wVar4.f15586a);
                wVar4.f15587b.a(cVarD0);
                try {
                    int iJ23 = vb.w.j(cVarD0, "id");
                    int iJ24 = vb.w.j(cVarD0, "timestamp");
                    int iJ25 = vb.w.j(cVarD0, "rj");
                    int iJ26 = vb.w.j(cVarD0, "sourceId");
                    int iJ27 = vb.w.j(cVarD0, "releaseTime");
                    int iJ28 = vb.w.j(cVarD0, "tags");
                    int iJ29 = vb.w.j(cVarD0, "vas");
                    int iJ30 = vb.w.j(cVarD0, "circle");
                    int iJ31 = vb.w.j(cVarD0, "nsfw");
                    int iJ32 = vb.w.j(cVarD0, "has_subtitle");
                    int iJ33 = vb.w.j(cVarD0, "icon");
                    int iJ34 = vb.w.j(cVarD0, "name");
                    int iJ35 = vb.w.j(cVarD0, "workJson");
                    ArrayList arrayList5 = new ArrayList();
                    while (cVarD0.Z()) {
                        int i13 = iJ35;
                        ArrayList arrayList6 = arrayList5;
                        int i14 = iJ25;
                        int i15 = iJ26;
                        arrayList5 = arrayList6;
                        arrayList5.add(new c9.d((int) cVarD0.getLong(iJ23), cVarD0.getLong(iJ24), cVarD0.getLong(iJ25), cVarD0.M(iJ26), cVarD0.M(iJ27), cVarD0.M(iJ28), cVarD0.M(iJ29), cVarD0.M(iJ30), ((int) cVarD0.getLong(iJ31)) != 0, ((int) cVarD0.getLong(iJ32)) != 0, cVarD0.M(iJ33), cVarD0.M(iJ34), cVarD0.M(i13)));
                        iJ35 = i13;
                        iJ25 = i14;
                        iJ26 = i15;
                        break;
                    }
                    return arrayList5;
                } finally {
                }
            case 4:
                z7.a aVar5 = (z7.a) obj;
                jc.l.e(aVar5, "_connection");
                n7.w wVar5 = this.f5557b;
                cVarD0 = aVar5.d0(wVar5.f15586a);
                wVar5.f15587b.a(cVarD0);
                try {
                    ArrayList arrayList7 = new ArrayList();
                    while (cVarD0.Z()) {
                        arrayList7.add(cVarD0.M(0));
                        break;
                    }
                    return arrayList7;
                } finally {
                }
            default:
                z7.c cVar = (z7.c) obj;
                this.f5557b.f15587b.a(cVar);
                return Integer.valueOf(cVar.Z() ? cVar.V() : 0);
        }
    }
}
