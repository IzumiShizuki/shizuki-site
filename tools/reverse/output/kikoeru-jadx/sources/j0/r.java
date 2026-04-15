package j0;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import h0.i0;
import h0.r1;
import h0.u0;
import i7.p2;
import j2.z2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import l0.l1;
import pc.f0;
import t2.h0;
import t2.k0;
import y2.v;
import y2.w;
import y2.x;
import y2.y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r implements InputConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p2 f9648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u0 f9650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l1 f9651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z2 f9652e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9653f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public y f9654g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f9655h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f9656i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f9657j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f9658k = true;

    public r(y yVar, p2 p2Var, boolean z10, u0 u0Var, l1 l1Var, z2 z2Var) {
        this.f9648a = p2Var;
        this.f9649b = z10;
        this.f9650c = u0Var;
        this.f9651d = l1Var;
        this.f9652e = z2Var;
        this.f9654g = yVar;
    }

    public final void a(y2.g gVar) {
        this.f9653f++;
        try {
            this.f9657j.add(gVar);
        } finally {
            b();
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [ic.k, jc.m] */
    public final boolean b() {
        int i10 = this.f9653f - 1;
        this.f9653f = i10;
        if (i10 == 0) {
            ArrayList arrayList = this.f9657j;
            if (!arrayList.isEmpty()) {
                ((q) this.f9648a.f9258a).f9637c.a(vb.m.H0(arrayList));
                arrayList.clear();
            }
        }
        return this.f9653f > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z10 = this.f9658k;
        if (!z10) {
            return z10;
        }
        this.f9653f++;
        return true;
    }

    public final void c(int i10) {
        sendKeyEvent(new KeyEvent(0, i10));
        sendKeyEvent(new KeyEvent(1, i10));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i10) {
        boolean z10 = this.f9658k;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f9657j.clear();
        this.f9653f = 0;
        this.f9658k = false;
        ArrayList arrayList = ((q) this.f9648a.f9258a).f9644j;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (jc.l.a(((WeakReference) arrayList.get(i10)).get(), this)) {
                arrayList.remove(i10);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z10 = this.f9658k;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        boolean z10 = this.f9658k;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z10 = this.f9658k;
        return z10 ? this.f9649b : z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i10) {
        boolean z10 = this.f9658k;
        if (z10) {
            a(new y2.a(i10, String.valueOf(charSequence)));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i10, int i11) {
        boolean z10 = this.f9658k;
        if (!z10) {
            return z10;
        }
        a(new y2.e(i10, i11));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        boolean z10 = this.f9658k;
        if (!z10) {
            return z10;
        }
        a(new y2.f(i10, i11));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return b();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z10 = this.f9658k;
        if (!z10) {
            return z10;
        }
        a(new y2.h());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i10) {
        y yVar = this.f9654g;
        return TextUtils.getCapsMode(yVar.f25434a.f20320b, k0.e(yVar.f25435b), i10);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i10) {
        boolean z10 = (i10 & 1) != 0;
        this.f9656i = z10;
        if (z10) {
            this.f9655h = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return a2.c.v(this.f9654g);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i10) {
        if (k0.b(this.f9654g.f25435b)) {
            return null;
        }
        return ud.e.z(this.f9654g).f20320b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i10, int i11) {
        return ud.e.A(this.f9654g, i10).f20320b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i10, int i11) {
        return ud.e.B(this.f9654g, i10).f20320b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i10) {
        boolean z10 = this.f9658k;
        if (z10) {
            z10 = false;
            switch (i10) {
                case R.id.selectAll:
                    a(new x(0, this.f9654g.f25434a.f20320b.length()));
                    break;
                case R.id.cut:
                    c(277);
                    return false;
                case R.id.copy:
                    c(278);
                    return false;
                case R.id.paste:
                    c(279);
                    return false;
                default:
                    return false;
            }
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i10) {
        int i11;
        boolean z10 = this.f9658k;
        if (z10) {
            z10 = true;
            if (i10 != 0) {
                switch (i10) {
                    case 2:
                        i11 = 2;
                        break;
                    case 3:
                        i11 = 3;
                        break;
                    case 4:
                        i11 = 4;
                        break;
                    case 5:
                        i11 = 6;
                        break;
                    case 6:
                        i11 = 7;
                        break;
                    case 7:
                        i11 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i10);
                        i11 = 1;
                        break;
                }
                ((q) this.f9648a.f9258a).f9638d.a(new y2.i(i11));
            } else {
                i11 = 1;
                ((q) this.f9648a.f9258a).f9638d.a(new y2.i(i11));
            }
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x02c8  */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void performHandwritingGesture(android.view.inputmethod.HandwritingGesture r20, java.util.concurrent.Executor r21, java.util.function.IntConsumer r22) {
        /*
            Method dump skipped, instruction units count: 943
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.r.performHandwritingGesture(android.view.inputmethod.HandwritingGesture, java.util.concurrent.Executor, java.util.function.IntConsumer):void");
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z10 = this.f9658k;
        if (z10) {
            return true;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        u0 u0Var;
        t2.g gVar;
        h0 h0Var;
        if (Build.VERSION.SDK_INT >= 34 && (u0Var = this.f9650c) != null && (gVar = u0Var.f7866j) != null) {
            r1 r1VarD = u0Var.d();
            if (gVar.equals((r1VarD == null || (h0Var = r1VarD.f7827a.f20344a) == null) ? null : h0Var.f20326a)) {
                boolean zT = g.t(previewableHandwritingGesture);
                i0 i0Var = i0.f7679a;
                l1 l1Var = this.f9651d;
                if (zT) {
                    SelectGesture selectGestureN = g.n(previewableHandwritingGesture);
                    if (l1Var != null) {
                        long jE = f0.E(u0Var, q1.h0.E(selectGestureN.getSelectionArea()), selectGestureN.getGranularity() != 1 ? 0 : 1);
                        u0 u0Var2 = l1Var.f11528d;
                        if (u0Var2 != null) {
                            u0Var2.f(jE);
                        }
                        u0 u0Var3 = l1Var.f11528d;
                        if (u0Var3 != null) {
                            u0Var3.e(k0.f20356b);
                        }
                        if (!k0.b(jE)) {
                            l1Var.q(false);
                            l1Var.o(i0Var);
                        }
                    }
                } else if (i.o(previewableHandwritingGesture)) {
                    DeleteGesture deleteGestureI = i.i(previewableHandwritingGesture);
                    if (l1Var != null) {
                        long jE2 = f0.E(u0Var, q1.h0.E(deleteGestureI.getDeletionArea()), deleteGestureI.getGranularity() != 1 ? 0 : 1);
                        u0 u0Var4 = l1Var.f11528d;
                        if (u0Var4 != null) {
                            u0Var4.e(jE2);
                        }
                        u0 u0Var5 = l1Var.f11528d;
                        if (u0Var5 != null) {
                            u0Var5.f(k0.f20356b);
                        }
                        if (!k0.b(jE2)) {
                            l1Var.q(false);
                            l1Var.o(i0Var);
                        }
                    }
                } else if (i.t(previewableHandwritingGesture)) {
                    SelectRangeGesture selectRangeGestureK = i.k(previewableHandwritingGesture);
                    if (l1Var != null) {
                        long jG = f0.g(u0Var, q1.h0.E(selectRangeGestureK.getSelectionStartArea()), q1.h0.E(selectRangeGestureK.getSelectionEndArea()), selectRangeGestureK.getGranularity() != 1 ? 0 : 1);
                        u0 u0Var6 = l1Var.f11528d;
                        if (u0Var6 != null) {
                            u0Var6.f(jG);
                        }
                        u0 u0Var7 = l1Var.f11528d;
                        if (u0Var7 != null) {
                            u0Var7.e(k0.f20356b);
                        }
                        if (!k0.b(jG)) {
                            l1Var.q(false);
                            l1Var.o(i0Var);
                        }
                    }
                } else if (i.u(previewableHandwritingGesture)) {
                    DeleteRangeGesture deleteRangeGestureJ = i.j(previewableHandwritingGesture);
                    if (l1Var != null) {
                        long jG2 = f0.g(u0Var, q1.h0.E(deleteRangeGestureJ.getDeletionStartArea()), q1.h0.E(deleteRangeGestureJ.getDeletionEndArea()), deleteRangeGestureJ.getGranularity() != 1 ? 0 : 1);
                        u0 u0Var8 = l1Var.f11528d;
                        if (u0Var8 != null) {
                            u0Var8.e(jG2);
                        }
                        u0 u0Var9 = l1Var.f11528d;
                        if (u0Var9 != null) {
                            u0Var9.f(k0.f20356b);
                        }
                        if (!k0.b(jG2)) {
                            l1Var.q(false);
                            l1Var.o(i0Var);
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new j(0, l1Var));
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z10) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean requestCursorUpdates(int r10) {
        /*
            r9 = this;
            boolean r0 = r9.f9658k
            if (r0 == 0) goto L75
            r0 = r10 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            r3 = r10 & 2
            if (r3 == 0) goto L13
            r3 = 1
            goto L14
        L13:
            r3 = 0
        L14:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 33
            if (r4 < r5) goto L4c
            r5 = r10 & 16
            if (r5 == 0) goto L20
            r5 = 1
            goto L21
        L20:
            r5 = 0
        L21:
            r6 = r10 & 8
            if (r6 == 0) goto L27
            r6 = 1
            goto L28
        L27:
            r6 = 0
        L28:
            r7 = r10 & 4
            if (r7 == 0) goto L2e
            r7 = 1
            goto L2f
        L2e:
            r7 = 0
        L2f:
            r8 = 34
            if (r4 < r8) goto L38
            r10 = r10 & 32
            if (r10 == 0) goto L38
            r1 = 1
        L38:
            if (r5 != 0) goto L49
            if (r6 != 0) goto L49
            if (r7 != 0) goto L49
            if (r1 != 0) goto L49
            if (r4 < r8) goto L47
            r10 = 1
        L43:
            r1 = 1
        L44:
            r5 = 1
            r6 = 1
            goto L4e
        L47:
            r10 = r1
            goto L43
        L49:
            r10 = r1
            r1 = r7
            goto L4e
        L4c:
            r10 = 0
            goto L44
        L4e:
            i7.p2 r4 = r9.f9648a
            java.lang.Object r4 = r4.f9258a
            j0.q r4 = (j0.q) r4
            j0.n r4 = r4.f9647m
            java.lang.Object r7 = r4.f9618c
            monitor-enter(r7)
            r4.f9621f = r5     // Catch: java.lang.Throwable -> L6d
            r4.f9622g = r6     // Catch: java.lang.Throwable -> L6d
            r4.f9623h = r1     // Catch: java.lang.Throwable -> L6d
            r4.f9624i = r10     // Catch: java.lang.Throwable -> L6d
            if (r0 == 0) goto L6f
            r4.f9620e = r2     // Catch: java.lang.Throwable -> L6d
            y2.y r10 = r4.f9625j     // Catch: java.lang.Throwable -> L6d
            if (r10 == 0) goto L6f
            r4.a()     // Catch: java.lang.Throwable -> L6d
            goto L6f
        L6d:
            r10 = move-exception
            goto L73
        L6f:
            r4.f9619d = r3     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r7)
            return r2
        L73:
            monitor-exit(r7)
            throw r10
        L75:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.r.requestCursorUpdates(int):boolean");
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ub.h] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z10 = this.f9658k;
        if (!z10) {
            return z10;
        }
        ((BaseInputConnection) ((q) this.f9648a.f9258a).f9645k.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i10, int i11) {
        boolean z10 = this.f9658k;
        if (z10) {
            a(new v(i10, i11));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i10) {
        boolean z10 = this.f9658k;
        if (z10) {
            a(new w(i10, String.valueOf(charSequence)));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i10, int i11) {
        boolean z10 = this.f9658k;
        if (!z10) {
            return z10;
        }
        a(new x(i10, i11));
        return true;
    }
}
