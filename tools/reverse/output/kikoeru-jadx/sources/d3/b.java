package d3;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.lifecycle.n0;
import b3.i;
import p1.e;
import q1.j0;
import x0.c0;
import x0.e1;
import x0.v;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f5466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f5467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e1 f5468c = v.v(new e(9205357640488583168L));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c0 f5469d = v.o(new n0(5, this));

    public b(j0 j0Var, float f10) {
        this.f5466a = j0Var;
        this.f5467b = f10;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        i.b(textPaint, this.f5467b);
        textPaint.setShader((Shader) this.f5469d.getValue());
    }
}
