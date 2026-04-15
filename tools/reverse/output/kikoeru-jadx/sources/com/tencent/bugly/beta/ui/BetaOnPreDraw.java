package com.tencent.bugly.beta.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.tencent.bugly.beta.global.e;
import com.tencent.bugly.proguard.X;
import j2.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class BetaOnPreDraw implements ViewTreeObserver.OnPreDrawListener {
    public static final int TYPE_BASE_BTN = 2;
    public static final int TYPE_CONTENT_SCROLL = 3;
    public static final int TYPE_UPGRADE_TITLE = 1;
    final Object[] args;
    long lastTime;
    StringBuilder loadText = h0.p("loading");
    final int type;

    public BetaOnPreDraw(int i10, Object... objArr) {
        this.type = i10;
        this.args = objArr;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        int i10;
        int i11;
        try {
            int i12 = this.type;
            try {
                if (i12 == 1) {
                    Object[] objArr = this.args;
                    UpgradeDialog upgradeDialog = (UpgradeDialog) objArr[0];
                    TextView textView = (TextView) objArr[1];
                    Bitmap bitmap = (Bitmap) objArr[2];
                    int iIntValue = ((Integer) objArr[3]).intValue();
                    int measuredWidth = textView.getMeasuredWidth();
                    int i13 = (int) (((double) measuredWidth) * 0.42857142857142855d);
                    textView.setHeight(i13);
                    if (upgradeDialog.titleDrawable == null) {
                        if (iIntValue == 2) {
                            upgradeDialog.titleDrawable = com.tencent.bugly.beta.global.a.a(bitmap, measuredWidth, i13, com.tencent.bugly.beta.global.a.a(e.f4381b.f4407v, 6.0f));
                        } else {
                            upgradeDialog.titleDrawable = com.tencent.bugly.beta.global.a.a(bitmap, measuredWidth, i13, com.tencent.bugly.beta.global.a.a(e.f4381b.f4407v, 0.0f));
                        }
                        if (upgradeDialog.titleDrawable != null) {
                            textView.setText("");
                            textView.setBackgroundDrawable(upgradeDialog.titleDrawable);
                            textView.getViewTreeObserver().removeOnPreDrawListener(this);
                            return true;
                        }
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis - this.lastTime <= 300) {
                        return true;
                    }
                    this.lastTime = jCurrentTimeMillis;
                    if (this.loadText.length() > 9) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("loading");
                        this.loadText = sb;
                    } else {
                        this.loadText.append(".");
                    }
                    textView.setText(this.loadText.toString());
                    return true;
                }
                if (i12 != 2) {
                    if (i12 != 3) {
                        return false;
                    }
                    ViewGroup viewGroup = (ViewGroup) this.args[0];
                    if (viewGroup.getMeasuredHeight() > com.tencent.bugly.beta.global.a.a((Context) this.args[1], 158.0f)) {
                        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                        layoutParams.height = com.tencent.bugly.beta.global.a.a((Context) this.args[1], 200.0f);
                        viewGroup.setLayoutParams(layoutParams);
                    }
                    return true;
                }
                if (((Integer) this.args[2]).intValue() > 0) {
                    int iIntValue2 = ((Integer) this.args[0]).intValue();
                    TextView textView2 = (TextView) this.args[1];
                    int measuredWidth2 = textView2.getMeasuredWidth();
                    int measuredHeight = textView2.getMeasuredHeight();
                    DisplayMetrics displayMetrics = e.f4381b.E;
                    int i14 = (int) (displayMetrics.widthPixels * displayMetrics.heightPixels * 0.4f);
                    if (measuredWidth2 != 0 && measuredHeight != 0 && measuredWidth2 * measuredHeight <= i14) {
                        this.args[2] = 0;
                        Paint paint = new Paint();
                        paint.setStyle(Paint.Style.FILL);
                        paint.setAntiAlias(true);
                        if (iIntValue2 == 2) {
                            i10 = 8;
                            i11 = 7;
                        } else {
                            i10 = 0;
                            i11 = 0;
                        }
                        paint.setColor(-3355444);
                        Bitmap.Config config = Bitmap.Config.ARGB_8888;
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth2, measuredHeight, config);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        float f10 = measuredWidth2;
                        float f11 = measuredHeight;
                        RectF rectF = new RectF(0.0f, 0.0f, f10, f11);
                        float f12 = i10;
                        canvas.drawRoundRect(rectF, f12, f12, paint);
                        paint.setColor(-1);
                        RectF rectF2 = new RectF(2.0f, 2.0f, f10 - 2.0f, f11 - 2.0f);
                        float f13 = i11;
                        canvas.drawRoundRect(rectF2, f13, f13, paint);
                        paint.setColor(-3355444);
                        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(measuredWidth2, measuredHeight, config);
                        new Canvas(bitmapCreateBitmap2).drawRoundRect(rectF, f12, f12, paint);
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                        BitmapDrawable bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap2);
                        textView2.setBackgroundDrawable(bitmapDrawable);
                        textView2.setOnTouchListener(new com.tencent.bugly.beta.global.c(1, bitmapDrawable2, bitmapDrawable));
                    }
                }
                return true;
            } catch (Exception e10) {
                e = e10;
                if (X.a(e)) {
                    return false;
                }
                e.printStackTrace();
                return false;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }
}
