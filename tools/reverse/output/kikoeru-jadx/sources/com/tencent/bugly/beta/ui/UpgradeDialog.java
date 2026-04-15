package com.tencent.bugly.beta.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.tencent.bugly.beta.Beta;
import com.tencent.bugly.beta.UpgradeInfo;
import com.tencent.bugly.beta.download.DownloadListener;
import com.tencent.bugly.beta.download.DownloadTask;
import com.tencent.bugly.beta.global.ResBean;
import com.tencent.bugly.beta.global.e;
import com.tencent.bugly.beta.global.f;
import com.tencent.bugly.proguard.B;
import com.tencent.bugly.proguard.X;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class UpgradeDialog extends BaseDialogFrag {
    public static UpgradeDialog instance = new UpgradeDialog();
    public Runnable cancelRunnable;
    public B strategyDetail;
    public DownloadTask strategyTask;
    public BitmapDrawable titleDrawable;
    protected TextView tvApkInfoTop;
    protected TextView tvUpgradeInfoBottom;
    public UILifecycleListener upgradeDialogListener;
    public Runnable upgradeRunnable;
    private BetaOnPreDraw onPreDraw = null;
    protected Bitmap titleBitmap = null;
    View.OnClickListener installTaskListener = new com.tencent.bugly.beta.global.b(9, this);
    View.OnClickListener startTaskListener = new com.tencent.bugly.beta.global.b(4, this);
    View.OnClickListener stopTaskListener = new com.tencent.bugly.beta.global.b(5, this);
    View.OnClickListener negListener = new com.tencent.bugly.beta.global.b(6, this);
    DownloadListener taskListener = new com.tencent.bugly.beta.download.a(2, this);

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e eVar = e.f4381b;
        this.mLayoutResId = eVar.f4397l;
        this.upgradeDialogListener = eVar.f4399n;
        try {
            this.mStyle = Integer.parseInt(ResBean.f4369a.a("VAL_style"));
        } catch (Exception e10) {
            X.c(e10.getMessage(), new Object[0]);
            this.mStyle = 0;
        }
    }

    @Override // com.tencent.bugly.beta.ui.BaseDialogFrag
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (this.mLayoutResId != 0) {
            this.tvApkInfoTop = (TextView) viewOnCreateView.findViewWithTag(Beta.TAG_UPGRADE_INFO);
            this.tvUpgradeInfoBottom = (TextView) viewOnCreateView.findViewWithTag(Beta.TAG_UPGRADE_FEATURE);
        } else {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            LinearLayout linearLayout = new LinearLayout(this.mContext);
            linearLayout.setLayoutParams(layoutParams);
            linearLayout.setOrientation(1);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            ResBean resBean = ResBean.f4369a;
            if (e.f4381b.W) {
                TextView textView = new TextView(this.mContext);
                this.tvApkInfoTop = textView;
                textView.setLayoutParams(layoutParams2);
                TextView textView2 = this.tvApkInfoTop;
                resBean.getClass();
                textView2.setTextColor(Color.parseColor("#757575"));
                this.tvApkInfoTop.setTextSize(14);
                this.tvApkInfoTop.setTag(Beta.TAG_UPGRADE_INFO);
                this.tvApkInfoTop.setLineSpacing(15.0f, 1.0f);
                linearLayout.addView(this.tvApkInfoTop);
            }
            TextView textView3 = new TextView(this.mContext);
            textView3.setLayoutParams(layoutParams2);
            resBean.getClass();
            textView3.setTextColor(Color.parseColor("#273238"));
            float f10 = 14;
            textView3.setTextSize(f10);
            textView3.setSingleLine();
            textView3.setEllipsize(TextUtils.TruncateAt.END);
            textView3.setText(String.valueOf(Beta.strUpgradeDialogFeatureLabel + ": "));
            textView3.setPadding(0, com.tencent.bugly.beta.global.a.a(this.mContext, 8.0f), 0, 0);
            linearLayout.addView(textView3);
            TextView textView4 = new TextView(this.mContext);
            this.tvUpgradeInfoBottom = textView4;
            textView4.setLayoutParams(layoutParams2);
            this.tvUpgradeInfoBottom.setTextColor(Color.parseColor("#273238"));
            this.tvUpgradeInfoBottom.setTextSize(f10);
            this.tvUpgradeInfoBottom.setTag(Beta.TAG_UPGRADE_FEATURE);
            this.tvUpgradeInfoBottom.setMaxHeight(com.tencent.bugly.beta.global.a.a(this.mContext, 200.0f));
            this.tvUpgradeInfoBottom.setLineSpacing(15.0f, 1.0f);
            linearLayout.addView(this.tvUpgradeInfoBottom);
            this.mContentContainer.addView(linearLayout);
        }
        UILifecycleListener uILifecycleListener = this.upgradeDialogListener;
        if (uILifecycleListener != null) {
            FragmentActivity activity = getActivity();
            B b10 = this.strategyDetail;
            uILifecycleListener.onCreate(activity, viewOnCreateView, b10 != null ? new UpgradeInfo(b10) : null);
        }
        return viewOnCreateView;
    }

    @Override // com.tencent.bugly.beta.ui.BaseDialogFrag
    public void onDestroyView() {
        try {
            super.onDestroyView();
            this.tvApkInfoTop = null;
            this.tvUpgradeInfoBottom = null;
            synchronized (this) {
                this.onPreDraw = null;
            }
            BitmapDrawable bitmapDrawable = this.titleDrawable;
            if (bitmapDrawable != null) {
                bitmapDrawable.setCallback(null);
            }
            UILifecycleListener uILifecycleListener = this.upgradeDialogListener;
            if (uILifecycleListener != null) {
                Context context = this.mContext;
                View view = this.mLayoutContainer;
                B b10 = this.strategyDetail;
                uILifecycleListener.onDestroy(context, view, b10 != null ? new UpgradeInfo(b10) : null);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.tencent.bugly.beta.ui.BaseFrag
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 != 4) {
            return false;
        }
        if (this.strategyDetail.f4831l == 2) {
            return true;
        }
        Runnable runnable = this.cancelRunnable;
        if (runnable != null) {
            runnable.run();
        }
        close();
        return true;
    }

    @Override // com.tencent.bugly.beta.ui.BaseFrag
    public void onPause() {
        DownloadTask downloadTask;
        super.onPause();
        DownloadListener downloadListener = this.taskListener;
        if (downloadListener != null && (downloadTask = this.strategyTask) != null) {
            downloadTask.removeListener(downloadListener);
        }
        UILifecycleListener uILifecycleListener = this.upgradeDialogListener;
        if (uILifecycleListener != null) {
            Context context = this.mContext;
            View view = this.mLayoutContainer;
            B b10 = this.strategyDetail;
            uILifecycleListener.onPause(context, view, b10 != null ? new UpgradeInfo(b10) : null);
        }
    }

    @Override // com.tencent.bugly.beta.ui.BaseFrag
    public void onResume() {
        DownloadTask downloadTask;
        super.onResume();
        DownloadListener downloadListener = this.taskListener;
        if (downloadListener != null && (downloadTask = this.strategyTask) != null) {
            downloadTask.addListener(downloadListener);
        }
        updateView();
        if (this.mStyle != 0 && this.titleBitmap == null) {
            f.f4412a.a(new com.tencent.bugly.beta.global.d(7, this));
        }
        UILifecycleListener uILifecycleListener = this.upgradeDialogListener;
        if (uILifecycleListener != null) {
            Context context = this.mContext;
            View view = this.mLayoutContainer;
            B b10 = this.strategyDetail;
            uILifecycleListener.onResume(context, view, b10 != null ? new UpgradeInfo(b10) : null);
        }
    }

    public void onStart() {
        super.onStart();
        UILifecycleListener uILifecycleListener = this.upgradeDialogListener;
        if (uILifecycleListener != null) {
            Context context = this.mContext;
            View view = this.mLayoutContainer;
            B b10 = this.strategyDetail;
            uILifecycleListener.onStart(context, view, b10 != null ? new UpgradeInfo(b10) : null);
        }
    }

    public void onStop() {
        super.onStop();
        UILifecycleListener uILifecycleListener = this.upgradeDialogListener;
        if (uILifecycleListener != null) {
            Context context = this.mContext;
            View view = this.mLayoutContainer;
            B b10 = this.strategyDetail;
            uILifecycleListener.onStop(context, view, b10 != null ? new UpgradeInfo(b10) : null);
        }
    }

    public synchronized void setUpgradeInfo(B b10, DownloadTask downloadTask) {
        this.strategyDetail = b10;
        this.strategyTask = downloadTask;
        downloadTask.addListener(this.taskListener);
        com.tencent.bugly.beta.utils.e.a(new com.tencent.bugly.beta.global.d(7, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void updateBtn(com.tencent.bugly.beta.download.DownloadTask r8) {
        /*
            r7 = this;
            int r0 = r8.getStatus()
            r1 = 2
            r2 = 0
            if (r0 == 0) goto L58
            r3 = 1
            if (r0 == r3) goto L53
            if (r0 == r1) goto L24
            r8 = 3
            if (r0 == r8) goto L1f
            r8 = 4
            if (r0 == r8) goto L58
            r8 = 5
            if (r0 == r8) goto L1a
            java.lang.String r8 = ""
            r0 = r2
            goto L5c
        L1a:
            java.lang.String r8 = com.tencent.bugly.beta.Beta.strUpgradeDialogRetryBtn
            android.view.View$OnClickListener r0 = r7.startTaskListener
            goto L5c
        L1f:
            java.lang.String r8 = com.tencent.bugly.beta.Beta.strUpgradeDialogContinueBtn
            android.view.View$OnClickListener r0 = r7.startTaskListener
            goto L5c
        L24:
            java.util.Locale r0 = java.util.Locale.getDefault()
            long r4 = r8.getSavedLength()
            float r4 = (float) r4
            long r5 = r8.getTotalLength()
            float r8 = (float) r5
            float r4 = r4 / r8
            r8 = 1120403456(0x42c80000, float:100.0)
            float r4 = r4 * r8
            java.lang.Float r8 = java.lang.Float.valueOf(r4)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r8
            java.lang.String r8 = "%.1f%%"
            java.lang.String r8 = java.lang.String.format(r0, r8, r3)
            java.lang.String r0 = "NaN%"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L50
            java.lang.String r8 = "0%"
        L50:
            android.view.View$OnClickListener r0 = r7.stopTaskListener
            goto L5c
        L53:
            java.lang.String r8 = com.tencent.bugly.beta.Beta.strUpgradeDialogInstallBtn
            android.view.View$OnClickListener r0 = r7.installTaskListener
            goto L5c
        L58:
            java.lang.String r8 = com.tencent.bugly.beta.Beta.strUpgradeDialogUpgradeBtn
            android.view.View$OnClickListener r0 = r7.startTaskListener
        L5c:
            com.tencent.bugly.proguard.B r3 = r7.strategyDetail
            byte r3 = r3.f4831l
            if (r3 == r1) goto L6a
            java.lang.String r1 = com.tencent.bugly.beta.Beta.strUpgradeDialogCancelBtn
            android.view.View$OnClickListener r2 = r7.negListener
            r7.setBtn(r1, r2, r8, r0)
            return
        L6a:
            r7.setBtn(r2, r2, r8, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.beta.ui.UpgradeDialog.updateBtn(com.tencent.bugly.beta.download.DownloadTask):void");
    }

    public synchronized void updateView() {
        B b10;
        try {
        } catch (Exception e10) {
            if (this.mLayoutResId != 0) {
                X.b("please confirm your argument: [Beta.upgradeDialogLayoutId] is correct", new Object[0]);
            }
            if (!X.a(e10)) {
                e10.printStackTrace();
            }
        } finally {
        }
        if (this.mLayoutContainer != null && (b10 = this.strategyDetail) != null && this.strategyTask != null) {
            Bitmap bitmapA = null;
            if (this.mLayoutResId != 0) {
                this.mTitleTextView.setText(b10.f4825f);
                ImageView imageView = this.mBannerImageView;
                if (imageView != null) {
                    imageView.setAdjustViewBounds(true);
                    if (this.mStyle != 0) {
                        Bitmap bitmapA2 = com.tencent.bugly.beta.global.a.a(this.mContext, 0, this.mRes.a("IMG_title"));
                        this.titleBitmap = bitmapA2;
                        this.titleDrawable = null;
                        if (bitmapA2 != null) {
                            bitmapA = bitmapA2;
                        } else {
                            int i10 = e.f4381b.f4396k;
                            if (i10 != 0) {
                                bitmapA = com.tencent.bugly.beta.global.a.a(this.mContext, 1, Integer.valueOf(i10));
                            }
                        }
                        this.mBannerImageView.setImageBitmap(bitmapA);
                    }
                }
            } else if (this.mStyle != 0) {
                Bitmap bitmapA3 = com.tencent.bugly.beta.global.a.a(this.mContext, 0, this.mRes.a("IMG_title"));
                this.titleBitmap = bitmapA3;
                this.titleDrawable = null;
                if (bitmapA3 != null) {
                    bitmapA = bitmapA3;
                } else {
                    int i11 = e.f4381b.f4396k;
                    if (i11 != 0) {
                        bitmapA = com.tencent.bugly.beta.global.a.a(this.mContext, 1, Integer.valueOf(i11));
                    }
                }
                this.mTitleTextView.getViewTreeObserver().removeOnPreDrawListener(this.onPreDraw);
                this.onPreDraw = new BetaOnPreDraw(1, this, this.mTitleTextView, bitmapA, Integer.valueOf(this.mStyle));
                this.mTitleTextView.getViewTreeObserver().addOnPreDrawListener(this.onPreDraw);
            } else {
                this.mTitleTextView.setHeight(com.tencent.bugly.beta.global.a.a(this.mContext, 42.0f));
                this.mTitleTextView.setText(this.strategyDetail.f4825f);
            }
            this.tvUpgradeInfoBottom.setText(this.strategyDetail.f4826g.length() > 500 ? this.strategyDetail.f4826g.substring(0, 500) : this.strategyDetail.f4826g);
            if (e.f4381b.W) {
                StringBuilder sb = new StringBuilder();
                sb.append(Beta.strUpgradeDialogVersionLabel);
                sb.append(": ");
                sb.append(this.strategyDetail.f4829j.f5153e);
                sb.append("\n");
                sb.append(Beta.strUpgradeDialogFileSizeLabel);
                sb.append(": ");
                float f10 = this.strategyDetail.f4830k.f5147e;
                if (f10 >= 1048576.0f) {
                    sb.append(String.format(Locale.getDefault(), "%.1f", Float.valueOf(f10 / 1048576.0f)));
                    sb.append("M");
                } else if (f10 >= 1024.0f) {
                    sb.append(String.format(Locale.getDefault(), "%.1f", Float.valueOf(f10 / 1024.0f)));
                    sb.append("K");
                } else {
                    sb.append(String.format(Locale.getDefault(), "%.1f", Float.valueOf(f10)));
                    sb.append("B");
                }
                sb.append("\n");
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.CHINA);
                sb.append(Beta.strUpgradeDialogUpdateTimeLabel);
                sb.append(": ");
                sb.append(simpleDateFormat.format(new Date(this.strategyDetail.f4839t)));
                this.tvApkInfoTop.setText(sb);
            }
            updateBtn(this.strategyTask);
        }
    }
}
