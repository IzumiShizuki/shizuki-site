.class public Lcom/tencent/bugly/proguard/r;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static a:Lcom/tencent/bugly/proguard/r;


# instance fields
.field public b:Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

.field public c:Lcom/tencent/bugly/beta/download/DownloadTask;

.field public final d:Landroid/os/Handler;

.field private e:Lcom/tencent/bugly/beta/download/DownloadListener;

.field private f:Lcom/tencent/bugly/beta/upgrade/a;

.field private g:Lcom/tencent/bugly/beta/global/d;

.field private h:Z

.field private final i:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/tencent/bugly/proguard/r;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/r;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/tencent/bugly/proguard/r;->a:Lcom/tencent/bugly/proguard/r;

    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/os/Handler;

    .line 5
    .line 6
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lcom/tencent/bugly/proguard/r;->d:Landroid/os/Handler;

    .line 14
    .line 15
    new-instance v0, Lcom/tencent/bugly/beta/download/a;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    const/4 v3, 0x2

    .line 23
    new-array v3, v3, [Ljava/lang/Object;

    .line 24
    .line 25
    aput-object p0, v3, v1

    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    aput-object v2, v3, v1

    .line 29
    .line 30
    const/4 v1, 0x4

    .line 31
    invoke-direct {v0, v1, v3}, Lcom/tencent/bugly/beta/download/a;-><init>(I[Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, Lcom/tencent/bugly/proguard/r;->e:Lcom/tencent/bugly/beta/download/DownloadListener;

    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    iput-object v0, p0, Lcom/tencent/bugly/proguard/r;->f:Lcom/tencent/bugly/beta/upgrade/a;

    .line 38
    .line 39
    new-instance v0, Ljava/lang/Object;

    .line 40
    .line 41
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, Lcom/tencent/bugly/proguard/r;->i:Ljava/lang/Object;

    .line 45
    .line 46
    return-void
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
.end method

.method private a()V
    .locals 5

    .line 99
    iget-object v0, p0, Lcom/tencent/bugly/proguard/r;->b:Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    if-nez v0, :cond_0

    goto :goto_0

    .line 100
    :cond_0
    iget-object v1, p0, Lcom/tencent/bugly/proguard/r;->c:Lcom/tencent/bugly/beta/download/DownloadTask;

    if-nez v1, :cond_1

    .line 101
    sget-object v1, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    iget-object v2, v1, Lcom/tencent/bugly/beta/global/e;->s:Lcom/tencent/bugly/beta/download/c;

    iget-object v0, v0, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    iget-object v0, v0, Lcom/tencent/bugly/proguard/B;->k:Lcom/tencent/bugly/proguard/x;

    iget-object v0, v0, Lcom/tencent/bugly/proguard/x;->c:Ljava/lang/String;

    iget-object v1, v1, Lcom/tencent/bugly/beta/global/e;->K:Ljava/io/File;

    .line 102
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, Lcom/tencent/bugly/proguard/r;->b:Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    iget-object v3, v3, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    iget-object v3, v3, Lcom/tencent/bugly/proguard/B;->k:Lcom/tencent/bugly/proguard/x;

    iget-object v3, v3, Lcom/tencent/bugly/proguard/x;->b:Ljava/lang/String;

    const/4 v4, 0x0

    .line 103
    invoke-interface {v2, v0, v1, v4, v3}, Lcom/tencent/bugly/beta/download/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/bugly/beta/download/DownloadTask;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/bugly/proguard/r;->c:Lcom/tencent/bugly/beta/download/DownloadTask;

    const/4 v1, 0x3

    .line 104
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/beta/download/DownloadTask;->setDownloadType(I)V

    .line 105
    :cond_1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/r;->c:Lcom/tencent/bugly/beta/download/DownloadTask;

    if-nez v0, :cond_2

    :goto_0
    return-void

    .line 106
    :cond_2
    iget-object v1, p0, Lcom/tencent/bugly/proguard/r;->e:Lcom/tencent/bugly/beta/download/DownloadListener;

    invoke-virtual {v0, v1}, Lcom/tencent/bugly/beta/download/DownloadTask;->addListener(Lcom/tencent/bugly/beta/download/DownloadListener;)V

    .line 107
    iget-object v0, p0, Lcom/tencent/bugly/proguard/r;->c:Lcom/tencent/bugly/beta/download/DownloadTask;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/tencent/bugly/beta/download/DownloadTask;->setNeededNotify(Z)V

    .line 108
    iget-object v0, p0, Lcom/tencent/bugly/proguard/r;->c:Lcom/tencent/bugly/beta/download/DownloadTask;

    invoke-virtual {v0}, Lcom/tencent/bugly/beta/download/DownloadTask;->download()V

    return-void
.end method

.method private a(Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;)V
    .locals 2

    .line 109
    iget-object v0, p1, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    if-eqz v0, :cond_0

    iget v0, v0, Lcom/tencent/bugly/proguard/B;->u:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    const-string v0, "hotfix.strategy.bch"

    .line 110
    invoke-static {v0, p1}, Lcom/tencent/bugly/beta/global/a;->a(Ljava/lang/String;Landroid/os/Parcelable;)Z

    :cond_0
    return-void
.end method


# virtual methods
.method public a(Lcom/tencent/bugly/proguard/B;)Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;
    .locals 21

    move-object/from16 v0, p1

    .line 45
    sget-object v1, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->CREATOR:Landroid/os/Parcelable$Creator;

    const-string v2, "hotfix.strategy.bch"

    invoke-static {v2, v1}, Lcom/tencent/bugly/beta/global/a;->a(Ljava/lang/String;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    .line 46
    iget-object v4, v1, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    if-nez v4, :cond_1

    .line 47
    :cond_0
    invoke-static {v2}, Lcom/tencent/bugly/beta/global/a;->a(Ljava/lang/String;)Z

    move-object v1, v3

    :cond_1
    const-string v4, "delete patchFile"

    const-string v5, "delete tmpPatchFile"

    const/4 v6, 0x3

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v0, :cond_6

    .line 48
    iget v9, v0, Lcom/tencent/bugly/proguard/B;->s:I

    if-eq v9, v7, :cond_5

    if-eqz v1, :cond_5

    .line 49
    iget-object v9, v1, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    iget-object v9, v9, Lcom/tencent/bugly/proguard/B;->r:Ljava/lang/String;

    .line 50
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9

    if-nez v9, :cond_5

    iget-object v9, v0, Lcom/tencent/bugly/proguard/B;->r:Ljava/lang/String;

    iget-object v10, v1, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    iget-object v10, v10, Lcom/tencent/bugly/proguard/B;->r:Ljava/lang/String;

    .line 51
    invoke-static {v9, v10}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v9

    if-eqz v9, :cond_5

    .line 52
    sget-object v9, Lcom/tencent/bugly/proguard/p;->a:Lcom/tencent/bugly/proguard/p;

    new-instance v10, Lcom/tencent/bugly/proguard/z;

    .line 53
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    iget-object v11, v1, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    iget-object v14, v11, Lcom/tencent/bugly/proguard/B;->r:Ljava/lang/String;

    iget v11, v11, Lcom/tencent/bugly/proguard/B;->u:I

    const/16 v17, 0x0

    const/16 v20, 0x0

    move/from16 v19, v11

    const-string v11, "recall"

    move-object/from16 v18, v14

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    invoke-direct/range {v10 .. v20}, Lcom/tencent/bugly/proguard/z;-><init>(Ljava/lang/String;JBJLcom/tencent/bugly/proguard/y;Ljava/lang/String;ILjava/util/Map;)V

    .line 54
    invoke-virtual {v9, v10}, Lcom/tencent/bugly/proguard/p;->a(Lcom/tencent/bugly/proguard/z;)Z

    .line 55
    invoke-static {v2}, Lcom/tencent/bugly/beta/global/a;->a(Ljava/lang/String;)Z

    .line 56
    sget-object v2, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    iget-object v9, v2, Lcom/tencent/bugly/beta/global/e;->s:Lcom/tencent/bugly/beta/download/c;

    iget-object v10, v1, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    iget-object v10, v10, Lcom/tencent/bugly/proguard/B;->k:Lcom/tencent/bugly/proguard/x;

    iget-object v10, v10, Lcom/tencent/bugly/proguard/x;->c:Ljava/lang/String;

    iget-object v2, v2, Lcom/tencent/bugly/beta/global/e;->K:Ljava/io/File;

    .line 57
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    iget-object v1, v1, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    iget-object v1, v1, Lcom/tencent/bugly/proguard/B;->k:Lcom/tencent/bugly/proguard/x;

    iget-object v1, v1, Lcom/tencent/bugly/proguard/x;->b:Ljava/lang/String;

    .line 58
    invoke-interface {v9, v10, v2, v3, v1}, Lcom/tencent/bugly/beta/download/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/bugly/beta/download/DownloadTask;

    move-result-object v1

    .line 59
    invoke-virtual {v1, v6}, Lcom/tencent/bugly/beta/download/DownloadTask;->setDownloadType(I)V

    .line 60
    invoke-virtual {v1, v7}, Lcom/tencent/bugly/beta/download/DownloadTask;->delete(Z)V

    .line 61
    sget-object v1, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    iget-object v1, v1, Lcom/tencent/bugly/beta/global/e;->J:Ljava/io/File;

    if-eqz v1, :cond_2

    .line 62
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 63
    new-array v1, v8, [Ljava/lang/Object;

    invoke-static {v5, v1}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 64
    :cond_2
    sget-object v1, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    iget-object v1, v1, Lcom/tencent/bugly/beta/global/e;->I:Ljava/io/File;

    if-eqz v1, :cond_3

    .line 65
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 66
    new-array v1, v8, [Ljava/lang/Object;

    invoke-static {v4, v1}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    :cond_3
    const-string v1, "IS_PATCH_ROLL_BACK"

    .line 67
    invoke-static {v1, v7}, Lcom/tencent/bugly/beta/global/a;->b(Ljava/lang/String;Z)V

    .line 68
    new-array v1, v8, [Ljava/lang/Object;

    const-string v2, "patch rollback"

    invoke-static {v2, v1}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 69
    sget-object v1, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    iget-object v1, v1, Lcom/tencent/bugly/beta/global/e;->v:Landroid/content/Context;

    invoke-static {v1}, Lcom/tencent/bugly/proguard/ca;->b(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 70
    invoke-static {}, Lcom/tencent/bugly/beta/tinker/TinkerManager;->getInstance()Lcom/tencent/bugly/beta/tinker/TinkerManager;

    move-result-object v1

    invoke-virtual {v1, v7}, Lcom/tencent/bugly/beta/tinker/TinkerManager;->onPatchRollback(Z)V

    goto :goto_0

    .line 71
    :cond_4
    invoke-static {}, Lcom/tencent/bugly/beta/tinker/TinkerManager;->getInstance()Lcom/tencent/bugly/beta/tinker/TinkerManager;

    move-result-object v1

    invoke-virtual {v1, v8}, Lcom/tencent/bugly/beta/tinker/TinkerManager;->onPatchRollback(Z)V

    :goto_0
    move-object v1, v3

    .line 72
    :cond_5
    iget v2, v0, Lcom/tencent/bugly/proguard/B;->s:I

    if-eq v2, v7, :cond_6

    move-object v0, v3

    :cond_6
    if-eqz v0, :cond_b

    .line 73
    new-instance v2, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    invoke-direct {v2}, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;-><init>()V

    .line 74
    iput-object v0, v2, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    .line 75
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    iput-wide v9, v2, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->e:J

    if-eqz v1, :cond_7

    .line 76
    iget-object v9, v1, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    iget-object v9, v9, Lcom/tencent/bugly/proguard/B;->k:Lcom/tencent/bugly/proguard/x;

    iget-object v9, v9, Lcom/tencent/bugly/proguard/x;->c:Ljava/lang/String;

    iget-object v10, v0, Lcom/tencent/bugly/proguard/B;->k:Lcom/tencent/bugly/proguard/x;

    iget-object v10, v10, Lcom/tencent/bugly/proguard/x;->c:Ljava/lang/String;

    invoke-static {v9, v10}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v9

    if-eqz v9, :cond_8

    iget-object v9, v0, Lcom/tencent/bugly/proguard/B;->q:Ljava/util/Map;

    if-eqz v9, :cond_7

    const-string v10, "H1"

    .line 77
    invoke-interface {v9, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/CharSequence;

    const-string v10, "false"

    invoke-static {v9, v10}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v9

    if-eqz v9, :cond_7

    goto :goto_2

    :cond_7
    :goto_1
    move-object/from16 v4, p0

    goto :goto_3

    .line 78
    :cond_8
    :goto_2
    sget-object v9, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    iget-object v10, v0, Lcom/tencent/bugly/proguard/B;->q:Ljava/util/Map;

    const-string v11, "H2"

    invoke-interface {v10, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    iput-object v10, v9, Lcom/tencent/bugly/beta/global/e;->O:Ljava/lang/String;

    .line 79
    sget-object v9, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    iget-object v10, v9, Lcom/tencent/bugly/beta/global/e;->s:Lcom/tencent/bugly/beta/download/c;

    iget-object v11, v1, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    iget-object v11, v11, Lcom/tencent/bugly/proguard/B;->k:Lcom/tencent/bugly/proguard/x;

    iget-object v11, v11, Lcom/tencent/bugly/proguard/x;->c:Ljava/lang/String;

    iget-object v9, v9, Lcom/tencent/bugly/beta/global/e;->K:Ljava/io/File;

    .line 80
    invoke-virtual {v9}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v9

    .line 81
    invoke-interface {v10, v11, v9, v3, v3}, Lcom/tencent/bugly/beta/download/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/bugly/beta/download/DownloadTask;

    move-result-object v3

    .line 82
    invoke-virtual {v3, v6}, Lcom/tencent/bugly/beta/download/DownloadTask;->setDownloadType(I)V

    .line 83
    invoke-virtual {v3, v7}, Lcom/tencent/bugly/beta/download/DownloadTask;->delete(Z)V

    .line 84
    iget-object v1, v1, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    iget v1, v1, Lcom/tencent/bugly/proguard/B;->u:I

    if-ne v1, v6, :cond_7

    .line 85
    sget-object v1, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    iget-object v1, v1, Lcom/tencent/bugly/beta/global/e;->J:Ljava/io/File;

    if-eqz v1, :cond_9

    .line 86
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    move-result v1

    if-eqz v1, :cond_9

    .line 87
    new-array v1, v8, [Ljava/lang/Object;

    invoke-static {v5, v1}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 88
    :cond_9
    sget-object v1, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    iget-object v1, v1, Lcom/tencent/bugly/beta/global/e;->I:Ljava/io/File;

    if-eqz v1, :cond_a

    .line 89
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    move-result v1

    if-eqz v1, :cond_a

    .line 90
    sget-object v1, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    const-string v3, ""

    iput-object v3, v1, Lcom/tencent/bugly/beta/global/e;->N:Ljava/lang/String;

    .line 91
    new-array v1, v8, [Ljava/lang/Object;

    invoke-static {v4, v1}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 92
    :cond_a
    sget-object v1, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    iput v8, v1, Lcom/tencent/bugly/beta/global/e;->Q:I

    const-string v1, "PATCH_MAX_TIMES"

    const-string v3, "0"

    .line 93
    invoke-static {v1, v3}, Lcom/tencent/bugly/beta/global/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 94
    :goto_3
    invoke-direct {v4, v2}, Lcom/tencent/bugly/proguard/r;->a(Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;)V

    .line 95
    iget v1, v0, Lcom/tencent/bugly/proguard/B;->u:I

    .line 96
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v0, v3, v8

    aput-object v1, v3, v7

    const-string v0, "onUpgradeReceived: %s [type: %d]"

    .line 97
    invoke-static {v0, v3}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-object v2

    :cond_b
    move-object/from16 v4, p0

    if-eqz v1, :cond_c

    .line 98
    iget-object v0, v1, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    if-eqz v0, :cond_c

    iget v0, v0, Lcom/tencent/bugly/proguard/B;->u:I

    if-ne v0, v6, :cond_c

    return-object v1

    :cond_c
    return-object v3
.end method

.method public declared-synchronized a(ILcom/tencent/bugly/proguard/B;Z)V
    .locals 2

    monitor-enter p0

    const/4 v0, 0x0

    .line 26
    :try_start_0
    iput-object v0, p0, Lcom/tencent/bugly/proguard/r;->c:Lcom/tencent/bugly/beta/download/DownloadTask;

    .line 27
    invoke-virtual {p0, p2}, Lcom/tencent/bugly/proguard/r;->a(Lcom/tencent/bugly/proguard/B;)Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/bugly/proguard/r;->b:Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    if-nez p1, :cond_6

    if-nez v0, :cond_0

    goto/16 :goto_1

    .line 28
    :cond_0
    iget-object p1, v0, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    if-eqz p1, :cond_2

    iget-object p1, p1, Lcom/tencent/bugly/proguard/B;->k:Lcom/tencent/bugly/proguard/x;

    if-eqz p1, :cond_2

    .line 29
    sget-object p1, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    iget-object p1, p1, Lcom/tencent/bugly/beta/global/e;->I:Ljava/io/File;

    if-eqz p1, :cond_2

    .line 30
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/tencent/bugly/proguard/r;->b:Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    iget-object v0, v0, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    iget-object v0, v0, Lcom/tencent/bugly/proguard/B;->k:Lcom/tencent/bugly/proguard/x;

    iget-object v0, v0, Lcom/tencent/bugly/proguard/x;->b:Ljava/lang/String;

    const-string v1, "SHA"

    .line 31
    invoke-static {p1, v0, v1}, Lcom/tencent/bugly/beta/global/a;->a(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 p2, 0x0

    .line 32
    new-array p3, p2, [Ljava/lang/Object;

    const-string v0, "patch has downloaded!"

    invoke-static {v0, p3}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 33
    sget-object p3, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    iget-boolean v0, p3, Lcom/tencent/bugly/beta/global/e;->P:Z

    if-nez v0, :cond_1

    iget p3, p3, Lcom/tencent/bugly/beta/global/e;->Q:I

    const/4 v0, 0x3

    if-gt p3, v0, :cond_1

    .line 34
    new-array p2, p2, [Ljava/lang/Object;

    const-string p3, "patch has downloaded but not patched execute patch!"

    invoke-static {p3, p2}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 35
    sget-object p2, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    iget p3, p2, Lcom/tencent/bugly/beta/global/e;->Q:I

    add-int/lit8 p3, p3, 0x1

    iput p3, p2, Lcom/tencent/bugly/beta/global/e;->Q:I

    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    const-string p3, "PATCH_MAX_TIMES"

    invoke-static {p3, p2}, Lcom/tencent/bugly/beta/global/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    sget-object p2, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    iget-object p2, p2, Lcom/tencent/bugly/beta/global/e;->J:Ljava/io/File;

    invoke-static {p1, p2}, Lcom/tencent/bugly/beta/global/a;->a(Ljava/io/File;Ljava/io/File;)Z

    .line 37
    invoke-static {}, Lcom/tencent/bugly/beta/tinker/TinkerManager;->getInstance()Lcom/tencent/bugly/beta/tinker/TinkerManager;

    move-result-object p1

    sget-object p2, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    iget-object p2, p2, Lcom/tencent/bugly/beta/global/e;->J:Ljava/io/File;

    .line 38
    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p2

    sget-object p3, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    iget-boolean p3, p3, Lcom/tencent/bugly/beta/global/e;->X:Z

    .line 39
    invoke-virtual {p1, p2, p3}, Lcom/tencent/bugly/beta/tinker/TinkerManager;->onDownloadSuccess(Ljava/lang/String;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    :goto_0
    monitor-exit p0

    return-void

    :cond_2
    if-eqz p2, :cond_5

    .line 40
    :try_start_1
    sget-object p1, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    iget-object p1, p1, Lcom/tencent/bugly/beta/global/e;->Y:Lcom/tencent/bugly/beta/interfaces/BetaPatchListener;

    if-eqz p1, :cond_3

    .line 41
    iget-object p1, p0, Lcom/tencent/bugly/proguard/r;->b:Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    iget-object p1, p1, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/B;->a()Lcom/tencent/bugly/proguard/x;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 42
    iget-object p2, p0, Lcom/tencent/bugly/proguard/r;->d:Landroid/os/Handler;

    new-instance v0, Lc7/r;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p1}, Lc7/r;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 43
    :cond_3
    sget-object p1, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    iget-boolean p2, p1, Lcom/tencent/bugly/beta/global/e;->aa:Z

    if-nez p2, :cond_4

    if-eqz p3, :cond_5

    :cond_4
    iget-boolean p1, p1, Lcom/tencent/bugly/beta/global/e;->ba:Z

    if-eqz p1, :cond_5

    .line 44
    invoke-direct {p0}, Lcom/tencent/bugly/proguard/r;->a()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_5
    monitor-exit p0

    return-void

    :cond_6
    :goto_1
    monitor-exit p0

    return-void

    :goto_2
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public a(ZZI)V
    .locals 10

    .line 1
    iget-object v8, p0, Lcom/tencent/bugly/proguard/r;->i:Ljava/lang/Object;

    monitor-enter v8

    const/4 v0, 0x3

    if-ne p3, v0, :cond_0

    if-nez p1, :cond_0

    const-string v1, "hotfix.strategy.bch"

    .line 2
    :try_start_0
    sget-object v3, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v3}, Lcom/tencent/bugly/beta/global/a;->a(Ljava/lang/String;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_6

    :cond_0
    const/4 v1, 0x0

    .line 3
    :goto_0
    iget-object v3, p0, Lcom/tencent/bugly/proguard/r;->f:Lcom/tencent/bugly/beta/upgrade/a;

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v3, :cond_2

    iget-boolean v6, v3, Lcom/tencent/bugly/beta/upgrade/a;->d:Z

    if-nez v6, :cond_2

    iget-boolean v6, p0, Lcom/tencent/bugly/proguard/r;->h:Z

    if-eq v6, p1, :cond_1

    goto :goto_1

    .line 4
    :cond_1
    monitor-enter v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    :try_start_1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/r;->f:Lcom/tencent/bugly/beta/upgrade/a;

    iget-object v0, v0, Lcom/tencent/bugly/beta/upgrade/a;->c:[Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    aput-object v1, v0, v4

    .line 6
    iget-object v0, p0, Lcom/tencent/bugly/proguard/r;->f:Lcom/tencent/bugly/beta/upgrade/a;

    iget-object v0, v0, Lcom/tencent/bugly/beta/upgrade/a;->c:[Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    aput-object v1, v0, v5

    .line 7
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 8
    :try_start_2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/r;->g:Lcom/tencent/bugly/beta/global/d;

    iget-object v0, v0, Lcom/tencent/bugly/beta/global/d;->b:[Ljava/lang/Object;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    aput-object v1, v0, v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto/16 :goto_5

    :catchall_1
    move-exception v0

    .line 9
    :try_start_3
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    throw v0

    .line 10
    :cond_2
    :goto_1
    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/r;->h:Z

    if-eqz v3, :cond_3

    .line 11
    iput-boolean v5, v3, Lcom/tencent/bugly/beta/upgrade/a;->d:Z

    .line 12
    :cond_3
    new-instance v3, Lcom/tencent/bugly/beta/upgrade/a;

    .line 13
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    new-array v0, v0, [Ljava/lang/Object;

    aput-object v6, v0, v4

    aput-object v9, v0, v5

    const/4 v6, 0x2

    aput-object v1, v0, v6

    const/16 v9, 0x324

    invoke-direct {v3, v5, v9, v0}, Lcom/tencent/bugly/beta/upgrade/a;-><init>(II[Ljava/lang/Object;)V

    iput-object v3, p0, Lcom/tencent/bugly/proguard/r;->f:Lcom/tencent/bugly/beta/upgrade/a;

    .line 14
    new-instance v0, Lcom/tencent/bugly/beta/global/d;

    new-array v6, v6, [Ljava/lang/Object;

    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    aput-object v9, v6, v4

    aput-object v3, v6, v5

    const/16 v3, 0xc

    invoke-direct {v0, v3, v6}, Lcom/tencent/bugly/beta/global/d;-><init>(I[Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/tencent/bugly/proguard/r;->g:Lcom/tencent/bugly/beta/global/d;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    const-string v0, ""

    if-eqz v1, :cond_4

    .line 15
    :try_start_5
    iget-object v1, v1, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    if-eqz v1, :cond_4

    .line 16
    iget-object v0, v1, Lcom/tencent/bugly/proguard/B;->r:Ljava/lang/String;

    .line 17
    iget-wide v3, v1, Lcom/tencent/bugly/proguard/B;->t:J

    :goto_2
    move-wide v4, v3

    move-object v3, v0

    goto :goto_3

    :catchall_2
    move-exception v0

    goto :goto_4

    :cond_4
    const-wide/16 v3, 0x0

    goto :goto_2

    .line 18
    :goto_3
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    const-string v0, "G16"

    .line 19
    :try_start_6
    sget-object v1, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    iget-object v1, v1, Lcom/tencent/bugly/beta/global/e;->N:Ljava/lang/String;

    invoke-virtual {v6, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    new-instance v1, Lcom/tencent/bugly/proguard/C;

    move v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/tencent/bugly/proguard/C;-><init>(ILjava/lang/String;JLjava/util/Map;)V

    .line 21
    invoke-static {v1}, Lcom/tencent/bugly/proguard/M;->a(Lcom/tencent/bugly/proguard/m;)[B

    move-result-object v4

    .line 22
    sget-object v1, Lcom/tencent/bugly/beta/upgrade/b;->a:Lcom/tencent/bugly/beta/upgrade/b;

    iget-object v5, p0, Lcom/tencent/bugly/proguard/r;->f:Lcom/tencent/bugly/beta/upgrade/a;

    sget-object v0, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    iget-object v0, v0, Lcom/tencent/bugly/beta/global/e;->H:Lcom/tencent/bugly/beta/upgrade/BetaUploadStrategy;

    iget-object v0, v0, Lcom/tencent/bugly/beta/upgrade/BetaUploadStrategy;->a:Lcom/tencent/bugly/proguard/sa;

    iget-object v0, v0, Lcom/tencent/bugly/proguard/sa;->h:Ljava/lang/String;

    const/16 v2, 0x324

    move v6, p1

    move v3, p3

    move-object v7, v0

    invoke-virtual/range {v1 .. v7}, Lcom/tencent/bugly/beta/upgrade/b;->a(II[BLcom/tencent/bugly/beta/upgrade/a;ZLjava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    goto :goto_5

    .line 23
    :goto_4
    :try_start_7
    invoke-static {v0}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/Throwable;)Z

    move-result v1

    if-nez v1, :cond_5

    .line 24
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 25
    :cond_5
    :goto_5
    monitor-exit v8

    return-void

    :goto_6
    monitor-exit v8
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    throw v0
.end method
