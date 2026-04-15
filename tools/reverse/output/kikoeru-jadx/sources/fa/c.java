package fa;

import java.util.List;
import ub.a0;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f6974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w0 f6975c;

    public /* synthetic */ c(w0 w0Var, w0 w0Var2, int i10) {
        this.f6973a = i10;
        this.f6974b = w0Var;
        this.f6975c = w0Var2;
    }

    @Override // ic.a
    public final Object b() {
        int length;
        int i10 = this.f6973a;
        a0 a0Var = a0.f21526a;
        w0 w0Var = this.f6975c;
        w0 w0Var2 = this.f6974b;
        switch (i10) {
            case 0:
                j9.h hVar = j9.h.f10699a;
                return Integer.valueOf(j9.h.a(((Number) w0Var2.getValue()).longValue(), (List) w0Var.getValue()));
            case 1:
                ((androidx.lifecycle.q) h9.d.c()).s1(5, ((Number) w0Var2.getValue()).longValue());
                w0Var.setValue(Boolean.FALSE);
                return a0Var;
            case 2:
                w0Var.setValue("");
                w0Var2.setValue(Boolean.FALSE);
                return a0Var;
            case 3:
                if (((String) w0Var.getValue()).length() > 0) {
                    w0Var.setValue("");
                } else {
                    w0Var2.setValue(Boolean.FALSE);
                }
                return a0Var;
            case 4:
                return ((Boolean) w0Var2.getValue()).booleanValue() ? (String) w0Var.getValue() : "";
            default:
                int length2 = ((String) w0Var2.getValue()).length();
                return Boolean.valueOf(1 <= length2 && length2 < 101 && (length = ((String) w0Var.getValue()).length()) >= 0 && length < 501);
        }
    }
}
