package b0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f1260a = 2500;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f1261b = 1500;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f1262c = 50;

    public static final boolean a(boolean z10, a0.w wVar, int i10) {
        if (z10) {
            if (wVar.c() > i10) {
                return true;
            }
            return wVar.c() == i10 && wVar.d() > 0;
        }
        if (wVar.c() < i10) {
            return true;
        }
        return wVar.c() == i10 && wVar.d() < 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x00c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00da A[Catch: j -> 0x01a1, TRY_ENTER, TRY_LEAVE, TryCatch #2 {j -> 0x01a1, blocks: (B:33:0x00bc, B:40:0x00da, B:53:0x0100, B:55:0x0114, B:59:0x0129), top: B:103:0x00bc }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x020a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x017b -> B:109:0x0185). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(a0.w r27, int r28, int r29, f3.c r30, ac.c r31) {
        /*
            Method dump skipped, instruction units count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.h1.b(a0.w, int, int, f3.c, ac.c):java.lang.Object");
    }

    public static final boolean c(a0.w wVar, int i10) {
        return i10 <= wVar.e() && wVar.c() <= i10;
    }
}
