package h8;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import ch.l;
import hf.a0;
import hf.l0;
import hf.t1;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import m0.w;
import nf.n;
import ub.k;
import ub.p;
import ud.s;
import ug.t;
import vb.m;
import x8.i;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s8.c f8226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f8227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x8.g f8228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final nf.d f8229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w f8230f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f8231g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f8232h;

    public h(Context context, s8.c cVar, p pVar, p pVar2, p pVar3, b bVar, x8.g gVar) {
        this.f8225a = context;
        this.f8226b = cVar;
        this.f8227c = pVar;
        this.f8228d = gVar;
        t1 t1VarE = a0.e();
        pf.e eVar = l0.f8566a;
        this.f8229e = a0.b(ud.b.C(t1VarE, n.f15850a.f10872f).G(new g(this)));
        i iVar = new i(this);
        w wVar = new w(this, iVar);
        this.f8230f = wVar;
        l lVar = new l(bVar);
        lVar.n(new p8.a(2), t.class);
        int i10 = 5;
        lVar.n(new p8.a(i10), String.class);
        lVar.n(new p8.a(1), Uri.class);
        int i11 = 4;
        lVar.n(new p8.a(i11), Uri.class);
        int i12 = 3;
        lVar.n(new p8.a(i12), Integer.class);
        int i13 = 0;
        lVar.n(new p8.a(i13), byte[].class);
        o8.c cVar2 = new o8.c();
        ArrayList arrayList = (ArrayList) lVar.f4203d;
        arrayList.add(new k(cVar2, Uri.class));
        arrayList.add(new k(new o8.a(gVar.f24846a), File.class));
        lVar.m(new m8.i(pVar3, pVar2, gVar.f24848c), Uri.class);
        lVar.m(new m8.a(i10), File.class);
        lVar.m(new m8.a(i13), Uri.class);
        lVar.m(new m8.a(i12), Uri.class);
        lVar.m(new m8.a(6), Uri.class);
        lVar.m(new m8.a(i11), Drawable.class);
        lVar.m(new m8.a(1), Bitmap.class);
        lVar.m(new m8.a(2), ByteBuffer.class);
        j8.c cVar3 = new j8.c(gVar.f24849d, gVar.f24850e);
        ArrayList arrayList2 = (ArrayList) lVar.f4205f;
        arrayList2.add(cVar3);
        List listZ = s.z((ArrayList) lVar.f4201b);
        this.f8231g = new b(listZ, s.z((ArrayList) lVar.f4202c), s.z(arrayList), s.z((ArrayList) lVar.f4204e), s.z(arrayList2));
        this.f8232h = m.r0(listZ, new n8.g(this, iVar, wVar));
        new AtomicBoolean(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bb, code lost:
    
        if (ud.b.d(r0, r2) == r8) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ce A[Catch: all -> 0x00d2, TryCatch #0 {all -> 0x00d2, blocks: (B:42:0x00c4, B:44:0x00ce, B:47:0x00d6, B:49:0x00e7, B:50:0x00ea), top: B:96:0x00c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e7 A[Catch: all -> 0x00d2, TryCatch #0 {all -> 0x00d2, blocks: (B:42:0x00c4, B:44:0x00ce, B:47:0x00d6, B:49:0x00e7, B:50:0x00ea), top: B:96:0x00c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0136 A[Catch: all -> 0x0162, TryCatch #1 {all -> 0x0162, blocks: (B:60:0x0130, B:62:0x0136, B:69:0x0158, B:65:0x0145, B:68:0x0152, B:74:0x0164, B:76:0x0168, B:79:0x0179, B:80:0x017e), top: B:98:0x0130 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0164 A[Catch: all -> 0x0162, TryCatch #1 {all -> 0x0162, blocks: (B:60:0x0130, B:62:0x0136, B:69:0x0158, B:65:0x0145, B:68:0x0152, B:74:0x0164, B:76:0x0168, B:79:0x0179, B:80:0x017e), top: B:98:0x0130 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0194 A[Catch: all -> 0x01a3, TryCatch #3 {all -> 0x01a3, blocks: (B:87:0x0190, B:89:0x0194, B:92:0x01a5, B:93:0x01ae), top: B:101:0x0190 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a5 A[Catch: all -> 0x01a3, TryCatch #3 {all -> 0x01a3, blocks: (B:87:0x0190, B:89:0x0194, B:92:0x01a5, B:93:0x01ae), top: B:101:0x0190 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(h8.h r20, s8.i r21, int r22, ac.c r23) {
        /*
            Method dump skipped, instruction units count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h8.h.a(h8.h, s8.i, int, ac.c):java.lang.Object");
    }

    public static void c(s8.e eVar, u8.a aVar, c cVar) {
        s8.i iVar = eVar.f19585b;
        if (aVar instanceof i8.m) {
            w8.f fVarA = iVar.f19620g.a((i8.m) aVar, eVar);
            if (!(fVarA instanceof w8.d)) {
                cVar.getClass();
                fVarA.a();
            }
        }
        cVar.getClass();
        iVar.getClass();
    }

    public final Object b(s8.i iVar, ac.c cVar) {
        pf.e eVar = l0.f8566a;
        return a0.H(n.f15850a.f10872f, new e(this, iVar, null, 1), cVar);
    }
}
