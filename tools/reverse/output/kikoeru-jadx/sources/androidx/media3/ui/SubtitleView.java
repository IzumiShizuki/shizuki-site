package androidx.media3.ui;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import d7.c;
import d7.d;
import d7.j;
import d7.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o4.a;
import o4.b;
import o4.f;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class SubtitleView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f996e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f997f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f998g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public j f999h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f1000i;

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f992a = Collections.EMPTY_LIST;
        this.f993b = d.f5490g;
        this.f994c = 0.0533f;
        this.f995d = 0.08f;
        this.f996e = true;
        this.f997f = true;
        c cVar = new c(context, 0);
        this.f999h = cVar;
        this.f1000i = cVar;
        addView(cVar);
        this.f998g = 1;
    }

    private List<b> getCuesWithStylingPreferencesApplied() {
        if (this.f996e && this.f997f) {
            return this.f992a;
        }
        ArrayList arrayList = new ArrayList(this.f992a.size());
        for (int i10 = 0; i10 < this.f992a.size(); i10++) {
            a aVarA = ((b) this.f992a.get(i10)).a();
            if (!this.f996e) {
                aVarA.f16184n = false;
                CharSequence charSequence = aVarA.f16171a;
                if (charSequence instanceof Spanned) {
                    if (!(charSequence instanceof Spannable)) {
                        aVarA.f16171a = SpannableString.valueOf(charSequence);
                    }
                    CharSequence charSequence2 = aVarA.f16171a;
                    charSequence2.getClass();
                    Spannable spannable = (Spannable) charSequence2;
                    for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                        if (!(obj instanceof f)) {
                            spannable.removeSpan(obj);
                        }
                    }
                }
                a.a.M(aVarA);
            } else if (!this.f997f) {
                a.a.M(aVarA);
            }
            arrayList.add(aVarA.a());
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private d getUserCaptionStyle() {
        boolean zIsInEditMode = isInEditMode();
        d dVar = d.f5490g;
        if (zIsInEditMode) {
            return dVar;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        if (captioningManager != null && captioningManager.isEnabled()) {
            CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
            dVar = new d(userStyle.hasForegroundColor() ? userStyle.foregroundColor : -1, userStyle.hasBackgroundColor() ? userStyle.backgroundColor : -16777216, userStyle.hasWindowColor() ? userStyle.windowColor : 0, userStyle.hasEdgeType() ? userStyle.edgeType : 0, userStyle.hasEdgeColor() ? userStyle.edgeColor : -1, userStyle.getTypeface());
        }
        return dVar;
    }

    private <T extends View & j> void setView(T t10) {
        removeView(this.f1000i);
        View view = this.f1000i;
        if (view instanceof p) {
            ((p) view).f5538b.destroy();
        }
        this.f1000i = t10;
        this.f999h = t10;
        addView(t10);
    }

    public final void a() {
        this.f999h.a(getCuesWithStylingPreferencesApplied(), this.f993b, this.f994c, this.f995d);
    }

    public void setApplyEmbeddedFontSizes(boolean z10) {
        this.f997f = z10;
        a();
    }

    public void setApplyEmbeddedStyles(boolean z10) {
        this.f996e = z10;
        a();
    }

    public void setBottomPaddingFraction(float f10) {
        this.f995d = f10;
        a();
    }

    public void setCues(List<b> list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.f992a = list;
        a();
    }

    public void setFractionalTextSize(float f10) {
        this.f994c = f10;
        a();
    }

    public void setStyle(d dVar) {
        this.f993b = dVar;
        a();
    }

    public void setViewType(int i10) {
        if (this.f998g == i10) {
            return;
        }
        if (i10 == 1) {
            setView(new c(getContext(), 0));
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException();
            }
            setView(new p(getContext()));
        }
        this.f998g = i10;
    }
}
