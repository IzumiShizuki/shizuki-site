.class public interface abstract Lcom/tencent/bugly/beta/tinker/TinkerManager$TinkerListener;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/bugly/beta/tinker/TinkerManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "TinkerListener"
.end annotation


# virtual methods
.method public abstract onApplyFailure(Ljava/lang/String;)V
.end method

.method public abstract onApplySuccess(Ljava/lang/String;)V
.end method

.method public abstract onDownloadFailure(Ljava/lang/String;)V
.end method

.method public abstract onDownloadSuccess(Ljava/lang/String;)V
.end method

.method public abstract onPatchRollback()V
.end method

.method public abstract onPatchStart()V
.end method
