.class public final Ln7/t;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public a:Z

.field public b:Z

.field public final c:Ln7/b;

.field public final d:Lc4/g;

.field public final e:Ljava/util/List;

.field public final f:Lp7/b;

.field public g:La8/a;


# direct methods
.method public constructor <init>(Ln7/b;Lc4/g;)V
    .locals 6

    iget-object v0, p1, Ln7/b;->g:Ln7/u;

    iget-object v1, p1, Ln7/b;->c:Lpe/d;

    iget-object v2, p1, Ln7/b;->b:Ljava/lang/String;

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ln7/t;->c:Ln7/b;

    .line 3
    iput-object p2, p0, Ln7/t;->d:Lc4/g;

    .line 4
    iget-object v3, p1, Ln7/b;->e:Ljava/util/List;

    if-nez v3, :cond_0

    sget-object v3, Lvb/r;->a:Lvb/r;

    :cond_0
    iput-object v3, p0, Ln7/t;->e:Ljava/util/List;

    .line 5
    iget-object v3, p1, Ln7/b;->t:Lz7/b;

    const/4 v4, 0x1

    if-nez v3, :cond_2

    if-eqz v1, :cond_1

    .line 6
    iget-object p1, p1, Ln7/b;->a:Landroid/content/Context;

    .line 7
    new-instance v1, Lb7/m;

    .line 8
    iget p2, p2, Lc4/g;->a:I

    .line 9
    invoke-direct {v1, p0, p2}, Lb7/m;-><init>(Ln7/t;I)V

    .line 10
    new-instance p2, Lq7/b;

    .line 11
    new-instance v3, Li7/p2;

    .line 12
    new-instance v5, Lb8/g;

    invoke-direct {v5, p1, v2, v1}, Lb8/g;-><init>(Landroid/content/Context;Ljava/lang/String;Lb7/m;)V

    .line 13
    const-string p1, "openHelper"

    invoke-static {v5, p1}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    iput-object v5, v3, Li7/p2;->a:Ljava/lang/Object;

    .line 15
    invoke-direct {p2, v3}, Lq7/b;-><init>(Li7/p2;)V

    .line 16
    iput-object p2, p0, Ln7/t;->f:Lp7/b;

    goto :goto_3

    .line 17
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "SQLiteManager was constructed with both null driver and open helper factory!"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    if-nez v2, :cond_3

    .line 18
    new-instance p1, Lm0/w;

    invoke-direct {p1, p0, v3}, Lm0/w;-><init>(Ln7/t;Lz7/b;)V

    .line 19
    new-instance p2, Lp7/e;

    invoke-direct {p2, p1}, Lp7/e;-><init>(Lm0/w;)V

    goto :goto_2

    .line 20
    :cond_3
    new-instance p1, Lm0/w;

    invoke-direct {p1, p0, v3}, Lm0/w;-><init>(Ln7/t;Lz7/b;)V

    .line 21
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    const/16 v1, 0x27

    const/4 v3, 0x2

    if-eq p2, v4, :cond_5

    if-ne p2, v3, :cond_4

    const/4 p2, 0x4

    goto :goto_0

    .line 22
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 23
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v2, "Can\'t get max number of reader for journal mode \'"

    invoke-direct {p2, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    const/4 p2, 0x1

    .line 24
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    if-eq v5, v4, :cond_7

    if-ne v5, v3, :cond_6

    goto :goto_1

    .line 25
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 26
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v2, "Can\'t get max number of writers for journal mode \'"

    invoke-direct {p2, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 27
    :cond_7
    :goto_1
    new-instance v1, Lp7/e;

    invoke-direct {v1, p1, v2, p2}, Lp7/e;-><init>(Lm0/w;Ljava/lang/String;I)V

    move-object p2, v1

    .line 28
    :goto_2
    iput-object p2, p0, Ln7/t;->f:Lp7/b;

    .line 29
    :goto_3
    sget-object p1, Ln7/u;->b:Ln7/u;

    if-ne v0, p1, :cond_8

    goto :goto_4

    :cond_8
    const/4 v4, 0x0

    .line 30
    :goto_4
    invoke-virtual {p0}, Ln7/t;->c()La8/b;

    move-result-object p1

    if-eqz p1, :cond_9

    invoke-interface {p1, v4}, La8/b;->setWriteAheadLoggingEnabled(Z)V

    :cond_9
    return-void
.end method

.method public constructor <init>(Ln7/b;Lm0/l3;)V
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 31
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object v1, v0, Ln7/t;->c:Ln7/b;

    .line 33
    new-instance v2, Ln7/r;

    const/4 v3, -0x1

    .line 34
    const-string v4, ""

    invoke-direct {v2, v3, v4, v4}, Lc4/g;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 35
    iput-object v2, v0, Ln7/t;->d:Lc4/g;

    .line 36
    iget-object v2, v1, Ln7/b;->e:Ljava/util/List;

    sget-object v3, Lvb/r;->a:Lvb/r;

    if-nez v2, :cond_0

    move-object v4, v3

    goto :goto_0

    :cond_0
    move-object v4, v2

    :goto_0
    iput-object v4, v0, Ln7/t;->e:Ljava/util/List;

    .line 37
    new-instance v4, Le7/y;

    const/16 v5, 0xc

    invoke-direct {v4, v5, v0}, Le7/y;-><init>(ILjava/lang/Object;)V

    if-nez v2, :cond_1

    move-object v2, v3

    .line 38
    :cond_1
    check-cast v2, Ljava/util/Collection;

    .line 39
    new-instance v3, Ln7/s;

    invoke-direct {v3, v4}, Ln7/s;-><init>(Le7/y;)V

    .line 40
    invoke-static {v2, v3}, Lvb/m;->r0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v10

    .line 41
    iget-object v6, v1, Ln7/b;->a:Landroid/content/Context;

    .line 42
    iget-object v7, v1, Ln7/b;->b:Ljava/lang/String;

    .line 43
    iget-object v8, v1, Ln7/b;->c:Lpe/d;

    .line 44
    iget-object v9, v1, Ln7/b;->d:Li4/d;

    .line 45
    iget-boolean v11, v1, Ln7/b;->f:Z

    .line 46
    iget-object v12, v1, Ln7/b;->g:Ln7/u;

    .line 47
    iget-object v13, v1, Ln7/b;->h:Ljava/util/concurrent/Executor;

    .line 48
    iget-object v14, v1, Ln7/b;->i:Ljava/util/concurrent/Executor;

    .line 49
    iget-object v15, v1, Ln7/b;->j:Landroid/content/Intent;

    .line 50
    iget-boolean v2, v1, Ln7/b;->k:Z

    .line 51
    iget-boolean v3, v1, Ln7/b;->l:Z

    .line 52
    iget-object v4, v1, Ln7/b;->m:Ljava/util/Set;

    .line 53
    iget-object v5, v1, Ln7/b;->n:Ljava/lang/String;

    .line 54
    iget-object v0, v1, Ln7/b;->o:Ljava/io/File;

    move-object/from16 v20, v0

    .line 55
    iget-object v0, v1, Ln7/b;->p:Ljava/util/concurrent/Callable;

    move-object/from16 v21, v0

    .line 56
    iget-object v0, v1, Ln7/b;->q:Ljava/util/List;

    move-object/from16 v22, v0

    .line 57
    iget-object v0, v1, Ln7/b;->r:Ljava/util/List;

    move-object/from16 v23, v0

    .line 58
    iget-boolean v0, v1, Ln7/b;->s:Z

    move/from16 v24, v0

    .line 59
    iget-object v0, v1, Ln7/b;->t:Lz7/b;

    .line 60
    iget-object v1, v1, Ln7/b;->u:Lyb/h;

    move-object/from16 v25, v0

    .line 61
    const-string v0, "migrationContainer"

    invoke-static {v9, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v19, v5

    .line 62
    new-instance v5, Ln7/b;

    move-object/from16 v26, v1

    move/from16 v16, v2

    move/from16 v17, v3

    move-object/from16 v18, v4

    invoke-direct/range {v5 .. v26}, Ln7/b;-><init>(Landroid/content/Context;Ljava/lang/String;Lpe/d;Li4/d;Ljava/util/List;ZLn7/u;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Landroid/content/Intent;ZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Ljava/util/List;Ljava/util/List;ZLz7/b;Lyb/h;)V

    move-object/from16 v0, p2

    .line 63
    invoke-virtual {v0, v5}, Lm0/l3;->a(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    throw v0
.end method

.method public static final a(Ln7/t;Lz7/a;)V
    .locals 5

    .line 1
    iget-object v0, p0, Ln7/t;->d:Lc4/g;

    .line 2
    .line 3
    const-string v1, "PRAGMA user_version = "

    .line 4
    .line 5
    iget-object v2, p0, Ln7/t;->c:Ln7/b;

    .line 6
    .line 7
    iget-object v3, v2, Ln7/b;->g:Ln7/u;

    .line 8
    .line 9
    sget-object v4, Ln7/u;->b:Ln7/u;

    .line 10
    .line 11
    if-ne v3, v4, :cond_0

    .line 12
    .line 13
    const-string v3, "PRAGMA journal_mode = WAL"

    .line 14
    .line 15
    invoke-static {p1, v3}, Lud/n;->g(Lz7/a;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const-string v3, "PRAGMA journal_mode = TRUNCATE"

    .line 20
    .line 21
    invoke-static {p1, v3}, Lud/n;->g(Lz7/a;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    :goto_0
    iget-object v2, v2, Ln7/b;->g:Ln7/u;

    .line 25
    .line 26
    if-ne v2, v4, :cond_1

    .line 27
    .line 28
    const-string v2, "PRAGMA synchronous = NORMAL"

    .line 29
    .line 30
    invoke-static {p1, v2}, Lud/n;->g(Lz7/a;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    const-string v2, "PRAGMA synchronous = FULL"

    .line 35
    .line 36
    invoke-static {p1, v2}, Lud/n;->g(Lz7/a;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :goto_1
    invoke-static {p1}, Ln7/t;->b(Lz7/a;)V

    .line 40
    .line 41
    .line 42
    const-string v2, "PRAGMA user_version"

    .line 43
    .line 44
    invoke-interface {p1, v2}, Lz7/a;->d0(Ljava/lang/String;)Lz7/c;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    :try_start_0
    invoke-interface {v2}, Lz7/c;->Z()Z

    .line 49
    .line 50
    .line 51
    const/4 v3, 0x0

    .line 52
    invoke-interface {v2, v3}, Lz7/c;->getLong(I)J

    .line 53
    .line 54
    .line 55
    move-result-wide v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 56
    long-to-int v4, v3

    .line 57
    const/4 v3, 0x0

    .line 58
    invoke-static {v2, v3}, Lgh/g;->m(Lz7/c;Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    iget v0, v0, Lc4/g;->a:I

    .line 62
    .line 63
    if-eq v4, v0, :cond_5

    .line 64
    .line 65
    const-string v2, "BEGIN EXCLUSIVE TRANSACTION"

    .line 66
    .line 67
    invoke-static {p1, v2}, Lud/n;->g(Lz7/a;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    if-nez v4, :cond_2

    .line 71
    .line 72
    :try_start_1
    invoke-virtual {p0, p1}, Ln7/t;->d(Lz7/a;)V

    .line 73
    .line 74
    .line 75
    goto :goto_2

    .line 76
    :catchall_0
    move-exception v0

    .line 77
    goto :goto_3

    .line 78
    :cond_2
    invoke-virtual {p0, p1, v4, v0}, Ln7/t;->e(Lz7/a;II)V

    .line 79
    .line 80
    .line 81
    :goto_2
    new-instance v2, Ljava/lang/StringBuilder;

    .line 82
    .line 83
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-static {p1, v0}, Lud/n;->g(Lz7/a;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    sget-object v0, Lub/a0;->a:Lub/a0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 97
    .line 98
    goto :goto_4

    .line 99
    :goto_3
    invoke-static {v0}, Lub/a;->b(Ljava/lang/Throwable;)Lub/m;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    :goto_4
    instance-of v1, v0, Lub/m;

    .line 104
    .line 105
    if-nez v1, :cond_3

    .line 106
    .line 107
    move-object v1, v0

    .line 108
    check-cast v1, Lub/a0;

    .line 109
    .line 110
    const-string v1, "END TRANSACTION"

    .line 111
    .line 112
    invoke-static {p1, v1}, Lud/n;->g(Lz7/a;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    :cond_3
    invoke-static {v0}, Lub/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    if-nez v0, :cond_4

    .line 120
    .line 121
    goto :goto_5

    .line 122
    :cond_4
    const-string p0, "ROLLBACK TRANSACTION"

    .line 123
    .line 124
    invoke-static {p1, p0}, Lud/n;->g(Lz7/a;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    throw v0

    .line 128
    :cond_5
    :goto_5
    invoke-virtual {p0, p1}, Ln7/t;->f(Lz7/a;)V

    .line 129
    .line 130
    .line 131
    return-void

    .line 132
    :catchall_1
    move-exception p0

    .line 133
    :try_start_2
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 134
    :catchall_2
    move-exception p1

    .line 135
    invoke-static {v2, p0}, Lgh/g;->m(Lz7/c;Ljava/lang/Throwable;)V

    .line 136
    .line 137
    .line 138
    throw p1
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
.end method

.method public static b(Lz7/a;)V
    .locals 5

    .line 1
    const-string v0, "PRAGMA busy_timeout"

    .line 2
    .line 3
    invoke-interface {p0, v0}, Lz7/a;->d0(Ljava/lang/String;)Lz7/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :try_start_0
    invoke-interface {v0}, Lz7/c;->Z()Z

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-interface {v0, v1}, Lz7/c;->getLong(I)J

    .line 12
    .line 13
    .line 14
    move-result-wide v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-static {v0, v3}, Lgh/g;->m(Lz7/c;Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    const-wide/16 v3, 0xbb8

    .line 20
    .line 21
    cmp-long v0, v1, v3

    .line 22
    .line 23
    if-gez v0, :cond_0

    .line 24
    .line 25
    const-string v0, "PRAGMA busy_timeout = 3000"

    .line 26
    .line 27
    invoke-static {p0, v0}, Lud/n;->g(Lz7/a;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void

    .line 31
    :catchall_0
    move-exception p0

    .line 32
    :try_start_1
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 33
    :catchall_1
    move-exception v1

    .line 34
    invoke-static {v0, p0}, Lgh/g;->m(Lz7/c;Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    throw v1
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


# virtual methods
.method public final c()La8/b;
    .locals 3

    .line 1
    iget-object v0, p0, Ln7/t;->f:Lp7/b;

    .line 2
    .line 3
    instance-of v1, v0, Lq7/b;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    check-cast v0, Lq7/b;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object v0, v2

    .line 12
    :goto_0
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object v0, v0, Lq7/b;->a:Li7/p2;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iget-object v0, v0, Li7/p2;->a:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, La8/b;

    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_1
    return-object v2
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final d(Lz7/a;)V
    .locals 7

    .line 1
    const-string v0, "connection"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "SELECT count(*) FROM sqlite_master WHERE name != \'android_metadata\'"

    .line 7
    .line 8
    invoke-interface {p1, v0}, Lz7/a;->d0(Ljava/lang/String;)Lz7/c;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :try_start_0
    invoke-interface {v0}, Lz7/c;->Z()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x0

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-interface {v0, v2}, Lz7/c;->getLong(I)J

    .line 20
    .line 21
    .line 22
    move-result-wide v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    const-wide/16 v5, 0x0

    .line 24
    .line 25
    cmp-long v1, v3, v5

    .line 26
    .line 27
    if-nez v1, :cond_0

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception p1

    .line 32
    goto :goto_3

    .line 33
    :cond_0
    :goto_0
    const/4 v1, 0x0

    .line 34
    invoke-static {v0, v1}, Lgh/g;->m(Lz7/c;Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Ln7/t;->d:Lc4/g;

    .line 38
    .line 39
    invoke-virtual {v0, p1}, Lc4/g;->a(Lz7/a;)V

    .line 40
    .line 41
    .line 42
    if-nez v2, :cond_2

    .line 43
    .line 44
    invoke-virtual {v0, p1}, Lc4/g;->g(Lz7/a;)Lk5/d;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    iget-boolean v2, v1, Lk5/d;->b:Z

    .line 49
    .line 50
    if-eqz v2, :cond_1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 54
    .line 55
    new-instance v0, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    const-string v2, "Pre-packaged database has an invalid schema: "

    .line 58
    .line 59
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    iget-object v1, v1, Lk5/d;->c:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v1, Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw p1

    .line 81
    :cond_2
    :goto_1
    invoke-virtual {p0, p1}, Ln7/t;->g(Lz7/a;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, p1}, Lc4/g;->c(Lz7/a;)V

    .line 85
    .line 86
    .line 87
    iget-object v0, p0, Ln7/t;->e:Ljava/util/List;

    .line 88
    .line 89
    check-cast v0, Ljava/lang/Iterable;

    .line 90
    .line 91
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    :cond_3
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-eqz v1, :cond_4

    .line 100
    .line 101
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    check-cast v1, Ln7/s;

    .line 106
    .line 107
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    instance-of v1, p1, Lq7/a;

    .line 111
    .line 112
    if-eqz v1, :cond_3

    .line 113
    .line 114
    move-object v1, p1

    .line 115
    check-cast v1, Lq7/a;

    .line 116
    .line 117
    iget-object v1, v1, Lq7/a;->a:La8/a;

    .line 118
    .line 119
    const-string v2, "db"

    .line 120
    .line 121
    invoke-static {v1, v2}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_4
    return-void

    .line 126
    :goto_3
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 127
    :catchall_1
    move-exception v1

    .line 128
    invoke-static {v0, p1}, Lgh/g;->m(Lz7/c;Ljava/lang/Throwable;)V

    .line 129
    .line 130
    .line 131
    throw v1
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

.method public final e(Lz7/a;II)V
    .locals 12

    .line 1
    const-string v0, "connection"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ln7/t;->c:Ln7/b;

    .line 7
    .line 8
    iget-object v1, v0, Ln7/b;->d:Li4/d;

    .line 9
    .line 10
    const-string v2, "<this>"

    .line 11
    .line 12
    invoke-static {v1, v2}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object v1, v1, Li4/d;->a:Ljava/util/LinkedHashMap;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    const/4 v3, 0x0

    .line 19
    const/4 v4, 0x1

    .line 20
    if-ne p2, p3, :cond_0

    .line 21
    .line 22
    sget-object v1, Lvb/r;->a:Lvb/r;

    .line 23
    .line 24
    goto/16 :goto_7

    .line 25
    .line 26
    :cond_0
    if-le p3, p2, :cond_1

    .line 27
    .line 28
    const/4 v5, 0x1

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const/4 v5, 0x0

    .line 31
    :goto_0
    new-instance v6, Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 34
    .line 35
    .line 36
    move v7, p2

    .line 37
    :cond_2
    if-eqz v5, :cond_3

    .line 38
    .line 39
    if-ge v7, p3, :cond_b

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_3
    if-le v7, p3, :cond_b

    .line 43
    .line 44
    :goto_1
    if-eqz v5, :cond_5

    .line 45
    .line 46
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object v8

    .line 50
    invoke-virtual {v1, v8}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v8

    .line 54
    check-cast v8, Ljava/util/TreeMap;

    .line 55
    .line 56
    if-nez v8, :cond_4

    .line 57
    .line 58
    :goto_2
    move-object v10, v2

    .line 59
    goto :goto_3

    .line 60
    :cond_4
    invoke-virtual {v8}, Ljava/util/TreeMap;->descendingKeySet()Ljava/util/NavigableSet;

    .line 61
    .line 62
    .line 63
    move-result-object v9

    .line 64
    new-instance v10, Lub/k;

    .line 65
    .line 66
    invoke-direct {v10, v8, v9}, Lub/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_5
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object v8

    .line 74
    invoke-virtual {v1, v8}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v8

    .line 78
    check-cast v8, Ljava/util/TreeMap;

    .line 79
    .line 80
    if-nez v8, :cond_6

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_6
    invoke-virtual {v8}, Ljava/util/TreeMap;->keySet()Ljava/util/Set;

    .line 84
    .line 85
    .line 86
    move-result-object v9

    .line 87
    new-instance v10, Lub/k;

    .line 88
    .line 89
    invoke-direct {v10, v8, v9}, Lub/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    :goto_3
    if-nez v10, :cond_7

    .line 93
    .line 94
    goto :goto_6

    .line 95
    :cond_7
    iget-object v8, v10, Lub/k;->a:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v8, Ljava/util/Map;

    .line 98
    .line 99
    iget-object v9, v10, Lub/k;->b:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v9, Ljava/lang/Iterable;

    .line 102
    .line 103
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 104
    .line 105
    .line 106
    move-result-object v9

    .line 107
    :cond_8
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 108
    .line 109
    .line 110
    move-result v10

    .line 111
    if-eqz v10, :cond_a

    .line 112
    .line 113
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v10

    .line 117
    check-cast v10, Ljava/lang/Number;

    .line 118
    .line 119
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 120
    .line 121
    .line 122
    move-result v10

    .line 123
    if-eqz v5, :cond_9

    .line 124
    .line 125
    add-int/lit8 v11, v7, 0x1

    .line 126
    .line 127
    if-gt v11, v10, :cond_8

    .line 128
    .line 129
    if-gt v10, p3, :cond_8

    .line 130
    .line 131
    goto :goto_4

    .line 132
    :cond_9
    if-gt p3, v10, :cond_8

    .line 133
    .line 134
    if-ge v10, v7, :cond_8

    .line 135
    .line 136
    :goto_4
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 137
    .line 138
    .line 139
    move-result-object v7

    .line 140
    invoke-interface {v8, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v7

    .line 144
    invoke-static {v7}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move v7, v10

    .line 151
    const/4 v8, 0x1

    .line 152
    goto :goto_5

    .line 153
    :cond_a
    const/4 v8, 0x0

    .line 154
    :goto_5
    if-nez v8, :cond_2

    .line 155
    .line 156
    :goto_6
    move-object v1, v2

    .line 157
    goto :goto_7

    .line 158
    :cond_b
    move-object v1, v6

    .line 159
    :goto_7
    iget-object v5, p0, Ln7/t;->d:Lc4/g;

    .line 160
    .line 161
    if-eqz v1, :cond_e

    .line 162
    .line 163
    invoke-virtual {v5, p1}, Lc4/g;->f(Lz7/a;)V

    .line 164
    .line 165
    .line 166
    check-cast v1, Ljava/lang/Iterable;

    .line 167
    .line 168
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 169
    .line 170
    .line 171
    move-result-object p2

    .line 172
    :goto_8
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 173
    .line 174
    .line 175
    move-result p3

    .line 176
    if-eqz p3, :cond_c

    .line 177
    .line 178
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object p3

    .line 182
    check-cast p3, Lr7/a;

    .line 183
    .line 184
    invoke-virtual {p3, p1}, Lr7/a;->a(Lz7/a;)V

    .line 185
    .line 186
    .line 187
    goto :goto_8

    .line 188
    :cond_c
    invoke-virtual {v5, p1}, Lc4/g;->g(Lz7/a;)Lk5/d;

    .line 189
    .line 190
    .line 191
    move-result-object p2

    .line 192
    iget-boolean p3, p2, Lk5/d;->b:Z

    .line 193
    .line 194
    if-eqz p3, :cond_d

    .line 195
    .line 196
    invoke-virtual {v5, p1}, Lc4/g;->e(Lz7/a;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {p0, p1}, Ln7/t;->g(Lz7/a;)V

    .line 200
    .line 201
    .line 202
    return-void

    .line 203
    :cond_d
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 204
    .line 205
    new-instance p3, Ljava/lang/StringBuilder;

    .line 206
    .line 207
    const-string v0, "Migration didn\'t properly handle: "

    .line 208
    .line 209
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    iget-object p2, p2, Lk5/d;->c:Ljava/lang/Object;

    .line 213
    .line 214
    check-cast p2, Ljava/lang/String;

    .line 215
    .line 216
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object p2

    .line 223
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object p2

    .line 227
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    throw p1

    .line 231
    :cond_e
    const-string v1, "<this>"

    .line 232
    .line 233
    invoke-static {v0, v1}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    const/4 v1, 0x0

    .line 237
    if-le p2, p3, :cond_f

    .line 238
    .line 239
    iget-boolean v6, v0, Ln7/b;->l:Z

    .line 240
    .line 241
    if-eqz v6, :cond_f

    .line 242
    .line 243
    goto :goto_9

    .line 244
    :cond_f
    iget-object v6, v0, Ln7/b;->m:Ljava/util/Set;

    .line 245
    .line 246
    iget-boolean v7, v0, Ln7/b;->k:Z

    .line 247
    .line 248
    if-eqz v7, :cond_11

    .line 249
    .line 250
    if-eqz v6, :cond_10

    .line 251
    .line 252
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 253
    .line 254
    .line 255
    move-result-object v7

    .line 256
    invoke-interface {v6, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    move-result v6

    .line 260
    if-nez v6, :cond_11

    .line 261
    .line 262
    :cond_10
    const/4 v1, 0x1

    .line 263
    :cond_11
    :goto_9
    if-nez v1, :cond_1a

    .line 264
    .line 265
    iget-boolean p2, v0, Ln7/b;->s:Z

    .line 266
    .line 267
    if-eqz p2, :cond_16

    .line 268
    .line 269
    const-string p2, "SELECT name, type FROM sqlite_master WHERE type = \'table\' OR type = \'view\'"

    .line 270
    .line 271
    invoke-interface {p1, p2}, Lz7/a;->d0(Ljava/lang/String;)Lz7/c;

    .line 272
    .line 273
    .line 274
    move-result-object p2

    .line 275
    :try_start_0
    invoke-static {}, Lud/b;->l()Lwb/b;

    .line 276
    .line 277
    .line 278
    move-result-object p3

    .line 279
    :cond_12
    :goto_a
    invoke-interface {p2}, Lz7/c;->Z()Z

    .line 280
    .line 281
    .line 282
    move-result v0

    .line 283
    if-eqz v0, :cond_14

    .line 284
    .line 285
    invoke-interface {p2, v3}, Lz7/c;->M(I)Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    const-string v1, "sqlite_"

    .line 290
    .line 291
    invoke-static {v0, v1, v3}, Lef/u;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 292
    .line 293
    .line 294
    move-result v1

    .line 295
    if-nez v1, :cond_12

    .line 296
    .line 297
    const-string v1, "android_metadata"

    .line 298
    .line 299
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    move-result v1

    .line 303
    if-eqz v1, :cond_13

    .line 304
    .line 305
    goto :goto_a

    .line 306
    :cond_13
    invoke-interface {p2, v4}, Lz7/c;->M(I)Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v1

    .line 310
    const-string v6, "view"

    .line 311
    .line 312
    invoke-static {v1, v6}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    move-result v1

    .line 316
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 317
    .line 318
    .line 319
    move-result-object v1

    .line 320
    new-instance v6, Lub/k;

    .line 321
    .line 322
    invoke-direct {v6, v0, v1}, Lub/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 323
    .line 324
    .line 325
    invoke-virtual {p3, v6}, Lwb/b;->add(Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    goto :goto_a

    .line 329
    :catchall_0
    move-exception p1

    .line 330
    goto :goto_c

    .line 331
    :cond_14
    invoke-static {p3}, Lud/b;->g(Lwb/b;)Lwb/b;

    .line 332
    .line 333
    .line 334
    move-result-object p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 335
    invoke-static {p2, v2}, Lgh/g;->m(Lz7/c;Ljava/lang/Throwable;)V

    .line 336
    .line 337
    .line 338
    invoke-virtual {p3, v3}, Lwb/b;->listIterator(I)Ljava/util/ListIterator;

    .line 339
    .line 340
    .line 341
    move-result-object p2

    .line 342
    :goto_b
    move-object p3, p2

    .line 343
    check-cast p3, Lh1/z;

    .line 344
    .line 345
    invoke-virtual {p3}, Lh1/z;->hasNext()Z

    .line 346
    .line 347
    .line 348
    move-result v0

    .line 349
    if-eqz v0, :cond_17

    .line 350
    .line 351
    invoke-virtual {p3}, Lh1/z;->next()Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object p3

    .line 355
    check-cast p3, Lub/k;

    .line 356
    .line 357
    iget-object v0, p3, Lub/k;->a:Ljava/lang/Object;

    .line 358
    .line 359
    check-cast v0, Ljava/lang/String;

    .line 360
    .line 361
    iget-object p3, p3, Lub/k;->b:Ljava/lang/Object;

    .line 362
    .line 363
    check-cast p3, Ljava/lang/Boolean;

    .line 364
    .line 365
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 366
    .line 367
    .line 368
    move-result p3

    .line 369
    if-eqz p3, :cond_15

    .line 370
    .line 371
    new-instance p3, Ljava/lang/StringBuilder;

    .line 372
    .line 373
    const-string v1, "DROP VIEW IF EXISTS "

    .line 374
    .line 375
    invoke-direct {p3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 379
    .line 380
    .line 381
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object p3

    .line 385
    invoke-static {p1, p3}, Lud/n;->g(Lz7/a;Ljava/lang/String;)V

    .line 386
    .line 387
    .line 388
    goto :goto_b

    .line 389
    :cond_15
    new-instance p3, Ljava/lang/StringBuilder;

    .line 390
    .line 391
    const-string v1, "DROP TABLE IF EXISTS "

    .line 392
    .line 393
    invoke-direct {p3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 394
    .line 395
    .line 396
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 397
    .line 398
    .line 399
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object p3

    .line 403
    invoke-static {p1, p3}, Lud/n;->g(Lz7/a;Ljava/lang/String;)V

    .line 404
    .line 405
    .line 406
    goto :goto_b

    .line 407
    :goto_c
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 408
    :catchall_1
    move-exception p3

    .line 409
    invoke-static {p2, p1}, Lgh/g;->m(Lz7/c;Ljava/lang/Throwable;)V

    .line 410
    .line 411
    .line 412
    throw p3

    .line 413
    :cond_16
    invoke-virtual {v5, p1}, Lc4/g;->b(Lz7/a;)V

    .line 414
    .line 415
    .line 416
    :cond_17
    iget-object p2, p0, Ln7/t;->e:Ljava/util/List;

    .line 417
    .line 418
    check-cast p2, Ljava/lang/Iterable;

    .line 419
    .line 420
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 421
    .line 422
    .line 423
    move-result-object p2

    .line 424
    :cond_18
    :goto_d
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 425
    .line 426
    .line 427
    move-result p3

    .line 428
    if-eqz p3, :cond_19

    .line 429
    .line 430
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object p3

    .line 434
    check-cast p3, Ln7/s;

    .line 435
    .line 436
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 437
    .line 438
    .line 439
    instance-of p3, p1, Lq7/a;

    .line 440
    .line 441
    if-eqz p3, :cond_18

    .line 442
    .line 443
    move-object p3, p1

    .line 444
    check-cast p3, Lq7/a;

    .line 445
    .line 446
    iget-object p3, p3, Lq7/a;->a:La8/a;

    .line 447
    .line 448
    const-string v0, "db"

    .line 449
    .line 450
    invoke-static {p3, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 451
    .line 452
    .line 453
    goto :goto_d

    .line 454
    :cond_19
    invoke-virtual {v5, p1}, Lc4/g;->a(Lz7/a;)V

    .line 455
    .line 456
    .line 457
    return-void

    .line 458
    :cond_1a
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 459
    .line 460
    new-instance v0, Ljava/lang/StringBuilder;

    .line 461
    .line 462
    const-string v1, "A migration from "

    .line 463
    .line 464
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 465
    .line 466
    .line 467
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 468
    .line 469
    .line 470
    const-string p2, " to "

    .line 471
    .line 472
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 473
    .line 474
    .line 475
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 476
    .line 477
    .line 478
    const-string p2, " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions."

    .line 479
    .line 480
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 481
    .line 482
    .line 483
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 484
    .line 485
    .line 486
    move-result-object p2

    .line 487
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 488
    .line 489
    .line 490
    move-result-object p2

    .line 491
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 492
    .line 493
    .line 494
    throw p1
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
.end method

.method public final f(Lz7/a;)V
    .locals 9

    .line 1
    const-string v0, "connection"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "Pre-packaged database has an invalid schema: "

    .line 7
    .line 8
    const-string v1, "SELECT 1 FROM sqlite_master WHERE type = \'table\' AND name = \'room_master_table\'"

    .line 9
    .line 10
    invoke-interface {p1, v1}, Lz7/a;->d0(Ljava/lang/String;)Lz7/c;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :try_start_0
    invoke-interface {v1}, Lz7/c;->Z()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x1

    .line 19
    const/4 v4, 0x0

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    invoke-interface {v1, v4}, Lz7/c;->getLong(I)J

    .line 23
    .line 24
    .line 25
    move-result-wide v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    const-wide/16 v7, 0x0

    .line 27
    .line 28
    cmp-long v2, v5, v7

    .line 29
    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    const/4 v2, 0x1

    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception p1

    .line 35
    goto/16 :goto_7

    .line 36
    .line 37
    :cond_0
    const/4 v2, 0x0

    .line 38
    :goto_0
    const/4 v5, 0x0

    .line 39
    invoke-static {v1, v5}, Lgh/g;->m(Lz7/c;Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    iget-object v1, p0, Ln7/t;->d:Lc4/g;

    .line 43
    .line 44
    if-eqz v2, :cond_3

    .line 45
    .line 46
    const-string v0, "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"

    .line 47
    .line 48
    invoke-interface {p1, v0}, Lz7/a;->d0(Ljava/lang/String;)Lz7/c;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    :try_start_1
    invoke-interface {v0}, Lz7/c;->Z()Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-eqz v2, :cond_1

    .line 57
    .line 58
    invoke-interface {v0, v4}, Lz7/c;->M(I)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 62
    goto :goto_1

    .line 63
    :catchall_1
    move-exception p1

    .line 64
    goto :goto_2

    .line 65
    :cond_1
    move-object v2, v5

    .line 66
    :goto_1
    invoke-static {v0, v5}, Lgh/g;->m(Lz7/c;Ljava/lang/Throwable;)V

    .line 67
    .line 68
    .line 69
    iget-object v0, v1, Lc4/g;->b:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v0, Ljava/lang/String;

    .line 72
    .line 73
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-nez v0, :cond_6

    .line 78
    .line 79
    iget-object v0, v1, Lc4/g;->c:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v0, Ljava/lang/String;

    .line 82
    .line 83
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-eqz v0, :cond_2

    .line 88
    .line 89
    goto :goto_5

    .line 90
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 91
    .line 92
    new-instance v0, Ljava/lang/StringBuilder;

    .line 93
    .line 94
    const-string v3, "Room cannot verify the data integrity. Looks like you\'ve changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: "

    .line 95
    .line 96
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    iget-object v1, v1, Lc4/g;->b:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v1, Ljava/lang/String;

    .line 102
    .line 103
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    const-string v1, ", found: "

    .line 107
    .line 108
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    throw p1

    .line 126
    :goto_2
    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 127
    :catchall_2
    move-exception v1

    .line 128
    invoke-static {v0, p1}, Lgh/g;->m(Lz7/c;Ljava/lang/Throwable;)V

    .line 129
    .line 130
    .line 131
    throw v1

    .line 132
    :cond_3
    const-string v2, "BEGIN EXCLUSIVE TRANSACTION"

    .line 133
    .line 134
    invoke-static {p1, v2}, Lud/n;->g(Lz7/a;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    :try_start_3
    invoke-virtual {v1, p1}, Lc4/g;->g(Lz7/a;)Lk5/d;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    iget-boolean v4, v2, Lk5/d;->b:Z

    .line 142
    .line 143
    if-eqz v4, :cond_4

    .line 144
    .line 145
    invoke-virtual {v1, p1}, Lc4/g;->e(Lz7/a;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p0, p1}, Ln7/t;->g(Lz7/a;)V

    .line 149
    .line 150
    .line 151
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 152
    .line 153
    goto :goto_4

    .line 154
    :catchall_3
    move-exception v0

    .line 155
    goto :goto_3

    .line 156
    :cond_4
    new-instance v4, Ljava/lang/IllegalStateException;

    .line 157
    .line 158
    new-instance v5, Ljava/lang/StringBuilder;

    .line 159
    .line 160
    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    iget-object v0, v2, Lk5/d;->c:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v0, Ljava/lang/String;

    .line 166
    .line 167
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-direct {v4, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    throw v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 182
    :goto_3
    invoke-static {v0}, Lub/a;->b(Ljava/lang/Throwable;)Lub/m;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    :goto_4
    instance-of v2, v0, Lub/m;

    .line 187
    .line 188
    if-nez v2, :cond_5

    .line 189
    .line 190
    move-object v2, v0

    .line 191
    check-cast v2, Lub/a0;

    .line 192
    .line 193
    const-string v2, "END TRANSACTION"

    .line 194
    .line 195
    invoke-static {p1, v2}, Lud/n;->g(Lz7/a;Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    :cond_5
    invoke-static {v0}, Lub/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    if-nez v0, :cond_9

    .line 203
    .line 204
    :cond_6
    :goto_5
    invoke-virtual {v1, p1}, Lc4/g;->d(Lz7/a;)V

    .line 205
    .line 206
    .line 207
    iget-object v0, p0, Ln7/t;->e:Ljava/util/List;

    .line 208
    .line 209
    check-cast v0, Ljava/lang/Iterable;

    .line 210
    .line 211
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    :cond_7
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 216
    .line 217
    .line 218
    move-result v1

    .line 219
    if-eqz v1, :cond_8

    .line 220
    .line 221
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    check-cast v1, Ln7/s;

    .line 226
    .line 227
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    instance-of v2, p1, Lq7/a;

    .line 231
    .line 232
    if-eqz v2, :cond_7

    .line 233
    .line 234
    move-object v2, p1

    .line 235
    check-cast v2, Lq7/a;

    .line 236
    .line 237
    iget-object v2, v2, Lq7/a;->a:La8/a;

    .line 238
    .line 239
    const-string v4, "db"

    .line 240
    .line 241
    invoke-static {v2, v4}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    iget-object v1, v1, Ln7/s;->a:Le7/y;

    .line 245
    .line 246
    invoke-virtual {v1, v2}, Le7/y;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    goto :goto_6

    .line 250
    :cond_8
    iput-boolean v3, p0, Ln7/t;->a:Z

    .line 251
    .line 252
    return-void

    .line 253
    :cond_9
    const-string v1, "ROLLBACK TRANSACTION"

    .line 254
    .line 255
    invoke-static {p1, v1}, Lud/n;->g(Lz7/a;Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    throw v0

    .line 259
    :goto_7
    :try_start_4
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 260
    :catchall_4
    move-exception v0

    .line 261
    invoke-static {v1, p1}, Lgh/g;->m(Lz7/c;Ljava/lang/Throwable;)V

    .line 262
    .line 263
    .line 264
    throw v0
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
.end method

.method public final g(Lz7/a;)V
    .locals 3

    .line 1
    const-string v0, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lud/n;->g(Lz7/a;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ln7/t;->d:Lc4/g;

    .line 7
    .line 8
    iget-object v0, v0, Lc4/g;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ljava/lang/String;

    .line 11
    .line 12
    const-string v1, "hash"

    .line 13
    .line 14
    invoke-static {v0, v1}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    new-instance v1, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const-string v2, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'"

    .line 20
    .line 21
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v0, "\')"

    .line 28
    .line 29
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-static {p1, v0}, Lud/n;->g(Lz7/a;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-void
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
