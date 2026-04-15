package ea;

import ac.i;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import c7.p;
import ic.k;
import ic.n;
import j2.k3;
import java.io.Serializable;
import jc.y;
import m0.v3;
import n8.g;
import s.v0;
import s.y0;
import s8.m;
import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f extends i implements n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6438e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6439f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f6440g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f6441h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f6442i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f6443j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f6444k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f6445l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f6446m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ContentResolver contentResolver, Uri uri, k3 k3Var, kf.f fVar, Context context, yb.c cVar) {
        super(2, cVar);
        this.f6438e = 1;
        this.f6443j = contentResolver;
        this.f6444k = uri;
        this.f6445l = k3Var;
        this.f6446m = fVar;
        this.f6441h = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object x(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ea.f.x(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [ac.i, ic.k] */
    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f6438e) {
            case 0:
                f fVar = new f((Context) this.f6441h, (String) this.f6445l, (String) this.f6446m, cVar, 0);
                fVar.f6444k = obj;
                return fVar;
            case 1:
                f fVar2 = new f((ContentResolver) this.f6443j, (Uri) this.f6444k, (k3) this.f6445l, (kf.f) this.f6446m, (Context) this.f6441h, cVar);
                fVar2.f6440g = obj;
                return fVar2;
            case 2:
                f fVar3 = new f((v0) this.f6441h, (v3) this.f6445l, (i) this.f6446m, cVar);
                fVar3.f6443j = obj;
                return fVar3;
            case 3:
                return new f((g) this.f6442i, (y) this.f6443j, (y) this.f6444k, (s8.i) this.f6441h, this.f6440g, (y) this.f6445l, (h8.c) this.f6446m, cVar);
            case 4:
                return new f((g) this.f6442i, (s8.i) this.f6443j, this.f6440g, (m) this.f6444k, (h8.c) this.f6441h, (q8.b) this.f6445l, (p) this.f6446m, cVar);
            case 5:
                f fVar4 = new f((v0) this.f6441h, (y0) this.f6445l, (t0.i) this.f6446m, cVar, 5);
                fVar4.f6443j = obj;
                return fVar4;
            default:
                f fVar5 = new f((ic.a) this.f6446m, cVar);
                fVar5.f6443j = obj;
                return fVar5;
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) throws Throwable {
        switch (this.f6438e) {
            case 0:
                return ((f) o((hf.y) obj, (yb.c) obj2)).u(a0.f21526a);
            case 1:
                return ((f) o((lf.g) obj, (yb.c) obj2)).u(a0.f21526a);
            case 2:
                return ((f) o((hf.y) obj, (yb.c) obj2)).u(a0.f21526a);
            case 3:
                return ((f) o((hf.y) obj, (yb.c) obj2)).u(a0.f21526a);
            case 4:
                return ((f) o((hf.y) obj, (yb.c) obj2)).u(a0.f21526a);
            case 5:
                return ((f) o((hf.y) obj, (yb.c) obj2)).u(a0.f21526a);
            default:
                ((f) o((lf.g) obj, (yb.c) obj2)).u(a0.f21526a);
                return zb.a.f26667a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:314:0x01ba, code lost:
    
        r6 = r18;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:47:0x0122, B:59:0x0154], limit reached: 329 */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d5 A[LOOP:0: B:40:0x00fd->B:100:0x01d5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x046d A[Catch: all -> 0x0421, TRY_LEAVE, TryCatch #0 {all -> 0x0421, blocks: (B:229:0x041b, B:240:0x0453, B:244:0x0465, B:246:0x046d, B:236:0x0434, B:239:0x044a), top: B:284:0x040d }] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x00ff A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x017c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:346:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c1  */
    /* JADX WARN: Type inference failed for: r2v25, types: [int, rf.a] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int, rf.a] */
    /* JADX WARN: Type inference failed for: r8v19, types: [ic.k] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:249:0x0492 -> B:240:0x0453). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x01b9 -> B:87:0x01ba). Please report as a decompilation issue!!! */
    @Override // ac.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.Object r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ea.f.u(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ic.a aVar, yb.c cVar) {
        super(2, cVar);
        this.f6438e = 6;
        this.f6446m = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, Object obj2, Serializable serializable, yb.c cVar, int i10) {
        super(2, cVar);
        this.f6438e = i10;
        this.f6441h = obj;
        this.f6445l = obj2;
        this.f6446m = serializable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, y yVar, y yVar2, s8.i iVar, Object obj, y yVar3, h8.c cVar, yb.c cVar2) {
        super(2, cVar2);
        this.f6438e = 3;
        this.f6442i = gVar;
        this.f6443j = yVar;
        this.f6444k = yVar2;
        this.f6441h = iVar;
        this.f6440g = obj;
        this.f6445l = yVar3;
        this.f6446m = cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, s8.i iVar, Object obj, m mVar, h8.c cVar, q8.b bVar, p pVar, yb.c cVar2) {
        super(2, cVar2);
        this.f6438e = 4;
        this.f6442i = gVar;
        this.f6443j = iVar;
        this.f6440g = obj;
        this.f6444k = mVar;
        this.f6441h = cVar;
        this.f6445l = bVar;
        this.f6446m = pVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(v0 v0Var, v3 v3Var, k kVar, yb.c cVar) {
        super(2, cVar);
        this.f6438e = 2;
        this.f6441h = v0Var;
        this.f6445l = v3Var;
        this.f6446m = (i) kVar;
    }
}
