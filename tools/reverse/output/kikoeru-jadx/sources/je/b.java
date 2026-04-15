package je;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10845a;

    public b(String str) {
        if (str != null) {
            this.f10845a = str;
        } else {
            a(7);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(int r9) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: je.b.a(int):void");
    }

    public static b b(be.c cVar) {
        if (cVar != null) {
            return new b(cVar.f2744a.f2747a.replace('.', '/'));
        }
        a(4);
        throw null;
    }

    public static b c(String str) {
        if (str != null) {
            return new b(str);
        }
        a(0);
        throw null;
    }

    public static String e(be.b bVar) {
        be.c cVar = bVar.f2740a;
        String strReplace = bVar.f2741b.f2744a.f2747a.replace('.', '$');
        if (!cVar.f2744a.c()) {
            strReplace = cVar.f2744a.f2747a.replace('.', '/') + "/" + strReplace;
        }
        if (strReplace != null) {
            return strReplace;
        }
        a(3);
        throw null;
    }

    public final String d() {
        String str = this.f10845a;
        if (str != null) {
            return str;
        }
        a(10);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        return this.f10845a.equals(((b) obj).f10845a);
    }

    public final int hashCode() {
        return this.f10845a.hashCode();
    }

    public final String toString() {
        return this.f10845a;
    }
}
