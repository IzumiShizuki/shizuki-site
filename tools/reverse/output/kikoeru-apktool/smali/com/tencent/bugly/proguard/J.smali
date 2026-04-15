.class public Lcom/tencent/bugly/proguard/J;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field private static a:Lcom/tencent/bugly/proguard/J; = null

.field private static b:Lcom/tencent/bugly/proguard/K; = null

.field public static c:Z = false


# direct methods
.method private constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/a;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/tencent/bugly/proguard/K;

    .line 5
    .line 6
    invoke-direct {v0, p1, p2}, Lcom/tencent/bugly/proguard/K;-><init>(Landroid/content/Context;Ljava/util/List;)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/tencent/bugly/proguard/J;->b:Lcom/tencent/bugly/proguard/K;

    .line 10
    .line 11
    return-void
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
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
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
.end method

.method public static synthetic a(Lcom/tencent/bugly/proguard/J;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Lcom/tencent/bugly/proguard/I;)I
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/tencent/bugly/proguard/J;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Lcom/tencent/bugly/proguard/I;)I

    move-result p0

    return p0
.end method

.method private declared-synchronized a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Lcom/tencent/bugly/proguard/I;)I
    .locals 3

    monitor-enter p0

    const/4 v0, 0x0

    .line 59
    :try_start_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 60
    :try_start_1
    sget-object v2, Lcom/tencent/bugly/proguard/J;->b:Lcom/tencent/bugly/proguard/K;

    invoke-virtual {v2}, Lcom/tencent/bugly/proguard/K;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    if-eqz v2, :cond_0

    .line 61
    :try_start_2
    invoke-virtual {v2, p1, p2, p3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    :goto_0
    if-eqz p4, :cond_1

    .line 62
    :try_start_3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p4, p1}, Lcom/tencent/bugly/proguard/I;->a(Ljava/lang/Object;)V

    goto :goto_1

    :catchall_1
    move-exception p1

    goto :goto_6

    .line 63
    :cond_1
    :goto_1
    sget-boolean p1, Lcom/tencent/bugly/proguard/J;->c:Z

    if-eqz p1, :cond_4

    if-eqz v2, :cond_4

    .line 64
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteClosable;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_4

    :catchall_2
    move-exception p1

    const/4 v2, 0x0

    .line 65
    :goto_2
    :try_start_4
    invoke-static {p1}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/Throwable;)Z

    move-result p2

    if-nez p2, :cond_2

    .line 66
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    goto :goto_3

    :catchall_3
    move-exception p1

    goto :goto_5

    :cond_2
    :goto_3
    if-eqz p4, :cond_3

    .line 67
    :try_start_5
    invoke-interface {p4, v1}, Lcom/tencent/bugly/proguard/I;->a(Ljava/lang/Object;)V

    .line 68
    :cond_3
    sget-boolean p1, Lcom/tencent/bugly/proguard/J;->c:Z

    if-eqz p1, :cond_4

    if-eqz v2, :cond_4

    .line 69
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteClosable;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :cond_4
    :goto_4
    monitor-exit p0

    return v0

    :goto_5
    if-eqz p4, :cond_5

    .line 70
    :try_start_6
    invoke-interface {p4, v1}, Lcom/tencent/bugly/proguard/I;->a(Ljava/lang/Object;)V

    .line 71
    :cond_5
    sget-boolean p2, Lcom/tencent/bugly/proguard/J;->c:Z

    if-eqz p2, :cond_6

    if-eqz v2, :cond_6

    .line 72
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteClosable;->close()V

    .line 73
    :cond_6
    throw p1

    :goto_6
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    throw p1
.end method

.method public static synthetic a(Lcom/tencent/bugly/proguard/J;Ljava/lang/String;Landroid/content/ContentValues;Lcom/tencent/bugly/proguard/I;)J
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/tencent/bugly/proguard/J;->a(Ljava/lang/String;Landroid/content/ContentValues;Lcom/tencent/bugly/proguard/I;)J

    move-result-wide p0

    return-wide p0
.end method

.method private declared-synchronized a(Ljava/lang/String;Landroid/content/ContentValues;Lcom/tencent/bugly/proguard/I;)J
    .locals 8

    monitor-enter p0

    const-wide/16 v0, 0x0

    .line 35
    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 36
    :try_start_1
    sget-object v3, Lcom/tencent/bugly/proguard/J;->b:Lcom/tencent/bugly/proguard/K;

    invoke-virtual {v3}, Lcom/tencent/bugly/proguard/K;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    if-eqz v3, :cond_1

    if-eqz p2, :cond_1

    :try_start_2
    const-string v4, "_id"
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 37
    :try_start_3
    invoke-virtual {v3, p1, v4, p2}, Landroid/database/sqlite/SQLiteDatabase;->replace(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    const/4 p2, 0x0

    const/4 v6, 0x1

    cmp-long v7, v4, v0

    if-ltz v7, :cond_0

    :try_start_4
    const-string v7, "[Database] insert %s success."
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 38
    :try_start_5
    new-array v6, v6, [Ljava/lang/Object;

    aput-object p1, v6, p2

    invoke-static {v7, v6}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catchall_1
    move-exception p1

    goto :goto_5

    :cond_0
    :try_start_6
    const-string v7, "[Database] replace %s error."
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 39
    :try_start_7
    new-array v6, v6, [Ljava/lang/Object;

    aput-object p1, v6, p2

    invoke-static {v7, v6}, Lcom/tencent/bugly/proguard/X;->e(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :goto_0
    move-wide v0, v4

    :cond_1
    if-eqz p3, :cond_2

    .line 40
    :try_start_8
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {p3, p1}, Lcom/tencent/bugly/proguard/I;->a(Ljava/lang/Object;)V

    .line 41
    :cond_2
    sget-boolean p1, Lcom/tencent/bugly/proguard/J;->c:Z

    if-eqz p1, :cond_5

    if-eqz v3, :cond_5

    .line 42
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteClosable;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    goto :goto_3

    :catchall_2
    move-exception p1

    const/4 v3, 0x0

    .line 43
    :goto_1
    :try_start_9
    invoke-static {p1}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/Throwable;)Z

    move-result p2

    if-nez p2, :cond_3

    .line 44
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    goto :goto_2

    :catchall_3
    move-exception p1

    goto :goto_4

    :cond_3
    :goto_2
    if-eqz p3, :cond_4

    .line 45
    :try_start_a
    invoke-interface {p3, v2}, Lcom/tencent/bugly/proguard/I;->a(Ljava/lang/Object;)V

    .line 46
    :cond_4
    sget-boolean p1, Lcom/tencent/bugly/proguard/J;->c:Z

    if-eqz p1, :cond_5

    if-eqz v3, :cond_5

    .line 47
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteClosable;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    :cond_5
    :goto_3
    monitor-exit p0

    return-wide v0

    :goto_4
    if-eqz p3, :cond_6

    .line 48
    :try_start_b
    invoke-interface {p3, v2}, Lcom/tencent/bugly/proguard/I;->a(Ljava/lang/Object;)V

    .line 49
    :cond_6
    sget-boolean p2, Lcom/tencent/bugly/proguard/J;->c:Z

    if-eqz p2, :cond_7

    if-eqz v3, :cond_7

    .line 50
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteClosable;->close()V

    .line 51
    :cond_7
    throw p1

    :goto_5
    monitor-exit p0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    throw p1
.end method

.method public static synthetic a(Lcom/tencent/bugly/proguard/J;ZLjava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/proguard/I;)Landroid/database/Cursor;
    .locals 0

    .line 3
    invoke-direct/range {p0 .. p10}, Lcom/tencent/bugly/proguard/J;->a(ZLjava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/proguard/I;)Landroid/database/Cursor;

    move-result-object p0

    return-object p0
.end method

.method private declared-synchronized a(ZLjava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/proguard/I;)Landroid/database/Cursor;
    .locals 13

    move-object/from16 v1, p10

    monitor-enter p0

    const/4 v2, 0x0

    .line 52
    :try_start_0
    sget-object v0, Lcom/tencent/bugly/proguard/J;->b:Lcom/tencent/bugly/proguard/K;

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/K;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v3

    if-eqz v3, :cond_0

    move v4, p1

    move-object v5, p2

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    move-object/from16 v10, p7

    move-object/from16 v11, p8

    move-object/from16 v12, p9

    .line 53
    invoke-virtual/range {v3 .. v12}, Landroid/database/sqlite/SQLiteDatabase;->query(ZLjava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_1

    :cond_0
    :goto_0
    if-eqz v1, :cond_2

    .line 54
    :try_start_1
    invoke-interface {v1, v2}, Lcom/tencent/bugly/proguard/I;->a(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object p1, v0

    goto :goto_5

    .line 55
    :goto_1
    :try_start_2
    invoke-static {p1}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/Throwable;)Z

    move-result p2

    if-nez p2, :cond_1

    .line 56
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_2

    :catchall_2
    move-exception v0

    move-object p1, v0

    goto :goto_4

    :cond_1
    :goto_2
    if-eqz v1, :cond_2

    .line 57
    :try_start_3
    invoke-interface {v1, v2}, Lcom/tencent/bugly/proguard/I;->a(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :cond_2
    :goto_3
    monitor-exit p0

    return-object v2

    :goto_4
    if-eqz v1, :cond_3

    :try_start_4
    invoke-interface {v1, v2}, Lcom/tencent/bugly/proguard/I;->a(Ljava/lang/Object;)V

    .line 58
    :cond_3
    throw p1

    :goto_5
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw p1
.end method

.method public static declared-synchronized a()Lcom/tencent/bugly/proguard/J;
    .locals 2

    const-class v0, Lcom/tencent/bugly/proguard/J;

    monitor-enter v0

    .line 10
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/proguard/J;->a:Lcom/tencent/bugly/proguard/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public static declared-synchronized a(Landroid/content/Context;Ljava/util/List;)Lcom/tencent/bugly/proguard/J;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/a;",
            ">;)",
            "Lcom/tencent/bugly/proguard/J;"
        }
    .end annotation

    const-class v0, Lcom/tencent/bugly/proguard/J;

    monitor-enter v0

    .line 7
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/proguard/J;->a:Lcom/tencent/bugly/proguard/J;

    if-nez v1, :cond_0

    .line 8
    new-instance v1, Lcom/tencent/bugly/proguard/J;

    invoke-direct {v1, p0, p1}, Lcom/tencent/bugly/proguard/J;-><init>(Landroid/content/Context;Ljava/util/List;)V

    sput-object v1, Lcom/tencent/bugly/proguard/J;->a:Lcom/tencent/bugly/proguard/J;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    .line 9
    :cond_0
    :goto_0
    sget-object p0, Lcom/tencent/bugly/proguard/J;->a:Lcom/tencent/bugly/proguard/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method private a(ILcom/tencent/bugly/proguard/I;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/tencent/bugly/proguard/I;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "[B>;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 96
    :try_start_0
    invoke-direct {p0, p1}, Lcom/tencent/bugly/proguard/J;->c(I)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 97
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 98
    :try_start_1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tencent/bugly/proguard/L;

    .line 99
    iget-object v2, v0, Lcom/tencent/bugly/proguard/L;->g:[B

    if-eqz v2, :cond_0

    .line 100
    iget-object v0, v0, Lcom/tencent/bugly/proguard/L;->f:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    move-object v0, v1

    goto :goto_2

    :goto_1
    move-object v0, v1

    goto :goto_3

    :catchall_1
    move-exception p1

    goto :goto_3

    :cond_2
    :goto_2
    if-eqz p2, :cond_3

    .line 101
    invoke-interface {p2, v0}, Lcom/tencent/bugly/proguard/I;->a(Ljava/lang/Object;)V

    :cond_3
    return-object v0

    .line 102
    :goto_3
    :try_start_2
    invoke-static {p1}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/Throwable;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 103
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_4

    :catchall_2
    move-exception p1

    goto :goto_5

    :cond_4
    :goto_4
    if-eqz p2, :cond_5

    .line 104
    invoke-interface {p2, v0}, Lcom/tencent/bugly/proguard/I;->a(Ljava/lang/Object;)V

    :cond_5
    return-object v0

    :goto_5
    if-eqz p2, :cond_6

    invoke-interface {p2, v0}, Lcom/tencent/bugly/proguard/I;->a(Ljava/lang/Object;)V

    .line 105
    :cond_6
    throw p1
.end method

.method public static synthetic a(Lcom/tencent/bugly/proguard/J;ILcom/tencent/bugly/proguard/I;)Ljava/util/Map;
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2}, Lcom/tencent/bugly/proguard/J;->a(ILcom/tencent/bugly/proguard/I;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private declared-synchronized a(ILjava/lang/String;Lcom/tencent/bugly/proguard/I;)Z
    .locals 8

    const-string v0, " and _tp = \""

    const-string v1, "_id = "

    const-string v2, "_id = "

    monitor-enter p0

    .line 177
    :try_start_0
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 178
    :try_start_1
    sget-object v6, Lcom/tencent/bugly/proguard/J;->b:Lcom/tencent/bugly/proguard/K;

    invoke-virtual {v6}, Lcom/tencent/bugly/proguard/K;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    if-eqz v6, :cond_1

    .line 179
    :try_start_2
    invoke-static {p2}, Lcom/tencent/bugly/proguard/ca;->b(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_0

    .line 180
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 181
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    const-string p1, "\""
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_0
    :try_start_5
    const-string p2, "t_pf"
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 182
    :try_start_6
    invoke-virtual {v6, p2, p1, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :try_start_7
    const-string p2, "[Database] deleted %s data %d"
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 183
    :try_start_8
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "t_pf"

    aput-object v2, v1, v5

    const/4 v2, 0x1

    aput-object v0, v1, v2

    invoke-static {p2, v1}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    if-lez p1, :cond_1

    const/4 v5, 0x1

    goto :goto_2

    :catchall_1
    move-exception p1

    goto :goto_7

    :goto_1
    move-object v4, v6

    goto :goto_3

    :cond_1
    :goto_2
    if-eqz p3, :cond_2

    .line 184
    :try_start_9
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p3, p1}, Lcom/tencent/bugly/proguard/I;->a(Ljava/lang/Object;)V

    .line 185
    :cond_2
    sget-boolean p1, Lcom/tencent/bugly/proguard/J;->c:Z
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    if-eqz p1, :cond_5

    if-eqz v6, :cond_5

    goto :goto_5

    :catchall_2
    move-exception p1

    .line 186
    :goto_3
    :try_start_a
    invoke-static {p1}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/Throwable;)Z

    move-result p2

    if-nez p2, :cond_3

    .line 187
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    goto :goto_4

    :catchall_3
    move-exception p1

    goto :goto_6

    :cond_3
    :goto_4
    if-eqz p3, :cond_4

    .line 188
    :try_start_b
    invoke-interface {p3, v3}, Lcom/tencent/bugly/proguard/I;->a(Ljava/lang/Object;)V

    .line 189
    :cond_4
    sget-boolean p1, Lcom/tencent/bugly/proguard/J;->c:Z

    if-eqz p1, :cond_5

    if-eqz v4, :cond_5

    move-object v6, v4

    .line 190
    :goto_5
    invoke-virtual {v6}, Landroid/database/sqlite/SQLiteClosable;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 191
    :cond_5
    monitor-exit p0

    return v5

    :goto_6
    if-eqz p3, :cond_6

    .line 192
    :try_start_c
    invoke-interface {p3, v3}, Lcom/tencent/bugly/proguard/I;->a(Ljava/lang/Object;)V

    .line 193
    :cond_6
    sget-boolean p2, Lcom/tencent/bugly/proguard/J;->c:Z

    if-eqz p2, :cond_7

    if-eqz v4, :cond_7

    .line 194
    invoke-virtual {v4}, Landroid/database/sqlite/SQLiteClosable;->close()V

    .line 195
    :cond_7
    throw p1

    :goto_7
    monitor-exit p0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    throw p1
.end method

.method private a(ILjava/lang/String;[BLcom/tencent/bugly/proguard/I;)Z
    .locals 4

    .line 84
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 85
    :try_start_0
    new-instance v1, Lcom/tencent/bugly/proguard/L;

    invoke-direct {v1}, Lcom/tencent/bugly/proguard/L;-><init>()V

    int-to-long v2, p1

    .line 86
    iput-wide v2, v1, Lcom/tencent/bugly/proguard/L;->a:J

    .line 87
    iput-object p2, v1, Lcom/tencent/bugly/proguard/L;->f:Ljava/lang/String;

    .line 88
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iput-wide p1, v1, Lcom/tencent/bugly/proguard/L;->e:J

    .line 89
    iput-object p3, v1, Lcom/tencent/bugly/proguard/L;->g:[B

    .line 90
    invoke-direct {p0, v1}, Lcom/tencent/bugly/proguard/J;->d(Lcom/tencent/bugly/proguard/L;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p4, :cond_0

    .line 91
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-interface {p4, p2}, Lcom/tencent/bugly/proguard/I;->a(Ljava/lang/Object;)V

    :cond_0
    return p1

    :catchall_0
    move-exception p1

    .line 92
    :try_start_1
    invoke-static {p1}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/Throwable;)Z

    move-result p2

    if-nez p2, :cond_1

    .line 93
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    goto :goto_1

    :cond_1
    :goto_0
    if-eqz p4, :cond_2

    .line 94
    invoke-interface {p4, v0}, Lcom/tencent/bugly/proguard/I;->a(Ljava/lang/Object;)V

    :cond_2
    const/4 p1, 0x0

    return p1

    :goto_1
    if-eqz p4, :cond_3

    invoke-interface {p4, v0}, Lcom/tencent/bugly/proguard/I;->a(Ljava/lang/Object;)V

    .line 95
    :cond_3
    throw p1
.end method

.method public static synthetic a(Lcom/tencent/bugly/proguard/J;ILjava/lang/String;Lcom/tencent/bugly/proguard/I;)Z
    .locals 0

    .line 6
    invoke-direct {p0, p1, p2, p3}, Lcom/tencent/bugly/proguard/J;->a(ILjava/lang/String;Lcom/tencent/bugly/proguard/I;)Z

    move-result p0

    return p0
.end method

.method public static synthetic a(Lcom/tencent/bugly/proguard/J;ILjava/lang/String;[BLcom/tencent/bugly/proguard/I;)Z
    .locals 0

    .line 4
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/tencent/bugly/proguard/J;->a(ILjava/lang/String;[BLcom/tencent/bugly/proguard/I;)Z

    move-result p0

    return p0
.end method

.method private declared-synchronized c(I)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/proguard/L;",
            ">;"
        }
    .end annotation

    const-string v0, "_id = "

    monitor-enter p0

    const/4 v1, 0x0

    .line 19
    :try_start_0
    sget-object v2, Lcom/tencent/bugly/proguard/J;->b:Lcom/tencent/bugly/proguard/K;

    invoke-virtual {v2}, Lcom/tencent/bugly/proguard/K;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    if-eqz v3, :cond_7

    .line 20
    :try_start_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    :try_start_2
    const-string v4, "t_pf"
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 21
    :try_start_3
    invoke-virtual/range {v3 .. v10}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    if-nez v2, :cond_2

    if-eqz v2, :cond_0

    .line 22
    :try_start_4
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto/16 :goto_7

    .line 23
    :cond_0
    :goto_0
    sget-boolean p1, Lcom/tencent/bugly/proguard/J;->c:Z

    if-eqz p1, :cond_1

    .line 24
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteClosable;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :cond_1
    monitor-exit p0

    return-object v1

    .line 25
    :cond_2
    :try_start_5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 27
    :goto_1
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v5

    const/4 v7, 0x0

    if-eqz v5, :cond_4

    .line 28
    invoke-virtual {p0, v2}, Lcom/tencent/bugly/proguard/J;->b(Landroid/database/Cursor;)Lcom/tencent/bugly/proguard/L;

    move-result-object v5

    if-eqz v5, :cond_3

    .line 29
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_1

    :cond_3
    :try_start_6
    const-string v5, "_tp"
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 30
    :try_start_7
    invoke-interface {v2, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v5

    invoke-interface {v2, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    :try_start_8
    const-string v8, " or "
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 31
    :try_start_9
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    :try_start_a
    const-string v8, "_tp"
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    :try_start_b
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    :try_start_c
    const-string v8, " = "
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    :try_start_d
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    goto :goto_1

    :catchall_1
    :try_start_e
    const-string v5, "[Database] unknown id."
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    .line 32
    :try_start_f
    new-array v7, v7, [Ljava/lang/Object;

    invoke-static {v5, v7}, Lcom/tencent/bugly/proguard/X;->e(Ljava/lang/String;[Ljava/lang/Object;)Z

    goto :goto_1

    .line 33
    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v5
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_2

    if-lez v5, :cond_5

    :try_start_10
    const-string v5, " and "
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    .line 34
    :try_start_11
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_2

    :try_start_12
    const-string v5, "_id"
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_0

    :try_start_13
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_2

    :try_start_14
    const-string v5, " = "
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_0

    :try_start_15
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/4 p1, 0x4

    .line 35
    invoke-virtual {v6, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_2

    :try_start_16
    const-string v0, "t_pf"
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_0

    .line 36
    :try_start_17
    invoke-virtual {v3, v0, p1, v1}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result p1
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_2

    :try_start_18
    const-string v0, "[Database] deleted %s illegal data %d."
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_0

    .line 37
    :try_start_19
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    const-string v6, "t_pf"

    aput-object v6, v5, v7

    const/4 v6, 0x1

    aput-object p1, v5, v6

    invoke-static {v0, v5}, Lcom/tencent/bugly/proguard/X;->e(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_2

    goto :goto_2

    :catchall_2
    move-exception v0

    move-object p1, v0

    goto :goto_3

    .line 38
    :cond_5
    :goto_2
    :try_start_1a
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 39
    sget-boolean p1, Lcom/tencent/bugly/proguard/J;->c:Z

    if-eqz p1, :cond_6

    .line 40
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteClosable;->close()V
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_0

    :cond_6
    monitor-exit p0

    return-object v4

    :catchall_3
    move-exception v0

    move-object p1, v0

    move-object v2, v1

    goto :goto_3

    .line 41
    :cond_7
    :try_start_1b
    sget-boolean p1, Lcom/tencent/bugly/proguard/J;->c:Z
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_0

    if-eqz p1, :cond_a

    if-eqz v3, :cond_a

    goto :goto_5

    :catchall_4
    move-exception v0

    move-object p1, v0

    move-object v2, v1

    move-object v3, v2

    .line 42
    :goto_3
    :try_start_1c
    invoke-static {p1}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/Throwable;)Z

    move-result v0

    if-nez v0, :cond_8

    .line 43
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_5

    goto :goto_4

    :catchall_5
    move-exception v0

    move-object p1, v0

    goto :goto_6

    :cond_8
    :goto_4
    if-eqz v2, :cond_9

    .line 44
    :try_start_1d
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 45
    :cond_9
    sget-boolean p1, Lcom/tencent/bugly/proguard/J;->c:Z

    if-eqz p1, :cond_a

    if-eqz v3, :cond_a

    .line 46
    :goto_5
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteClosable;->close()V
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_0

    .line 47
    :cond_a
    monitor-exit p0

    return-object v1

    :goto_6
    if-eqz v2, :cond_b

    .line 48
    :try_start_1e
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 49
    :cond_b
    sget-boolean v0, Lcom/tencent/bugly/proguard/J;->c:Z

    if-eqz v0, :cond_c

    if-eqz v3, :cond_c

    .line 50
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteClosable;->close()V

    .line 51
    :cond_c
    throw p1

    :goto_7
    monitor-exit p0
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_0

    throw p1
.end method

.method private declared-synchronized d(Lcom/tencent/bugly/proguard/L;)Z
    .locals 8

    .line 1
    monitor-enter p0

    .line 2
    const/4 v0, 0x0

    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    monitor-exit p0

    .line 6
    return v0

    .line 7
    :cond_0
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/proguard/J;->b:Lcom/tencent/bugly/proguard/K;

    .line 8
    .line 9
    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/K;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    .line 10
    .line 11
    .line 12
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 13
    if-eqz v1, :cond_4

    .line 14
    .line 15
    :try_start_1
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/J;->b(Lcom/tencent/bugly/proguard/L;)Landroid/content/ContentValues;

    .line 16
    .line 17
    .line 18
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 19
    if-eqz v2, :cond_4

    .line 20
    .line 21
    :try_start_2
    const-string v3, "t_pf"

    .line 22
    .line 23
    const-string v4, "_id"
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 24
    .line 25
    :try_start_3
    invoke-virtual {v1, v3, v4, v2}, Landroid/database/sqlite/SQLiteDatabase;->replace(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 26
    .line 27
    .line 28
    move-result-wide v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 29
    const-wide/16 v4, 0x0

    .line 30
    .line 31
    cmp-long v6, v2, v4

    .line 32
    .line 33
    if-ltz v6, :cond_2

    .line 34
    .line 35
    :try_start_4
    const-string v4, "[Database] insert %s success."
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 36
    .line 37
    const/4 v5, 0x1

    .line 38
    :try_start_5
    new-array v6, v5, [Ljava/lang/Object;

    .line 39
    .line 40
    const-string v7, "t_pf"

    .line 41
    .line 42
    aput-object v7, v6, v0

    .line 43
    .line 44
    invoke-static {v4, v6}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    iput-wide v2, p1, Lcom/tencent/bugly/proguard/L;->a:J
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 48
    .line 49
    :try_start_6
    sget-boolean p1, Lcom/tencent/bugly/proguard/J;->c:Z

    .line 50
    .line 51
    if-eqz p1, :cond_1

    .line 52
    .line 53
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteClosable;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :catchall_0
    move-exception p1

    .line 58
    goto :goto_4

    .line 59
    :cond_1
    :goto_0
    monitor-exit p0

    .line 60
    return v5

    .line 61
    :catchall_1
    move-exception p1

    .line 62
    goto :goto_1

    .line 63
    :cond_2
    :try_start_7
    sget-boolean p1, Lcom/tencent/bugly/proguard/J;->c:Z

    .line 64
    .line 65
    if-eqz p1, :cond_3

    .line 66
    .line 67
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteClosable;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 68
    .line 69
    .line 70
    :cond_3
    monitor-exit p0

    .line 71
    return v0

    .line 72
    :cond_4
    :try_start_8
    sget-boolean p1, Lcom/tencent/bugly/proguard/J;->c:Z

    .line 73
    .line 74
    if-eqz p1, :cond_5

    .line 75
    .line 76
    if-eqz v1, :cond_5

    .line 77
    .line 78
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteClosable;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 79
    .line 80
    .line 81
    :cond_5
    monitor-exit p0

    .line 82
    return v0

    .line 83
    :catchall_2
    move-exception p1

    .line 84
    const/4 v1, 0x0

    .line 85
    :goto_1
    :try_start_9
    invoke-static {p1}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/Throwable;)Z

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    if-nez v2, :cond_6

    .line 90
    .line 91
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 92
    .line 93
    .line 94
    goto :goto_2

    .line 95
    :catchall_3
    move-exception p1

    .line 96
    goto :goto_3

    .line 97
    :cond_6
    :goto_2
    :try_start_a
    sget-boolean p1, Lcom/tencent/bugly/proguard/J;->c:Z

    .line 98
    .line 99
    if-eqz p1, :cond_7

    .line 100
    .line 101
    if-eqz v1, :cond_7

    .line 102
    .line 103
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteClosable;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 104
    .line 105
    .line 106
    :cond_7
    monitor-exit p0

    .line 107
    return v0

    .line 108
    :goto_3
    :try_start_b
    sget-boolean v0, Lcom/tencent/bugly/proguard/J;->c:Z

    .line 109
    .line 110
    if-eqz v0, :cond_8

    .line 111
    .line 112
    if-eqz v1, :cond_8

    .line 113
    .line 114
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteClosable;->close()V

    .line 115
    .line 116
    .line 117
    :cond_8
    throw p1

    .line 118
    :goto_4
    monitor-exit p0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 119
    throw p1
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Lcom/tencent/bugly/proguard/I;Z)I
    .locals 1

    if-nez p5, :cond_0

    .line 29
    new-instance p5, Lcom/tencent/bugly/proguard/s;

    const/4 v0, 0x2

    invoke-direct {p5, p0, v0, p4}, Lcom/tencent/bugly/proguard/s;-><init>(Lcom/tencent/bugly/proguard/J;ILcom/tencent/bugly/proguard/I;)V

    .line 30
    iput-object p1, p5, Lcom/tencent/bugly/proguard/s;->c:Ljava/lang/String;

    .line 31
    iput-object p2, p5, Lcom/tencent/bugly/proguard/s;->m:Ljava/lang/String;

    .line 32
    iput-object p3, p5, Lcom/tencent/bugly/proguard/s;->n:[Ljava/lang/String;

    .line 33
    invoke-static {}, Lcom/tencent/bugly/proguard/W;->c()Lcom/tencent/bugly/proguard/W;

    move-result-object p1

    invoke-virtual {p1, p5}, Lcom/tencent/bugly/proguard/W;->a(Ljava/lang/Runnable;)Z

    const/4 p1, 0x0

    return p1

    .line 34
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/tencent/bugly/proguard/J;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Lcom/tencent/bugly/proguard/I;)I

    move-result p1

    return p1
.end method

.method public a(Ljava/lang/String;Landroid/content/ContentValues;Lcom/tencent/bugly/proguard/I;Z)J
    .locals 1

    if-nez p4, :cond_0

    .line 11
    new-instance p4, Lcom/tencent/bugly/proguard/s;

    const/4 v0, 0x1

    invoke-direct {p4, p0, v0, p3}, Lcom/tencent/bugly/proguard/s;-><init>(Lcom/tencent/bugly/proguard/J;ILcom/tencent/bugly/proguard/I;)V

    .line 12
    iput-object p1, p4, Lcom/tencent/bugly/proguard/s;->c:Ljava/lang/String;

    .line 13
    iput-object p2, p4, Lcom/tencent/bugly/proguard/s;->d:Landroid/content/ContentValues;

    .line 14
    invoke-static {}, Lcom/tencent/bugly/proguard/W;->c()Lcom/tencent/bugly/proguard/W;

    move-result-object p1

    invoke-virtual {p1, p4}, Lcom/tencent/bugly/proguard/W;->a(Ljava/lang/Runnable;)Z

    const-wide/16 p1, 0x0

    return-wide p1

    .line 15
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/tencent/bugly/proguard/J;->a(Ljava/lang/String;Landroid/content/ContentValues;Lcom/tencent/bugly/proguard/I;)J

    move-result-wide p1

    return-wide p1
.end method

.method public a(Lcom/tencent/bugly/proguard/L;)Landroid/content/ContentValues;
    .locals 7

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 157
    :cond_0
    :try_start_0
    new-instance v1, Landroid/content/ContentValues;

    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    .line 158
    iget-wide v2, p1, Lcom/tencent/bugly/proguard/L;->a:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-lez v6, :cond_1

    const-string v4, "_id"

    .line 159
    :try_start_1
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v4, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    :goto_0
    const-string v2, "_tp"

    .line 160
    :try_start_2
    iget v3, p1, Lcom/tencent/bugly/proguard/L;->b:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const-string v2, "_pc"

    .line 161
    :try_start_3
    iget-object v3, p1, Lcom/tencent/bugly/proguard/L;->c:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    const-string v2, "_th"

    .line 162
    :try_start_4
    iget-object v3, p1, Lcom/tencent/bugly/proguard/L;->d:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    const-string v2, "_tm"

    .line 163
    :try_start_5
    iget-wide v3, p1, Lcom/tencent/bugly/proguard/L;->e:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 164
    iget-object p1, p1, Lcom/tencent/bugly/proguard/L;->g:[B
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    if-eqz p1, :cond_2

    const-string v2, "_dt"

    .line 165
    :try_start_6
    invoke-virtual {v1, v2, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :cond_2
    return-object v1

    .line 166
    :goto_1
    invoke-static {p1}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/Throwable;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 167
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_3
    return-object v0
.end method

.method public a(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Lcom/tencent/bugly/proguard/I;Z)Landroid/database/Cursor;
    .locals 12

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    move-object/from16 v10, p5

    move/from16 v11, p6

    .line 16
    invoke-virtual/range {v0 .. v11}, Lcom/tencent/bugly/proguard/J;->a(ZLjava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/proguard/I;Z)Landroid/database/Cursor;

    move-result-object p1

    return-object p1
.end method

.method public a(ZLjava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/proguard/I;Z)Landroid/database/Cursor;
    .locals 2

    if-nez p11, :cond_0

    .line 17
    new-instance v0, Lcom/tencent/bugly/proguard/s;

    const/4 v1, 0x3

    invoke-direct {v0, p0, v1, p10}, Lcom/tencent/bugly/proguard/s;-><init>(Lcom/tencent/bugly/proguard/J;ILcom/tencent/bugly/proguard/I;)V

    .line 18
    iput-boolean p1, v0, Lcom/tencent/bugly/proguard/s;->e:Z

    .line 19
    iput-object p2, v0, Lcom/tencent/bugly/proguard/s;->c:Ljava/lang/String;

    .line 20
    iput-object p3, v0, Lcom/tencent/bugly/proguard/s;->f:[Ljava/lang/String;

    .line 21
    iput-object p4, v0, Lcom/tencent/bugly/proguard/s;->g:Ljava/lang/String;

    .line 22
    iput-object p5, v0, Lcom/tencent/bugly/proguard/s;->h:[Ljava/lang/String;

    .line 23
    iput-object p6, v0, Lcom/tencent/bugly/proguard/s;->i:Ljava/lang/String;

    .line 24
    iput-object p7, v0, Lcom/tencent/bugly/proguard/s;->j:Ljava/lang/String;

    .line 25
    iput-object p8, v0, Lcom/tencent/bugly/proguard/s;->k:Ljava/lang/String;

    .line 26
    iput-object p9, v0, Lcom/tencent/bugly/proguard/s;->l:Ljava/lang/String;

    .line 27
    invoke-static {}, Lcom/tencent/bugly/proguard/W;->c()Lcom/tencent/bugly/proguard/W;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/tencent/bugly/proguard/W;->a(Ljava/lang/Runnable;)Z

    const/4 p1, 0x0

    return-object p1

    .line 28
    :cond_0
    invoke-direct/range {p0 .. p10}, Lcom/tencent/bugly/proguard/J;->a(ZLjava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/proguard/I;)Landroid/database/Cursor;

    move-result-object p1

    return-object p1
.end method

.method public a(Landroid/database/Cursor;)Lcom/tencent/bugly/proguard/L;
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 168
    :cond_0
    :try_start_0
    new-instance v1, Lcom/tencent/bugly/proguard/L;

    invoke-direct {v1}, Lcom/tencent/bugly/proguard/L;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v2, "_id"

    .line 169
    :try_start_1
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    iput-wide v2, v1, Lcom/tencent/bugly/proguard/L;->a:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v2, "_tp"

    .line 170
    :try_start_2
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v2

    iput v2, v1, Lcom/tencent/bugly/proguard/L;->b:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const-string v2, "_pc"

    .line 171
    :try_start_3
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/tencent/bugly/proguard/L;->c:Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    const-string v2, "_th"

    .line 172
    :try_start_4
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/tencent/bugly/proguard/L;->d:Ljava/lang/String;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    const-string v2, "_tm"

    .line 173
    :try_start_5
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    iput-wide v2, v1, Lcom/tencent/bugly/proguard/L;->e:J
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    const-string v2, "_dt"

    .line 174
    :try_start_6
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object p1

    iput-object p1, v1, Lcom/tencent/bugly/proguard/L;->g:[B
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    return-object v1

    :catchall_0
    move-exception p1

    .line 175
    invoke-static {p1}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/Throwable;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 176
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_1
    return-object v0
.end method

.method public declared-synchronized a(I)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/proguard/L;",
            ">;"
        }
    .end annotation

    const-string v0, "_tp = "

    monitor-enter p0

    .line 106
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/proguard/J;->b:Lcom/tencent/bugly/proguard/K;

    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/K;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v1, 0x0

    if-eqz v2, :cond_c

    if-ltz p1, :cond_0

    .line 107
    :try_start_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object v5, p1

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto/16 :goto_4

    :cond_0
    move-object v5, v1

    :goto_0
    :try_start_2
    const-string v3, "t_lr"
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 108
    :try_start_3
    invoke-virtual/range {v2 .. v9}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-nez p1, :cond_3

    if-eqz p1, :cond_1

    .line 109
    :try_start_4
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object p1, v0

    goto/16 :goto_9

    .line 110
    :cond_1
    :goto_1
    sget-boolean p1, Lcom/tencent/bugly/proguard/J;->c:Z

    if-eqz p1, :cond_2

    .line 111
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteClosable;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :cond_2
    monitor-exit p0

    return-object v1

    .line 112
    :cond_3
    :try_start_5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 113
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 114
    :goto_2
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_5

    .line 115
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/J;->a(Landroid/database/Cursor;)Lcom/tencent/bugly/proguard/L;

    move-result-object v4

    if-eqz v4, :cond_4

    .line 116
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_2

    :cond_4
    :try_start_6
    const-string v4, "_id"
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 117
    :try_start_7
    invoke-interface {p1, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-interface {p1, v4}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v6
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :try_start_8
    const-string v4, " or "
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 118
    :try_start_9
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    :try_start_a
    const-string v4, "_id"
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    :try_start_b
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    :try_start_c
    const-string v4, " = "
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    :try_start_d
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    invoke-virtual {v0, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    goto :goto_2

    :catchall_2
    :try_start_e
    const-string v4, "[Database] unknown id."
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_1

    .line 120
    :try_start_f
    new-array v5, v5, [Ljava/lang/Object;

    invoke-static {v4, v5}, Lcom/tencent/bugly/proguard/X;->e(Ljava/lang/String;[Ljava/lang/Object;)Z

    goto :goto_2

    .line 121
    :cond_5
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 122
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_6

    const/4 v4, 0x4

    .line 123
    invoke-virtual {v0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_3

    :try_start_10
    const-string v4, "t_lr"
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_1

    .line 124
    :try_start_11
    invoke-virtual {v2, v4, v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_3

    :try_start_12
    const-string v4, "[Database] deleted %s illegal data %d"
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_1

    .line 125
    :try_start_13
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/Object;

    const-string v7, "t_lr"

    aput-object v7, v6, v5

    const/4 v5, 0x1

    aput-object v0, v6, v5

    invoke-static {v4, v6}, Lcom/tencent/bugly/proguard/X;->e(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_3

    goto :goto_3

    :catchall_3
    move-exception v0

    goto :goto_5

    .line 126
    :cond_6
    :goto_3
    :try_start_14
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 127
    sget-boolean p1, Lcom/tencent/bugly/proguard/J;->c:Z

    if-eqz p1, :cond_7

    .line 128
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteClosable;->close()V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_1

    :cond_7
    monitor-exit p0

    return-object v3

    :goto_4
    move-object v0, p1

    move-object p1, v1

    .line 129
    :goto_5
    :try_start_15
    invoke-static {v0}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/Throwable;)Z

    move-result v3

    if-nez v3, :cond_8

    .line 130
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_4

    goto :goto_6

    :catchall_4
    move-exception v0

    goto :goto_7

    :cond_8
    :goto_6
    if-eqz p1, :cond_9

    .line 131
    :try_start_16
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 132
    :cond_9
    sget-boolean p1, Lcom/tencent/bugly/proguard/J;->c:Z

    if-eqz p1, :cond_c

    .line 133
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteClosable;->close()V

    goto :goto_8

    :goto_7
    if-eqz p1, :cond_a

    .line 134
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 135
    :cond_a
    sget-boolean p1, Lcom/tencent/bugly/proguard/J;->c:Z

    if-eqz p1, :cond_b

    .line 136
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteClosable;->close()V

    .line 137
    :cond_b
    throw v0
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_1

    :cond_c
    :goto_8
    monitor-exit p0

    return-object v1

    :goto_9
    :try_start_17
    monitor-exit p0
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_1

    throw p1
.end method

.method public a(ILcom/tencent/bugly/proguard/I;Z)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/tencent/bugly/proguard/I;",
            "Z)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "[B>;"
        }
    .end annotation

    if-nez p3, :cond_0

    .line 80
    new-instance p3, Lcom/tencent/bugly/proguard/s;

    const/4 v0, 0x5

    invoke-direct {p3, p0, v0, p2}, Lcom/tencent/bugly/proguard/s;-><init>(Lcom/tencent/bugly/proguard/J;ILcom/tencent/bugly/proguard/I;)V

    .line 81
    iput p1, p3, Lcom/tencent/bugly/proguard/s;->o:I

    .line 82
    invoke-static {}, Lcom/tencent/bugly/proguard/W;->c()Lcom/tencent/bugly/proguard/W;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/tencent/bugly/proguard/W;->a(Ljava/lang/Runnable;)Z

    const/4 p1, 0x0

    return-object p1

    .line 83
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/tencent/bugly/proguard/J;->a(ILcom/tencent/bugly/proguard/I;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public declared-synchronized a(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/proguard/L;",
            ">;)V"
        }
    .end annotation

    monitor-enter p0

    if-eqz p1, :cond_6

    .line 138
    :try_start_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_6

    .line 139
    :cond_0
    sget-object v0, Lcom/tencent/bugly/proguard/J;->b:Lcom/tencent/bugly/proguard/K;

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/K;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 140
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 141
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/tencent/bugly/proguard/L;

    const-string v3, " or "

    .line 142
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "_id"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " = "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, v2, Lcom/tencent/bugly/proguard/L;->a:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_5

    .line 143
    :cond_1
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 144
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_2

    const/4 v2, 0x4

    .line 145
    invoke-virtual {p1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    :cond_2
    const/4 v2, 0x0

    .line 146
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->setLength(I)V

    const-string v1, "t_lr"
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v3, 0x0

    .line 147
    :try_start_1
    invoke-virtual {v0, v1, p1, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    const-string v1, "[Database] deleted %s data %d"
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 148
    :try_start_3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "t_lr"

    aput-object v4, v3, v2

    const/4 v2, 0x1

    aput-object p1, v3, v2

    invoke-static {v1, v3}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 149
    :try_start_4
    sget-boolean p1, Lcom/tencent/bugly/proguard/J;->c:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-eqz p1, :cond_5

    goto :goto_2

    :catchall_1
    move-exception p1

    .line 150
    :try_start_5
    invoke-static {p1}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/Throwable;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 151
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_1

    :catchall_2
    move-exception p1

    goto :goto_3

    .line 152
    :cond_3
    :goto_1
    :try_start_6
    sget-boolean p1, Lcom/tencent/bugly/proguard/J;->c:Z

    if-eqz p1, :cond_5

    .line 153
    :goto_2
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteClosable;->close()V

    goto :goto_4

    .line 154
    :goto_3
    sget-boolean v1, Lcom/tencent/bugly/proguard/J;->c:Z

    if-eqz v1, :cond_4

    .line 155
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteClosable;->close()V

    .line 156
    :cond_4
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :cond_5
    :goto_4
    monitor-exit p0

    return-void

    :goto_5
    :try_start_7
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    throw p1

    :cond_6
    :goto_6
    monitor-exit p0

    return-void
.end method

.method public a(ILjava/lang/String;[BLcom/tencent/bugly/proguard/I;Z)Z
    .locals 1

    if-nez p5, :cond_0

    .line 74
    new-instance p5, Lcom/tencent/bugly/proguard/s;

    const/4 v0, 0x4

    invoke-direct {p5, p0, v0, p4}, Lcom/tencent/bugly/proguard/s;-><init>(Lcom/tencent/bugly/proguard/J;ILcom/tencent/bugly/proguard/I;)V

    .line 75
    iput p1, p5, Lcom/tencent/bugly/proguard/s;->o:I

    .line 76
    iput-object p2, p5, Lcom/tencent/bugly/proguard/s;->p:Ljava/lang/String;

    .line 77
    iput-object p3, p5, Lcom/tencent/bugly/proguard/s;->q:[B

    .line 78
    invoke-static {}, Lcom/tencent/bugly/proguard/W;->c()Lcom/tencent/bugly/proguard/W;

    move-result-object p1

    invoke-virtual {p1, p5}, Lcom/tencent/bugly/proguard/W;->a(Ljava/lang/Runnable;)Z

    const/4 p1, 0x1

    return p1

    .line 79
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/tencent/bugly/proguard/J;->a(ILjava/lang/String;[BLcom/tencent/bugly/proguard/I;)Z

    move-result p1

    return p1
.end method

.method public b(Lcom/tencent/bugly/proguard/L;)Landroid/content/ContentValues;
    .locals 7

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    .line 13
    iget-object v1, p1, Lcom/tencent/bugly/proguard/L;->f:Ljava/lang/String;

    invoke-static {v1}, Lcom/tencent/bugly/proguard/ca;->b(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_2

    .line 14
    :cond_0
    :try_start_0
    new-instance v1, Landroid/content/ContentValues;

    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    .line 15
    iget-wide v2, p1, Lcom/tencent/bugly/proguard/L;->a:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-lez v6, :cond_1

    const-string v4, "_id"

    .line 16
    :try_start_1
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v4, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    :goto_0
    const-string v2, "_tp"

    .line 17
    :try_start_2
    iget-object v3, p1, Lcom/tencent/bugly/proguard/L;->f:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const-string v2, "_tm"

    .line 18
    :try_start_3
    iget-wide v3, p1, Lcom/tencent/bugly/proguard/L;->e:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 19
    iget-object p1, p1, Lcom/tencent/bugly/proguard/L;->g:[B
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-eqz p1, :cond_2

    const-string v2, "_dt"

    .line 20
    :try_start_4
    invoke-virtual {v1, v2, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :cond_2
    return-object v1

    .line 21
    :goto_1
    invoke-static {p1}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/Throwable;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 22
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_3
    :goto_2
    return-object v0
.end method

.method public b(Landroid/database/Cursor;)Lcom/tencent/bugly/proguard/L;
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 23
    :cond_0
    :try_start_0
    new-instance v1, Lcom/tencent/bugly/proguard/L;

    invoke-direct {v1}, Lcom/tencent/bugly/proguard/L;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v2, "_id"

    .line 24
    :try_start_1
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    iput-wide v2, v1, Lcom/tencent/bugly/proguard/L;->a:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v2, "_tm"

    .line 25
    :try_start_2
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    iput-wide v2, v1, Lcom/tencent/bugly/proguard/L;->e:J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const-string v2, "_tp"

    .line 26
    :try_start_3
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/tencent/bugly/proguard/L;->f:Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    const-string v2, "_dt"

    .line 27
    :try_start_4
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object p1

    iput-object p1, v1, Lcom/tencent/bugly/proguard/L;->g:[B
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    return-object v1

    :catchall_0
    move-exception p1

    .line 28
    invoke-static {p1}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/Throwable;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 29
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_1
    return-object v0
.end method

.method public declared-synchronized b(I)V
    .locals 5

    const-string v0, "_tp = "

    monitor-enter p0

    .line 1
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/proguard/J;->b:Lcom/tencent/bugly/proguard/K;

    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/K;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v1, :cond_3

    const/4 v2, 0x0

    if-ltz p1, :cond_0

    .line 2
    :try_start_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    move-object p1, v2

    :goto_0
    :try_start_2
    const-string v0, "t_lr"
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 3
    :try_start_3
    invoke-virtual {v1, v0, p1, v2}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    const-string v0, "[Database] deleted %s data %d"
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 4
    :try_start_5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "t_lr"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object p1, v2, v3

    invoke-static {v0, v2}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 5
    :try_start_6
    sget-boolean p1, Lcom/tencent/bugly/proguard/J;->c:Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    if-eqz p1, :cond_3

    goto :goto_3

    :catchall_1
    move-exception p1

    goto :goto_6

    .line 6
    :goto_1
    :try_start_7
    invoke-static {p1}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/Throwable;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 7
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    goto :goto_2

    :catchall_2
    move-exception p1

    goto :goto_4

    .line 8
    :cond_1
    :goto_2
    :try_start_8
    sget-boolean p1, Lcom/tencent/bugly/proguard/J;->c:Z

    if-eqz p1, :cond_3

    .line 9
    :goto_3
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteClosable;->close()V

    goto :goto_5

    .line 10
    :goto_4
    sget-boolean v0, Lcom/tencent/bugly/proguard/J;->c:Z

    if-eqz v0, :cond_2

    .line 11
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteClosable;->close()V

    .line 12
    :cond_2
    throw p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    :cond_3
    :goto_5
    monitor-exit p0

    return-void

    :goto_6
    :try_start_9
    monitor-exit p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    throw p1
.end method

.method public declared-synchronized c(Lcom/tencent/bugly/proguard/L;)Z
    .locals 8

    monitor-enter p0

    const/4 v0, 0x0

    if-nez p1, :cond_0

    monitor-exit p0

    return v0

    .line 1
    :cond_0
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/proguard/J;->b:Lcom/tencent/bugly/proguard/K;

    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/K;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    if-eqz v1, :cond_4

    .line 2
    :try_start_1
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/J;->a(Lcom/tencent/bugly/proguard/L;)Landroid/content/ContentValues;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v2, :cond_4

    :try_start_2
    const-string v3, "t_lr"

    const-string v4, "_id"
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 3
    :try_start_3
    invoke-virtual {v1, v3, v4, v2}, Landroid/database/sqlite/SQLiteDatabase;->replace(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-ltz v6, :cond_2

    :try_start_4
    const-string v4, "[Database] insert %s success."
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    const/4 v5, 0x1

    .line 4
    :try_start_5
    new-array v6, v5, [Ljava/lang/Object;

    const-string v7, "t_lr"

    aput-object v7, v6, v0

    invoke-static {v4, v6}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 5
    iput-wide v2, p1, Lcom/tencent/bugly/proguard/L;->a:J
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 6
    :try_start_6
    sget-boolean p1, Lcom/tencent/bugly/proguard/J;->c:Z

    if-eqz p1, :cond_1

    .line 7
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteClosable;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_1
    :goto_0
    monitor-exit p0

    return v5

    :catchall_1
    move-exception p1

    goto :goto_1

    .line 8
    :cond_2
    :try_start_7
    sget-boolean p1, Lcom/tencent/bugly/proguard/J;->c:Z

    if-eqz p1, :cond_3

    .line 9
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteClosable;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :cond_3
    monitor-exit p0

    return v0

    .line 10
    :cond_4
    :try_start_8
    sget-boolean p1, Lcom/tencent/bugly/proguard/J;->c:Z

    if-eqz p1, :cond_5

    if-eqz v1, :cond_5

    .line 11
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteClosable;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    :cond_5
    monitor-exit p0

    return v0

    :catchall_2
    move-exception p1

    const/4 v1, 0x0

    .line 12
    :goto_1
    :try_start_9
    invoke-static {p1}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/Throwable;)Z

    move-result v2

    if-nez v2, :cond_6

    .line 13
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    goto :goto_2

    :catchall_3
    move-exception p1

    goto :goto_3

    .line 14
    :cond_6
    :goto_2
    :try_start_a
    sget-boolean p1, Lcom/tencent/bugly/proguard/J;->c:Z

    if-eqz p1, :cond_7

    if-eqz v1, :cond_7

    .line 15
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteClosable;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    :cond_7
    monitor-exit p0

    return v0

    .line 16
    :goto_3
    :try_start_b
    sget-boolean v0, Lcom/tencent/bugly/proguard/J;->c:Z

    if-eqz v0, :cond_8

    if-eqz v1, :cond_8

    .line 17
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteClosable;->close()V

    .line 18
    :cond_8
    throw p1

    :goto_4
    monitor-exit p0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    throw p1
.end method
