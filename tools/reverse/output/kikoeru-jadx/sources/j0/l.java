package j0;

import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import android.view.inputmethod.InputMethodManager;
import b0.d0;
import j2.l2;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f9610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f9611b;

    public l(View view) {
        this.f9611b = view;
        this.f9610a = ub.a.c(ub.i.f21541b, new d0(17, this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ub.h] */
    public InputMethodManager a() {
        return (InputMethodManager) this.f9610a.getValue();
    }

    public AutofillId b(long j10) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession contentCaptureSessionG = l2.g(this.f9610a);
        b1.e eVarK = a2.c.K(this.f9611b);
        Objects.requireNonNull(eVarK);
        return m2.a.b(contentCaptureSessionG, k1.g.k(eVarK.f1425a), j10);
    }

    public l(ContentCaptureSession contentCaptureSession, View view) {
        this.f9610a = contentCaptureSession;
        this.f9611b = view;
    }
}
