package u3;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class o0 extends n0 {
    public o0(w0 w0Var, WindowInsets windowInsets) {
        super(w0Var, windowInsets);
    }

    @Override // u3.t0
    public w0 a() {
        return w0.c(null, this.f21313c.consumeDisplayCutout());
    }

    @Override // u3.m0, u3.t0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return Objects.equals(this.f21313c, o0Var.f21313c) && Objects.equals(this.f21317g, o0Var.f21317g) && m0.C(this.f21318h, o0Var.f21318h);
    }

    @Override // u3.t0
    public c f() {
        DisplayCutout displayCutout = this.f21313c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new c(displayCutout);
    }

    @Override // u3.t0
    public int hashCode() {
        return this.f21313c.hashCode();
    }

    public o0(w0 w0Var, o0 o0Var) {
        super(w0Var, o0Var);
    }
}
