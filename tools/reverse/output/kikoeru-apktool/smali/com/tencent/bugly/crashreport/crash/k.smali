.class public Lcom/tencent/bugly/crashreport/crash/k;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field private static a:Lcom/tencent/bugly/crashreport/crash/k;


# instance fields
.field private b:Lcom/tencent/bugly/crashreport/common/strategy/c;

.field private c:Lcom/tencent/bugly/crashreport/common/info/a;

.field private d:Lcom/tencent/bugly/crashreport/crash/e;

.field private e:Landroid/content/Context;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/h;->g()Lcom/tencent/bugly/crashreport/crash/h;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/crashreport/common/strategy/c;->b()Lcom/tencent/bugly/crashreport/common/strategy/c;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iput-object v1, p0, Lcom/tencent/bugly/crashreport/crash/k;->b:Lcom/tencent/bugly/crashreport/common/strategy/c;

    .line 16
    .line 17
    invoke-static {p1}, Lcom/tencent/bugly/crashreport/common/info/a;->a(Landroid/content/Context;)Lcom/tencent/bugly/crashreport/common/info/a;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iput-object v1, p0, Lcom/tencent/bugly/crashreport/crash/k;->c:Lcom/tencent/bugly/crashreport/common/info/a;

    .line 22
    .line 23
    iget-object v0, v0, Lcom/tencent/bugly/crashreport/crash/h;->r:Lcom/tencent/bugly/crashreport/crash/e;

    .line 24
    .line 25
    iput-object v0, p0, Lcom/tencent/bugly/crashreport/crash/k;->d:Lcom/tencent/bugly/crashreport/crash/e;

    .line 26
    .line 27
    iput-object p1, p0, Lcom/tencent/bugly/crashreport/crash/k;->e:Landroid/content/Context;

    .line 28
    .line 29
    invoke-static {}, Lcom/tencent/bugly/proguard/W;->c()Lcom/tencent/bugly/proguard/W;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    new-instance v0, Lc7/r;

    .line 34
    .line 35
    const/4 v1, 0x1

    .line 36
    invoke-direct {v0, v1, p0}, Lc7/r;-><init>(ILjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, v0}, Lcom/tencent/bugly/proguard/W;->a(Ljava/lang/Runnable;)Z

    .line 40
    .line 41
    .line 42
    return-void
    .line 43
    .line 44
    .line 45
    .line 46
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
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method

.method public static synthetic a()Lcom/tencent/bugly/crashreport/crash/k;
    .locals 1

    .line 2
    sget-object v0, Lcom/tencent/bugly/crashreport/crash/k;->a:Lcom/tencent/bugly/crashreport/crash/k;

    return-object v0
.end method

.method public static a(Landroid/content/Context;)Lcom/tencent/bugly/crashreport/crash/k;
    .locals 1

    .line 4
    sget-object v0, Lcom/tencent/bugly/crashreport/crash/k;->a:Lcom/tencent/bugly/crashreport/crash/k;

    if-nez v0, :cond_0

    .line 5
    new-instance v0, Lcom/tencent/bugly/crashreport/crash/k;

    invoke-direct {v0, p0}, Lcom/tencent/bugly/crashreport/crash/k;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/tencent/bugly/crashreport/crash/k;->a:Lcom/tencent/bugly/crashreport/crash/k;

    .line 6
    :cond_0
    sget-object p0, Lcom/tencent/bugly/crashreport/crash/k;->a:Lcom/tencent/bugly/crashreport/crash/k;

    return-object p0
.end method

.method public static synthetic a(Lcom/tencent/bugly/crashreport/crash/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tencent/bugly/crashreport/crash/k;->b()V

    return-void
.end method

.method public static synthetic a(Lcom/tencent/bugly/crashreport/crash/k;Ljava/lang/Thread;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 0

    .line 3
    invoke-direct/range {p0 .. p6}, Lcom/tencent/bugly/crashreport/crash/k;->b(Ljava/lang/Thread;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public static a(Ljava/lang/Thread;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Thread;",
            "I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 7
    invoke-static {}, Lcom/tencent/bugly/proguard/W;->c()Lcom/tencent/bugly/proguard/W;

    move-result-object v0

    new-instance v1, Lcom/tencent/bugly/crashreport/crash/d;

    move-object v2, p0

    move v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    invoke-direct/range {v1 .. v7}, Lcom/tencent/bugly/crashreport/crash/d;-><init>(Ljava/lang/Thread;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/W;->a(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private b()V
    .locals 5

    const/4 v0, 0x0

    .line 1
    new-array v1, v0, [Ljava/lang/Object;

    const-string v2, "[ExtraCrashManager] Trying to notify Bugly agents."

    invoke-static {v2, v1}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 2
    :try_start_0
    const-class v1, Lcom/tencent/bugly/proguard/o;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v2, "com.tencent.bugly"

    .line 3
    :try_start_1
    iget-object v3, p0, Lcom/tencent/bugly/crashreport/crash/k;->c:Lcom/tencent/bugly/crashreport/common/info/a;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v3, "sdkPackageName"

    const/4 v4, 0x0

    .line 4
    :try_start_2
    invoke-static {v1, v3, v2, v4}, Lcom/tencent/bugly/proguard/ca;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const-string v1, "[ExtraCrashManager] Bugly game agent has been notified."

    .line 5
    :try_start_3
    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {v1, v2}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    return-void

    .line 6
    :catchall_0
    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "[ExtraCrashManager] no game agent"

    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void
.end method

.method private b(Ljava/lang/Thread;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Thread;",
            "I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v0, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    const-string v8, "[ExtraCrashManager] Successfully handled."

    if-nez p1, :cond_0

    .line 7
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    const/4 v3, 0x4

    const/4 v7, 0x1

    const/4 v9, 0x6

    const/16 v10, 0x8

    const/4 v11, 0x5

    const/4 v12, 0x0

    if-eq v0, v3, :cond_3

    if-eq v0, v11, :cond_2

    if-eq v0, v9, :cond_2

    if-eq v0, v10, :cond_1

    .line 8
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-array v2, v7, [Ljava/lang/Object;

    aput-object v0, v2, v12

    const-string v0, "[ExtraCrashManager] Unknown extra crash type: %d"

    invoke-static {v0, v2}, Lcom/tencent/bugly/proguard/X;->e(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    :cond_1
    const-string v3, "H5"

    goto :goto_1

    :cond_2
    const-string v3, "Cocos"

    goto :goto_1

    :cond_3
    const-string v3, "Unity"

    .line 9
    :goto_1
    new-array v13, v7, [Ljava/lang/Object;

    aput-object v3, v13, v12

    const-string v14, "[ExtraCrashManager] %s Crash Happen"

    invoke-static {v14, v13}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 10
    :try_start_0
    iget-object v13, v1, Lcom/tencent/bugly/crashreport/crash/k;->b:Lcom/tencent/bugly/crashreport/common/strategy/c;

    invoke-virtual {v13}, Lcom/tencent/bugly/crashreport/common/strategy/c;->d()Z

    move-result v13
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v13, :cond_4

    const-string v13, "[ExtraCrashManager] There is no remote strategy, but still store it."

    .line 11
    :try_start_1
    new-array v14, v12, [Ljava/lang/Object;

    invoke-static {v13, v14}, Lcom/tencent/bugly/proguard/X;->e(Ljava/lang/String;[Ljava/lang/Object;)Z

    goto :goto_2

    :catchall_0
    move-exception v0

    goto/16 :goto_6

    .line 12
    :cond_4
    :goto_2
    iget-object v13, v1, Lcom/tencent/bugly/crashreport/crash/k;->b:Lcom/tencent/bugly/crashreport/common/strategy/c;

    invoke-virtual {v13}, Lcom/tencent/bugly/crashreport/common/strategy/c;->c()Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    move-result-object v13

    .line 13
    iget-boolean v14, v13, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->f:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v15, "\n"

    if-nez v14, :cond_5

    :try_start_2
    iget-object v14, v1, Lcom/tencent/bugly/crashreport/crash/k;->b:Lcom/tencent/bugly/crashreport/common/strategy/c;

    invoke-virtual {v14}, Lcom/tencent/bugly/crashreport/common/strategy/c;->d()Z

    move-result v14
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v14, :cond_5

    const-string v0, "[ExtraCrashManager] Crash report was closed by remote , will not upload to Bugly , print local for helpful!"

    .line 14
    :try_start_3
    new-array v7, v12, [Ljava/lang/Object;

    invoke-static {v0, v7}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 15
    invoke-static {}, Lcom/tencent/bugly/proguard/ca;->a()Ljava/lang/String;

    move-result-object v0

    iget-object v7, v1, Lcom/tencent/bugly/crashreport/crash/k;->c:Lcom/tencent/bugly/crashreport/common/info/a;

    iget-object v7, v7, Lcom/tencent/bugly/crashreport/common/info/a;->h:Ljava/lang/String;

    .line 16
    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v2

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    move-object/from16 p2, v0

    move-object/from16 p4, v2

    move-object/from16 p1, v3

    move-object/from16 p5, v4

    move-object/from16 p6, v5

    move-object/from16 p3, v7

    .line 17
    invoke-static/range {p1 .. p6}, Lcom/tencent/bugly/crashreport/crash/e;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 18
    new-array v0, v12, [Ljava/lang/Object;

    invoke-static {v8, v0}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    :cond_5
    move-object v14, v3

    const-string v3, "[ExtraCrashManager] %s report is disabled."

    if-eq v0, v11, :cond_7

    if-eq v0, v9, :cond_7

    if-eq v0, v10, :cond_6

    goto :goto_3

    .line 19
    :cond_6
    :try_start_4
    iget-boolean v9, v13, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->l:Z

    if-nez v9, :cond_8

    .line 20
    new-array v0, v7, [Ljava/lang/Object;

    aput-object v14, v0, v12

    invoke-static {v3, v0}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 21
    new-array v0, v12, [Ljava/lang/Object;

    invoke-static {v8, v0}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    .line 22
    :cond_7
    :try_start_5
    iget-boolean v9, v13, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->k:Z

    if-nez v9, :cond_8

    .line 23
    new-array v0, v7, [Ljava/lang/Object;

    aput-object v14, v0, v12

    invoke-static {v3, v0}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 24
    new-array v0, v12, [Ljava/lang/Object;

    invoke-static {v8, v0}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    :cond_8
    :goto_3
    if-ne v0, v10, :cond_9

    const/4 v3, 0x5

    :goto_4
    move-object/from16 v7, p6

    goto :goto_5

    :cond_9
    move v3, v0

    goto :goto_4

    .line 25
    :goto_5
    :try_start_6
    invoke-direct/range {v1 .. v7}, Lcom/tencent/bugly/crashreport/crash/k;->c(Ljava/lang/Thread;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;

    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    if-nez v0, :cond_a

    const-string v0, "[ExtraCrashManager] Failed to package crash data."

    .line 26
    :try_start_7
    new-array v2, v12, [Ljava/lang/Object;

    invoke-static {v0, v2}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 27
    new-array v0, v12, [Ljava/lang/Object;

    invoke-static {v8, v0}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    .line 28
    :cond_a
    :try_start_8
    invoke-static {}, Lcom/tencent/bugly/proguard/ca;->a()Ljava/lang/String;

    move-result-object v3

    iget-object v7, v1, Lcom/tencent/bugly/crashreport/crash/k;->c:Lcom/tencent/bugly/crashreport/common/info/a;

    iget-object v7, v7, Lcom/tencent/bugly/crashreport/common/info/a;->h:Ljava/lang/String;

    .line 29
    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v2

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    move-object/from16 p6, v0

    move-object/from16 p4, v2

    move-object/from16 p2, v3

    move-object/from16 p5, v4

    move-object/from16 p3, v7

    move-object/from16 p1, v14

    .line 30
    invoke-static/range {p1 .. p6}, Lcom/tencent/bugly/crashreport/crash/e;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V

    move-object/from16 v0, p6

    .line 31
    iget-object v2, v1, Lcom/tencent/bugly/crashreport/crash/k;->d:Lcom/tencent/bugly/crashreport/crash/e;

    invoke-virtual {v2, v0}, Lcom/tencent/bugly/crashreport/crash/e;->c(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)Z

    move-result v2

    if-nez v2, :cond_b

    .line 32
    iget-object v2, v1, Lcom/tencent/bugly/crashreport/crash/k;->d:Lcom/tencent/bugly/crashreport/crash/e;

    const-wide/16 v3, 0xbb8

    invoke-virtual {v2, v0, v3, v4, v12}, Lcom/tencent/bugly/crashreport/crash/e;->a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;JZ)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 33
    :cond_b
    new-array v0, v12, [Ljava/lang/Object;

    invoke-static {v8, v0}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    .line 34
    :goto_6
    :try_start_9
    invoke-static {v0}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/Throwable;)Z

    move-result v2

    if-nez v2, :cond_c

    .line 35
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    goto :goto_7

    :catchall_1
    move-exception v0

    goto :goto_8

    .line 36
    :cond_c
    :goto_7
    new-array v0, v12, [Ljava/lang/Object;

    invoke-static {v8, v0}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    :goto_8
    new-array v2, v12, [Ljava/lang/Object;

    invoke-static {v8, v2}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 37
    throw v0
.end method

.method private c(Ljava/lang/Thread;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Thread;",
            "I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/tencent/bugly/crashreport/common/info/b;->h()J

    .line 7
    .line 8
    .line 9
    move-result-wide v1

    .line 10
    iput-wide v1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->C:J

    .line 11
    .line 12
    invoke-static {}, Lcom/tencent/bugly/crashreport/common/info/b;->j()J

    .line 13
    .line 14
    .line 15
    move-result-wide v1

    .line 16
    iput-wide v1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->D:J

    .line 17
    .line 18
    invoke-static {}, Lcom/tencent/bugly/crashreport/common/info/b;->g()J

    .line 19
    .line 20
    .line 21
    move-result-wide v1

    .line 22
    iput-wide v1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->E:J

    .line 23
    .line 24
    iget-object v1, p0, Lcom/tencent/bugly/crashreport/crash/k;->c:Lcom/tencent/bugly/crashreport/common/info/a;

    .line 25
    .line 26
    invoke-virtual {v1}, Lcom/tencent/bugly/crashreport/common/info/a;->v()J

    .line 27
    .line 28
    .line 29
    move-result-wide v1

    .line 30
    iput-wide v1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->F:J

    .line 31
    .line 32
    iget-object v1, p0, Lcom/tencent/bugly/crashreport/crash/k;->c:Lcom/tencent/bugly/crashreport/common/info/a;

    .line 33
    .line 34
    invoke-virtual {v1}, Lcom/tencent/bugly/crashreport/common/info/a;->w()J

    .line 35
    .line 36
    .line 37
    move-result-wide v1

    .line 38
    iput-wide v1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->G:J

    .line 39
    .line 40
    iget-object v1, p0, Lcom/tencent/bugly/crashreport/crash/k;->c:Lcom/tencent/bugly/crashreport/common/info/a;

    .line 41
    .line 42
    invoke-virtual {v1}, Lcom/tencent/bugly/crashreport/common/info/a;->x()J

    .line 43
    .line 44
    .line 45
    move-result-wide v1

    .line 46
    iput-wide v1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->H:J

    .line 47
    .line 48
    iget-object v1, p0, Lcom/tencent/bugly/crashreport/crash/k;->e:Landroid/content/Context;

    .line 49
    .line 50
    sget v2, Lcom/tencent/bugly/crashreport/crash/h;->e:I

    .line 51
    .line 52
    sget-object v3, Lcom/tencent/bugly/crashreport/crash/h;->h:Ljava/lang/String;

    .line 53
    .line 54
    invoke-static {v1, v2, v3}, Lcom/tencent/bugly/proguard/ca;->a(Landroid/content/Context;ILjava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    iput-object v1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->w:Ljava/lang/String;

    .line 59
    .line 60
    iput p2, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->b:I

    .line 61
    .line 62
    iget-object p2, p0, Lcom/tencent/bugly/crashreport/crash/k;->c:Lcom/tencent/bugly/crashreport/common/info/a;

    .line 63
    .line 64
    invoke-virtual {p2}, Lcom/tencent/bugly/crashreport/common/info/a;->l()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    iput-object p2, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->e:Ljava/lang/String;

    .line 69
    .line 70
    iget-object p2, p0, Lcom/tencent/bugly/crashreport/crash/k;->c:Lcom/tencent/bugly/crashreport/common/info/a;

    .line 71
    .line 72
    iget-object v1, p2, Lcom/tencent/bugly/crashreport/common/info/a;->E:Ljava/lang/String;

    .line 73
    .line 74
    iput-object v1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->f:Ljava/lang/String;

    .line 75
    .line 76
    invoke-virtual {p2}, Lcom/tencent/bugly/crashreport/common/info/a;->i()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    iput-object p2, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->g:Ljava/lang/String;

    .line 81
    .line 82
    iget-object p2, p0, Lcom/tencent/bugly/crashreport/crash/k;->c:Lcom/tencent/bugly/crashreport/common/info/a;

    .line 83
    .line 84
    invoke-virtual {p2}, Lcom/tencent/bugly/crashreport/common/info/a;->y()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    iput-object p2, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->m:Ljava/lang/String;

    .line 89
    .line 90
    const-string p2, ""

    .line 91
    .line 92
    invoke-static {p2, p3}, Lj2/h0;->x(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p3

    .line 96
    iput-object p3, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->n:Ljava/lang/String;

    .line 97
    .line 98
    invoke-static {p2, p4}, Lj2/h0;->x(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p3

    .line 102
    iput-object p3, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->o:Ljava/lang/String;

    .line 103
    .line 104
    const/4 p3, 0x0

    .line 105
    if-eqz p5, :cond_0

    .line 106
    .line 107
    const-string p4, "\n"

    .line 108
    .line 109
    invoke-virtual {p5, p4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p4

    .line 113
    array-length v1, p4

    .line 114
    if-lez v1, :cond_1

    .line 115
    .line 116
    aget-object p2, p4, p3

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_0
    move-object p5, p2

    .line 120
    :cond_1
    :goto_0
    iput-object p2, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->p:Ljava/lang/String;

    .line 121
    .line 122
    iput-object p5, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->q:Ljava/lang/String;

    .line 123
    .line 124
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 125
    .line 126
    .line 127
    move-result-wide p4

    .line 128
    iput-wide p4, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->r:J

    .line 129
    .line 130
    iget-object p2, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->q:Ljava/lang/String;

    .line 131
    .line 132
    invoke-virtual {p2}, Ljava/lang/String;->getBytes()[B

    .line 133
    .line 134
    .line 135
    move-result-object p2

    .line 136
    invoke-static {p2}, Lcom/tencent/bugly/proguard/ca;->c([B)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p2

    .line 140
    iput-object p2, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->u:Ljava/lang/String;

    .line 141
    .line 142
    sget p2, Lcom/tencent/bugly/crashreport/crash/h;->f:I

    .line 143
    .line 144
    invoke-static {p2, p3}, Lcom/tencent/bugly/proguard/ca;->a(IZ)Ljava/util/Map;

    .line 145
    .line 146
    .line 147
    move-result-object p2

    .line 148
    iput-object p2, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->z:Ljava/util/Map;

    .line 149
    .line 150
    iget-object p2, p0, Lcom/tencent/bugly/crashreport/crash/k;->c:Lcom/tencent/bugly/crashreport/common/info/a;

    .line 151
    .line 152
    iget-object p2, p2, Lcom/tencent/bugly/crashreport/common/info/a;->h:Ljava/lang/String;

    .line 153
    .line 154
    iput-object p2, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->A:Ljava/lang/String;

    .line 155
    .line 156
    new-instance p2, Ljava/lang/StringBuilder;

    .line 157
    .line 158
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 159
    .line 160
    .line 161
    invoke-virtual {p1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p3

    .line 165
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    const-string p3, "("

    .line 169
    .line 170
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {p1}, Ljava/lang/Thread;->getId()J

    .line 174
    .line 175
    .line 176
    move-result-wide p3

    .line 177
    invoke-virtual {p2, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    const-string p1, ")"

    .line 181
    .line 182
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    iput-object p1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->B:Ljava/lang/String;

    .line 190
    .line 191
    iget-object p1, p0, Lcom/tencent/bugly/crashreport/crash/k;->c:Lcom/tencent/bugly/crashreport/common/info/a;

    .line 192
    .line 193
    invoke-virtual {p1}, Lcom/tencent/bugly/crashreport/common/info/a;->r()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    iput-object p1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->I:Ljava/lang/String;

    .line 198
    .line 199
    iget-object p1, p0, Lcom/tencent/bugly/crashreport/crash/k;->c:Lcom/tencent/bugly/crashreport/common/info/a;

    .line 200
    .line 201
    invoke-virtual {p1}, Lcom/tencent/bugly/crashreport/common/info/a;->p()Ljava/util/Map;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    iput-object p1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->h:Ljava/util/Map;

    .line 206
    .line 207
    iget-object p1, p0, Lcom/tencent/bugly/crashreport/crash/k;->c:Lcom/tencent/bugly/crashreport/common/info/a;

    .line 208
    .line 209
    iget-wide p2, p1, Lcom/tencent/bugly/crashreport/common/info/a;->d:J

    .line 210
    .line 211
    iput-wide p2, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->N:J

    .line 212
    .line 213
    invoke-virtual {p1}, Lcom/tencent/bugly/crashreport/common/info/a;->C()Z

    .line 214
    .line 215
    .line 216
    move-result p1

    .line 217
    iput-boolean p1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->O:Z

    .line 218
    .line 219
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/h;->g()Lcom/tencent/bugly/crashreport/crash/h;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    invoke-virtual {p1}, Lcom/tencent/bugly/crashreport/crash/h;->f()Z

    .line 224
    .line 225
    .line 226
    move-result p1

    .line 227
    if-nez p1, :cond_2

    .line 228
    .line 229
    iget-object p1, p0, Lcom/tencent/bugly/crashreport/crash/k;->d:Lcom/tencent/bugly/crashreport/crash/e;

    .line 230
    .line 231
    invoke-virtual {p1, v0}, Lcom/tencent/bugly/crashreport/crash/e;->d(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V

    .line 232
    .line 233
    .line 234
    :cond_2
    iget-object p1, p0, Lcom/tencent/bugly/crashreport/crash/k;->c:Lcom/tencent/bugly/crashreport/common/info/a;

    .line 235
    .line 236
    invoke-virtual {p1}, Lcom/tencent/bugly/crashreport/common/info/a;->A()I

    .line 237
    .line 238
    .line 239
    move-result p1

    .line 240
    iput p1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->R:I

    .line 241
    .line 242
    iget-object p1, p0, Lcom/tencent/bugly/crashreport/crash/k;->c:Lcom/tencent/bugly/crashreport/common/info/a;

    .line 243
    .line 244
    invoke-virtual {p1}, Lcom/tencent/bugly/crashreport/common/info/a;->t()I

    .line 245
    .line 246
    .line 247
    move-result p1

    .line 248
    iput p1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->S:I

    .line 249
    .line 250
    iget-object p1, p0, Lcom/tencent/bugly/crashreport/crash/k;->c:Lcom/tencent/bugly/crashreport/common/info/a;

    .line 251
    .line 252
    invoke-virtual {p1}, Lcom/tencent/bugly/crashreport/common/info/a;->h()Ljava/util/Map;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    iput-object p1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->T:Ljava/util/Map;

    .line 257
    .line 258
    iget-object p1, p0, Lcom/tencent/bugly/crashreport/crash/k;->c:Lcom/tencent/bugly/crashreport/common/info/a;

    .line 259
    .line 260
    invoke-virtual {p1}, Lcom/tencent/bugly/crashreport/common/info/a;->g()Ljava/util/Map;

    .line 261
    .line 262
    .line 263
    move-result-object p1

    .line 264
    iput-object p1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->U:Ljava/util/Map;

    .line 265
    .line 266
    invoke-static {}, Lcom/tencent/bugly/proguard/ba;->b()[B

    .line 267
    .line 268
    .line 269
    move-result-object p1

    .line 270
    iput-object p1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->y:[B

    .line 271
    .line 272
    iget-object p1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->P:Ljava/util/Map;

    .line 273
    .line 274
    if-nez p1, :cond_3

    .line 275
    .line 276
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 277
    .line 278
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 279
    .line 280
    .line 281
    iput-object p1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->P:Ljava/util/Map;

    .line 282
    .line 283
    :cond_3
    if-eqz p6, :cond_4

    .line 284
    .line 285
    iget-object p1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->P:Ljava/util/Map;

    .line 286
    .line 287
    invoke-interface {p1, p6}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 288
    .line 289
    .line 290
    :cond_4
    return-object v0
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
.end method
