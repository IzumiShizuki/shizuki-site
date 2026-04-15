package e7;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h7.g f6299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c4.n f6300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Activity f6301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f6302e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d.k0 f6303f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f6304g;

    public a0(Context context) {
        Object next;
        jc.l.e(context, "context");
        this.f6298a = context;
        this.f6299b = new h7.g(this, new ca.b(this, 1));
        this.f6300c = new c4.n(context, false);
        Iterator it = df.m.b0(context, new d9.i(12)).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Context) next) instanceof Activity) {
                    break;
                }
            }
        }
        this.f6301d = (Activity) next;
        this.f6303f = new d.k0(this);
        this.f6304g = true;
        n0 n0Var = this.f6299b.f8177s;
        n0Var.a(new z(n0Var));
        this.f6299b.f8177s.a(new b(this.f6298a));
        ub.a.d(new ca.b(this, 2));
    }

    public static void b(a0 a0Var, String str) {
        a0Var.getClass();
        jc.l.e(str, "route");
        h7.g gVar = a0Var.f6299b;
        gVar.getClass();
        if (gVar.f8161c == null) {
            throw new IllegalArgumentException(("Cannot navigate to " + str + ". Navigation graph has not been set for NavController " + gVar + '.').toString());
        }
        w wVarI = gVar.i();
        t tVarM = wVarI.m(str, true, wVarI);
        if (tVarM == null) {
            StringBuilder sbK = a0.c.K("Navigation destination that matches route ", str, " cannot be found in the navigation graph ");
            sbK.append(gVar.f8161c);
            throw new IllegalArgumentException(sbK.toString());
        }
        u uVar = tVarM.f6392a;
        Bundle bundleA = uVar.a(tVarM.f6393b);
        if (bundleA == null) {
            bundleA = n7.d.c((ub.k[]) Arrays.copyOf(new ub.k[0], 0));
        }
        int i10 = u.f6398e;
        String str2 = (String) uVar.f6400b.f8191e;
        String strConcat = str2 != null ? "android-app://androidx.navigation/".concat(str2) : "";
        jc.l.e(strConcat, "uriString");
        Uri uri = Uri.parse(strConcat);
        jc.l.d(uri, "parse(...)");
        Intent intent = new Intent();
        intent.setDataAndType(uri, null);
        intent.setAction(null);
        bundleA.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        gVar.k(uVar, bundleA, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x00ea A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(android.content.Intent r22) {
        /*
            Method dump skipped, instruction units count: 703
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.a0.a(android.content.Intent):boolean");
    }

    public final void c() {
        h7.g gVar = this.f6299b;
        if (gVar.f8164f.isEmpty()) {
            return;
        }
        u uVarF = gVar.f();
        jc.l.b(uVarF);
        if (gVar.l(true, uVarF.f6400b.f8187a, false)) {
            gVar.b();
        }
    }
}
