package k1;

import android.graphics.Rect;
import android.view.autofill.AutofillId;
import i7.p2;
import j2.h0;
import j2.v;
import o.z;
import q2.q;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p2 f10983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f10984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f10985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r2.b f10986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f10987e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Rect f10988f = new Rect();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AutofillId f10989g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z f10990h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f10991i;

    public b(p2 p2Var, q qVar, v vVar, r2.b bVar, String str) {
        this.f10983a = p2Var;
        this.f10984b = qVar;
        this.f10985c = vVar;
        this.f10986d = bVar;
        this.f10987e = str;
        vVar.setImportantForAutofill(1);
        b1.e eVarK = a2.c.K(vVar);
        AutofillId autofillIdK = eVarK != null ? g.k(eVarK.f1425a) : null;
        if (autofillIdK == null) {
            throw h0.g("Required value was null.");
        }
        this.f10989g = autofillIdK;
        this.f10990h = new z();
    }
}
