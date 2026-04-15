package d9;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements ic.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5553c;

    public /* synthetic */ b(int i10, String str, String str2) {
        this.f5551a = i10;
        this.f5552b = str;
        this.f5553c = str2;
    }

    @Override // ic.k
    public final Object a(Object obj) throws Exception {
        z7.c cVarD0;
        c9.a aVar;
        c9.b bVar;
        switch (this.f5551a) {
            case 0:
                String str = this.f5552b;
                String str2 = this.f5553c;
                z7.a aVar2 = (z7.a) obj;
                jc.l.e(aVar2, "_connection");
                cVarD0 = aVar2.d0("SELECT * FROM AccountBean WHERE server=(?) AND username=(?)");
                try {
                    cVarD0.v(1, str);
                    cVarD0.v(2, str2);
                    int iJ = vb.w.j(cVarD0, "id");
                    int iJ2 = vb.w.j(cVarD0, "server");
                    int iJ3 = vb.w.j(cVarD0, "username");
                    int iJ4 = vb.w.j(cVarD0, "password");
                    int iJ5 = vb.w.j(cVarD0, "token");
                    int iJ6 = vb.w.j(cVarD0, "timestamp");
                    if (cVarD0.Z()) {
                        aVar = new c9.a((int) cVarD0.getLong(iJ), cVarD0.M(iJ2), cVarD0.M(iJ3), cVarD0.M(iJ4), cVarD0.M(iJ5), cVarD0.getLong(iJ6));
                        break;
                    } else {
                        aVar = null;
                    }
                    return aVar;
                } finally {
                }
            default:
                String str3 = this.f5552b;
                String str4 = this.f5553c;
                z7.a aVar3 = (z7.a) obj;
                jc.l.e(aVar3, "_connection");
                cVarD0 = aVar3.d0("SELECT * FROM BlacklistBean WHERE type=(?) AND value=(?)");
                try {
                    cVarD0.v(1, str3);
                    cVarD0.v(2, str4);
                    int iJ7 = vb.w.j(cVarD0, "id");
                    int iJ8 = vb.w.j(cVarD0, "type");
                    int iJ9 = vb.w.j(cVarD0, "value");
                    if (cVarD0.Z()) {
                        bVar = new c9.b((int) cVarD0.getLong(iJ7), cVarD0.M(iJ8), cVarD0.M(iJ9));
                        break;
                    } else {
                        bVar = null;
                    }
                    return bVar;
                } finally {
                }
        }
    }
}
