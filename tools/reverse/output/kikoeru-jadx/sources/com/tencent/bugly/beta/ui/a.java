package com.tencent.bugly.beta.ui;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f4421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View.OnClickListener f4422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View.OnClickListener f4424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BaseDialogFrag f4425e;

    public a(BaseDialogFrag baseDialogFrag, String str, View.OnClickListener onClickListener, String str2, View.OnClickListener onClickListener2) {
        this.f4425e = baseDialogFrag;
        this.f4421a = str;
        this.f4422b = onClickListener;
        this.f4423c = str2;
        this.f4424d = onClickListener2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BaseDialogFrag baseDialogFrag = this.f4425e;
        TextView textView = baseDialogFrag.mLeftBtnTextView;
        if (textView == null || baseDialogFrag.mRightBtnTextView == null) {
            return;
        }
        String str = this.f4421a;
        if (str != null) {
            textView.setVisibility(0);
            if (baseDialogFrag.mStyle != 2) {
                baseDialogFrag.mLeftBtnTextView.setText(str);
                if (baseDialogFrag.mLayoutResId == 0) {
                    baseDialogFrag.mLeftBtnTextView.getViewTreeObserver().addOnPreDrawListener(new BetaOnPreDraw(2, Integer.valueOf(baseDialogFrag.mStyle), baseDialogFrag.mLeftBtnTextView, 1));
                }
            }
            baseDialogFrag.mLeftBtnTextView.setOnClickListener(this.f4422b);
        }
        String str2 = this.f4423c;
        if (str2 != null) {
            baseDialogFrag.mRightBtnTextView.setVisibility(0);
            baseDialogFrag.mRightBtnTextView.setText(str2);
            baseDialogFrag.mRightBtnTextView.setOnClickListener(this.f4424d);
            if (baseDialogFrag.mLayoutResId == 0) {
                baseDialogFrag.mRightBtnTextView.getViewTreeObserver().addOnPreDrawListener(new BetaOnPreDraw(2, Integer.valueOf(baseDialogFrag.mStyle), baseDialogFrag.mRightBtnTextView, 1));
            }
            baseDialogFrag.mRightBtnTextView.requestFocus();
        }
    }
}
