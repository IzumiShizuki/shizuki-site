package j2;

import android.view.View;
import android.view.translation.ViewTranslationCallback;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements ViewTranslationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g0 f9815a = new g0();

    @Override // android.view.translation.ViewTranslationCallback
    public final boolean onClearTranslation(View view) {
        ic.a aVar;
        jc.l.c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        l1.c contentCaptureManager$ui_release = ((v) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.getClass();
        contentCaptureManager$ui_release.f11680f = l1.a.f11668a;
        o.m mVarD = contentCaptureManager$ui_release.d();
        Object[] objArr = mVarD.f16009c;
        long[] jArr = mVarD.f16007a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        o.k0 k0Var = ((q2.p) objArr[(i10 << 3) + i12]).f17643a.f17639d.f17630a;
                        Object objG = k0Var.g(q2.t.C);
                        if (objG == null) {
                            objG = null;
                        }
                        if (objG != null) {
                            Object objG2 = k0Var.g(q2.j.f17616m);
                            q2.a aVar2 = (q2.a) (objG2 != null ? objG2 : null);
                            if (aVar2 != null && (aVar = (ic.a) aVar2.f17587b) != null) {
                            }
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return true;
                }
            }
            if (i10 == length) {
                return true;
            }
            i10++;
        }
    }

    @Override // android.view.translation.ViewTranslationCallback
    public final boolean onHideTranslation(View view) {
        ic.k kVar;
        jc.l.c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        l1.c contentCaptureManager$ui_release = ((v) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.getClass();
        contentCaptureManager$ui_release.f11680f = l1.a.f11668a;
        o.m mVarD = contentCaptureManager$ui_release.d();
        Object[] objArr = mVarD.f16009c;
        long[] jArr = mVarD.f16007a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        o.k0 k0Var = ((q2.p) objArr[(i10 << 3) + i12]).f17643a.f17639d.f17630a;
                        Object objG = k0Var.g(q2.t.C);
                        if (objG == null) {
                            objG = null;
                        }
                        if (jc.l.a(objG, Boolean.TRUE)) {
                            Object objG2 = k0Var.g(q2.j.f17615l);
                            q2.a aVar = (q2.a) (objG2 != null ? objG2 : null);
                            if (aVar != null && (kVar = (ic.k) aVar.f17587b) != null) {
                            }
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return true;
                }
            }
            if (i10 == length) {
                return true;
            }
            i10++;
        }
    }

    @Override // android.view.translation.ViewTranslationCallback
    public final boolean onShowTranslation(View view) {
        ic.k kVar;
        jc.l.c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        l1.c contentCaptureManager$ui_release = ((v) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.getClass();
        contentCaptureManager$ui_release.f11680f = l1.a.f11669b;
        o.m mVarD = contentCaptureManager$ui_release.d();
        Object[] objArr = mVarD.f16009c;
        long[] jArr = mVarD.f16007a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        o.k0 k0Var = ((q2.p) objArr[(i10 << 3) + i12]).f17643a.f17639d.f17630a;
                        Object objG = k0Var.g(q2.t.C);
                        if (objG == null) {
                            objG = null;
                        }
                        if (jc.l.a(objG, Boolean.FALSE)) {
                            Object objG2 = k0Var.g(q2.j.f17615l);
                            q2.a aVar = (q2.a) (objG2 != null ? objG2 : null);
                            if (aVar != null && (kVar = (ic.k) aVar.f17587b) != null) {
                            }
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return true;
                }
            }
            if (i10 == length) {
                return true;
            }
            i10++;
        }
    }
}
