.class public final Lv4/c0;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Landroid/os/Handler$Callback;
.implements Lj5/a0;
.implements Lv4/v0;


# static fields
.field public static final X:J


# instance fields
.field public A:Lv4/z;

.field public B:Z

.field public C:Z

.field public D:Z

.field public E:Z

.field public F:J

.field public G:Z

.field public H:I

.field public I:Z

.field public J:Z

.field public K:Z

.field public L:Z

.field public M:I

.field public N:Lv4/b0;

.field public O:J

.field public P:J

.field public Q:I

.field public R:Z

.field public S:Lv4/m;

.field public T:J

.field public U:Lv4/o;

.field public V:J

.field public W:Z

.field public final a:[Lv4/a1;

.field public final b:[Lv4/e;

.field public final c:[Z

.field public final d:Lj2/b;

.field public final e:Lm5/u;

.field public final f:Lv4/j;

.field public final g:Ln5/e;

.field public final h:Lp4/x;

.field public final i:Lk9/c;

.field public final j:Landroid/os/Looper;

.field public final k:Lm4/h1;

.field public final l:Lm4/f1;

.field public final m:J

.field public final n:Lv4/k;

.field public final o:Ljava/util/ArrayList;

.field public final p:Lp4/v;

.field public final q:Lv4/q;

.field public final r:Lv4/j0;

.field public final s:Lv4/t0;

.field public final t:Lv4/h;

.field public final u:Lw4/k;

.field public final v:Lw4/d;

.field public final w:Lp4/x;

.field public final x:Z

.field public y:Lv4/b1;

.field public z:Lv4/u0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-wide/16 v0, 0x2710

    .line 2
    .line 3
    invoke-static {v0, v1}, Lp4/c0;->c0(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    sput-wide v0, Lv4/c0;->X:J

    .line 8
    .line 9
    return-void
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

.method public constructor <init>([Lv4/e;[Lv4/e;Lj2/b;Lm5/u;Lv4/j;Ln5/e;IZLw4/d;Lv4/b1;Lv4/h;Landroid/os/Looper;Lp4/v;Lv4/q;Lw4/k;)V
    .locals 12

    .line 1
    move-object/from16 v1, p5

    .line 2
    .line 3
    move-object/from16 v2, p6

    .line 4
    .line 5
    move-object/from16 v3, p9

    .line 6
    .line 7
    move-object/from16 v4, p13

    .line 8
    .line 9
    move-object/from16 v5, p15

    .line 10
    .line 11
    sget-object v6, Lv4/o;->a:Lv4/o;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    iput-wide v7, p0, Lv4/c0;->V:J

    .line 22
    .line 23
    move-object/from16 v9, p14

    .line 24
    .line 25
    iput-object v9, p0, Lv4/c0;->q:Lv4/q;

    .line 26
    .line 27
    iput-object p3, p0, Lv4/c0;->d:Lj2/b;

    .line 28
    .line 29
    move-object/from16 v9, p4

    .line 30
    .line 31
    iput-object v9, p0, Lv4/c0;->e:Lm5/u;

    .line 32
    .line 33
    iput-object v1, p0, Lv4/c0;->f:Lv4/j;

    .line 34
    .line 35
    iput-object v2, p0, Lv4/c0;->g:Ln5/e;

    .line 36
    .line 37
    move/from16 v10, p7

    .line 38
    .line 39
    iput v10, p0, Lv4/c0;->H:I

    .line 40
    .line 41
    move/from16 v10, p8

    .line 42
    .line 43
    iput-boolean v10, p0, Lv4/c0;->I:Z

    .line 44
    .line 45
    move-object/from16 v10, p10

    .line 46
    .line 47
    iput-object v10, p0, Lv4/c0;->y:Lv4/b1;

    .line 48
    .line 49
    move-object/from16 v10, p11

    .line 50
    .line 51
    iput-object v10, p0, Lv4/c0;->t:Lv4/h;

    .line 52
    .line 53
    const/4 v10, 0x0

    .line 54
    iput-boolean v10, p0, Lv4/c0;->C:Z

    .line 55
    .line 56
    iput-object v4, p0, Lv4/c0;->p:Lp4/v;

    .line 57
    .line 58
    iput-object v5, p0, Lv4/c0;->u:Lw4/k;

    .line 59
    .line 60
    iput-object v6, p0, Lv4/c0;->U:Lv4/o;

    .line 61
    .line 62
    iput-object v3, p0, Lv4/c0;->v:Lw4/d;

    .line 63
    .line 64
    iput-wide v7, p0, Lv4/c0;->T:J

    .line 65
    .line 66
    iput-wide v7, p0, Lv4/c0;->F:J

    .line 67
    .line 68
    iget-wide v6, v1, Lv4/j;->h:J

    .line 69
    .line 70
    iput-wide v6, p0, Lv4/c0;->m:J

    .line 71
    .line 72
    sget-object v1, Lm4/i1;->a:Lm4/e1;

    .line 73
    .line 74
    invoke-static {v9}, Lv4/u0;->h(Lm5/u;)Lv4/u0;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    iput-object v1, p0, Lv4/c0;->z:Lv4/u0;

    .line 79
    .line 80
    new-instance v6, Lv4/z;

    .line 81
    .line 82
    invoke-direct {v6, v1}, Lv4/z;-><init>(Lv4/u0;)V

    .line 83
    .line 84
    .line 85
    iput-object v6, p0, Lv4/c0;->A:Lv4/z;

    .line 86
    .line 87
    array-length v1, p1

    .line 88
    new-array v1, v1, [Lv4/e;

    .line 89
    .line 90
    iput-object v1, p0, Lv4/c0;->b:[Lv4/e;

    .line 91
    .line 92
    array-length v1, p1

    .line 93
    new-array v1, v1, [Z

    .line 94
    .line 95
    iput-object v1, p0, Lv4/c0;->c:[Z

    .line 96
    .line 97
    move-object v1, p3

    .line 98
    check-cast v1, Lm5/p;

    .line 99
    .line 100
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    array-length v6, p1

    .line 104
    new-array v6, v6, [Lv4/a1;

    .line 105
    .line 106
    iput-object v6, p0, Lv4/c0;->a:[Lv4/a1;

    .line 107
    .line 108
    const/4 v6, 0x0

    .line 109
    :goto_0
    array-length v7, p1

    .line 110
    const/4 v8, 0x1

    .line 111
    if-ge v10, v7, :cond_1

    .line 112
    .line 113
    aget-object v7, p1, v10

    .line 114
    .line 115
    iput v10, v7, Lv4/e;->e:I

    .line 116
    .line 117
    iput-object v5, v7, Lv4/e;->f:Lw4/k;

    .line 118
    .line 119
    iput-object v4, v7, Lv4/e;->g:Lp4/v;

    .line 120
    .line 121
    iget-object v9, p0, Lv4/c0;->b:[Lv4/e;

    .line 122
    .line 123
    aput-object v7, v9, v10

    .line 124
    .line 125
    iget-object v7, p0, Lv4/c0;->b:[Lv4/e;

    .line 126
    .line 127
    aget-object v7, v7, v10

    .line 128
    .line 129
    iget-object v9, v7, Lv4/e;->a:Ljava/lang/Object;

    .line 130
    .line 131
    monitor-enter v9

    .line 132
    :try_start_0
    iput-object v1, v7, Lv4/e;->q:Lm5/p;

    .line 133
    .line 134
    monitor-exit v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 135
    aget-object v7, p2, v10

    .line 136
    .line 137
    if-eqz v7, :cond_0

    .line 138
    .line 139
    array-length v6, p1

    .line 140
    add-int/2addr v6, v10

    .line 141
    iput v6, v7, Lv4/e;->e:I

    .line 142
    .line 143
    iput-object v5, v7, Lv4/e;->f:Lw4/k;

    .line 144
    .line 145
    iput-object v4, v7, Lv4/e;->g:Lp4/v;

    .line 146
    .line 147
    const/4 v6, 0x1

    .line 148
    :cond_0
    iget-object v8, p0, Lv4/c0;->a:[Lv4/a1;

    .line 149
    .line 150
    new-instance v9, Lv4/a1;

    .line 151
    .line 152
    aget-object v11, p1, v10

    .line 153
    .line 154
    invoke-direct {v9, v11, v7, v10}, Lv4/a1;-><init>(Lv4/e;Lv4/e;I)V

    .line 155
    .line 156
    .line 157
    aput-object v9, v8, v10

    .line 158
    .line 159
    add-int/lit8 v10, v10, 0x1

    .line 160
    .line 161
    goto :goto_0

    .line 162
    :catchall_0
    move-exception v0

    .line 163
    move-object p1, v0

    .line 164
    :try_start_1
    monitor-exit v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 165
    throw p1

    .line 166
    :cond_1
    iput-boolean v6, p0, Lv4/c0;->x:Z

    .line 167
    .line 168
    new-instance p1, Lv4/k;

    .line 169
    .line 170
    invoke-direct {p1, p0, v4}, Lv4/k;-><init>(Lv4/c0;Lp4/v;)V

    .line 171
    .line 172
    .line 173
    iput-object p1, p0, Lv4/c0;->n:Lv4/k;

    .line 174
    .line 175
    new-instance p1, Ljava/util/ArrayList;

    .line 176
    .line 177
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 178
    .line 179
    .line 180
    iput-object p1, p0, Lv4/c0;->o:Ljava/util/ArrayList;

    .line 181
    .line 182
    new-instance p1, Lm4/h1;

    .line 183
    .line 184
    invoke-direct {p1}, Lm4/h1;-><init>()V

    .line 185
    .line 186
    .line 187
    iput-object p1, p0, Lv4/c0;->k:Lm4/h1;

    .line 188
    .line 189
    new-instance p1, Lm4/f1;

    .line 190
    .line 191
    invoke-direct {p1}, Lm4/f1;-><init>()V

    .line 192
    .line 193
    .line 194
    iput-object p1, p0, Lv4/c0;->l:Lm4/f1;

    .line 195
    .line 196
    iput-object p0, p3, Lj2/b;->a:Ljava/lang/Object;

    .line 197
    .line 198
    iput-object v2, p3, Lj2/b;->b:Ljava/lang/Object;

    .line 199
    .line 200
    iput-boolean v8, p0, Lv4/c0;->R:Z

    .line 201
    .line 202
    const/4 p1, 0x0

    .line 203
    move-object/from16 p2, p12

    .line 204
    .line 205
    invoke-virtual {v4, p2, p1}, Lp4/v;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lp4/x;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    iput-object p1, p0, Lv4/c0;->w:Lp4/x;

    .line 210
    .line 211
    new-instance p2, Lv4/j0;

    .line 212
    .line 213
    new-instance v0, Landroidx/media3/exoplayer/offline/g;

    .line 214
    .line 215
    const/16 v1, 0x18

    .line 216
    .line 217
    invoke-direct {v0, v1, p0}, Landroidx/media3/exoplayer/offline/g;-><init>(ILjava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    invoke-direct {p2, v3, p1, v0}, Lv4/j0;-><init>(Lw4/d;Lp4/x;Landroidx/media3/exoplayer/offline/g;)V

    .line 221
    .line 222
    .line 223
    iput-object p2, p0, Lv4/c0;->r:Lv4/j0;

    .line 224
    .line 225
    new-instance p2, Lv4/t0;

    .line 226
    .line 227
    invoke-direct {p2, p0, v3, p1, v5}, Lv4/t0;-><init>(Lv4/c0;Lw4/d;Lp4/x;Lw4/k;)V

    .line 228
    .line 229
    .line 230
    iput-object p2, p0, Lv4/c0;->s:Lv4/t0;

    .line 231
    .line 232
    new-instance p1, Lk9/c;

    .line 233
    .line 234
    invoke-direct {p1}, Lk9/c;-><init>()V

    .line 235
    .line 236
    .line 237
    iput-object p1, p0, Lv4/c0;->i:Lk9/c;

    .line 238
    .line 239
    invoke-virtual {p1}, Lk9/c;->a()Landroid/os/Looper;

    .line 240
    .line 241
    .line 242
    move-result-object p1

    .line 243
    iput-object p1, p0, Lv4/c0;->j:Landroid/os/Looper;

    .line 244
    .line 245
    invoke-virtual {v4, p1, p0}, Lp4/v;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lp4/x;

    .line 246
    .line 247
    .line 248
    move-result-object p1

    .line 249
    iput-object p1, p0, Lv4/c0;->h:Lp4/x;

    .line 250
    .line 251
    return-void
.end method

.method public static M(Lm4/i1;Lv4/b0;ZIZLm4/h1;Lm4/f1;)Landroid/util/Pair;
    .locals 9

    .line 1
    iget-object v0, p1, Lv4/b0;->a:Lm4/i1;

    .line 2
    .line 3
    invoke-virtual {p0}, Lm4/i1;->p()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    goto/16 :goto_2

    .line 10
    .line 11
    :cond_0
    invoke-virtual {v0}, Lm4/i1;->p()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    move-object v2, p0

    .line 18
    goto :goto_0

    .line 19
    :cond_1
    move-object v2, v0

    .line 20
    :goto_0
    :try_start_0
    iget v5, p1, Lv4/b0;->b:I

    .line 21
    .line 22
    iget-wide v6, p1, Lv4/b0;->c:J

    .line 23
    .line 24
    move-object v3, p5

    .line 25
    move-object v4, p6

    .line 26
    invoke-virtual/range {v2 .. v7}, Lm4/i1;->i(Lm4/h1;Lm4/f1;IJ)Landroid/util/Pair;

    .line 27
    .line 28
    .line 29
    move-result-object p5
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    move-object v5, v4

    .line 31
    move-object v4, v3

    .line 32
    invoke-virtual {p0, v2}, Lm4/i1;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p6

    .line 36
    if-eqz p6, :cond_2

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    iget-object p6, p5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 40
    .line 41
    invoke-virtual {p0, p6}, Lm4/i1;->b(Ljava/lang/Object;)I

    .line 42
    .line 43
    .line 44
    move-result p6

    .line 45
    const/4 v0, -0x1

    .line 46
    if-eq p6, v0, :cond_4

    .line 47
    .line 48
    iget-object p2, p5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 49
    .line 50
    invoke-virtual {v2, p2, v5}, Lm4/i1;->g(Ljava/lang/Object;Lm4/f1;)Lm4/f1;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    iget-boolean p2, p2, Lm4/f1;->f:Z

    .line 55
    .line 56
    if-eqz p2, :cond_3

    .line 57
    .line 58
    iget p2, v5, Lm4/f1;->c:I

    .line 59
    .line 60
    const-wide/16 p3, 0x0

    .line 61
    .line 62
    invoke-virtual {v2, p2, v4, p3, p4}, Lm4/i1;->m(ILm4/h1;J)Lm4/h1;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    iget p2, p2, Lm4/h1;->n:I

    .line 67
    .line 68
    iget-object p3, p5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 69
    .line 70
    invoke-virtual {v2, p3}, Lm4/i1;->b(Ljava/lang/Object;)I

    .line 71
    .line 72
    .line 73
    move-result p3

    .line 74
    if-ne p2, p3, :cond_3

    .line 75
    .line 76
    iget-object p2, p5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 77
    .line 78
    invoke-virtual {p0, p2, v5}, Lm4/i1;->g(Ljava/lang/Object;Lm4/f1;)Lm4/f1;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    iget v6, p2, Lm4/f1;->c:I

    .line 83
    .line 84
    iget-wide v7, p1, Lv4/b0;->c:J

    .line 85
    .line 86
    move-object v3, p0

    .line 87
    invoke-virtual/range {v3 .. v8}, Lm4/i1;->i(Lm4/h1;Lm4/f1;IJ)Landroid/util/Pair;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    return-object p0

    .line 92
    :cond_3
    :goto_1
    return-object p5

    .line 93
    :cond_4
    move-object v3, p0

    .line 94
    if-eqz p2, :cond_5

    .line 95
    .line 96
    iget-object p0, p5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 97
    .line 98
    move p2, p3

    .line 99
    move p3, p4

    .line 100
    move-object p5, v2

    .line 101
    move-object p6, v3

    .line 102
    move-object p1, v5

    .line 103
    move-object p4, p0

    .line 104
    move-object p0, v4

    .line 105
    invoke-static/range {p0 .. p6}, Lv4/c0;->N(Lm4/h1;Lm4/f1;IZLjava/lang/Object;Lm4/i1;Lm4/i1;)I

    .line 106
    .line 107
    .line 108
    move-result v6

    .line 109
    if-eq v6, v0, :cond_5

    .line 110
    .line 111
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    invoke-virtual/range {v3 .. v8}, Lm4/i1;->i(Lm4/h1;Lm4/f1;IJ)Landroid/util/Pair;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    return-object p0

    .line 121
    :catch_0
    :cond_5
    :goto_2
    const/4 p0, 0x0

    .line 122
    return-object p0
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
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
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
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
.end method

.method public static N(Lm4/h1;Lm4/f1;IZLjava/lang/Object;Lm4/i1;Lm4/i1;)I
    .locals 12

    .line 1
    move-object v3, p0

    .line 2
    move-object v2, p1

    .line 3
    move-object/from16 v0, p4

    .line 4
    .line 5
    move-object/from16 v1, p5

    .line 6
    .line 7
    move-object/from16 v6, p6

    .line 8
    .line 9
    invoke-virtual {v1, v0, p1}, Lm4/i1;->g(Ljava/lang/Object;Lm4/f1;)Lm4/f1;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    iget v4, v4, Lm4/f1;->c:I

    .line 14
    .line 15
    const-wide/16 v7, 0x0

    .line 16
    .line 17
    invoke-virtual {v1, v4, p0, v7, v8}, Lm4/i1;->m(ILm4/h1;J)Lm4/h1;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    iget-object v4, v4, Lm4/h1;->a:Ljava/lang/Object;

    .line 22
    .line 23
    const/4 v9, 0x0

    .line 24
    const/4 v5, 0x0

    .line 25
    :goto_0
    invoke-virtual {v6}, Lm4/i1;->o()I

    .line 26
    .line 27
    .line 28
    move-result v10

    .line 29
    if-ge v5, v10, :cond_1

    .line 30
    .line 31
    invoke-virtual {v6, v5, p0, v7, v8}, Lm4/i1;->m(ILm4/h1;J)Lm4/h1;

    .line 32
    .line 33
    .line 34
    move-result-object v10

    .line 35
    iget-object v10, v10, Lm4/h1;->a:Ljava/lang/Object;

    .line 36
    .line 37
    invoke-virtual {v10, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v10

    .line 41
    if-eqz v10, :cond_0

    .line 42
    .line 43
    return v5

    .line 44
    :cond_0
    add-int/lit8 v5, v5, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    invoke-virtual {v1, v0}, Lm4/i1;->b(Ljava/lang/Object;)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    invoke-virtual {v1}, Lm4/i1;->h()I

    .line 52
    .line 53
    .line 54
    move-result v7

    .line 55
    const/4 v8, -0x1

    .line 56
    const/4 v10, 0x0

    .line 57
    const/4 v11, -0x1

    .line 58
    :goto_1
    if-ge v10, v7, :cond_3

    .line 59
    .line 60
    if-ne v11, v8, :cond_3

    .line 61
    .line 62
    move-object v4, v1

    .line 63
    move v1, v0

    .line 64
    move-object v0, v4

    .line 65
    move v4, p2

    .line 66
    move v5, p3

    .line 67
    invoke-virtual/range {v0 .. v5}, Lm4/i1;->d(ILm4/f1;Lm4/h1;IZ)I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-ne v1, v8, :cond_2

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_2
    invoke-virtual {v0, v1}, Lm4/i1;->l(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-virtual {v6, v3}, Lm4/i1;->b(Ljava/lang/Object;)I

    .line 79
    .line 80
    .line 81
    move-result v11

    .line 82
    add-int/lit8 v10, v10, 0x1

    .line 83
    .line 84
    move v3, v1

    .line 85
    move-object v1, v0

    .line 86
    move v0, v3

    .line 87
    move-object v3, p0

    .line 88
    goto :goto_1

    .line 89
    :cond_3
    :goto_2
    if-ne v11, v8, :cond_4

    .line 90
    .line 91
    return v8

    .line 92
    :cond_4
    invoke-virtual {v6, v11, p1, v9}, Lm4/i1;->f(ILm4/f1;Z)Lm4/f1;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    iget v0, v0, Lm4/f1;->c:I

    .line 97
    .line 98
    return v0
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
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
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
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
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
.end method

.method public static u(Lv4/h0;)Z
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_4

    .line 3
    .line 4
    :try_start_0
    iget-object v1, p0, Lv4/h0;->a:Ljava/lang/Object;

    .line 5
    .line 6
    iget-boolean v2, p0, Lv4/h0;->e:Z

    .line 7
    .line 8
    if-nez v2, :cond_0

    .line 9
    .line 10
    invoke-interface {v1}, Lj5/b0;->f()V

    .line 11
    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    iget-object v2, p0, Lv4/h0;->c:[Lj5/c1;

    .line 15
    .line 16
    array-length v3, v2

    .line 17
    const/4 v4, 0x0

    .line 18
    :goto_0
    if-ge v4, v3, :cond_2

    .line 19
    .line 20
    aget-object v5, v2, v4

    .line 21
    .line 22
    if-eqz v5, :cond_1

    .line 23
    .line 24
    invoke-interface {v5}, Lj5/c1;->b()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    .line 26
    .line 27
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    :goto_1
    iget-boolean p0, p0, Lv4/h0;->e:Z

    .line 31
    .line 32
    if-nez p0, :cond_3

    .line 33
    .line 34
    const-wide/16 v1, 0x0

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_3
    invoke-interface {v1}, Lj5/e1;->d()J

    .line 38
    .line 39
    .line 40
    move-result-wide v1

    .line 41
    :goto_2
    const-wide/high16 v3, -0x8000000000000000L

    .line 42
    .line 43
    cmp-long p0, v1, v3

    .line 44
    .line 45
    if-eqz p0, :cond_4

    .line 46
    .line 47
    const/4 p0, 0x1

    .line 48
    return p0

    .line 49
    :catch_0
    :cond_4
    return v0
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
.method public final A(IZ)V
    .locals 2

    .line 1
    iget-object v0, p0, Lv4/c0;->c:[Z

    .line 2
    .line 3
    aget-boolean v1, v0, p1

    .line 4
    .line 5
    if-eq v1, p2, :cond_0

    .line 6
    .line 7
    aput-boolean p2, v0, p1

    .line 8
    .line 9
    new-instance v0, Lb7/p0;

    .line 10
    .line 11
    invoke-direct {v0, p0, p1, p2}, Lb7/p0;-><init>(Lv4/c0;IZ)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lv4/c0;->w:Lp4/x;

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Lp4/x;->c(Ljava/lang/Runnable;)Z

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
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

.method public final B()V
    .locals 2

    .line 1
    iget-object v0, p0, Lv4/c0;->s:Lv4/t0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lv4/t0;->b()Lm4/i1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-virtual {p0, v0, v1}, Lv4/c0;->q(Lm4/i1;Z)V

    .line 9
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
.end method

.method public final C(Lv4/y;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lv4/c0;->A:Lv4/z;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Lv4/z;->c(I)V

    .line 5
    .line 6
    .line 7
    iget v0, p1, Lv4/y;->a:I

    .line 8
    .line 9
    iget v2, p1, Lv4/y;->b:I

    .line 10
    .line 11
    iget v3, p1, Lv4/y;->c:I

    .line 12
    .line 13
    iget-object p1, p1, Lv4/y;->d:Lj5/f1;

    .line 14
    .line 15
    iget-object v4, p0, Lv4/c0;->s:Lv4/t0;

    .line 16
    .line 17
    iget-object v5, v4, Lv4/t0;->b:Ljava/util/ArrayList;

    .line 18
    .line 19
    const/4 v6, 0x0

    .line 20
    if-ltz v0, :cond_0

    .line 21
    .line 22
    if-gt v0, v2, :cond_0

    .line 23
    .line 24
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 25
    .line 26
    .line 27
    move-result v7

    .line 28
    if-gt v2, v7, :cond_0

    .line 29
    .line 30
    if-ltz v3, :cond_0

    .line 31
    .line 32
    const/4 v7, 0x1

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 v7, 0x0

    .line 35
    :goto_0
    invoke-static {v7}, Lp4/c;->c(Z)V

    .line 36
    .line 37
    .line 38
    iput-object p1, v4, Lv4/t0;->j:Lj5/f1;

    .line 39
    .line 40
    if-eq v0, v2, :cond_3

    .line 41
    .line 42
    if-ne v0, v3, :cond_1

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_1
    invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    sub-int v7, v2, v0

    .line 50
    .line 51
    add-int/2addr v7, v3

    .line 52
    sub-int/2addr v7, v1

    .line 53
    add-int/lit8 v1, v2, -0x1

    .line 54
    .line 55
    invoke-static {v7, v1}, Ljava/lang/Math;->max(II)I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    invoke-virtual {v5, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v7

    .line 63
    check-cast v7, Lv4/s0;

    .line 64
    .line 65
    iget v7, v7, Lv4/s0;->d:I

    .line 66
    .line 67
    invoke-static {v0, v2, v3, v5}, Lp4/c0;->M(IIILjava/util/ArrayList;)V

    .line 68
    .line 69
    .line 70
    :goto_1
    if-gt p1, v1, :cond_2

    .line 71
    .line 72
    invoke-virtual {v5, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    check-cast v0, Lv4/s0;

    .line 77
    .line 78
    iput v7, v0, Lv4/s0;->d:I

    .line 79
    .line 80
    iget-object v0, v0, Lv4/s0;->a:Lj5/y;

    .line 81
    .line 82
    iget-object v0, v0, Lj5/y;->o:Lj5/w;

    .line 83
    .line 84
    iget-object v0, v0, Lj5/s;->e:Lm4/i1;

    .line 85
    .line 86
    invoke-virtual {v0}, Lm4/i1;->o()I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    add-int/2addr v7, v0

    .line 91
    add-int/lit8 p1, p1, 0x1

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_2
    invoke-virtual {v4}, Lv4/t0;->b()Lm4/i1;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    goto :goto_3

    .line 99
    :cond_3
    :goto_2
    invoke-virtual {v4}, Lv4/t0;->b()Lm4/i1;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    :goto_3
    invoke-virtual {p0, p1, v6}, Lv4/c0;->q(Lm4/i1;Z)V

    .line 104
    .line 105
    .line 106
    return-void
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
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

.method public final D()V
    .locals 11

    .line 1
    iget-object v0, p0, Lv4/c0;->A:Lv4/z;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Lv4/z;->c(I)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p0, v0, v0, v0, v1}, Lv4/c0;->I(ZZZZ)V

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, Lv4/c0;->f:Lv4/j;

    .line 12
    .line 13
    iget-object v3, v2, Lv4/j;->i:Ljava/util/HashMap;

    .line 14
    .line 15
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-virtual {v4}, Ljava/lang/Thread;->getId()J

    .line 20
    .line 21
    .line 22
    move-result-wide v4

    .line 23
    iget-wide v6, v2, Lv4/j;->j:J

    .line 24
    .line 25
    const-wide/16 v8, -0x1

    .line 26
    .line 27
    cmp-long v10, v6, v8

    .line 28
    .line 29
    if-eqz v10, :cond_1

    .line 30
    .line 31
    cmp-long v8, v6, v4

    .line 32
    .line 33
    if-nez v8, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 v6, 0x0

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    :goto_0
    const/4 v6, 0x1

    .line 39
    :goto_1
    const-string v7, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper)."

    .line 40
    .line 41
    invoke-static {v7, v6}, Lp4/c;->h(Ljava/lang/String;Z)V

    .line 42
    .line 43
    .line 44
    iput-wide v4, v2, Lv4/j;->j:J

    .line 45
    .line 46
    iget-object v4, p0, Lv4/c0;->u:Lw4/k;

    .line 47
    .line 48
    invoke-virtual {v3, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    if-nez v5, :cond_2

    .line 53
    .line 54
    new-instance v5, Lv4/i;

    .line 55
    .line 56
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    :cond_2
    invoke-virtual {v3, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    check-cast v3, Lv4/i;

    .line 67
    .line 68
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    iget v2, v2, Lv4/j;->f:I

    .line 72
    .line 73
    const/4 v4, -0x1

    .line 74
    if-ne v2, v4, :cond_3

    .line 75
    .line 76
    const/high16 v2, 0xc80000

    .line 77
    .line 78
    :cond_3
    iput v2, v3, Lv4/i;->b:I

    .line 79
    .line 80
    iput-boolean v0, v3, Lv4/i;->a:Z

    .line 81
    .line 82
    iget-object v2, p0, Lv4/c0;->z:Lv4/u0;

    .line 83
    .line 84
    iget-object v2, v2, Lv4/u0;->a:Lm4/i1;

    .line 85
    .line 86
    invoke-virtual {v2}, Lm4/i1;->p()Z

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    const/4 v3, 0x2

    .line 91
    if-eqz v2, :cond_4

    .line 92
    .line 93
    const/4 v2, 0x4

    .line 94
    goto :goto_2

    .line 95
    :cond_4
    const/4 v2, 0x2

    .line 96
    :goto_2
    invoke-virtual {p0, v2}, Lv4/c0;->d0(I)V

    .line 97
    .line 98
    .line 99
    iget-object v2, p0, Lv4/c0;->g:Ln5/e;

    .line 100
    .line 101
    check-cast v2, Ln5/i;

    .line 102
    .line 103
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    iget-object v4, p0, Lv4/c0;->s:Lv4/t0;

    .line 107
    .line 108
    iget-object v5, v4, Lv4/t0;->b:Ljava/util/ArrayList;

    .line 109
    .line 110
    iget-boolean v6, v4, Lv4/t0;->k:Z

    .line 111
    .line 112
    xor-int/2addr v6, v1

    .line 113
    invoke-static {v6}, Lp4/c;->i(Z)V

    .line 114
    .line 115
    .line 116
    iput-object v2, v4, Lv4/t0;->l:Ls4/f0;

    .line 117
    .line 118
    :goto_3
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    if-ge v0, v2, :cond_5

    .line 123
    .line 124
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    check-cast v2, Lv4/s0;

    .line 129
    .line 130
    invoke-virtual {v4, v2}, Lv4/t0;->e(Lv4/s0;)V

    .line 131
    .line 132
    .line 133
    iget-object v6, v4, Lv4/t0;->g:Ljava/util/HashSet;

    .line 134
    .line 135
    invoke-virtual {v6, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    add-int/lit8 v0, v0, 0x1

    .line 139
    .line 140
    goto :goto_3

    .line 141
    :cond_5
    iput-boolean v1, v4, Lv4/t0;->k:Z

    .line 142
    .line 143
    iget-object v0, p0, Lv4/c0;->h:Lp4/x;

    .line 144
    .line 145
    invoke-virtual {v0, v3}, Lp4/x;->e(I)Z

    .line 146
    .line 147
    .line 148
    return-void
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
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
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
.end method

.method public final E()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    :try_start_0
    invoke-virtual {p0, v1, v0, v1, v0}, Lv4/c0;->I(ZZZZ)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lv4/c0;->F()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lv4/c0;->f:Lv4/j;

    .line 10
    .line 11
    iget-object v2, p0, Lv4/c0;->u:Lw4/k;

    .line 12
    .line 13
    iget-object v3, v0, Lv4/j;->i:Ljava/util/HashMap;

    .line 14
    .line 15
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0}, Lv4/j;->d()V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object v2, v0, Lv4/j;->i:Ljava/util/HashMap;

    .line 25
    .line 26
    invoke-virtual {v2}, Ljava/util/HashMap;->isEmpty()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    const-wide/16 v2, -0x1

    .line 33
    .line 34
    iput-wide v2, v0, Lv4/j;->j:J

    .line 35
    .line 36
    :cond_1
    invoke-virtual {p0, v1}, Lv4/c0;->d0(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Lv4/c0;->i:Lk9/c;

    .line 40
    .line 41
    invoke-virtual {v0}, Lk9/c;->b()V

    .line 42
    .line 43
    .line 44
    monitor-enter p0

    .line 45
    :try_start_1
    iput-boolean v1, p0, Lv4/c0;->B:Z

    .line 46
    .line 47
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 48
    .line 49
    .line 50
    monitor-exit p0

    .line 51
    return-void

    .line 52
    :catchall_0
    move-exception v0

    .line 53
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 54
    throw v0

    .line 55
    :catchall_1
    move-exception v0

    .line 56
    iget-object v2, p0, Lv4/c0;->i:Lk9/c;

    .line 57
    .line 58
    invoke-virtual {v2}, Lk9/c;->b()V

    .line 59
    .line 60
    .line 61
    monitor-enter p0

    .line 62
    :try_start_2
    iput-boolean v1, p0, Lv4/c0;->B:Z

    .line 63
    .line 64
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 65
    .line 66
    .line 67
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 68
    throw v0

    .line 69
    :catchall_2
    move-exception v0

    .line 70
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 71
    throw v0
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

.method public final F()V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    iget-object v2, p0, Lv4/c0;->a:[Lv4/a1;

    .line 4
    .line 5
    array-length v2, v2

    .line 6
    if-ge v1, v2, :cond_3

    .line 7
    .line 8
    iget-object v2, p0, Lv4/c0;->b:[Lv4/e;

    .line 9
    .line 10
    aget-object v2, v2, v1

    .line 11
    .line 12
    iget-object v3, v2, Lv4/e;->a:Ljava/lang/Object;

    .line 13
    .line 14
    monitor-enter v3

    .line 15
    const/4 v4, 0x0

    .line 16
    :try_start_0
    iput-object v4, v2, Lv4/e;->q:Lm5/p;

    .line 17
    .line 18
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    iget-object v2, p0, Lv4/c0;->a:[Lv4/a1;

    .line 20
    .line 21
    aget-object v2, v2, v1

    .line 22
    .line 23
    iget-object v3, v2, Lv4/a1;->a:Lv4/e;

    .line 24
    .line 25
    iget v4, v3, Lv4/e;->h:I

    .line 26
    .line 27
    const/4 v5, 0x1

    .line 28
    if-nez v4, :cond_0

    .line 29
    .line 30
    const/4 v4, 0x1

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    const/4 v4, 0x0

    .line 33
    :goto_1
    invoke-static {v4}, Lp4/c;->i(Z)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3}, Lv4/e;->p()V

    .line 37
    .line 38
    .line 39
    iput-boolean v0, v2, Lv4/a1;->e:Z

    .line 40
    .line 41
    iget-object v3, v2, Lv4/a1;->c:Lv4/e;

    .line 42
    .line 43
    if-eqz v3, :cond_2

    .line 44
    .line 45
    iget v4, v3, Lv4/e;->h:I

    .line 46
    .line 47
    if-nez v4, :cond_1

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_1
    const/4 v5, 0x0

    .line 51
    :goto_2
    invoke-static {v5}, Lp4/c;->i(Z)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v3}, Lv4/e;->p()V

    .line 55
    .line 56
    .line 57
    iput-boolean v0, v2, Lv4/a1;->f:Z

    .line 58
    .line 59
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :catchall_0
    move-exception v0

    .line 63
    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 64
    throw v0

    .line 65
    :cond_3
    return-void
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

.method public final G(IILj5/f1;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lv4/c0;->A:Lv4/z;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Lv4/z;->c(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lv4/c0;->s:Lv4/t0;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-ltz p1, :cond_0

    .line 14
    .line 15
    if-gt p1, p2, :cond_0

    .line 16
    .line 17
    iget-object v3, v0, Lv4/t0;->b:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-gt p2, v3, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v1, 0x0

    .line 27
    :goto_0
    invoke-static {v1}, Lp4/c;->c(Z)V

    .line 28
    .line 29
    .line 30
    iput-object p3, v0, Lv4/t0;->j:Lj5/f1;

    .line 31
    .line 32
    invoke-virtual {v0, p1, p2}, Lv4/t0;->g(II)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Lv4/t0;->b()Lm4/i1;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p0, p1, v2}, Lv4/c0;->q(Lm4/i1;Z)V

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
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method

.method public final H()V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lv4/c0;->n:Lv4/k;

    .line 4
    .line 5
    invoke-virtual {v1}, Lv4/k;->e()Lm4/s0;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget v1, v1, Lm4/s0;->a:F

    .line 10
    .line 11
    iget-object v2, v0, Lv4/c0;->r:Lv4/j0;

    .line 12
    .line 13
    iget-object v3, v2, Lv4/j0;->i:Lv4/h0;

    .line 14
    .line 15
    iget-object v2, v2, Lv4/j0;->j:Lv4/h0;

    .line 16
    .line 17
    const/4 v10, 0x1

    .line 18
    const/4 v4, 0x0

    .line 19
    move-object v11, v3

    .line 20
    const/4 v3, 0x1

    .line 21
    :goto_0
    if-eqz v11, :cond_13

    .line 22
    .line 23
    iget-boolean v5, v11, Lv4/h0;->e:Z

    .line 24
    .line 25
    if-nez v5, :cond_0

    .line 26
    .line 27
    goto/16 :goto_a

    .line 28
    .line 29
    :cond_0
    iget-object v5, v0, Lv4/c0;->z:Lv4/u0;

    .line 30
    .line 31
    iget-object v6, v5, Lv4/u0;->a:Lm4/i1;

    .line 32
    .line 33
    iget-boolean v5, v5, Lv4/u0;->l:Z

    .line 34
    .line 35
    invoke-virtual {v11, v1, v6, v5}, Lv4/h0;->j(FLm4/i1;Z)Lm5/u;

    .line 36
    .line 37
    .line 38
    move-result-object v12

    .line 39
    iget-object v5, v0, Lv4/c0;->r:Lv4/j0;

    .line 40
    .line 41
    iget-object v5, v5, Lv4/j0;->i:Lv4/h0;

    .line 42
    .line 43
    if-ne v11, v5, :cond_1

    .line 44
    .line 45
    move-object v14, v12

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    move-object v14, v4

    .line 48
    :goto_1
    iget-object v4, v11, Lv4/h0;->o:Lm5/u;

    .line 49
    .line 50
    iget-object v5, v12, Lm5/u;->c:[Lm5/r;

    .line 51
    .line 52
    const/4 v6, 0x0

    .line 53
    if-eqz v4, :cond_6

    .line 54
    .line 55
    iget-object v7, v4, Lm5/u;->c:[Lm5/r;

    .line 56
    .line 57
    array-length v7, v7

    .line 58
    array-length v8, v5

    .line 59
    if-eq v7, v8, :cond_2

    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_2
    const/4 v7, 0x0

    .line 63
    :goto_2
    array-length v8, v5

    .line 64
    if-ge v7, v8, :cond_4

    .line 65
    .line 66
    invoke-virtual {v12, v4, v7}, Lm5/u;->a(Lm5/u;I)Z

    .line 67
    .line 68
    .line 69
    move-result v8

    .line 70
    if-nez v8, :cond_3

    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_3
    add-int/lit8 v7, v7, 0x1

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_4
    if-ne v11, v2, :cond_5

    .line 77
    .line 78
    const/4 v3, 0x0

    .line 79
    :cond_5
    iget-object v11, v11, Lv4/h0;->m:Lv4/h0;

    .line 80
    .line 81
    move-object v4, v14

    .line 82
    goto :goto_0

    .line 83
    :cond_6
    :goto_3
    const/4 v1, 0x4

    .line 84
    if-eqz v3, :cond_11

    .line 85
    .line 86
    iget-object v2, v0, Lv4/c0;->r:Lv4/j0;

    .line 87
    .line 88
    iget-object v13, v2, Lv4/j0;->i:Lv4/h0;

    .line 89
    .line 90
    invoke-virtual {v2, v13}, Lv4/j0;->n(Lv4/h0;)I

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    and-int/2addr v2, v10

    .line 95
    if-eqz v2, :cond_7

    .line 96
    .line 97
    const/16 v17, 0x1

    .line 98
    .line 99
    goto :goto_4

    .line 100
    :cond_7
    const/16 v17, 0x0

    .line 101
    .line 102
    :goto_4
    iget-object v2, v0, Lv4/c0;->a:[Lv4/a1;

    .line 103
    .line 104
    array-length v2, v2

    .line 105
    new-array v2, v2, [Z

    .line 106
    .line 107
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    iget-object v3, v0, Lv4/c0;->z:Lv4/u0;

    .line 111
    .line 112
    iget-wide v3, v3, Lv4/u0;->s:J

    .line 113
    .line 114
    move-object/from16 v18, v2

    .line 115
    .line 116
    move-wide v15, v3

    .line 117
    invoke-virtual/range {v13 .. v18}, Lv4/h0;->a(Lm5/u;JZ[Z)J

    .line 118
    .line 119
    .line 120
    move-result-wide v2

    .line 121
    iget-object v4, v0, Lv4/c0;->z:Lv4/u0;

    .line 122
    .line 123
    iget v5, v4, Lv4/u0;->e:I

    .line 124
    .line 125
    if-eq v5, v1, :cond_8

    .line 126
    .line 127
    iget-wide v4, v4, Lv4/u0;->s:J

    .line 128
    .line 129
    cmp-long v7, v2, v4

    .line 130
    .line 131
    if-eqz v7, :cond_8

    .line 132
    .line 133
    const/4 v8, 0x1

    .line 134
    goto :goto_5

    .line 135
    :cond_8
    const/4 v8, 0x0

    .line 136
    :goto_5
    iget-object v4, v0, Lv4/c0;->z:Lv4/u0;

    .line 137
    .line 138
    const/4 v5, 0x4

    .line 139
    iget-object v1, v4, Lv4/u0;->b:Lj5/d0;

    .line 140
    .line 141
    iget-wide v11, v4, Lv4/u0;->c:J

    .line 142
    .line 143
    iget-wide v14, v4, Lv4/u0;->d:J

    .line 144
    .line 145
    const/4 v9, 0x5

    .line 146
    move-wide v4, v11

    .line 147
    move-wide v6, v14

    .line 148
    const/4 v11, 0x0

    .line 149
    const/4 v14, 0x4

    .line 150
    invoke-virtual/range {v0 .. v9}, Lv4/c0;->t(Lj5/d0;JJJZI)Lv4/u0;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    iput-object v1, v0, Lv4/c0;->z:Lv4/u0;

    .line 155
    .line 156
    if-eqz v8, :cond_9

    .line 157
    .line 158
    invoke-virtual {v0, v2, v3}, Lv4/c0;->K(J)V

    .line 159
    .line 160
    .line 161
    :cond_9
    invoke-virtual {v0}, Lv4/c0;->e()V

    .line 162
    .line 163
    .line 164
    iget-object v1, v0, Lv4/c0;->a:[Lv4/a1;

    .line 165
    .line 166
    array-length v1, v1

    .line 167
    new-array v1, v1, [Z

    .line 168
    .line 169
    const/4 v6, 0x0

    .line 170
    :goto_6
    iget-object v2, v0, Lv4/c0;->a:[Lv4/a1;

    .line 171
    .line 172
    array-length v3, v2

    .line 173
    if-ge v6, v3, :cond_f

    .line 174
    .line 175
    aget-object v2, v2, v6

    .line 176
    .line 177
    invoke-virtual {v2}, Lv4/a1;->c()I

    .line 178
    .line 179
    .line 180
    move-result v2

    .line 181
    iget-object v3, v0, Lv4/c0;->a:[Lv4/a1;

    .line 182
    .line 183
    aget-object v3, v3, v6

    .line 184
    .line 185
    invoke-virtual {v3}, Lv4/a1;->g()Z

    .line 186
    .line 187
    .line 188
    move-result v3

    .line 189
    aput-boolean v3, v1, v6

    .line 190
    .line 191
    iget-object v3, v0, Lv4/c0;->a:[Lv4/a1;

    .line 192
    .line 193
    aget-object v3, v3, v6

    .line 194
    .line 195
    iget-object v4, v13, Lv4/h0;->c:[Lj5/c1;

    .line 196
    .line 197
    aget-object v4, v4, v6

    .line 198
    .line 199
    iget-object v5, v0, Lv4/c0;->n:Lv4/k;

    .line 200
    .line 201
    iget-wide v7, v0, Lv4/c0;->O:J

    .line 202
    .line 203
    aget-boolean v9, v18, v6

    .line 204
    .line 205
    iget-object v12, v3, Lv4/a1;->a:Lv4/e;

    .line 206
    .line 207
    invoke-static {v12}, Lv4/a1;->h(Lv4/e;)Z

    .line 208
    .line 209
    .line 210
    move-result v15

    .line 211
    if-eqz v15, :cond_b

    .line 212
    .line 213
    iget-object v15, v12, Lv4/e;->i:Lj5/c1;

    .line 214
    .line 215
    if-eq v4, v15, :cond_a

    .line 216
    .line 217
    invoke-virtual {v3, v12, v5}, Lv4/a1;->a(Lv4/e;Lv4/k;)V

    .line 218
    .line 219
    .line 220
    goto :goto_7

    .line 221
    :cond_a
    if-eqz v9, :cond_b

    .line 222
    .line 223
    iput-boolean v11, v12, Lv4/e;->n:Z

    .line 224
    .line 225
    iput-wide v7, v12, Lv4/e;->l:J

    .line 226
    .line 227
    iput-wide v7, v12, Lv4/e;->m:J

    .line 228
    .line 229
    invoke-virtual {v12, v7, v8, v11}, Lv4/e;->o(JZ)V

    .line 230
    .line 231
    .line 232
    :cond_b
    :goto_7
    iget-object v12, v3, Lv4/a1;->c:Lv4/e;

    .line 233
    .line 234
    if-eqz v12, :cond_d

    .line 235
    .line 236
    invoke-static {v12}, Lv4/a1;->h(Lv4/e;)Z

    .line 237
    .line 238
    .line 239
    move-result v15

    .line 240
    if-eqz v15, :cond_d

    .line 241
    .line 242
    iget-object v15, v12, Lv4/e;->i:Lj5/c1;

    .line 243
    .line 244
    if-eq v4, v15, :cond_c

    .line 245
    .line 246
    invoke-virtual {v3, v12, v5}, Lv4/a1;->a(Lv4/e;Lv4/k;)V

    .line 247
    .line 248
    .line 249
    goto :goto_8

    .line 250
    :cond_c
    if-eqz v9, :cond_d

    .line 251
    .line 252
    iput-boolean v11, v12, Lv4/e;->n:Z

    .line 253
    .line 254
    iput-wide v7, v12, Lv4/e;->l:J

    .line 255
    .line 256
    iput-wide v7, v12, Lv4/e;->m:J

    .line 257
    .line 258
    invoke-virtual {v12, v7, v8, v11}, Lv4/e;->o(JZ)V

    .line 259
    .line 260
    .line 261
    :cond_d
    :goto_8
    iget-object v3, v0, Lv4/c0;->a:[Lv4/a1;

    .line 262
    .line 263
    aget-object v3, v3, v6

    .line 264
    .line 265
    invoke-virtual {v3}, Lv4/a1;->c()I

    .line 266
    .line 267
    .line 268
    move-result v3

    .line 269
    sub-int v3, v2, v3

    .line 270
    .line 271
    if-lez v3, :cond_e

    .line 272
    .line 273
    invoke-virtual {v0, v6, v11}, Lv4/c0;->A(IZ)V

    .line 274
    .line 275
    .line 276
    :cond_e
    iget v3, v0, Lv4/c0;->M:I

    .line 277
    .line 278
    iget-object v4, v0, Lv4/c0;->a:[Lv4/a1;

    .line 279
    .line 280
    aget-object v4, v4, v6

    .line 281
    .line 282
    invoke-virtual {v4}, Lv4/a1;->c()I

    .line 283
    .line 284
    .line 285
    move-result v4

    .line 286
    sub-int/2addr v2, v4

    .line 287
    sub-int/2addr v3, v2

    .line 288
    iput v3, v0, Lv4/c0;->M:I

    .line 289
    .line 290
    add-int/lit8 v6, v6, 0x1

    .line 291
    .line 292
    goto :goto_6

    .line 293
    :cond_f
    iget-wide v2, v0, Lv4/c0;->O:J

    .line 294
    .line 295
    invoke-virtual {v0, v1, v2, v3}, Lv4/c0;->i([ZJ)V

    .line 296
    .line 297
    .line 298
    iput-boolean v10, v13, Lv4/h0;->h:Z

    .line 299
    .line 300
    :cond_10
    const/4 v5, 0x4

    .line 301
    goto :goto_9

    .line 302
    :cond_11
    const/4 v14, 0x4

    .line 303
    iget-object v1, v0, Lv4/c0;->r:Lv4/j0;

    .line 304
    .line 305
    invoke-virtual {v1, v11}, Lv4/j0;->n(Lv4/h0;)I

    .line 306
    .line 307
    .line 308
    iget-boolean v1, v11, Lv4/h0;->e:Z

    .line 309
    .line 310
    if-eqz v1, :cond_10

    .line 311
    .line 312
    iget-object v1, v11, Lv4/h0;->g:Lv4/i0;

    .line 313
    .line 314
    iget-wide v1, v1, Lv4/i0;->b:J

    .line 315
    .line 316
    iget-wide v3, v0, Lv4/c0;->O:J

    .line 317
    .line 318
    iget-wide v5, v11, Lv4/h0;->p:J

    .line 319
    .line 320
    sub-long/2addr v3, v5

    .line 321
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 322
    .line 323
    .line 324
    move-result-wide v1

    .line 325
    iget-boolean v3, v0, Lv4/c0;->x:Z

    .line 326
    .line 327
    if-eqz v3, :cond_12

    .line 328
    .line 329
    invoke-virtual {v0}, Lv4/c0;->d()Z

    .line 330
    .line 331
    .line 332
    move-result v3

    .line 333
    if-eqz v3, :cond_12

    .line 334
    .line 335
    iget-object v3, v0, Lv4/c0;->r:Lv4/j0;

    .line 336
    .line 337
    iget-object v3, v3, Lv4/j0;->k:Lv4/h0;

    .line 338
    .line 339
    if-ne v3, v11, :cond_12

    .line 340
    .line 341
    invoke-virtual {v0}, Lv4/c0;->e()V

    .line 342
    .line 343
    .line 344
    :cond_12
    iget-object v3, v11, Lv4/h0;->j:[Lv4/e;

    .line 345
    .line 346
    array-length v3, v3

    .line 347
    new-array v3, v3, [Z

    .line 348
    .line 349
    const/4 v15, 0x0

    .line 350
    move-wide v13, v1

    .line 351
    move-object/from16 v16, v3

    .line 352
    .line 353
    const/4 v5, 0x4

    .line 354
    invoke-virtual/range {v11 .. v16}, Lv4/h0;->a(Lm5/u;JZ[Z)J

    .line 355
    .line 356
    .line 357
    :goto_9
    invoke-virtual {v0, v10}, Lv4/c0;->p(Z)V

    .line 358
    .line 359
    .line 360
    iget-object v1, v0, Lv4/c0;->z:Lv4/u0;

    .line 361
    .line 362
    iget v1, v1, Lv4/u0;->e:I

    .line 363
    .line 364
    if-eq v1, v5, :cond_13

    .line 365
    .line 366
    invoke-virtual {v0}, Lv4/c0;->w()V

    .line 367
    .line 368
    .line 369
    invoke-virtual {v0}, Lv4/c0;->n0()V

    .line 370
    .line 371
    .line 372
    iget-object v1, v0, Lv4/c0;->h:Lp4/x;

    .line 373
    .line 374
    const/4 v2, 0x2

    .line 375
    invoke-virtual {v1, v2}, Lp4/x;->e(I)Z

    .line 376
    .line 377
    .line 378
    :cond_13
    :goto_a
    return-void
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
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
.end method

.method public final I(ZZZZ)V
    .locals 35

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v2, "ExoPlayerImplInternal"

    .line 4
    .line 5
    iget-object v0, v1, Lv4/c0;->h:Lp4/x;

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    invoke-virtual {v0, v3}, Lp4/x;->d(I)V

    .line 9
    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    iput-object v3, v1, Lv4/c0;->S:Lv4/m;

    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v5, 0x1

    .line 16
    invoke-virtual {v1, v4, v5}, Lv4/c0;->p0(ZZ)V

    .line 17
    .line 18
    .line 19
    iget-object v0, v1, Lv4/c0;->n:Lv4/k;

    .line 20
    .line 21
    iput-boolean v4, v0, Lv4/k;->f:Z

    .line 22
    .line 23
    iget-object v0, v0, Lv4/k;->a:Lv4/c1;

    .line 24
    .line 25
    iget-boolean v6, v0, Lv4/c1;->b:Z

    .line 26
    .line 27
    if-eqz v6, :cond_0

    .line 28
    .line 29
    invoke-virtual {v0}, Lv4/c1;->b()J

    .line 30
    .line 31
    .line 32
    move-result-wide v6

    .line 33
    invoke-virtual {v0, v6, v7}, Lv4/c1;->d(J)V

    .line 34
    .line 35
    .line 36
    iput-boolean v4, v0, Lv4/c1;->b:Z

    .line 37
    .line 38
    :cond_0
    const-wide v6, 0xe8d4a51000L

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    iput-wide v6, v1, Lv4/c0;->O:J

    .line 44
    .line 45
    const/4 v0, 0x0

    .line 46
    :goto_0
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    :try_start_0
    iget-object v8, v1, Lv4/c0;->a:[Lv4/a1;

    .line 52
    .line 53
    array-length v8, v8

    .line 54
    if-ge v0, v8, :cond_1

    .line 55
    .line 56
    invoke-virtual {v1, v0}, Lv4/c0;->f(I)V

    .line 57
    .line 58
    .line 59
    add-int/lit8 v0, v0, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :catch_0
    move-exception v0

    .line 63
    goto :goto_1

    .line 64
    :catch_1
    move-exception v0

    .line 65
    goto :goto_1

    .line 66
    :cond_1
    iput-wide v6, v1, Lv4/c0;->V:J
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lv4/m; {:try_start_0 .. :try_end_0} :catch_0

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :goto_1
    const-string v8, "Disable failed."

    .line 70
    .line 71
    invoke-static {v2, v8, v0}, Lp4/c;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 72
    .line 73
    .line 74
    :goto_2
    if-eqz p1, :cond_2

    .line 75
    .line 76
    iget-object v8, v1, Lv4/c0;->a:[Lv4/a1;

    .line 77
    .line 78
    array-length v9, v8

    .line 79
    const/4 v10, 0x0

    .line 80
    :goto_3
    if-ge v10, v9, :cond_2

    .line 81
    .line 82
    aget-object v0, v8, v10

    .line 83
    .line 84
    :try_start_1
    invoke-virtual {v0}, Lv4/a1;->l()V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_2

    .line 85
    .line 86
    .line 87
    goto :goto_4

    .line 88
    :catch_2
    move-exception v0

    .line 89
    const-string v11, "Reset failed."

    .line 90
    .line 91
    invoke-static {v2, v11, v0}, Lp4/c;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 92
    .line 93
    .line 94
    :goto_4
    add-int/lit8 v10, v10, 0x1

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_2
    iput v4, v1, Lv4/c0;->M:I

    .line 98
    .line 99
    iget-object v0, v1, Lv4/c0;->z:Lv4/u0;

    .line 100
    .line 101
    iget-object v2, v0, Lv4/u0;->b:Lj5/d0;

    .line 102
    .line 103
    iget-wide v8, v0, Lv4/u0;->s:J

    .line 104
    .line 105
    iget-object v0, v1, Lv4/c0;->z:Lv4/u0;

    .line 106
    .line 107
    iget-object v0, v0, Lv4/u0;->b:Lj5/d0;

    .line 108
    .line 109
    invoke-virtual {v0}, Lj5/d0;->b()Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-nez v0, :cond_4

    .line 114
    .line 115
    iget-object v0, v1, Lv4/c0;->z:Lv4/u0;

    .line 116
    .line 117
    iget-object v10, v1, Lv4/c0;->l:Lm4/f1;

    .line 118
    .line 119
    iget-object v11, v0, Lv4/u0;->b:Lj5/d0;

    .line 120
    .line 121
    iget-object v0, v0, Lv4/u0;->a:Lm4/i1;

    .line 122
    .line 123
    invoke-virtual {v0}, Lm4/i1;->p()Z

    .line 124
    .line 125
    .line 126
    move-result v12

    .line 127
    if-nez v12, :cond_4

    .line 128
    .line 129
    iget-object v11, v11, Lj5/d0;->a:Ljava/lang/Object;

    .line 130
    .line 131
    invoke-virtual {v0, v11, v10}, Lm4/i1;->g(Ljava/lang/Object;Lm4/f1;)Lm4/f1;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    iget-boolean v0, v0, Lm4/f1;->f:Z

    .line 136
    .line 137
    if-eqz v0, :cond_3

    .line 138
    .line 139
    goto :goto_5

    .line 140
    :cond_3
    iget-object v0, v1, Lv4/c0;->z:Lv4/u0;

    .line 141
    .line 142
    iget-wide v10, v0, Lv4/u0;->s:J

    .line 143
    .line 144
    goto :goto_6

    .line 145
    :cond_4
    :goto_5
    iget-object v0, v1, Lv4/c0;->z:Lv4/u0;

    .line 146
    .line 147
    iget-wide v10, v0, Lv4/u0;->c:J

    .line 148
    .line 149
    :goto_6
    if-eqz p2, :cond_6

    .line 150
    .line 151
    iput-object v3, v1, Lv4/c0;->N:Lv4/b0;

    .line 152
    .line 153
    iget-object v0, v1, Lv4/c0;->z:Lv4/u0;

    .line 154
    .line 155
    iget-object v0, v0, Lv4/u0;->a:Lm4/i1;

    .line 156
    .line 157
    invoke-virtual {v1, v0}, Lv4/c0;->l(Lm4/i1;)Landroid/util/Pair;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    iget-object v2, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v2, Lj5/d0;

    .line 164
    .line 165
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast v0, Ljava/lang/Long;

    .line 168
    .line 169
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 170
    .line 171
    .line 172
    move-result-wide v8

    .line 173
    iget-object v0, v1, Lv4/c0;->z:Lv4/u0;

    .line 174
    .line 175
    iget-object v0, v0, Lv4/u0;->b:Lj5/d0;

    .line 176
    .line 177
    invoke-virtual {v2, v0}, Lj5/d0;->equals(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    move-wide v11, v8

    .line 182
    if-nez v0, :cond_5

    .line 183
    .line 184
    :goto_7
    move-wide v9, v6

    .line 185
    goto :goto_8

    .line 186
    :cond_5
    const/4 v5, 0x0

    .line 187
    goto :goto_7

    .line 188
    :cond_6
    move-wide/from16 v33, v10

    .line 189
    .line 190
    move-wide v11, v8

    .line 191
    move-wide/from16 v9, v33

    .line 192
    .line 193
    const/4 v5, 0x0

    .line 194
    :goto_8
    iget-object v0, v1, Lv4/c0;->r:Lv4/j0;

    .line 195
    .line 196
    invoke-virtual {v0}, Lv4/j0;->b()V

    .line 197
    .line 198
    .line 199
    iput-boolean v4, v1, Lv4/c0;->G:Z

    .line 200
    .line 201
    iget-object v0, v1, Lv4/c0;->z:Lv4/u0;

    .line 202
    .line 203
    iget-object v0, v0, Lv4/u0;->a:Lm4/i1;

    .line 204
    .line 205
    if-eqz p3, :cond_9

    .line 206
    .line 207
    instance-of v6, v0, Lv4/y0;

    .line 208
    .line 209
    if-eqz v6, :cond_9

    .line 210
    .line 211
    check-cast v0, Lv4/y0;

    .line 212
    .line 213
    iget-object v6, v1, Lv4/c0;->s:Lv4/t0;

    .line 214
    .line 215
    iget-object v6, v6, Lv4/t0;->j:Lj5/f1;

    .line 216
    .line 217
    iget-object v7, v0, Lv4/y0;->k:[Lm4/i1;

    .line 218
    .line 219
    array-length v8, v7

    .line 220
    new-array v8, v8, [Lm4/i1;

    .line 221
    .line 222
    const/4 v13, 0x0

    .line 223
    :goto_9
    array-length v14, v7

    .line 224
    if-ge v13, v14, :cond_7

    .line 225
    .line 226
    new-instance v14, Lj5/n1;

    .line 227
    .line 228
    aget-object v15, v7, v13

    .line 229
    .line 230
    invoke-direct {v14, v15}, Lj5/n1;-><init>(Lm4/i1;)V

    .line 231
    .line 232
    .line 233
    aput-object v14, v8, v13

    .line 234
    .line 235
    add-int/lit8 v13, v13, 0x1

    .line 236
    .line 237
    goto :goto_9

    .line 238
    :cond_7
    new-instance v7, Lv4/y0;

    .line 239
    .line 240
    iget-object v0, v0, Lv4/y0;->l:[Ljava/lang/Object;

    .line 241
    .line 242
    invoke-direct {v7, v8, v0, v6}, Lv4/y0;-><init>([Lm4/i1;[Ljava/lang/Object;Lj5/f1;)V

    .line 243
    .line 244
    .line 245
    iget v0, v2, Lj5/d0;->b:I

    .line 246
    .line 247
    const/4 v6, -0x1

    .line 248
    if-eq v0, v6, :cond_8

    .line 249
    .line 250
    iget-object v0, v2, Lj5/d0;->a:Ljava/lang/Object;

    .line 251
    .line 252
    iget-object v6, v1, Lv4/c0;->l:Lm4/f1;

    .line 253
    .line 254
    invoke-virtual {v7, v0, v6}, Lv4/y0;->g(Ljava/lang/Object;Lm4/f1;)Lm4/f1;

    .line 255
    .line 256
    .line 257
    iget-object v0, v1, Lv4/c0;->l:Lm4/f1;

    .line 258
    .line 259
    iget v0, v0, Lm4/f1;->c:I

    .line 260
    .line 261
    iget-object v6, v1, Lv4/c0;->k:Lm4/h1;

    .line 262
    .line 263
    const-wide/16 v13, 0x0

    .line 264
    .line 265
    invoke-virtual {v7, v0, v6, v13, v14}, Lv4/y0;->m(ILm4/h1;J)Lm4/h1;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v6}, Lm4/h1;->a()Z

    .line 269
    .line 270
    .line 271
    move-result v0

    .line 272
    if-eqz v0, :cond_8

    .line 273
    .line 274
    new-instance v0, Lj5/d0;

    .line 275
    .line 276
    iget-object v6, v2, Lj5/d0;->a:Ljava/lang/Object;

    .line 277
    .line 278
    iget-wide v13, v2, Lj5/d0;->d:J

    .line 279
    .line 280
    invoke-direct {v0, v13, v14, v6}, Lj5/d0;-><init>(JLjava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    move-object v8, v0

    .line 284
    goto :goto_b

    .line 285
    :cond_8
    :goto_a
    move-object v8, v2

    .line 286
    goto :goto_b

    .line 287
    :cond_9
    move-object v7, v0

    .line 288
    goto :goto_a

    .line 289
    :goto_b
    new-instance v6, Lv4/u0;

    .line 290
    .line 291
    iget-object v0, v1, Lv4/c0;->z:Lv4/u0;

    .line 292
    .line 293
    iget v13, v0, Lv4/u0;->e:I

    .line 294
    .line 295
    if-eqz p4, :cond_a

    .line 296
    .line 297
    move-object v14, v3

    .line 298
    goto :goto_c

    .line 299
    :cond_a
    iget-object v2, v0, Lv4/u0;->f:Lv4/m;

    .line 300
    .line 301
    move-object v14, v2

    .line 302
    :goto_c
    if-eqz v5, :cond_b

    .line 303
    .line 304
    sget-object v2, Lj5/o1;->d:Lj5/o1;

    .line 305
    .line 306
    :goto_d
    move-object/from16 v16, v2

    .line 307
    .line 308
    goto :goto_e

    .line 309
    :cond_b
    iget-object v2, v0, Lv4/u0;->h:Lj5/o1;

    .line 310
    .line 311
    goto :goto_d

    .line 312
    :goto_e
    if-eqz v5, :cond_c

    .line 313
    .line 314
    iget-object v2, v1, Lv4/c0;->e:Lm5/u;

    .line 315
    .line 316
    :goto_f
    move-object/from16 v17, v2

    .line 317
    .line 318
    goto :goto_10

    .line 319
    :cond_c
    iget-object v2, v0, Lv4/u0;->i:Lm5/u;

    .line 320
    .line 321
    goto :goto_f

    .line 322
    :goto_10
    if-eqz v5, :cond_d

    .line 323
    .line 324
    sget-object v2, Lya/i0;->b:Lya/g0;

    .line 325
    .line 326
    sget-object v2, Lya/a1;->e:Lya/a1;

    .line 327
    .line 328
    :goto_11
    move-object/from16 v18, v2

    .line 329
    .line 330
    goto :goto_12

    .line 331
    :cond_d
    iget-object v2, v0, Lv4/u0;->j:Ljava/util/List;

    .line 332
    .line 333
    goto :goto_11

    .line 334
    :goto_12
    iget-boolean v2, v0, Lv4/u0;->l:Z

    .line 335
    .line 336
    iget v5, v0, Lv4/u0;->m:I

    .line 337
    .line 338
    iget v15, v0, Lv4/u0;->n:I

    .line 339
    .line 340
    iget-object v0, v0, Lv4/u0;->o:Lm4/s0;

    .line 341
    .line 342
    const-wide/16 v30, 0x0

    .line 343
    .line 344
    const/16 v32, 0x0

    .line 345
    .line 346
    move/from16 v22, v15

    .line 347
    .line 348
    const/4 v15, 0x0

    .line 349
    const-wide/16 v26, 0x0

    .line 350
    .line 351
    move-object/from16 v19, v8

    .line 352
    .line 353
    move-wide/from16 v24, v11

    .line 354
    .line 355
    move-wide/from16 v28, v11

    .line 356
    .line 357
    move-object/from16 v23, v0

    .line 358
    .line 359
    move/from16 v20, v2

    .line 360
    .line 361
    move/from16 v21, v5

    .line 362
    .line 363
    invoke-direct/range {v6 .. v32}, Lv4/u0;-><init>(Lm4/i1;Lj5/d0;JJILv4/m;ZLj5/o1;Lm5/u;Ljava/util/List;Lj5/d0;ZIILm4/s0;JJJJZ)V

    .line 364
    .line 365
    .line 366
    iput-object v6, v1, Lv4/c0;->z:Lv4/u0;

    .line 367
    .line 368
    if-eqz p3, :cond_11

    .line 369
    .line 370
    iget-object v0, v1, Lv4/c0;->r:Lv4/j0;

    .line 371
    .line 372
    iget-object v2, v0, Lv4/j0;->q:Ljava/util/ArrayList;

    .line 373
    .line 374
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 375
    .line 376
    .line 377
    move-result v2

    .line 378
    if-nez v2, :cond_f

    .line 379
    .line 380
    new-instance v2, Ljava/util/ArrayList;

    .line 381
    .line 382
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 383
    .line 384
    .line 385
    const/4 v5, 0x0

    .line 386
    :goto_13
    iget-object v6, v0, Lv4/j0;->q:Ljava/util/ArrayList;

    .line 387
    .line 388
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 389
    .line 390
    .line 391
    move-result v6

    .line 392
    if-ge v5, v6, :cond_e

    .line 393
    .line 394
    iget-object v6, v0, Lv4/j0;->q:Ljava/util/ArrayList;

    .line 395
    .line 396
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object v6

    .line 400
    check-cast v6, Lv4/h0;

    .line 401
    .line 402
    invoke-virtual {v6}, Lv4/h0;->i()V

    .line 403
    .line 404
    .line 405
    add-int/lit8 v5, v5, 0x1

    .line 406
    .line 407
    goto :goto_13

    .line 408
    :cond_e
    iput-object v2, v0, Lv4/j0;->q:Ljava/util/ArrayList;

    .line 409
    .line 410
    iput-object v3, v0, Lv4/j0;->m:Lv4/h0;

    .line 411
    .line 412
    invoke-virtual {v0}, Lv4/j0;->k()V

    .line 413
    .line 414
    .line 415
    :cond_f
    iget-object v2, v1, Lv4/c0;->s:Lv4/t0;

    .line 416
    .line 417
    iget-object v3, v2, Lv4/t0;->f:Ljava/util/HashMap;

    .line 418
    .line 419
    invoke-virtual {v3}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 424
    .line 425
    .line 426
    move-result-object v5

    .line 427
    :goto_14
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 428
    .line 429
    .line 430
    move-result v0

    .line 431
    if-eqz v0, :cond_10

    .line 432
    .line 433
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v0

    .line 437
    move-object v6, v0

    .line 438
    check-cast v6, Lv4/r0;

    .line 439
    .line 440
    :try_start_2
    iget-object v0, v6, Lv4/r0;->a:Lj5/a;

    .line 441
    .line 442
    iget-object v7, v6, Lv4/r0;->b:Lv4/l0;

    .line 443
    .line 444
    invoke-virtual {v0, v7}, Lj5/a;->p(Lj5/e0;)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_3

    .line 445
    .line 446
    .line 447
    goto :goto_15

    .line 448
    :catch_3
    move-exception v0

    .line 449
    const-string v7, "MediaSourceList"

    .line 450
    .line 451
    const-string v8, "Failed to release child source."

    .line 452
    .line 453
    invoke-static {v7, v8, v0}, Lp4/c;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 454
    .line 455
    .line 456
    :goto_15
    iget-object v0, v6, Lv4/r0;->a:Lj5/a;

    .line 457
    .line 458
    iget-object v7, v6, Lv4/r0;->c:Lv4/q0;

    .line 459
    .line 460
    invoke-virtual {v0, v7}, Lj5/a;->s(Lj5/j0;)V

    .line 461
    .line 462
    .line 463
    iget-object v0, v6, Lv4/r0;->a:Lj5/a;

    .line 464
    .line 465
    invoke-virtual {v0, v7}, Lj5/a;->r(Lb5/r;)V

    .line 466
    .line 467
    .line 468
    goto :goto_14

    .line 469
    :cond_10
    invoke-virtual {v3}, Ljava/util/HashMap;->clear()V

    .line 470
    .line 471
    .line 472
    iget-object v0, v2, Lv4/t0;->g:Ljava/util/HashSet;

    .line 473
    .line 474
    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    .line 475
    .line 476
    .line 477
    iput-boolean v4, v2, Lv4/t0;->k:Z

    .line 478
    .line 479
    :cond_11
    return-void
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
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
.end method

.method public final J()V
    .locals 1

    .line 1
    iget-object v0, p0, Lv4/c0;->r:Lv4/j0;

    .line 2
    .line 3
    iget-object v0, v0, Lv4/j0;->i:Lv4/h0;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, v0, Lv4/h0;->g:Lv4/i0;

    .line 8
    .line 9
    iget-boolean v0, v0, Lv4/i0;->i:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-boolean v0, p0, Lv4/c0;->C:Z

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    :goto_0
    iput-boolean v0, p0, Lv4/c0;->D:Z

    .line 21
    .line 22
    return-void
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final K(J)V
    .locals 7

    .line 1
    iget-object v0, p0, Lv4/c0;->r:Lv4/j0;

    .line 2
    .line 3
    iget-object v1, v0, Lv4/j0;->i:Lv4/h0;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    const-wide v2, 0xe8d4a51000L

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    :goto_0
    add-long/2addr p1, v2

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    iget-wide v2, v1, Lv4/h0;->p:J

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :goto_1
    iput-wide p1, p0, Lv4/c0;->O:J

    .line 18
    .line 19
    iget-object v2, p0, Lv4/c0;->n:Lv4/k;

    .line 20
    .line 21
    iget-object v2, v2, Lv4/k;->a:Lv4/c1;

    .line 22
    .line 23
    invoke-virtual {v2, p1, p2}, Lv4/c1;->d(J)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lv4/c0;->a:[Lv4/a1;

    .line 27
    .line 28
    array-length p2, p1

    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x0

    .line 31
    :goto_2
    if-ge v3, p2, :cond_2

    .line 32
    .line 33
    aget-object v4, p1, v3

    .line 34
    .line 35
    iget-wide v5, p0, Lv4/c0;->O:J

    .line 36
    .line 37
    invoke-virtual {v4, v1}, Lv4/a1;->d(Lv4/h0;)Lv4/e;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    if-eqz v4, :cond_1

    .line 42
    .line 43
    iput-boolean v2, v4, Lv4/e;->n:Z

    .line 44
    .line 45
    iput-wide v5, v4, Lv4/e;->l:J

    .line 46
    .line 47
    iput-wide v5, v4, Lv4/e;->m:J

    .line 48
    .line 49
    invoke-virtual {v4, v5, v6, v2}, Lv4/e;->o(JZ)V

    .line 50
    .line 51
    .line 52
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    iget-object p1, v0, Lv4/j0;->i:Lv4/h0;

    .line 56
    .line 57
    :goto_3
    if-eqz p1, :cond_5

    .line 58
    .line 59
    iget-object p2, p1, Lv4/h0;->o:Lm5/u;

    .line 60
    .line 61
    iget-object p2, p2, Lm5/u;->c:[Lm5/r;

    .line 62
    .line 63
    array-length v0, p2

    .line 64
    const/4 v1, 0x0

    .line 65
    :goto_4
    if-ge v1, v0, :cond_4

    .line 66
    .line 67
    aget-object v3, p2, v1

    .line 68
    .line 69
    if-eqz v3, :cond_3

    .line 70
    .line 71
    invoke-interface {v3}, Lm5/r;->r()V

    .line 72
    .line 73
    .line 74
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 75
    .line 76
    goto :goto_4

    .line 77
    :cond_4
    iget-object p1, p1, Lv4/h0;->m:Lv4/h0;

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_5
    return-void
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

.method public final L(Lm4/i1;Lm4/i1;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Lm4/i1;->p()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p2}, Lm4/i1;->p()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object p1, p0, Lv4/c0;->o:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    add-int/lit8 p2, p2, -0x1

    .line 21
    .line 22
    if-gez p2, :cond_1

    .line 23
    .line 24
    invoke-static {p1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-static {p1}, La0/c;->N(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    const/4 p1, 0x0

    .line 36
    throw p1
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

.method public final O(J)V
    .locals 2

    .line 1
    iget-object v0, p0, Lv4/c0;->z:Lv4/u0;

    .line 2
    .line 3
    iget v0, v0, Lv4/u0;->e:I

    .line 4
    .line 5
    const/4 v1, 0x3

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lv4/c0;->f0()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    const-wide/16 v0, 0x3e8

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    sget-wide v0, Lv4/c0;->X:J

    .line 18
    .line 19
    :goto_0
    add-long/2addr p1, v0

    .line 20
    iget-object v0, p0, Lv4/c0;->h:Lp4/x;

    .line 21
    .line 22
    iget-object v0, v0, Lp4/x;->a:Landroid/os/Handler;

    .line 23
    .line 24
    const/4 v1, 0x2

    .line 25
    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Handler;->sendEmptyMessageAtTime(IJ)Z

    .line 26
    .line 27
    .line 28
    return-void
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public final P(Z)V
    .locals 11

    .line 1
    iget-object v0, p0, Lv4/c0;->r:Lv4/j0;

    .line 2
    .line 3
    iget-object v0, v0, Lv4/j0;->i:Lv4/h0;

    .line 4
    .line 5
    iget-object v0, v0, Lv4/h0;->g:Lv4/i0;

    .line 6
    .line 7
    iget-object v2, v0, Lv4/i0;->a:Lj5/d0;

    .line 8
    .line 9
    iget-object v0, p0, Lv4/c0;->z:Lv4/u0;

    .line 10
    .line 11
    iget-wide v3, v0, Lv4/u0;->s:J

    .line 12
    .line 13
    const/4 v5, 0x1

    .line 14
    const/4 v6, 0x0

    .line 15
    move-object v1, p0

    .line 16
    invoke-virtual/range {v1 .. v6}, Lv4/c0;->R(Lj5/d0;JZZ)J

    .line 17
    .line 18
    .line 19
    move-result-wide v3

    .line 20
    iget-object v0, v1, Lv4/c0;->z:Lv4/u0;

    .line 21
    .line 22
    iget-wide v5, v0, Lv4/u0;->s:J

    .line 23
    .line 24
    cmp-long v0, v3, v5

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    iget-object v0, v1, Lv4/c0;->z:Lv4/u0;

    .line 29
    .line 30
    iget-wide v5, v0, Lv4/u0;->c:J

    .line 31
    .line 32
    iget-wide v7, v0, Lv4/u0;->d:J

    .line 33
    .line 34
    const/4 v10, 0x5

    .line 35
    move v9, p1

    .line 36
    invoke-virtual/range {v1 .. v10}, Lv4/c0;->t(Lj5/d0;JJJZI)Lv4/u0;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iput-object p1, v1, Lv4/c0;->z:Lv4/u0;

    .line 41
    .line 42
    :cond_0
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

.method public final Q(Lv4/b0;)V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lv4/c0;->A:Lv4/z;

    .line 4
    .line 5
    const/4 v9, 0x1

    .line 6
    invoke-virtual {v0, v9}, Lv4/z;->c(I)V

    .line 7
    .line 8
    .line 9
    iget-object v0, v1, Lv4/c0;->z:Lv4/u0;

    .line 10
    .line 11
    iget-object v2, v0, Lv4/u0;->a:Lm4/i1;

    .line 12
    .line 13
    iget v5, v1, Lv4/c0;->H:I

    .line 14
    .line 15
    iget-boolean v6, v1, Lv4/c0;->I:Z

    .line 16
    .line 17
    iget-object v7, v1, Lv4/c0;->k:Lm4/h1;

    .line 18
    .line 19
    iget-object v8, v1, Lv4/c0;->l:Lm4/f1;

    .line 20
    .line 21
    const/4 v4, 0x1

    .line 22
    move-object/from16 v3, p1

    .line 23
    .line 24
    invoke-static/range {v2 .. v8}, Lv4/c0;->M(Lm4/i1;Lv4/b0;ZIZLm4/h1;Lm4/f1;)Landroid/util/Pair;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    const/4 v8, 0x0

    .line 34
    if-nez v0, :cond_0

    .line 35
    .line 36
    iget-object v2, v1, Lv4/c0;->z:Lv4/u0;

    .line 37
    .line 38
    iget-object v2, v2, Lv4/u0;->a:Lm4/i1;

    .line 39
    .line 40
    invoke-virtual {v1, v2}, Lv4/c0;->l(Lm4/i1;)Landroid/util/Pair;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    iget-object v10, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v10, Lj5/d0;

    .line 47
    .line 48
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v2, Ljava/lang/Long;

    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 53
    .line 54
    .line 55
    move-result-wide v11

    .line 56
    iget-object v2, v1, Lv4/c0;->z:Lv4/u0;

    .line 57
    .line 58
    iget-object v2, v2, Lv4/u0;->a:Lm4/i1;

    .line 59
    .line 60
    invoke-virtual {v2}, Lm4/i1;->p()Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    xor-int/2addr v2, v9

    .line 65
    move-wide v5, v6

    .line 66
    :goto_0
    const-wide/16 v15, 0x0

    .line 67
    .line 68
    goto :goto_4

    .line 69
    :cond_0
    iget-object v2, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 70
    .line 71
    iget-object v10, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v10, Ljava/lang/Long;

    .line 74
    .line 75
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    .line 76
    .line 77
    .line 78
    move-result-wide v11

    .line 79
    iget-wide v13, v3, Lv4/b0;->c:J

    .line 80
    .line 81
    cmp-long v10, v13, v6

    .line 82
    .line 83
    if-nez v10, :cond_1

    .line 84
    .line 85
    move-wide v13, v6

    .line 86
    goto :goto_1

    .line 87
    :cond_1
    move-wide v13, v11

    .line 88
    :goto_1
    iget-object v10, v1, Lv4/c0;->r:Lv4/j0;

    .line 89
    .line 90
    iget-object v15, v1, Lv4/c0;->z:Lv4/u0;

    .line 91
    .line 92
    iget-object v15, v15, Lv4/u0;->a:Lm4/i1;

    .line 93
    .line 94
    invoke-virtual {v10, v15, v2, v11, v12}, Lv4/j0;->p(Lm4/i1;Ljava/lang/Object;J)Lj5/d0;

    .line 95
    .line 96
    .line 97
    move-result-object v10

    .line 98
    invoke-virtual {v10}, Lj5/d0;->b()Z

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    if-eqz v2, :cond_3

    .line 103
    .line 104
    iget-object v2, v1, Lv4/c0;->z:Lv4/u0;

    .line 105
    .line 106
    iget-object v2, v2, Lv4/u0;->a:Lm4/i1;

    .line 107
    .line 108
    iget-object v6, v10, Lj5/d0;->a:Ljava/lang/Object;

    .line 109
    .line 110
    iget-object v7, v1, Lv4/c0;->l:Lm4/f1;

    .line 111
    .line 112
    invoke-virtual {v2, v6, v7}, Lm4/i1;->g(Ljava/lang/Object;Lm4/f1;)Lm4/f1;

    .line 113
    .line 114
    .line 115
    iget-object v2, v1, Lv4/c0;->l:Lm4/f1;

    .line 116
    .line 117
    iget v6, v10, Lj5/d0;->b:I

    .line 118
    .line 119
    invoke-virtual {v2, v6}, Lm4/f1;->f(I)I

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    iget v6, v10, Lj5/d0;->c:I

    .line 124
    .line 125
    if-ne v2, v6, :cond_2

    .line 126
    .line 127
    iget-object v2, v1, Lv4/c0;->l:Lm4/f1;

    .line 128
    .line 129
    iget-object v2, v2, Lm4/f1;->g:Lm4/b;

    .line 130
    .line 131
    iget-wide v6, v2, Lm4/b;->b:J

    .line 132
    .line 133
    move-wide v11, v6

    .line 134
    goto :goto_2

    .line 135
    :cond_2
    const-wide/16 v11, 0x0

    .line 136
    .line 137
    :goto_2
    move-wide v5, v13

    .line 138
    const/4 v2, 0x1

    .line 139
    goto :goto_0

    .line 140
    :cond_3
    const-wide/16 v15, 0x0

    .line 141
    .line 142
    iget-wide v4, v3, Lv4/b0;->c:J

    .line 143
    .line 144
    cmp-long v2, v4, v6

    .line 145
    .line 146
    if-nez v2, :cond_4

    .line 147
    .line 148
    const/4 v2, 0x1

    .line 149
    goto :goto_3

    .line 150
    :cond_4
    const/4 v2, 0x0

    .line 151
    :goto_3
    move-wide v5, v13

    .line 152
    :goto_4
    :try_start_0
    iget-object v4, v1, Lv4/c0;->z:Lv4/u0;

    .line 153
    .line 154
    iget-object v4, v4, Lv4/u0;->a:Lm4/i1;

    .line 155
    .line 156
    invoke-virtual {v4}, Lm4/i1;->p()Z

    .line 157
    .line 158
    .line 159
    move-result v4

    .line 160
    if-eqz v4, :cond_5

    .line 161
    .line 162
    iput-object v3, v1, Lv4/c0;->N:Lv4/b0;

    .line 163
    .line 164
    goto :goto_7

    .line 165
    :catchall_0
    move-exception v0

    .line 166
    move v9, v2

    .line 167
    :goto_5
    move-object v2, v10

    .line 168
    :goto_6
    move-wide v3, v11

    .line 169
    goto/16 :goto_13

    .line 170
    .line 171
    :cond_5
    const/4 v3, 0x4

    .line 172
    if-nez v0, :cond_7

    .line 173
    .line 174
    iget-object v0, v1, Lv4/c0;->z:Lv4/u0;

    .line 175
    .line 176
    iget v0, v0, Lv4/u0;->e:I

    .line 177
    .line 178
    if-eq v0, v9, :cond_6

    .line 179
    .line 180
    invoke-virtual {v1, v3}, Lv4/c0;->d0(I)V

    .line 181
    .line 182
    .line 183
    :cond_6
    invoke-virtual {v1, v8, v9, v8, v9}, Lv4/c0;->I(ZZZZ)V

    .line 184
    .line 185
    .line 186
    :goto_7
    move v9, v2

    .line 187
    move-object v2, v10

    .line 188
    move-wide v3, v11

    .line 189
    goto/16 :goto_10

    .line 190
    .line 191
    :cond_7
    iget-object v0, v1, Lv4/c0;->z:Lv4/u0;

    .line 192
    .line 193
    iget-object v0, v0, Lv4/u0;->b:Lj5/d0;

    .line 194
    .line 195
    invoke-virtual {v10, v0}, Lj5/d0;->equals(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 199
    if-eqz v0, :cond_b

    .line 200
    .line 201
    :try_start_1
    iget-object v0, v1, Lv4/c0;->r:Lv4/j0;

    .line 202
    .line 203
    iget-object v0, v0, Lv4/j0;->i:Lv4/h0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 204
    .line 205
    if-eqz v0, :cond_8

    .line 206
    .line 207
    :try_start_2
    iget-boolean v4, v0, Lv4/h0;->e:Z

    .line 208
    .line 209
    if-eqz v4, :cond_8

    .line 210
    .line 211
    cmp-long v4, v11, v15

    .line 212
    .line 213
    if-eqz v4, :cond_8

    .line 214
    .line 215
    iget-object v0, v0, Lv4/h0;->a:Ljava/lang/Object;

    .line 216
    .line 217
    iget-object v4, v1, Lv4/c0;->y:Lv4/b1;

    .line 218
    .line 219
    invoke-interface {v0, v11, v12, v4}, Lj5/b0;->o(JLv4/b1;)J

    .line 220
    .line 221
    .line 222
    move-result-wide v13
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 223
    goto :goto_8

    .line 224
    :cond_8
    move-wide v13, v11

    .line 225
    :goto_8
    :try_start_3
    invoke-static {v13, v14}, Lp4/c0;->c0(J)J

    .line 226
    .line 227
    .line 228
    move-result-wide v15

    .line 229
    iget-object v0, v1, Lv4/c0;->z:Lv4/u0;

    .line 230
    .line 231
    iget-wide v8, v0, Lv4/u0;->s:J

    .line 232
    .line 233
    invoke-static {v8, v9}, Lp4/c0;->c0(J)J

    .line 234
    .line 235
    .line 236
    move-result-wide v8

    .line 237
    cmp-long v0, v15, v8

    .line 238
    .line 239
    if-nez v0, :cond_9

    .line 240
    .line 241
    iget-object v0, v1, Lv4/c0;->z:Lv4/u0;

    .line 242
    .line 243
    iget v4, v0, Lv4/u0;->e:I

    .line 244
    .line 245
    const/4 v8, 0x2

    .line 246
    if-eq v4, v8, :cond_a

    .line 247
    .line 248
    const/4 v8, 0x3

    .line 249
    if-ne v4, v8, :cond_9

    .line 250
    .line 251
    goto :goto_9

    .line 252
    :cond_9
    move v9, v2

    .line 253
    move-wide v15, v5

    .line 254
    move-object v2, v10

    .line 255
    goto :goto_b

    .line 256
    :cond_a
    :goto_9
    iget-wide v3, v0, Lv4/u0;->s:J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 257
    .line 258
    move v9, v2

    .line 259
    move-object v2, v10

    .line 260
    const/4 v10, 0x2

    .line 261
    move-wide v7, v3

    .line 262
    :goto_a
    invoke-virtual/range {v1 .. v10}, Lv4/c0;->t(Lj5/d0;JJJZI)Lv4/u0;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    iput-object v0, v1, Lv4/c0;->z:Lv4/u0;

    .line 267
    .line 268
    return-void

    .line 269
    :catchall_1
    move-exception v0

    .line 270
    move v9, v2

    .line 271
    move-wide v15, v5

    .line 272
    goto :goto_5

    .line 273
    :cond_b
    move v9, v2

    .line 274
    move-wide v15, v5

    .line 275
    move-object v2, v10

    .line 276
    move-wide v13, v11

    .line 277
    :goto_b
    :try_start_4
    iget-object v0, v1, Lv4/c0;->z:Lv4/u0;

    .line 278
    .line 279
    iget v0, v0, Lv4/u0;->e:I

    .line 280
    .line 281
    if-ne v0, v3, :cond_c

    .line 282
    .line 283
    const/4 v6, 0x1

    .line 284
    goto :goto_c

    .line 285
    :cond_c
    const/4 v6, 0x0

    .line 286
    :goto_c
    iget-object v0, v1, Lv4/c0;->r:Lv4/j0;

    .line 287
    .line 288
    iget-object v3, v0, Lv4/j0;->i:Lv4/h0;

    .line 289
    .line 290
    iget-object v0, v0, Lv4/j0;->j:Lv4/h0;

    .line 291
    .line 292
    if-eq v3, v0, :cond_d

    .line 293
    .line 294
    const/4 v5, 0x1

    .line 295
    :goto_d
    move-wide v3, v13

    .line 296
    goto :goto_e

    .line 297
    :cond_d
    const/4 v5, 0x0

    .line 298
    goto :goto_d

    .line 299
    :goto_e
    invoke-virtual/range {v1 .. v6}, Lv4/c0;->R(Lj5/d0;JZZ)J

    .line 300
    .line 301
    .line 302
    move-result-wide v13
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 303
    cmp-long v0, v11, v13

    .line 304
    .line 305
    if-eqz v0, :cond_e

    .line 306
    .line 307
    const/16 v17, 0x1

    .line 308
    .line 309
    goto :goto_f

    .line 310
    :cond_e
    const/16 v17, 0x0

    .line 311
    .line 312
    :goto_f
    or-int v9, v9, v17

    .line 313
    .line 314
    :try_start_5
    iget-object v0, v1, Lv4/c0;->z:Lv4/u0;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 315
    .line 316
    move-object v3, v2

    .line 317
    :try_start_6
    iget-object v2, v0, Lv4/u0;->a:Lm4/i1;

    .line 318
    .line 319
    iget-object v5, v0, Lv4/u0;->b:Lj5/d0;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 320
    .line 321
    const/4 v8, 0x1

    .line 322
    move-object v4, v2

    .line 323
    move-wide v6, v15

    .line 324
    :try_start_7
    invoke-virtual/range {v1 .. v8}, Lv4/c0;->o0(Lm4/i1;Lj5/d0;Lm4/i1;Lj5/d0;JZ)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 325
    .line 326
    .line 327
    move-object v2, v3

    .line 328
    move-wide v5, v6

    .line 329
    move-wide v3, v13

    .line 330
    :goto_10
    const/4 v10, 0x2

    .line 331
    move-wide v7, v3

    .line 332
    move-object/from16 v1, p0

    .line 333
    .line 334
    goto :goto_a

    .line 335
    :catchall_2
    move-exception v0

    .line 336
    move-object v2, v3

    .line 337
    move-wide v5, v6

    .line 338
    :goto_11
    move-wide v3, v13

    .line 339
    goto :goto_13

    .line 340
    :catchall_3
    move-exception v0

    .line 341
    move-object v2, v3

    .line 342
    :goto_12
    move-wide v5, v15

    .line 343
    goto :goto_11

    .line 344
    :catchall_4
    move-exception v0

    .line 345
    goto :goto_12

    .line 346
    :catchall_5
    move-exception v0

    .line 347
    move-wide v5, v15

    .line 348
    goto/16 :goto_6

    .line 349
    .line 350
    :goto_13
    const/4 v10, 0x2

    .line 351
    move-wide v7, v3

    .line 352
    invoke-virtual/range {v1 .. v10}, Lv4/c0;->t(Lj5/d0;JJJZI)Lv4/u0;

    .line 353
    .line 354
    .line 355
    move-result-object v2

    .line 356
    iput-object v2, v1, Lv4/c0;->z:Lv4/u0;

    .line 357
    .line 358
    throw v0
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
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
.end method

.method public final R(Lj5/d0;JZZ)J
    .locals 9

    .line 1
    invoke-virtual {p0}, Lv4/c0;->j0()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {p0, v0, v1}, Lv4/c0;->p0(ZZ)V

    .line 7
    .line 8
    .line 9
    const/4 v2, 0x2

    .line 10
    if-nez p5, :cond_0

    .line 11
    .line 12
    iget-object p5, p0, Lv4/c0;->z:Lv4/u0;

    .line 13
    .line 14
    iget p5, p5, Lv4/u0;->e:I

    .line 15
    .line 16
    const/4 v3, 0x3

    .line 17
    if-ne p5, v3, :cond_1

    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0, v2}, Lv4/c0;->d0(I)V

    .line 20
    .line 21
    .line 22
    :cond_1
    iget-object p5, p0, Lv4/c0;->r:Lv4/j0;

    .line 23
    .line 24
    iget-object v3, p5, Lv4/j0;->i:Lv4/h0;

    .line 25
    .line 26
    move-object v4, v3

    .line 27
    :goto_0
    if-eqz v4, :cond_3

    .line 28
    .line 29
    iget-object v5, v4, Lv4/h0;->g:Lv4/i0;

    .line 30
    .line 31
    iget-object v5, v5, Lv4/i0;->a:Lj5/d0;

    .line 32
    .line 33
    invoke-virtual {p1, v5}, Lj5/d0;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-eqz v5, :cond_2

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    iget-object v4, v4, Lv4/h0;->m:Lv4/h0;

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_3
    :goto_1
    if-nez p4, :cond_4

    .line 44
    .line 45
    if-ne v3, v4, :cond_4

    .line 46
    .line 47
    if-eqz v4, :cond_7

    .line 48
    .line 49
    iget-wide v5, v4, Lv4/h0;->p:J

    .line 50
    .line 51
    add-long/2addr v5, p2

    .line 52
    const-wide/16 v7, 0x0

    .line 53
    .line 54
    cmp-long p1, v5, v7

    .line 55
    .line 56
    if-gez p1, :cond_7

    .line 57
    .line 58
    :cond_4
    const/4 p1, 0x0

    .line 59
    :goto_2
    iget-object p4, p0, Lv4/c0;->a:[Lv4/a1;

    .line 60
    .line 61
    array-length v3, p4

    .line 62
    if-ge p1, v3, :cond_5

    .line 63
    .line 64
    invoke-virtual {p0, p1}, Lv4/c0;->f(I)V

    .line 65
    .line 66
    .line 67
    add-int/lit8 p1, p1, 0x1

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_5
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    iput-wide v5, p0, Lv4/c0;->V:J

    .line 76
    .line 77
    if-eqz v4, :cond_7

    .line 78
    .line 79
    :goto_3
    iget-object p1, p5, Lv4/j0;->i:Lv4/h0;

    .line 80
    .line 81
    if-eq p1, v4, :cond_6

    .line 82
    .line 83
    invoke-virtual {p5}, Lv4/j0;->a()Lv4/h0;

    .line 84
    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_6
    invoke-virtual {p5, v4}, Lv4/j0;->n(Lv4/h0;)I

    .line 88
    .line 89
    .line 90
    const-wide v5, 0xe8d4a51000L

    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    iput-wide v5, v4, Lv4/h0;->p:J

    .line 96
    .line 97
    array-length p1, p4

    .line 98
    new-array p1, p1, [Z

    .line 99
    .line 100
    iget-object p4, p5, Lv4/j0;->j:Lv4/h0;

    .line 101
    .line 102
    invoke-virtual {p4}, Lv4/h0;->e()J

    .line 103
    .line 104
    .line 105
    move-result-wide v5

    .line 106
    invoke-virtual {p0, p1, v5, v6}, Lv4/c0;->i([ZJ)V

    .line 107
    .line 108
    .line 109
    iput-boolean v1, v4, Lv4/h0;->h:Z

    .line 110
    .line 111
    :cond_7
    if-eqz v4, :cond_a

    .line 112
    .line 113
    iget-object p1, v4, Lv4/h0;->a:Ljava/lang/Object;

    .line 114
    .line 115
    invoke-virtual {p5, v4}, Lv4/j0;->n(Lv4/h0;)I

    .line 116
    .line 117
    .line 118
    iget-boolean p4, v4, Lv4/h0;->e:Z

    .line 119
    .line 120
    if-nez p4, :cond_8

    .line 121
    .line 122
    iget-object p1, v4, Lv4/h0;->g:Lv4/i0;

    .line 123
    .line 124
    invoke-virtual {p1, p2, p3}, Lv4/i0;->b(J)Lv4/i0;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    iput-object p1, v4, Lv4/h0;->g:Lv4/i0;

    .line 129
    .line 130
    goto :goto_4

    .line 131
    :cond_8
    iget-boolean p4, v4, Lv4/h0;->f:Z

    .line 132
    .line 133
    if-eqz p4, :cond_9

    .line 134
    .line 135
    invoke-interface {p1, p2, p3}, Lj5/b0;->h(J)J

    .line 136
    .line 137
    .line 138
    move-result-wide p2

    .line 139
    iget-wide p4, p0, Lv4/c0;->m:J

    .line 140
    .line 141
    sub-long p4, p2, p4

    .line 142
    .line 143
    invoke-interface {p1, p4, p5}, Lj5/b0;->i(J)V

    .line 144
    .line 145
    .line 146
    :cond_9
    :goto_4
    invoke-virtual {p0, p2, p3}, Lv4/c0;->K(J)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {p0}, Lv4/c0;->w()V

    .line 150
    .line 151
    .line 152
    goto :goto_5

    .line 153
    :cond_a
    invoke-virtual {p5}, Lv4/j0;->b()V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p0, p2, p3}, Lv4/c0;->K(J)V

    .line 157
    .line 158
    .line 159
    :goto_5
    invoke-virtual {p0, v0}, Lv4/c0;->p(Z)V

    .line 160
    .line 161
    .line 162
    iget-object p1, p0, Lv4/c0;->h:Lp4/x;

    .line 163
    .line 164
    invoke-virtual {p1, v2}, Lp4/x;->e(I)Z

    .line 165
    .line 166
    .line 167
    return-wide p2
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
.end method

.method public final S(Lv4/x0;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lv4/c0;->h:Lp4/x;

    .line 2
    .line 3
    iget-object v1, p1, Lv4/x0;->e:Landroid/os/Looper;

    .line 4
    .line 5
    iget-object v2, p0, Lv4/c0;->j:Landroid/os/Looper;

    .line 6
    .line 7
    if-ne v1, v2, :cond_2

    .line 8
    .line 9
    monitor-enter p1

    .line 10
    monitor-exit p1

    .line 11
    const/4 v1, 0x1

    .line 12
    :try_start_0
    iget-object v2, p1, Lv4/x0;->a:Lv4/w0;

    .line 13
    .line 14
    iget v3, p1, Lv4/x0;->c:I

    .line 15
    .line 16
    iget-object v4, p1, Lv4/x0;->d:Ljava/lang/Object;

    .line 17
    .line 18
    invoke-interface {v2, v3, v4}, Lv4/w0;->d(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v1}, Lv4/x0;->a(Z)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Lv4/c0;->z:Lv4/u0;

    .line 25
    .line 26
    iget p1, p1, Lv4/u0;->e:I

    .line 27
    .line 28
    const/4 v1, 0x3

    .line 29
    const/4 v2, 0x2

    .line 30
    if-eq p1, v1, :cond_1

    .line 31
    .line 32
    if-ne p1, v2, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    return-void

    .line 36
    :cond_1
    :goto_0
    invoke-virtual {v0, v2}, Lp4/x;->e(I)Z

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :catchall_0
    move-exception v0

    .line 41
    invoke-virtual {p1, v1}, Lv4/x0;->a(Z)V

    .line 42
    .line 43
    .line 44
    throw v0

    .line 45
    :cond_2
    const/16 v1, 0xf

    .line 46
    .line 47
    invoke-virtual {v0, v1, p1}, Lp4/x;->a(ILjava/lang/Object;)Lp4/w;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p1}, Lp4/w;->b()V

    .line 52
    .line 53
    .line 54
    return-void
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

.method public final T(Lv4/x0;)V
    .locals 3

    .line 1
    iget-object v0, p1, Lv4/x0;->e:Landroid/os/Looper;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Ljava/lang/Thread;->isAlive()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    const-string v0, "TAG"

    .line 14
    .line 15
    const-string v1, "Trying to send message on a dead thread."

    .line 16
    .line 17
    invoke-static {v0, v1}, Lp4/c;->B(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-virtual {p1, v0}, Lv4/x0;->a(Z)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    const/4 v1, 0x0

    .line 26
    iget-object v2, p0, Lv4/c0;->p:Lp4/v;

    .line 27
    .line 28
    invoke-virtual {v2, v0, v1}, Lp4/v;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lp4/x;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    new-instance v1, La9/m;

    .line 33
    .line 34
    invoke-direct {v1, p0, p1}, La9/m;-><init>(Lv4/c0;Lv4/x0;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Lp4/x;->c(Ljava/lang/Runnable;)Z

    .line 38
    .line 39
    .line 40
    return-void
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

.method public final U(ZLjava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lv4/c0;->J:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-boolean p1, p0, Lv4/c0;->J:Z

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lv4/c0;->a:[Lv4/a1;

    .line 10
    .line 11
    array-length v0, p1

    .line 12
    const/4 v1, 0x0

    .line 13
    :goto_0
    if-ge v1, v0, :cond_0

    .line 14
    .line 15
    aget-object v2, p1, v1

    .line 16
    .line 17
    invoke-virtual {v2}, Lv4/a1;->l()V

    .line 18
    .line 19
    .line 20
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    if-eqz p2, :cond_1

    .line 24
    .line 25
    monitor-enter p0

    .line 26
    const/4 p1, 0x1

    .line 27
    :try_start_0
    invoke-virtual {p2, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 31
    .line 32
    .line 33
    monitor-exit p0

    .line 34
    return-void

    .line 35
    :catchall_0
    move-exception p1

    .line 36
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    throw p1

    .line 38
    :cond_1
    return-void
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

.method public final V(Lv4/x;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lv4/c0;->A:Lv4/z;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Lv4/z;->c(I)V

    .line 5
    .line 6
    .line 7
    iget v0, p1, Lv4/x;->c:I

    .line 8
    .line 9
    iget-object v1, p1, Lv4/x;->b:Lj5/f1;

    .line 10
    .line 11
    iget-object v2, p1, Lv4/x;->a:Ljava/util/ArrayList;

    .line 12
    .line 13
    const/4 v3, -0x1

    .line 14
    if-eq v0, v3, :cond_0

    .line 15
    .line 16
    new-instance v0, Lv4/b0;

    .line 17
    .line 18
    new-instance v3, Lv4/y0;

    .line 19
    .line 20
    invoke-direct {v3, v2, v1}, Lv4/y0;-><init>(Ljava/util/ArrayList;Lj5/f1;)V

    .line 21
    .line 22
    .line 23
    iget v4, p1, Lv4/x;->c:I

    .line 24
    .line 25
    iget-wide v5, p1, Lv4/x;->d:J

    .line 26
    .line 27
    invoke-direct {v0, v3, v4, v5, v6}, Lv4/b0;-><init>(Lm4/i1;IJ)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lv4/c0;->N:Lv4/b0;

    .line 31
    .line 32
    :cond_0
    iget-object p1, p0, Lv4/c0;->s:Lv4/t0;

    .line 33
    .line 34
    iget-object v0, p1, Lv4/t0;->b:Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    const/4 v4, 0x0

    .line 41
    invoke-virtual {p1, v4, v3}, Lv4/t0;->g(II)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    invoke-virtual {p1, v0, v2, v1}, Lv4/t0;->a(ILjava/util/ArrayList;Lj5/f1;)Lm4/i1;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {p0, p1, v4}, Lv4/c0;->q(Lm4/i1;Z)V

    .line 53
    .line 54
    .line 55
    return-void
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

.method public final W(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Lv4/c0;->C:Z

    .line 2
    .line 3
    invoke-virtual {p0}, Lv4/c0;->J()V

    .line 4
    .line 5
    .line 6
    iget-boolean p1, p0, Lv4/c0;->D:Z

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    iget-object p1, p0, Lv4/c0;->r:Lv4/j0;

    .line 11
    .line 12
    iget-object v0, p1, Lv4/j0;->j:Lv4/h0;

    .line 13
    .line 14
    iget-object p1, p1, Lv4/j0;->i:Lv4/h0;

    .line 15
    .line 16
    if-eq v0, p1, :cond_0

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    invoke-virtual {p0, p1}, Lv4/c0;->P(Z)V

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    invoke-virtual {p0, p1}, Lv4/c0;->p(Z)V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
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
.end method

.method public final X(ZIZI)V
    .locals 4

    .line 1
    iget-object v0, p0, Lv4/c0;->A:Lv4/z;

    .line 2
    .line 3
    invoke-virtual {v0, p3}, Lv4/z;->c(I)V

    .line 4
    .line 5
    .line 6
    iget-object p3, p0, Lv4/c0;->z:Lv4/u0;

    .line 7
    .line 8
    invoke-virtual {p3, p4, p2, p1}, Lv4/u0;->c(IIZ)Lv4/u0;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    iput-object p2, p0, Lv4/c0;->z:Lv4/u0;

    .line 13
    .line 14
    const/4 p2, 0x0

    .line 15
    invoke-virtual {p0, p2, p2}, Lv4/c0;->p0(ZZ)V

    .line 16
    .line 17
    .line 18
    iget-object p3, p0, Lv4/c0;->r:Lv4/j0;

    .line 19
    .line 20
    iget-object p4, p3, Lv4/j0;->i:Lv4/h0;

    .line 21
    .line 22
    :goto_0
    if-eqz p4, :cond_2

    .line 23
    .line 24
    iget-object v0, p4, Lv4/h0;->o:Lm5/u;

    .line 25
    .line 26
    iget-object v0, v0, Lm5/u;->c:[Lm5/r;

    .line 27
    .line 28
    array-length v1, v0

    .line 29
    const/4 v2, 0x0

    .line 30
    :goto_1
    if-ge v2, v1, :cond_1

    .line 31
    .line 32
    aget-object v3, v0, v2

    .line 33
    .line 34
    if-eqz v3, :cond_0

    .line 35
    .line 36
    invoke-interface {v3, p1}, Lm5/r;->e(Z)V

    .line 37
    .line 38
    .line 39
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    iget-object p4, p4, Lv4/h0;->m:Lv4/h0;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    invoke-virtual {p0}, Lv4/c0;->f0()Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-nez p1, :cond_3

    .line 50
    .line 51
    invoke-virtual {p0}, Lv4/c0;->j0()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Lv4/c0;->n0()V

    .line 55
    .line 56
    .line 57
    iget-wide p1, p0, Lv4/c0;->O:J

    .line 58
    .line 59
    invoke-virtual {p3, p1, p2}, Lv4/j0;->m(J)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_3
    iget-object p1, p0, Lv4/c0;->z:Lv4/u0;

    .line 64
    .line 65
    iget p1, p1, Lv4/u0;->e:I

    .line 66
    .line 67
    const/4 p2, 0x3

    .line 68
    iget-object p3, p0, Lv4/c0;->h:Lp4/x;

    .line 69
    .line 70
    const/4 p4, 0x2

    .line 71
    if-ne p1, p2, :cond_4

    .line 72
    .line 73
    iget-object p1, p0, Lv4/c0;->n:Lv4/k;

    .line 74
    .line 75
    const/4 p2, 0x1

    .line 76
    iput-boolean p2, p1, Lv4/k;->f:Z

    .line 77
    .line 78
    iget-object p1, p1, Lv4/k;->a:Lv4/c1;

    .line 79
    .line 80
    invoke-virtual {p1}, Lv4/c1;->f()V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, Lv4/c0;->h0()V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p3, p4}, Lp4/x;->e(I)Z

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_4
    if-ne p1, p4, :cond_5

    .line 91
    .line 92
    invoke-virtual {p3, p4}, Lp4/x;->e(I)Z

    .line 93
    .line 94
    .line 95
    :cond_5
    return-void
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
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
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
.end method

.method public final Y(Lm4/s0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lv4/c0;->h:Lp4/x;

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lp4/x;->d(I)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lv4/c0;->n:Lv4/k;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lv4/k;->a(Lm4/s0;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lv4/k;->e()Lm4/s0;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const/4 v0, 0x1

    .line 18
    iget v1, p1, Lm4/s0;->a:F

    .line 19
    .line 20
    invoke-virtual {p0, p1, v1, v0, v0}, Lv4/c0;->s(Lm4/s0;FZZ)V

    .line 21
    .line 22
    .line 23
    return-void
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
.end method

.method public final Z(Lv4/o;)V
    .locals 3

    .line 1
    iput-object p1, p0, Lv4/c0;->U:Lv4/o;

    .line 2
    .line 3
    iget-object v0, p0, Lv4/c0;->z:Lv4/u0;

    .line 4
    .line 5
    iget-object v0, v0, Lv4/u0;->a:Lm4/i1;

    .line 6
    .line 7
    iget-object v0, p0, Lv4/c0;->r:Lv4/j0;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object p1, v0, Lv4/j0;->q:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-nez p1, :cond_1

    .line 22
    .line 23
    new-instance p1, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    :goto_0
    iget-object v2, v0, Lv4/j0;->q:Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-ge v1, v2, :cond_0

    .line 36
    .line 37
    iget-object v2, v0, Lv4/j0;->q:Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    check-cast v2, Lv4/h0;

    .line 44
    .line 45
    invoke-virtual {v2}, Lv4/h0;->i()V

    .line 46
    .line 47
    .line 48
    add-int/lit8 v1, v1, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    iput-object p1, v0, Lv4/j0;->q:Ljava/util/ArrayList;

    .line 52
    .line 53
    const/4 p1, 0x0

    .line 54
    iput-object p1, v0, Lv4/j0;->m:Lv4/h0;

    .line 55
    .line 56
    invoke-virtual {v0}, Lv4/j0;->k()V

    .line 57
    .line 58
    .line 59
    :cond_1
    return-void
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

.method public final a(Lj5/b0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lv4/c0;->h:Lp4/x;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Lp4/x;->a(ILjava/lang/Object;)Lp4/w;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Lp4/w;->b()V

    .line 10
    .line 11
    .line 12
    return-void
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
.end method

.method public final a0(I)V
    .locals 2

    .line 1
    iput p1, p0, Lv4/c0;->H:I

    .line 2
    .line 3
    iget-object v0, p0, Lv4/c0;->z:Lv4/u0;

    .line 4
    .line 5
    iget-object v0, v0, Lv4/u0;->a:Lm4/i1;

    .line 6
    .line 7
    iget-object v1, p0, Lv4/c0;->r:Lv4/j0;

    .line 8
    .line 9
    iput p1, v1, Lv4/j0;->g:I

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Lv4/j0;->r(Lm4/i1;)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    and-int/lit8 v0, p1, 0x1

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    invoke-virtual {p0, p1}, Lv4/c0;->P(Z)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    and-int/lit8 p1, p1, 0x2

    .line 25
    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, Lv4/c0;->e()V

    .line 29
    .line 30
    .line 31
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 32
    invoke-virtual {p0, p1}, Lv4/c0;->p(Z)V

    .line 33
    .line 34
    .line 35
    return-void
    .line 36
.end method

.method public final b(Lv4/x;I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lv4/c0;->A:Lv4/z;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Lv4/z;->c(I)V

    .line 5
    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    iget-object v1, p0, Lv4/c0;->s:Lv4/t0;

    .line 9
    .line 10
    if-ne p2, v0, :cond_0

    .line 11
    .line 12
    iget-object p2, v1, Lv4/t0;->b:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    :cond_0
    iget-object v0, p1, Lv4/x;->a:Ljava/util/ArrayList;

    .line 19
    .line 20
    iget-object p1, p1, Lv4/x;->b:Lj5/f1;

    .line 21
    .line 22
    invoke-virtual {v1, p2, v0, p1}, Lv4/t0;->a(ILjava/util/ArrayList;Lj5/f1;)Lm4/i1;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const/4 p2, 0x0

    .line 27
    invoke-virtual {p0, p1, p2}, Lv4/c0;->q(Lm4/i1;Z)V

    .line 28
    .line 29
    .line 30
    return-void
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

.method public final b0(Z)V
    .locals 2

    .line 1
    iput-boolean p1, p0, Lv4/c0;->I:Z

    .line 2
    .line 3
    iget-object v0, p0, Lv4/c0;->z:Lv4/u0;

    .line 4
    .line 5
    iget-object v0, v0, Lv4/u0;->a:Lm4/i1;

    .line 6
    .line 7
    iget-object v1, p0, Lv4/c0;->r:Lv4/j0;

    .line 8
    .line 9
    iput-boolean p1, v1, Lv4/j0;->h:Z

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Lv4/j0;->r(Lm4/i1;)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    and-int/lit8 v0, p1, 0x1

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    invoke-virtual {p0, p1}, Lv4/c0;->P(Z)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    and-int/lit8 p1, p1, 0x2

    .line 25
    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, Lv4/c0;->e()V

    .line 29
    .line 30
    .line 31
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 32
    invoke-virtual {p0, p1}, Lv4/c0;->p(Z)V

    .line 33
    .line 34
    .line 35
    return-void
    .line 36
.end method

.method public final c(Lj5/e1;)V
    .locals 2

    .line 1
    check-cast p1, Lj5/b0;

    .line 2
    .line 3
    iget-object v0, p0, Lv4/c0;->h:Lp4/x;

    .line 4
    .line 5
    const/16 v1, 0x9

    .line 6
    .line 7
    invoke-virtual {v0, v1, p1}, Lp4/x;->a(ILjava/lang/Object;)Lp4/w;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Lp4/w;->b()V

    .line 12
    .line 13
    .line 14
    return-void
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
.end method

.method public final c0(Lj5/f1;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lv4/c0;->A:Lv4/z;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Lv4/z;->c(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lv4/c0;->s:Lv4/t0;

    .line 8
    .line 9
    iget-object v1, v0, Lv4/t0;->b:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    iget-object v2, p1, Lj5/f1;->b:[I

    .line 16
    .line 17
    array-length v2, v2

    .line 18
    const/4 v3, 0x0

    .line 19
    if-eq v2, v1, :cond_0

    .line 20
    .line 21
    new-instance v2, Lj5/f1;

    .line 22
    .line 23
    new-instance v4, Ljava/util/Random;

    .line 24
    .line 25
    iget-object p1, p1, Lj5/f1;->a:Ljava/util/Random;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/util/Random;->nextLong()J

    .line 28
    .line 29
    .line 30
    move-result-wide v5

    .line 31
    invoke-direct {v4, v5, v6}, Ljava/util/Random;-><init>(J)V

    .line 32
    .line 33
    .line 34
    invoke-direct {v2, v4}, Lj5/f1;-><init>(Ljava/util/Random;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, v3, v1}, Lj5/f1;->a(II)Lj5/f1;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    :cond_0
    iput-object p1, v0, Lv4/t0;->j:Lj5/f1;

    .line 42
    .line 43
    invoke-virtual {v0}, Lv4/t0;->b()Lm4/i1;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p0, p1, v3}, Lv4/c0;->q(Lm4/i1;Z)V

    .line 48
    .line 49
    .line 50
    return-void
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

.method public final d()Z
    .locals 5

    .line 1
    iget-boolean v0, p0, Lv4/c0;->x:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    iget-object v0, p0, Lv4/c0;->a:[Lv4/a1;

    .line 8
    .line 9
    array-length v2, v0

    .line 10
    const/4 v3, 0x0

    .line 11
    :goto_0
    if-ge v3, v2, :cond_2

    .line 12
    .line 13
    aget-object v4, v0, v3

    .line 14
    .line 15
    invoke-virtual {v4}, Lv4/a1;->f()Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    if-eqz v4, :cond_1

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    return v0

    .line 23
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_2
    return v1
    .line 27
    .line 28
    .line 29
.end method

.method public final d0(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lv4/c0;->z:Lv4/u0;

    .line 2
    .line 3
    iget v1, v0, Lv4/u0;->e:I

    .line 4
    .line 5
    if-eq v1, p1, :cond_1

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    if-eq p1, v1, :cond_0

    .line 9
    .line 10
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    iput-wide v1, p0, Lv4/c0;->T:J

    .line 16
    .line 17
    :cond_0
    invoke-virtual {v0, p1}, Lv4/u0;->f(I)Lv4/u0;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Lv4/c0;->z:Lv4/u0;

    .line 22
    .line 23
    :cond_1
    return-void
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
.end method

.method public final e()V
    .locals 10

    .line 1
    iget-boolean v0, p0, Lv4/c0;->x:Z

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    invoke-virtual {p0}, Lv4/c0;->d()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_6

    .line 12
    :cond_0
    iget-object v0, p0, Lv4/c0;->a:[Lv4/a1;

    .line 13
    .line 14
    array-length v1, v0

    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    :goto_0
    if-ge v3, v1, :cond_6

    .line 18
    .line 19
    aget-object v4, v0, v3

    .line 20
    .line 21
    invoke-virtual {v4}, Lv4/a1;->c()I

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    invoke-virtual {v4}, Lv4/a1;->f()Z

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    if-nez v6, :cond_1

    .line 30
    .line 31
    goto :goto_5

    .line 32
    :cond_1
    iget v6, v4, Lv4/a1;->d:I

    .line 33
    .line 34
    const/4 v7, 0x1

    .line 35
    const/4 v8, 0x4

    .line 36
    if-eq v6, v8, :cond_3

    .line 37
    .line 38
    const/4 v9, 0x2

    .line 39
    if-ne v6, v9, :cond_2

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    const/4 v9, 0x0

    .line 43
    goto :goto_2

    .line 44
    :cond_3
    :goto_1
    const/4 v9, 0x1

    .line 45
    :goto_2
    if-ne v6, v8, :cond_4

    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_4
    const/4 v7, 0x0

    .line 49
    :goto_3
    if-eqz v9, :cond_5

    .line 50
    .line 51
    iget-object v6, v4, Lv4/a1;->a:Lv4/e;

    .line 52
    .line 53
    goto :goto_4

    .line 54
    :cond_5
    iget-object v6, v4, Lv4/a1;->c:Lv4/e;

    .line 55
    .line 56
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    :goto_4
    iget-object v8, p0, Lv4/c0;->n:Lv4/k;

    .line 60
    .line 61
    invoke-virtual {v4, v6, v8}, Lv4/a1;->a(Lv4/e;Lv4/k;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v4, v9}, Lv4/a1;->j(Z)V

    .line 65
    .line 66
    .line 67
    iput v7, v4, Lv4/a1;->d:I

    .line 68
    .line 69
    :goto_5
    iget v6, p0, Lv4/c0;->M:I

    .line 70
    .line 71
    invoke-virtual {v4}, Lv4/a1;->c()I

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    sub-int/2addr v5, v4

    .line 76
    sub-int/2addr v6, v5

    .line 77
    iput v6, p0, Lv4/c0;->M:I

    .line 78
    .line 79
    add-int/lit8 v3, v3, 0x1

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_6
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    iput-wide v0, p0, Lv4/c0;->V:J

    .line 88
    .line 89
    :cond_7
    :goto_6
    return-void
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

.method public final e0(Ljava/lang/Object;Ljava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lv4/c0;->a:[Lv4/a1;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    const/4 v3, 0x2

    .line 6
    const/4 v4, 0x1

    .line 7
    if-ge v2, v1, :cond_3

    .line 8
    .line 9
    aget-object v5, v0, v2

    .line 10
    .line 11
    iget-object v6, v5, Lv4/a1;->a:Lv4/e;

    .line 12
    .line 13
    iget v7, v6, Lv4/e;->b:I

    .line 14
    .line 15
    if-eq v7, v3, :cond_0

    .line 16
    .line 17
    goto :goto_2

    .line 18
    :cond_0
    iget v3, v5, Lv4/a1;->d:I

    .line 19
    .line 20
    const/4 v7, 0x4

    .line 21
    if-eq v3, v7, :cond_2

    .line 22
    .line 23
    if-ne v3, v4, :cond_1

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    invoke-interface {v6, v4, p1}, Lv4/w0;->d(ILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_2
    :goto_1
    iget-object v3, v5, Lv4/a1;->c:Lv4/e;

    .line 31
    .line 32
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-interface {v3, v4, p1}, Lv4/w0;->d(ILjava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_3
    iget-object p1, p0, Lv4/c0;->z:Lv4/u0;

    .line 42
    .line 43
    iget p1, p1, Lv4/u0;->e:I

    .line 44
    .line 45
    const/4 v0, 0x3

    .line 46
    if-eq p1, v0, :cond_4

    .line 47
    .line 48
    if-ne p1, v3, :cond_5

    .line 49
    .line 50
    :cond_4
    iget-object p1, p0, Lv4/c0;->h:Lp4/x;

    .line 51
    .line 52
    invoke-virtual {p1, v3}, Lp4/x;->e(I)Z

    .line 53
    .line 54
    .line 55
    :cond_5
    if-eqz p2, :cond_6

    .line 56
    .line 57
    monitor-enter p0

    .line 58
    :try_start_0
    invoke-virtual {p2, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 62
    .line 63
    .line 64
    monitor-exit p0

    .line 65
    return-void

    .line 66
    :catchall_0
    move-exception p1

    .line 67
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    throw p1

    .line 69
    :cond_6
    return-void
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
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
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
.end method

.method public final f(I)V
    .locals 7

    .line 1
    iget-object v0, p0, Lv4/c0;->a:[Lv4/a1;

    .line 2
    .line 3
    aget-object v1, v0, p1

    .line 4
    .line 5
    invoke-virtual {v1}, Lv4/a1;->c()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    aget-object v0, v0, p1

    .line 10
    .line 11
    iget-object v2, v0, Lv4/a1;->a:Lv4/e;

    .line 12
    .line 13
    iget-object v3, p0, Lv4/c0;->n:Lv4/k;

    .line 14
    .line 15
    invoke-virtual {v0, v2, v3}, Lv4/a1;->a(Lv4/e;Lv4/k;)V

    .line 16
    .line 17
    .line 18
    iget-object v2, v0, Lv4/a1;->c:Lv4/e;

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    iget v5, v2, Lv4/e;->h:I

    .line 24
    .line 25
    if-eqz v5, :cond_0

    .line 26
    .line 27
    iget v5, v0, Lv4/a1;->d:I

    .line 28
    .line 29
    const/4 v6, 0x3

    .line 30
    if-eq v5, v6, :cond_0

    .line 31
    .line 32
    const/4 v5, 0x1

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 v5, 0x0

    .line 35
    :goto_0
    invoke-virtual {v0, v2, v3}, Lv4/a1;->a(Lv4/e;Lv4/k;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v4}, Lv4/a1;->j(Z)V

    .line 39
    .line 40
    .line 41
    if-eqz v5, :cond_1

    .line 42
    .line 43
    iget-object v3, v0, Lv4/a1;->a:Lv4/e;

    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    const/16 v5, 0x11

    .line 49
    .line 50
    invoke-interface {v2, v5, v3}, Lv4/w0;->d(ILjava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    :cond_1
    iput v4, v0, Lv4/a1;->d:I

    .line 54
    .line 55
    invoke-virtual {p0, p1, v4}, Lv4/c0;->A(IZ)V

    .line 56
    .line 57
    .line 58
    iget p1, p0, Lv4/c0;->M:I

    .line 59
    .line 60
    sub-int/2addr p1, v1

    .line 61
    iput p1, p0, Lv4/c0;->M:I

    .line 62
    .line 63
    return-void
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

.method public final f0()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lv4/c0;->z:Lv4/u0;

    .line 2
    .line 3
    iget-boolean v1, v0, Lv4/u0;->l:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget v0, v0, Lv4/u0;->n:I

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
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

.method public final g()V
    .locals 50

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lv4/c0;->p:Lp4/v;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 9
    .line 10
    .line 11
    move-result-wide v11

    .line 12
    iget-object v0, v1, Lv4/c0;->h:Lp4/x;

    .line 13
    .line 14
    const/4 v13, 0x2

    .line 15
    invoke-virtual {v0, v13}, Lp4/x;->d(I)V

    .line 16
    .line 17
    .line 18
    iget-object v0, v1, Lv4/c0;->z:Lv4/u0;

    .line 19
    .line 20
    iget-object v0, v0, Lv4/u0;->a:Lm4/i1;

    .line 21
    .line 22
    invoke-virtual {v0}, Lm4/i1;->p()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v14, 0x0

    .line 27
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    const/4 v15, 0x4

    .line 33
    const/4 v2, 0x1

    .line 34
    if-nez v0, :cond_0

    .line 35
    .line 36
    iget-object v0, v1, Lv4/c0;->s:Lv4/t0;

    .line 37
    .line 38
    iget-boolean v0, v0, Lv4/t0;->k:Z

    .line 39
    .line 40
    if-nez v0, :cond_1

    .line 41
    .line 42
    :cond_0
    const/4 v15, 0x3

    .line 43
    goto/16 :goto_36

    .line 44
    .line 45
    :cond_1
    iget-object v0, v1, Lv4/c0;->r:Lv4/j0;

    .line 46
    .line 47
    iget-wide v3, v1, Lv4/c0;->O:J

    .line 48
    .line 49
    invoke-virtual {v0, v3, v4}, Lv4/j0;->m(J)V

    .line 50
    .line 51
    .line 52
    iget-object v0, v1, Lv4/c0;->r:Lv4/j0;

    .line 53
    .line 54
    iget-object v3, v0, Lv4/j0;->l:Lv4/h0;

    .line 55
    .line 56
    if-eqz v3, :cond_3

    .line 57
    .line 58
    iget-object v4, v3, Lv4/h0;->g:Lv4/i0;

    .line 59
    .line 60
    iget-boolean v4, v4, Lv4/i0;->j:Z

    .line 61
    .line 62
    if-nez v4, :cond_2

    .line 63
    .line 64
    invoke-virtual {v3}, Lv4/h0;->g()Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-eqz v3, :cond_2

    .line 69
    .line 70
    iget-object v3, v0, Lv4/j0;->l:Lv4/h0;

    .line 71
    .line 72
    iget-object v3, v3, Lv4/h0;->g:Lv4/i0;

    .line 73
    .line 74
    iget-wide v3, v3, Lv4/i0;->e:J

    .line 75
    .line 76
    cmp-long v5, v3, v9

    .line 77
    .line 78
    if-eqz v5, :cond_2

    .line 79
    .line 80
    iget v0, v0, Lv4/j0;->n:I

    .line 81
    .line 82
    const/16 v3, 0x64

    .line 83
    .line 84
    if-ge v0, v3, :cond_2

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_2
    move-wide/from16 v23, v9

    .line 88
    .line 89
    goto/16 :goto_8

    .line 90
    .line 91
    :cond_3
    :goto_0
    iget-object v0, v1, Lv4/c0;->r:Lv4/j0;

    .line 92
    .line 93
    iget-wide v3, v1, Lv4/c0;->O:J

    .line 94
    .line 95
    iget-object v5, v1, Lv4/c0;->z:Lv4/u0;

    .line 96
    .line 97
    iget-object v6, v0, Lv4/j0;->l:Lv4/h0;

    .line 98
    .line 99
    if-nez v6, :cond_4

    .line 100
    .line 101
    iget-object v3, v5, Lv4/u0;->a:Lm4/i1;

    .line 102
    .line 103
    iget-object v4, v5, Lv4/u0;->b:Lj5/d0;

    .line 104
    .line 105
    move-wide/from16 v23, v9

    .line 106
    .line 107
    iget-wide v9, v5, Lv4/u0;->c:J

    .line 108
    .line 109
    iget-wide v5, v5, Lv4/u0;->s:J

    .line 110
    .line 111
    move-object/from16 v16, v0

    .line 112
    .line 113
    move-object/from16 v17, v3

    .line 114
    .line 115
    move-object/from16 v18, v4

    .line 116
    .line 117
    move-wide/from16 v21, v5

    .line 118
    .line 119
    move-wide/from16 v19, v9

    .line 120
    .line 121
    invoke-virtual/range {v16 .. v22}, Lv4/j0;->e(Lm4/i1;Lj5/d0;JJ)Lv4/i0;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    goto :goto_1

    .line 126
    :cond_4
    move-wide/from16 v23, v9

    .line 127
    .line 128
    iget-object v5, v5, Lv4/u0;->a:Lm4/i1;

    .line 129
    .line 130
    invoke-virtual {v0, v5, v6, v3, v4}, Lv4/j0;->d(Lm4/i1;Lv4/h0;J)Lv4/i0;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    :goto_1
    if-eqz v0, :cond_f

    .line 135
    .line 136
    iget-object v3, v1, Lv4/c0;->r:Lv4/j0;

    .line 137
    .line 138
    iget-object v4, v3, Lv4/j0;->l:Lv4/h0;

    .line 139
    .line 140
    if-nez v4, :cond_5

    .line 141
    .line 142
    const-wide v4, 0xe8d4a51000L

    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    move-wide/from16 v27, v4

    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_5
    iget-wide v5, v4, Lv4/h0;->p:J

    .line 151
    .line 152
    iget-object v4, v4, Lv4/h0;->g:Lv4/i0;

    .line 153
    .line 154
    iget-wide v9, v4, Lv4/i0;->e:J

    .line 155
    .line 156
    add-long/2addr v5, v9

    .line 157
    iget-wide v9, v0, Lv4/i0;->b:J

    .line 158
    .line 159
    sub-long/2addr v5, v9

    .line 160
    move-wide/from16 v27, v5

    .line 161
    .line 162
    :goto_2
    const/4 v4, 0x0

    .line 163
    :goto_3
    iget-object v5, v3, Lv4/j0;->q:Ljava/util/ArrayList;

    .line 164
    .line 165
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 166
    .line 167
    .line 168
    move-result v5

    .line 169
    if-ge v4, v5, :cond_8

    .line 170
    .line 171
    iget-object v5, v3, Lv4/j0;->q:Ljava/util/ArrayList;

    .line 172
    .line 173
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v5

    .line 177
    check-cast v5, Lv4/h0;

    .line 178
    .line 179
    iget-object v5, v5, Lv4/h0;->g:Lv4/i0;

    .line 180
    .line 181
    iget-wide v9, v5, Lv4/i0;->e:J

    .line 182
    .line 183
    iget-wide v7, v0, Lv4/i0;->e:J

    .line 184
    .line 185
    cmp-long v6, v9, v23

    .line 186
    .line 187
    if-eqz v6, :cond_6

    .line 188
    .line 189
    cmp-long v6, v9, v7

    .line 190
    .line 191
    if-nez v6, :cond_7

    .line 192
    .line 193
    :cond_6
    iget-wide v6, v5, Lv4/i0;->b:J

    .line 194
    .line 195
    iget-wide v8, v0, Lv4/i0;->b:J

    .line 196
    .line 197
    cmp-long v10, v6, v8

    .line 198
    .line 199
    if-nez v10, :cond_7

    .line 200
    .line 201
    iget-object v5, v5, Lv4/i0;->a:Lj5/d0;

    .line 202
    .line 203
    iget-object v6, v0, Lv4/i0;->a:Lj5/d0;

    .line 204
    .line 205
    invoke-virtual {v5, v6}, Lj5/d0;->equals(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move-result v5

    .line 209
    if-eqz v5, :cond_7

    .line 210
    .line 211
    iget-object v5, v3, Lv4/j0;->q:Ljava/util/ArrayList;

    .line 212
    .line 213
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v4

    .line 217
    check-cast v4, Lv4/h0;

    .line 218
    .line 219
    goto :goto_4

    .line 220
    :cond_7
    add-int/lit8 v4, v4, 0x1

    .line 221
    .line 222
    goto :goto_3

    .line 223
    :cond_8
    move-object v4, v14

    .line 224
    :goto_4
    if-nez v4, :cond_9

    .line 225
    .line 226
    iget-object v4, v3, Lv4/j0;->e:Landroidx/media3/exoplayer/offline/g;

    .line 227
    .line 228
    iget-object v4, v4, Landroidx/media3/exoplayer/offline/g;->b:Ljava/lang/Object;

    .line 229
    .line 230
    check-cast v4, Lv4/c0;

    .line 231
    .line 232
    new-instance v25, Lv4/h0;

    .line 233
    .line 234
    iget-object v5, v4, Lv4/c0;->b:[Lv4/e;

    .line 235
    .line 236
    iget-object v6, v4, Lv4/c0;->d:Lj2/b;

    .line 237
    .line 238
    iget-object v7, v4, Lv4/c0;->f:Lv4/j;

    .line 239
    .line 240
    iget-object v7, v7, Lv4/j;->a:Ln5/f;

    .line 241
    .line 242
    iget-object v8, v4, Lv4/c0;->s:Lv4/t0;

    .line 243
    .line 244
    iget-object v9, v4, Lv4/c0;->e:Lm5/u;

    .line 245
    .line 246
    iget-object v4, v4, Lv4/c0;->U:Lv4/o;

    .line 247
    .line 248
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    move-object/from16 v32, v0

    .line 252
    .line 253
    move-object/from16 v26, v5

    .line 254
    .line 255
    move-object/from16 v29, v6

    .line 256
    .line 257
    move-object/from16 v30, v7

    .line 258
    .line 259
    move-object/from16 v31, v8

    .line 260
    .line 261
    move-object/from16 v33, v9

    .line 262
    .line 263
    invoke-direct/range {v25 .. v33}, Lv4/h0;-><init>([Lv4/e;JLj2/b;Ln5/f;Lv4/t0;Lv4/i0;Lm5/u;)V

    .line 264
    .line 265
    .line 266
    move-object/from16 v4, v25

    .line 267
    .line 268
    goto :goto_5

    .line 269
    :cond_9
    move-wide/from16 v5, v27

    .line 270
    .line 271
    iput-object v0, v4, Lv4/h0;->g:Lv4/i0;

    .line 272
    .line 273
    iput-wide v5, v4, Lv4/h0;->p:J

    .line 274
    .line 275
    :goto_5
    iget-object v5, v3, Lv4/j0;->l:Lv4/h0;

    .line 276
    .line 277
    if-eqz v5, :cond_b

    .line 278
    .line 279
    iget-object v6, v5, Lv4/h0;->m:Lv4/h0;

    .line 280
    .line 281
    if-ne v4, v6, :cond_a

    .line 282
    .line 283
    goto :goto_6

    .line 284
    :cond_a
    invoke-virtual {v5}, Lv4/h0;->b()V

    .line 285
    .line 286
    .line 287
    iput-object v4, v5, Lv4/h0;->m:Lv4/h0;

    .line 288
    .line 289
    invoke-virtual {v5}, Lv4/h0;->c()V

    .line 290
    .line 291
    .line 292
    goto :goto_6

    .line 293
    :cond_b
    iput-object v4, v3, Lv4/j0;->i:Lv4/h0;

    .line 294
    .line 295
    iput-object v4, v3, Lv4/j0;->j:Lv4/h0;

    .line 296
    .line 297
    iput-object v4, v3, Lv4/j0;->k:Lv4/h0;

    .line 298
    .line 299
    :goto_6
    iput-object v14, v3, Lv4/j0;->o:Ljava/lang/Object;

    .line 300
    .line 301
    iput-object v4, v3, Lv4/j0;->l:Lv4/h0;

    .line 302
    .line 303
    iget v5, v3, Lv4/j0;->n:I

    .line 304
    .line 305
    add-int/2addr v5, v2

    .line 306
    iput v5, v3, Lv4/j0;->n:I

    .line 307
    .line 308
    invoke-virtual {v3}, Lv4/j0;->l()V

    .line 309
    .line 310
    .line 311
    iget-boolean v3, v4, Lv4/h0;->d:Z

    .line 312
    .line 313
    if-nez v3, :cond_c

    .line 314
    .line 315
    iget-wide v5, v0, Lv4/i0;->b:J

    .line 316
    .line 317
    iput-boolean v2, v4, Lv4/h0;->d:Z

    .line 318
    .line 319
    iget-object v3, v4, Lv4/h0;->a:Ljava/lang/Object;

    .line 320
    .line 321
    invoke-interface {v3, v1, v5, v6}, Lj5/b0;->g(Lj5/a0;J)V

    .line 322
    .line 323
    .line 324
    goto :goto_7

    .line 325
    :cond_c
    iget-boolean v3, v4, Lv4/h0;->e:Z

    .line 326
    .line 327
    if-eqz v3, :cond_d

    .line 328
    .line 329
    iget-object v3, v1, Lv4/c0;->h:Lp4/x;

    .line 330
    .line 331
    const/16 v5, 0x8

    .line 332
    .line 333
    iget-object v6, v4, Lv4/h0;->a:Ljava/lang/Object;

    .line 334
    .line 335
    invoke-virtual {v3, v5, v6}, Lp4/x;->a(ILjava/lang/Object;)Lp4/w;

    .line 336
    .line 337
    .line 338
    move-result-object v3

    .line 339
    invoke-virtual {v3}, Lp4/w;->b()V

    .line 340
    .line 341
    .line 342
    :cond_d
    :goto_7
    iget-object v3, v1, Lv4/c0;->r:Lv4/j0;

    .line 343
    .line 344
    iget-object v3, v3, Lv4/j0;->i:Lv4/h0;

    .line 345
    .line 346
    if-ne v3, v4, :cond_e

    .line 347
    .line 348
    iget-wide v3, v0, Lv4/i0;->b:J

    .line 349
    .line 350
    invoke-virtual {v1, v3, v4}, Lv4/c0;->K(J)V

    .line 351
    .line 352
    .line 353
    :cond_e
    const/4 v0, 0x0

    .line 354
    invoke-virtual {v1, v0}, Lv4/c0;->p(Z)V

    .line 355
    .line 356
    .line 357
    :cond_f
    :goto_8
    iget-boolean v0, v1, Lv4/c0;->G:Z

    .line 358
    .line 359
    if-eqz v0, :cond_10

    .line 360
    .line 361
    iget-object v0, v1, Lv4/c0;->r:Lv4/j0;

    .line 362
    .line 363
    iget-object v0, v0, Lv4/j0;->l:Lv4/h0;

    .line 364
    .line 365
    invoke-static {v0}, Lv4/c0;->u(Lv4/h0;)Z

    .line 366
    .line 367
    .line 368
    move-result v0

    .line 369
    iput-boolean v0, v1, Lv4/c0;->G:Z

    .line 370
    .line 371
    invoke-virtual {v1}, Lv4/c0;->k0()V

    .line 372
    .line 373
    .line 374
    goto :goto_9

    .line 375
    :cond_10
    invoke-virtual {v1}, Lv4/c0;->w()V

    .line 376
    .line 377
    .line 378
    :goto_9
    iget-object v0, v1, Lv4/c0;->r:Lv4/j0;

    .line 379
    .line 380
    iget-boolean v3, v1, Lv4/c0;->D:Z

    .line 381
    .line 382
    if-nez v3, :cond_11

    .line 383
    .line 384
    iget-boolean v3, v1, Lv4/c0;->x:Z

    .line 385
    .line 386
    if-eqz v3, :cond_11

    .line 387
    .line 388
    iget-boolean v3, v1, Lv4/c0;->W:Z

    .line 389
    .line 390
    if-nez v3, :cond_11

    .line 391
    .line 392
    invoke-virtual {v1}, Lv4/c0;->d()Z

    .line 393
    .line 394
    .line 395
    move-result v3

    .line 396
    if-eqz v3, :cond_12

    .line 397
    .line 398
    :cond_11
    :goto_a
    const/4 v0, 0x0

    .line 399
    const/4 v9, 0x1

    .line 400
    goto/16 :goto_e

    .line 401
    .line 402
    :cond_12
    iget-object v3, v0, Lv4/j0;->k:Lv4/h0;

    .line 403
    .line 404
    if-eqz v3, :cond_11

    .line 405
    .line 406
    iget-object v4, v0, Lv4/j0;->j:Lv4/h0;

    .line 407
    .line 408
    if-ne v3, v4, :cond_11

    .line 409
    .line 410
    iget-object v3, v3, Lv4/h0;->m:Lv4/h0;

    .line 411
    .line 412
    if-eqz v3, :cond_11

    .line 413
    .line 414
    iget-boolean v4, v3, Lv4/h0;->e:Z

    .line 415
    .line 416
    if-nez v4, :cond_13

    .line 417
    .line 418
    goto :goto_a

    .line 419
    :cond_13
    iput-object v3, v0, Lv4/j0;->k:Lv4/h0;

    .line 420
    .line 421
    invoke-virtual {v0}, Lv4/j0;->l()V

    .line 422
    .line 423
    .line 424
    iget-object v3, v0, Lv4/j0;->k:Lv4/h0;

    .line 425
    .line 426
    invoke-static {v3}, Lp4/c;->j(Ljava/lang/Object;)V

    .line 427
    .line 428
    .line 429
    iget-object v7, v1, Lv4/c0;->a:[Lv4/a1;

    .line 430
    .line 431
    const/4 v3, 0x1

    .line 432
    iget-object v2, v0, Lv4/j0;->k:Lv4/h0;

    .line 433
    .line 434
    if-nez v2, :cond_14

    .line 435
    .line 436
    goto :goto_a

    .line 437
    :cond_14
    iget-object v8, v2, Lv4/h0;->o:Lm5/u;

    .line 438
    .line 439
    const/4 v3, 0x0

    .line 440
    :goto_b
    const/4 v4, 0x1

    .line 441
    array-length v5, v7

    .line 442
    if-ge v3, v5, :cond_18

    .line 443
    .line 444
    invoke-virtual {v8, v3}, Lm5/u;->b(I)Z

    .line 445
    .line 446
    .line 447
    move-result v5

    .line 448
    if-eqz v5, :cond_17

    .line 449
    .line 450
    aget-object v5, v7, v3

    .line 451
    .line 452
    iget-object v6, v5, Lv4/a1;->c:Lv4/e;

    .line 453
    .line 454
    if-eqz v6, :cond_17

    .line 455
    .line 456
    invoke-virtual {v5}, Lv4/a1;->f()Z

    .line 457
    .line 458
    .line 459
    move-result v5

    .line 460
    if-nez v5, :cond_17

    .line 461
    .line 462
    aget-object v5, v7, v3

    .line 463
    .line 464
    invoke-virtual {v5}, Lv4/a1;->f()Z

    .line 465
    .line 466
    .line 467
    move-result v6

    .line 468
    xor-int/2addr v6, v4

    .line 469
    invoke-static {v6}, Lp4/c;->i(Z)V

    .line 470
    .line 471
    .line 472
    iget-object v6, v5, Lv4/a1;->a:Lv4/e;

    .line 473
    .line 474
    invoke-static {v6}, Lv4/a1;->h(Lv4/e;)Z

    .line 475
    .line 476
    .line 477
    move-result v6

    .line 478
    if-eqz v6, :cond_15

    .line 479
    .line 480
    const/4 v6, 0x3

    .line 481
    goto :goto_c

    .line 482
    :cond_15
    iget-object v6, v5, Lv4/a1;->c:Lv4/e;

    .line 483
    .line 484
    if-eqz v6, :cond_16

    .line 485
    .line 486
    iget v6, v6, Lv4/e;->h:I

    .line 487
    .line 488
    if-eqz v6, :cond_16

    .line 489
    .line 490
    const/4 v6, 0x4

    .line 491
    goto :goto_c

    .line 492
    :cond_16
    const/4 v6, 0x2

    .line 493
    :goto_c
    iput v6, v5, Lv4/a1;->d:I

    .line 494
    .line 495
    const/4 v5, 0x1

    .line 496
    const/4 v4, 0x0

    .line 497
    const/4 v9, 0x1

    .line 498
    invoke-virtual {v2}, Lv4/h0;->e()J

    .line 499
    .line 500
    .line 501
    move-result-wide v5

    .line 502
    invoke-virtual/range {v1 .. v6}, Lv4/c0;->h(Lv4/h0;IZJ)V

    .line 503
    .line 504
    .line 505
    goto :goto_d

    .line 506
    :cond_17
    const/4 v9, 0x1

    .line 507
    :goto_d
    add-int/lit8 v3, v3, 0x1

    .line 508
    .line 509
    goto :goto_b

    .line 510
    :cond_18
    const/4 v9, 0x1

    .line 511
    invoke-virtual {v1}, Lv4/c0;->d()Z

    .line 512
    .line 513
    .line 514
    move-result v3

    .line 515
    if-eqz v3, :cond_19

    .line 516
    .line 517
    iget-object v3, v2, Lv4/h0;->a:Ljava/lang/Object;

    .line 518
    .line 519
    invoke-interface {v3}, Lj5/b0;->p()J

    .line 520
    .line 521
    .line 522
    move-result-wide v3

    .line 523
    iput-wide v3, v1, Lv4/c0;->V:J

    .line 524
    .line 525
    invoke-virtual {v2}, Lv4/h0;->g()Z

    .line 526
    .line 527
    .line 528
    move-result v3

    .line 529
    if-nez v3, :cond_19

    .line 530
    .line 531
    invoke-virtual {v0, v2}, Lv4/j0;->n(Lv4/h0;)I

    .line 532
    .line 533
    .line 534
    const/4 v0, 0x0

    .line 535
    invoke-virtual {v1, v0}, Lv4/c0;->p(Z)V

    .line 536
    .line 537
    .line 538
    invoke-virtual {v1}, Lv4/c0;->w()V

    .line 539
    .line 540
    .line 541
    goto :goto_e

    .line 542
    :cond_19
    const/4 v0, 0x0

    .line 543
    :goto_e
    iget-boolean v10, v1, Lv4/c0;->x:Z

    .line 544
    .line 545
    iget-object v2, v1, Lv4/c0;->a:[Lv4/a1;

    .line 546
    .line 547
    iget-object v3, v1, Lv4/c0;->r:Lv4/j0;

    .line 548
    .line 549
    iget-object v4, v3, Lv4/j0;->j:Lv4/h0;

    .line 550
    .line 551
    if-nez v4, :cond_1b

    .line 552
    .line 553
    :cond_1a
    :goto_f
    const/4 v7, 0x3

    .line 554
    goto/16 :goto_22

    .line 555
    .line 556
    :cond_1b
    iget-object v5, v4, Lv4/h0;->m:Lv4/h0;

    .line 557
    .line 558
    if-eqz v5, :cond_1c

    .line 559
    .line 560
    iget-boolean v5, v1, Lv4/c0;->D:Z

    .line 561
    .line 562
    if-eqz v5, :cond_1d

    .line 563
    .line 564
    :cond_1c
    move-object v14, v2

    .line 565
    const/4 v7, 0x3

    .line 566
    goto/16 :goto_1d

    .line 567
    .line 568
    :cond_1d
    iget-boolean v5, v4, Lv4/h0;->e:Z

    .line 569
    .line 570
    if-nez v5, :cond_1e

    .line 571
    .line 572
    goto :goto_f

    .line 573
    :cond_1e
    const/4 v5, 0x0

    .line 574
    :goto_10
    array-length v6, v2

    .line 575
    if-ge v5, v6, :cond_1f

    .line 576
    .line 577
    aget-object v6, v2, v5

    .line 578
    .line 579
    iget-object v7, v6, Lv4/a1;->a:Lv4/e;

    .line 580
    .line 581
    invoke-virtual {v6, v4, v7}, Lv4/a1;->e(Lv4/h0;Lv4/e;)Z

    .line 582
    .line 583
    .line 584
    move-result v7

    .line 585
    if-eqz v7, :cond_1a

    .line 586
    .line 587
    iget-object v7, v6, Lv4/a1;->c:Lv4/e;

    .line 588
    .line 589
    invoke-virtual {v6, v4, v7}, Lv4/a1;->e(Lv4/h0;Lv4/e;)Z

    .line 590
    .line 591
    .line 592
    move-result v6

    .line 593
    if-eqz v6, :cond_1a

    .line 594
    .line 595
    add-int/lit8 v5, v5, 0x1

    .line 596
    .line 597
    goto :goto_10

    .line 598
    :cond_1f
    invoke-virtual {v1}, Lv4/c0;->d()Z

    .line 599
    .line 600
    .line 601
    move-result v5

    .line 602
    if-eqz v5, :cond_20

    .line 603
    .line 604
    iget-object v5, v3, Lv4/j0;->k:Lv4/h0;

    .line 605
    .line 606
    iget-object v6, v3, Lv4/j0;->j:Lv4/h0;

    .line 607
    .line 608
    if-ne v5, v6, :cond_20

    .line 609
    .line 610
    goto :goto_f

    .line 611
    :cond_20
    iget-object v5, v4, Lv4/h0;->m:Lv4/h0;

    .line 612
    .line 613
    iget-boolean v6, v5, Lv4/h0;->e:Z

    .line 614
    .line 615
    if-nez v6, :cond_21

    .line 616
    .line 617
    iget-wide v6, v1, Lv4/c0;->O:J

    .line 618
    .line 619
    invoke-virtual {v5}, Lv4/h0;->e()J

    .line 620
    .line 621
    .line 622
    move-result-wide v17

    .line 623
    cmp-long v5, v6, v17

    .line 624
    .line 625
    if-gez v5, :cond_21

    .line 626
    .line 627
    goto :goto_f

    .line 628
    :cond_21
    iget-object v5, v4, Lv4/h0;->o:Lm5/u;

    .line 629
    .line 630
    iget-object v6, v3, Lv4/j0;->k:Lv4/h0;

    .line 631
    .line 632
    iget-object v7, v3, Lv4/j0;->j:Lv4/h0;

    .line 633
    .line 634
    if-ne v6, v7, :cond_22

    .line 635
    .line 636
    invoke-static {v7}, Lp4/c;->j(Ljava/lang/Object;)V

    .line 637
    .line 638
    .line 639
    iget-object v6, v7, Lv4/h0;->m:Lv4/h0;

    .line 640
    .line 641
    iput-object v6, v3, Lv4/j0;->k:Lv4/h0;

    .line 642
    .line 643
    :cond_22
    iget-object v6, v3, Lv4/j0;->j:Lv4/h0;

    .line 644
    .line 645
    invoke-static {v6}, Lp4/c;->j(Ljava/lang/Object;)V

    .line 646
    .line 647
    .line 648
    iget-object v6, v6, Lv4/h0;->m:Lv4/h0;

    .line 649
    .line 650
    iput-object v6, v3, Lv4/j0;->j:Lv4/h0;

    .line 651
    .line 652
    invoke-virtual {v3}, Lv4/j0;->l()V

    .line 653
    .line 654
    .line 655
    iget-object v6, v3, Lv4/j0;->j:Lv4/h0;

    .line 656
    .line 657
    invoke-static {v6}, Lp4/c;->j(Ljava/lang/Object;)V

    .line 658
    .line 659
    .line 660
    iget-object v7, v6, Lv4/h0;->o:Lm5/u;

    .line 661
    .line 662
    iget-object v8, v1, Lv4/c0;->z:Lv4/u0;

    .line 663
    .line 664
    iget-object v8, v8, Lv4/u0;->a:Lm4/i1;

    .line 665
    .line 666
    iget-object v0, v6, Lv4/h0;->g:Lv4/i0;

    .line 667
    .line 668
    iget-object v0, v0, Lv4/i0;->a:Lj5/d0;

    .line 669
    .line 670
    iget-object v4, v4, Lv4/h0;->g:Lv4/i0;

    .line 671
    .line 672
    iget-object v4, v4, Lv4/i0;->a:Lj5/d0;

    .line 673
    .line 674
    move-object/from16 v18, v6

    .line 675
    .line 676
    move-object/from16 v19, v7

    .line 677
    .line 678
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    move-object/from16 v20, v2

    .line 684
    .line 685
    move-object v2, v8

    .line 686
    const/4 v8, 0x0

    .line 687
    move-object/from16 v21, v5

    .line 688
    .line 689
    move-object v5, v4

    .line 690
    move-object v4, v2

    .line 691
    move-object v9, v3

    .line 692
    move-object/from16 v13, v19

    .line 693
    .line 694
    move-object/from16 v14, v20

    .line 695
    .line 696
    move-object/from16 v34, v21

    .line 697
    .line 698
    move-object v3, v0

    .line 699
    move/from16 v20, v10

    .line 700
    .line 701
    move-object/from16 v0, v18

    .line 702
    .line 703
    const/4 v10, 0x3

    .line 704
    invoke-virtual/range {v1 .. v8}, Lv4/c0;->o0(Lm4/i1;Lj5/d0;Lm4/i1;Lj5/d0;JZ)V

    .line 705
    .line 706
    .line 707
    iget-boolean v2, v0, Lv4/h0;->e:Z

    .line 708
    .line 709
    if-eqz v2, :cond_2f

    .line 710
    .line 711
    if-eqz v20, :cond_24

    .line 712
    .line 713
    iget-wide v2, v1, Lv4/c0;->V:J

    .line 714
    .line 715
    cmp-long v4, v2, v23

    .line 716
    .line 717
    if-nez v4, :cond_23

    .line 718
    .line 719
    goto :goto_12

    .line 720
    :cond_23
    :goto_11
    move-wide/from16 v2, v23

    .line 721
    .line 722
    goto :goto_13

    .line 723
    :cond_24
    :goto_12
    iget-object v2, v0, Lv4/h0;->a:Ljava/lang/Object;

    .line 724
    .line 725
    invoke-interface {v2}, Lj5/b0;->p()J

    .line 726
    .line 727
    .line 728
    move-result-wide v2

    .line 729
    cmp-long v4, v2, v23

    .line 730
    .line 731
    if-eqz v4, :cond_2f

    .line 732
    .line 733
    goto :goto_11

    .line 734
    :goto_13
    iput-wide v2, v1, Lv4/c0;->V:J

    .line 735
    .line 736
    if-eqz v20, :cond_25

    .line 737
    .line 738
    iget-boolean v2, v1, Lv4/c0;->W:Z

    .line 739
    .line 740
    if-nez v2, :cond_25

    .line 741
    .line 742
    const/4 v8, 0x1

    .line 743
    goto :goto_14

    .line 744
    :cond_25
    const/4 v8, 0x0

    .line 745
    :goto_14
    if-eqz v8, :cond_28

    .line 746
    .line 747
    const/4 v2, 0x0

    .line 748
    :goto_15
    array-length v3, v14

    .line 749
    if-ge v2, v3, :cond_28

    .line 750
    .line 751
    invoke-virtual {v13, v2}, Lm5/u;->b(I)Z

    .line 752
    .line 753
    .line 754
    move-result v3

    .line 755
    iget-object v4, v13, Lm5/u;->c:[Lm5/r;

    .line 756
    .line 757
    if-nez v3, :cond_26

    .line 758
    .line 759
    goto :goto_16

    .line 760
    :cond_26
    aget-object v3, v4, v2

    .line 761
    .line 762
    invoke-interface {v3}, Lm5/r;->m()Lm4/q;

    .line 763
    .line 764
    .line 765
    move-result-object v3

    .line 766
    iget-object v3, v3, Lm4/q;->n:Ljava/lang/String;

    .line 767
    .line 768
    aget-object v4, v4, v2

    .line 769
    .line 770
    invoke-interface {v4}, Lm5/r;->m()Lm4/q;

    .line 771
    .line 772
    .line 773
    move-result-object v4

    .line 774
    iget-object v4, v4, Lm4/q;->k:Ljava/lang/String;

    .line 775
    .line 776
    invoke-static {v3, v4}, Lm4/o0;->a(Ljava/lang/String;Ljava/lang/String;)Z

    .line 777
    .line 778
    .line 779
    move-result v3

    .line 780
    if-nez v3, :cond_27

    .line 781
    .line 782
    aget-object v3, v14, v2

    .line 783
    .line 784
    invoke-virtual {v3}, Lv4/a1;->f()Z

    .line 785
    .line 786
    .line 787
    move-result v3

    .line 788
    if-nez v3, :cond_27

    .line 789
    .line 790
    const/4 v8, 0x0

    .line 791
    goto :goto_17

    .line 792
    :cond_27
    :goto_16
    add-int/lit8 v2, v2, 0x1

    .line 793
    .line 794
    goto :goto_15

    .line 795
    :cond_28
    :goto_17
    if-nez v8, :cond_2f

    .line 796
    .line 797
    invoke-virtual {v0}, Lv4/h0;->e()J

    .line 798
    .line 799
    .line 800
    move-result-wide v2

    .line 801
    array-length v4, v14

    .line 802
    const/4 v8, 0x0

    .line 803
    :goto_18
    if-ge v8, v4, :cond_2c

    .line 804
    .line 805
    aget-object v5, v14, v8

    .line 806
    .line 807
    iget-object v6, v5, Lv4/a1;->c:Lv4/e;

    .line 808
    .line 809
    iget-object v7, v5, Lv4/a1;->a:Lv4/e;

    .line 810
    .line 811
    invoke-static {v7}, Lv4/a1;->h(Lv4/e;)Z

    .line 812
    .line 813
    .line 814
    move-result v13

    .line 815
    if-eqz v13, :cond_29

    .line 816
    .line 817
    iget v13, v5, Lv4/a1;->d:I

    .line 818
    .line 819
    if-eq v13, v15, :cond_29

    .line 820
    .line 821
    const/4 v15, 0x2

    .line 822
    if-eq v13, v15, :cond_29

    .line 823
    .line 824
    invoke-static {v7, v2, v3}, Lv4/a1;->m(Lv4/e;J)V

    .line 825
    .line 826
    .line 827
    :cond_29
    if-eqz v6, :cond_2b

    .line 828
    .line 829
    iget v7, v6, Lv4/e;->h:I

    .line 830
    .line 831
    if-eqz v7, :cond_2a

    .line 832
    .line 833
    const/4 v7, 0x1

    .line 834
    goto :goto_19

    .line 835
    :cond_2a
    const/4 v7, 0x0

    .line 836
    :goto_19
    if-eqz v7, :cond_2b

    .line 837
    .line 838
    iget v5, v5, Lv4/a1;->d:I

    .line 839
    .line 840
    if-eq v5, v10, :cond_2b

    .line 841
    .line 842
    invoke-static {v6, v2, v3}, Lv4/a1;->m(Lv4/e;J)V

    .line 843
    .line 844
    .line 845
    :cond_2b
    add-int/lit8 v8, v8, 0x1

    .line 846
    .line 847
    const/4 v15, 0x4

    .line 848
    goto :goto_18

    .line 849
    :cond_2c
    invoke-virtual {v0}, Lv4/h0;->g()Z

    .line 850
    .line 851
    .line 852
    move-result v2

    .line 853
    if-nez v2, :cond_2d

    .line 854
    .line 855
    invoke-virtual {v9, v0}, Lv4/j0;->n(Lv4/h0;)I

    .line 856
    .line 857
    .line 858
    const/4 v0, 0x0

    .line 859
    invoke-virtual {v1, v0}, Lv4/c0;->p(Z)V

    .line 860
    .line 861
    .line 862
    invoke-virtual {v1}, Lv4/c0;->w()V

    .line 863
    .line 864
    .line 865
    :cond_2d
    const/4 v7, 0x3

    .line 866
    :cond_2e
    const-wide v23, -0x7fffffffffffffffL    # -4.9E-324

    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    goto/16 :goto_22

    .line 872
    .line 873
    :cond_2f
    array-length v2, v14

    .line 874
    const/4 v8, 0x0

    .line 875
    :goto_1a
    if-ge v8, v2, :cond_2d

    .line 876
    .line 877
    aget-object v3, v14, v8

    .line 878
    .line 879
    invoke-virtual {v0}, Lv4/h0;->e()J

    .line 880
    .line 881
    .line 882
    move-result-wide v4

    .line 883
    iget-object v6, v3, Lv4/a1;->a:Lv4/e;

    .line 884
    .line 885
    iget v7, v3, Lv4/a1;->b:I

    .line 886
    .line 887
    move-object/from16 v9, v34

    .line 888
    .line 889
    invoke-virtual {v9, v7}, Lm5/u;->b(I)Z

    .line 890
    .line 891
    .line 892
    move-result v15

    .line 893
    invoke-virtual {v13, v7}, Lm5/u;->b(I)Z

    .line 894
    .line 895
    .line 896
    move-result v21

    .line 897
    iget-object v10, v3, Lv4/a1;->c:Lv4/e;

    .line 898
    .line 899
    move-object/from16 v25, v0

    .line 900
    .line 901
    if-eqz v10, :cond_30

    .line 902
    .line 903
    iget v0, v3, Lv4/a1;->d:I

    .line 904
    .line 905
    move/from16 v26, v7

    .line 906
    .line 907
    const/4 v7, 0x3

    .line 908
    if-eq v0, v7, :cond_31

    .line 909
    .line 910
    if-nez v0, :cond_32

    .line 911
    .line 912
    invoke-static {v6}, Lv4/a1;->h(Lv4/e;)Z

    .line 913
    .line 914
    .line 915
    move-result v0

    .line 916
    if-eqz v0, :cond_32

    .line 917
    .line 918
    goto :goto_1b

    .line 919
    :cond_30
    move/from16 v26, v7

    .line 920
    .line 921
    const/4 v7, 0x3

    .line 922
    :cond_31
    :goto_1b
    move-object v10, v6

    .line 923
    :cond_32
    if-eqz v15, :cond_35

    .line 924
    .line 925
    iget-boolean v0, v10, Lv4/e;->n:Z

    .line 926
    .line 927
    if-nez v0, :cond_35

    .line 928
    .line 929
    iget v0, v6, Lv4/e;->b:I

    .line 930
    .line 931
    const/4 v6, -0x2

    .line 932
    if-ne v0, v6, :cond_33

    .line 933
    .line 934
    const/4 v0, 0x1

    .line 935
    goto :goto_1c

    .line 936
    :cond_33
    const/4 v0, 0x0

    .line 937
    :goto_1c
    iget-object v6, v9, Lm5/u;->b:[Lv4/z0;

    .line 938
    .line 939
    aget-object v6, v6, v26

    .line 940
    .line 941
    iget-object v15, v13, Lm5/u;->b:[Lv4/z0;

    .line 942
    .line 943
    aget-object v15, v15, v26

    .line 944
    .line 945
    if-eqz v21, :cond_34

    .line 946
    .line 947
    invoke-static {v15, v6}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 948
    .line 949
    .line 950
    move-result v6

    .line 951
    if-eqz v6, :cond_34

    .line 952
    .line 953
    if-nez v0, :cond_34

    .line 954
    .line 955
    invoke-virtual {v3}, Lv4/a1;->f()Z

    .line 956
    .line 957
    .line 958
    move-result v0

    .line 959
    if-eqz v0, :cond_35

    .line 960
    .line 961
    :cond_34
    invoke-static {v10, v4, v5}, Lv4/a1;->m(Lv4/e;J)V

    .line 962
    .line 963
    .line 964
    :cond_35
    add-int/lit8 v8, v8, 0x1

    .line 965
    .line 966
    move-object/from16 v34, v9

    .line 967
    .line 968
    move-object/from16 v0, v25

    .line 969
    .line 970
    const/4 v10, 0x3

    .line 971
    goto :goto_1a

    .line 972
    :goto_1d
    iget-object v0, v4, Lv4/h0;->g:Lv4/i0;

    .line 973
    .line 974
    iget-boolean v0, v0, Lv4/i0;->j:Z

    .line 975
    .line 976
    if-nez v0, :cond_36

    .line 977
    .line 978
    iget-boolean v0, v1, Lv4/c0;->D:Z

    .line 979
    .line 980
    if-eqz v0, :cond_2e

    .line 981
    .line 982
    :cond_36
    array-length v0, v14

    .line 983
    const/4 v8, 0x0

    .line 984
    :goto_1e
    if-ge v8, v0, :cond_2e

    .line 985
    .line 986
    aget-object v2, v14, v8

    .line 987
    .line 988
    invoke-virtual {v2, v4}, Lv4/a1;->d(Lv4/h0;)Lv4/e;

    .line 989
    .line 990
    .line 991
    move-result-object v3

    .line 992
    if-eqz v3, :cond_37

    .line 993
    .line 994
    const/4 v3, 0x1

    .line 995
    goto :goto_1f

    .line 996
    :cond_37
    const/4 v3, 0x0

    .line 997
    :goto_1f
    if-nez v3, :cond_39

    .line 998
    .line 999
    :cond_38
    const-wide v23, -0x7fffffffffffffffL    # -4.9E-324

    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    goto :goto_21

    .line 1005
    :cond_39
    invoke-virtual {v2, v4}, Lv4/a1;->d(Lv4/h0;)Lv4/e;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v3

    .line 1009
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1010
    .line 1011
    .line 1012
    invoke-virtual {v3}, Lv4/e;->j()Z

    .line 1013
    .line 1014
    .line 1015
    move-result v3

    .line 1016
    if-eqz v3, :cond_38

    .line 1017
    .line 1018
    iget-object v3, v4, Lv4/h0;->g:Lv4/i0;

    .line 1019
    .line 1020
    iget-wide v5, v3, Lv4/i0;->e:J

    .line 1021
    .line 1022
    const-wide v23, -0x7fffffffffffffffL    # -4.9E-324

    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    cmp-long v3, v5, v23

    .line 1028
    .line 1029
    if-eqz v3, :cond_3a

    .line 1030
    .line 1031
    const-wide/high16 v9, -0x8000000000000000L

    .line 1032
    .line 1033
    cmp-long v3, v5, v9

    .line 1034
    .line 1035
    if-eqz v3, :cond_3a

    .line 1036
    .line 1037
    iget-wide v9, v4, Lv4/h0;->p:J

    .line 1038
    .line 1039
    add-long/2addr v5, v9

    .line 1040
    goto :goto_20

    .line 1041
    :cond_3a
    move-wide/from16 v5, v23

    .line 1042
    .line 1043
    :goto_20
    invoke-virtual {v2, v4}, Lv4/a1;->d(Lv4/h0;)Lv4/e;

    .line 1044
    .line 1045
    .line 1046
    move-result-object v2

    .line 1047
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1048
    .line 1049
    .line 1050
    invoke-static {v2, v5, v6}, Lv4/a1;->m(Lv4/e;J)V

    .line 1051
    .line 1052
    .line 1053
    :goto_21
    add-int/lit8 v8, v8, 0x1

    .line 1054
    .line 1055
    goto :goto_1e

    .line 1056
    :goto_22
    iget-object v0, v1, Lv4/c0;->r:Lv4/j0;

    .line 1057
    .line 1058
    iget-object v2, v0, Lv4/j0;->j:Lv4/h0;

    .line 1059
    .line 1060
    if-eqz v2, :cond_44

    .line 1061
    .line 1062
    iget-object v3, v0, Lv4/j0;->i:Lv4/h0;

    .line 1063
    .line 1064
    if-eq v3, v2, :cond_44

    .line 1065
    .line 1066
    iget-boolean v3, v2, Lv4/h0;->h:Z

    .line 1067
    .line 1068
    if-eqz v3, :cond_3b

    .line 1069
    .line 1070
    goto/16 :goto_28

    .line 1071
    .line 1072
    :cond_3b
    iget-object v8, v1, Lv4/c0;->a:[Lv4/a1;

    .line 1073
    .line 1074
    iget-object v9, v2, Lv4/h0;->o:Lm5/u;

    .line 1075
    .line 1076
    const/4 v3, 0x0

    .line 1077
    const/4 v10, 0x1

    .line 1078
    :goto_23
    array-length v4, v8

    .line 1079
    if-ge v3, v4, :cond_40

    .line 1080
    .line 1081
    aget-object v4, v8, v3

    .line 1082
    .line 1083
    invoke-virtual {v4}, Lv4/a1;->c()I

    .line 1084
    .line 1085
    .line 1086
    move-result v4

    .line 1087
    aget-object v5, v8, v3

    .line 1088
    .line 1089
    iget-object v6, v1, Lv4/c0;->n:Lv4/k;

    .line 1090
    .line 1091
    iget-object v13, v5, Lv4/a1;->a:Lv4/e;

    .line 1092
    .line 1093
    invoke-virtual {v5, v13, v2, v9, v6}, Lv4/a1;->k(Lv4/e;Lv4/h0;Lm5/u;Lv4/k;)I

    .line 1094
    .line 1095
    .line 1096
    move-result v13

    .line 1097
    iget-object v14, v5, Lv4/a1;->c:Lv4/e;

    .line 1098
    .line 1099
    invoke-virtual {v5, v14, v2, v9, v6}, Lv4/a1;->k(Lv4/e;Lv4/h0;Lm5/u;Lv4/k;)I

    .line 1100
    .line 1101
    .line 1102
    move-result v5

    .line 1103
    const/4 v6, 0x1

    .line 1104
    if-ne v13, v6, :cond_3c

    .line 1105
    .line 1106
    move v13, v5

    .line 1107
    :cond_3c
    and-int/lit8 v5, v13, 0x2

    .line 1108
    .line 1109
    if-eqz v5, :cond_3e

    .line 1110
    .line 1111
    iget-boolean v5, v1, Lv4/c0;->L:Z

    .line 1112
    .line 1113
    if-eqz v5, :cond_3e

    .line 1114
    .line 1115
    if-nez v5, :cond_3d

    .line 1116
    .line 1117
    goto :goto_24

    .line 1118
    :cond_3d
    const/4 v5, 0x0

    .line 1119
    iput-boolean v5, v1, Lv4/c0;->L:Z

    .line 1120
    .line 1121
    iget-object v5, v1, Lv4/c0;->z:Lv4/u0;

    .line 1122
    .line 1123
    iget-boolean v5, v5, Lv4/u0;->p:Z

    .line 1124
    .line 1125
    if-eqz v5, :cond_3e

    .line 1126
    .line 1127
    iget-object v5, v1, Lv4/c0;->h:Lp4/x;

    .line 1128
    .line 1129
    const/4 v15, 0x2

    .line 1130
    invoke-virtual {v5, v15}, Lp4/x;->e(I)Z

    .line 1131
    .line 1132
    .line 1133
    :cond_3e
    :goto_24
    iget v5, v1, Lv4/c0;->M:I

    .line 1134
    .line 1135
    aget-object v6, v8, v3

    .line 1136
    .line 1137
    invoke-virtual {v6}, Lv4/a1;->c()I

    .line 1138
    .line 1139
    .line 1140
    move-result v6

    .line 1141
    sub-int/2addr v4, v6

    .line 1142
    sub-int/2addr v5, v4

    .line 1143
    iput v5, v1, Lv4/c0;->M:I

    .line 1144
    .line 1145
    and-int/lit8 v4, v13, 0x1

    .line 1146
    .line 1147
    if-eqz v4, :cond_3f

    .line 1148
    .line 1149
    const/4 v4, 0x1

    .line 1150
    goto :goto_25

    .line 1151
    :cond_3f
    const/4 v4, 0x0

    .line 1152
    :goto_25
    and-int/2addr v10, v4

    .line 1153
    add-int/lit8 v3, v3, 0x1

    .line 1154
    .line 1155
    goto :goto_23

    .line 1156
    :cond_40
    if-eqz v10, :cond_43

    .line 1157
    .line 1158
    const/4 v3, 0x0

    .line 1159
    :goto_26
    array-length v4, v8

    .line 1160
    if-ge v3, v4, :cond_43

    .line 1161
    .line 1162
    invoke-virtual {v9, v3}, Lm5/u;->b(I)Z

    .line 1163
    .line 1164
    .line 1165
    move-result v4

    .line 1166
    if-eqz v4, :cond_42

    .line 1167
    .line 1168
    aget-object v4, v8, v3

    .line 1169
    .line 1170
    invoke-virtual {v4, v2}, Lv4/a1;->d(Lv4/h0;)Lv4/e;

    .line 1171
    .line 1172
    .line 1173
    move-result-object v4

    .line 1174
    if-eqz v4, :cond_41

    .line 1175
    .line 1176
    const/4 v4, 0x1

    .line 1177
    goto :goto_27

    .line 1178
    :cond_41
    const/4 v4, 0x0

    .line 1179
    :goto_27
    if-nez v4, :cond_42

    .line 1180
    .line 1181
    const/4 v4, 0x0

    .line 1182
    invoke-virtual {v2}, Lv4/h0;->e()J

    .line 1183
    .line 1184
    .line 1185
    move-result-wide v5

    .line 1186
    invoke-virtual/range {v1 .. v6}, Lv4/c0;->h(Lv4/h0;IZJ)V

    .line 1187
    .line 1188
    .line 1189
    :cond_42
    add-int/lit8 v3, v3, 0x1

    .line 1190
    .line 1191
    goto :goto_26

    .line 1192
    :cond_43
    if-eqz v10, :cond_44

    .line 1193
    .line 1194
    iget-object v0, v0, Lv4/j0;->j:Lv4/h0;

    .line 1195
    .line 1196
    const/4 v9, 0x1

    .line 1197
    iput-boolean v9, v0, Lv4/h0;->h:Z

    .line 1198
    .line 1199
    :cond_44
    :goto_28
    iget-object v0, v1, Lv4/c0;->a:[Lv4/a1;

    .line 1200
    .line 1201
    iget-object v13, v1, Lv4/c0;->r:Lv4/j0;

    .line 1202
    .line 1203
    const/4 v8, 0x0

    .line 1204
    :goto_29
    invoke-virtual {v1}, Lv4/c0;->f0()Z

    .line 1205
    .line 1206
    .line 1207
    move-result v2

    .line 1208
    if-nez v2, :cond_46

    .line 1209
    .line 1210
    :cond_45
    :goto_2a
    const/4 v15, 0x3

    .line 1211
    goto/16 :goto_35

    .line 1212
    .line 1213
    :cond_46
    iget-boolean v2, v1, Lv4/c0;->D:Z

    .line 1214
    .line 1215
    if-eqz v2, :cond_47

    .line 1216
    .line 1217
    goto :goto_2a

    .line 1218
    :cond_47
    iget-object v2, v13, Lv4/j0;->i:Lv4/h0;

    .line 1219
    .line 1220
    if-nez v2, :cond_48

    .line 1221
    .line 1222
    goto :goto_2a

    .line 1223
    :cond_48
    iget-object v2, v2, Lv4/h0;->m:Lv4/h0;

    .line 1224
    .line 1225
    if-eqz v2, :cond_45

    .line 1226
    .line 1227
    iget-wide v3, v1, Lv4/c0;->O:J

    .line 1228
    .line 1229
    invoke-virtual {v2}, Lv4/h0;->e()J

    .line 1230
    .line 1231
    .line 1232
    move-result-wide v5

    .line 1233
    cmp-long v9, v3, v5

    .line 1234
    .line 1235
    if-ltz v9, :cond_45

    .line 1236
    .line 1237
    iget-boolean v2, v2, Lv4/h0;->h:Z

    .line 1238
    .line 1239
    if-eqz v2, :cond_45

    .line 1240
    .line 1241
    if-eqz v8, :cond_49

    .line 1242
    .line 1243
    invoke-virtual {v1}, Lv4/c0;->y()V

    .line 1244
    .line 1245
    .line 1246
    :cond_49
    const/4 v5, 0x0

    .line 1247
    iput-boolean v5, v1, Lv4/c0;->W:Z

    .line 1248
    .line 1249
    invoke-virtual {v13}, Lv4/j0;->a()Lv4/h0;

    .line 1250
    .line 1251
    .line 1252
    move-result-object v14

    .line 1253
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1254
    .line 1255
    .line 1256
    iget-object v2, v1, Lv4/c0;->z:Lv4/u0;

    .line 1257
    .line 1258
    iget-object v2, v2, Lv4/u0;->b:Lj5/d0;

    .line 1259
    .line 1260
    iget-object v2, v2, Lj5/d0;->a:Ljava/lang/Object;

    .line 1261
    .line 1262
    iget-object v3, v14, Lv4/h0;->g:Lv4/i0;

    .line 1263
    .line 1264
    iget-object v3, v3, Lv4/i0;->a:Lj5/d0;

    .line 1265
    .line 1266
    iget-object v3, v3, Lj5/d0;->a:Ljava/lang/Object;

    .line 1267
    .line 1268
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1269
    .line 1270
    .line 1271
    move-result v2

    .line 1272
    if-eqz v2, :cond_4a

    .line 1273
    .line 1274
    iget-object v2, v1, Lv4/c0;->z:Lv4/u0;

    .line 1275
    .line 1276
    iget-object v2, v2, Lv4/u0;->b:Lj5/d0;

    .line 1277
    .line 1278
    iget v3, v2, Lj5/d0;->b:I

    .line 1279
    .line 1280
    const/4 v4, -0x1

    .line 1281
    if-ne v3, v4, :cond_4a

    .line 1282
    .line 1283
    iget-object v3, v14, Lv4/h0;->g:Lv4/i0;

    .line 1284
    .line 1285
    iget-object v3, v3, Lv4/i0;->a:Lj5/d0;

    .line 1286
    .line 1287
    iget v5, v3, Lj5/d0;->b:I

    .line 1288
    .line 1289
    if-ne v5, v4, :cond_4a

    .line 1290
    .line 1291
    iget v2, v2, Lj5/d0;->e:I

    .line 1292
    .line 1293
    iget v3, v3, Lj5/d0;->e:I

    .line 1294
    .line 1295
    if-eq v2, v3, :cond_4a

    .line 1296
    .line 1297
    const/4 v8, 0x1

    .line 1298
    goto :goto_2b

    .line 1299
    :cond_4a
    const/4 v8, 0x0

    .line 1300
    :goto_2b
    iget-object v2, v14, Lv4/h0;->g:Lv4/i0;

    .line 1301
    .line 1302
    iget-object v3, v2, Lv4/i0;->a:Lj5/d0;

    .line 1303
    .line 1304
    move-object v5, v3

    .line 1305
    iget-wide v3, v2, Lv4/i0;->b:J

    .line 1306
    .line 1307
    iget-wide v9, v2, Lv4/i0;->c:J

    .line 1308
    .line 1309
    const/16 v17, 0x1

    .line 1310
    .line 1311
    xor-int/lit8 v2, v8, 0x1

    .line 1312
    .line 1313
    move-wide/from16 v48, v9

    .line 1314
    .line 1315
    move v9, v2

    .line 1316
    move-object v2, v5

    .line 1317
    move-wide/from16 v5, v48

    .line 1318
    .line 1319
    const/4 v10, 0x0

    .line 1320
    const/16 v22, 0x3

    .line 1321
    .line 1322
    move-wide v7, v3

    .line 1323
    const/4 v15, 0x3

    .line 1324
    invoke-virtual/range {v1 .. v10}, Lv4/c0;->t(Lj5/d0;JJJZI)Lv4/u0;

    .line 1325
    .line 1326
    .line 1327
    move-result-object v2

    .line 1328
    iput-object v2, v1, Lv4/c0;->z:Lv4/u0;

    .line 1329
    .line 1330
    invoke-virtual {v1}, Lv4/c0;->J()V

    .line 1331
    .line 1332
    .line 1333
    invoke-virtual {v1}, Lv4/c0;->n0()V

    .line 1334
    .line 1335
    .line 1336
    invoke-virtual {v1}, Lv4/c0;->d()Z

    .line 1337
    .line 1338
    .line 1339
    move-result v2

    .line 1340
    if-eqz v2, :cond_51

    .line 1341
    .line 1342
    iget-object v2, v13, Lv4/j0;->k:Lv4/h0;

    .line 1343
    .line 1344
    if-ne v14, v2, :cond_51

    .line 1345
    .line 1346
    array-length v2, v0

    .line 1347
    const/4 v8, 0x0

    .line 1348
    :goto_2c
    if-ge v8, v2, :cond_51

    .line 1349
    .line 1350
    aget-object v3, v0, v8

    .line 1351
    .line 1352
    iget v4, v3, Lv4/a1;->d:I

    .line 1353
    .line 1354
    const/4 v5, 0x4

    .line 1355
    if-eq v4, v15, :cond_4c

    .line 1356
    .line 1357
    if-ne v4, v5, :cond_4b

    .line 1358
    .line 1359
    goto :goto_2d

    .line 1360
    :cond_4b
    const/4 v6, 0x2

    .line 1361
    if-ne v4, v6, :cond_50

    .line 1362
    .line 1363
    const/4 v4, 0x0

    .line 1364
    iput v4, v3, Lv4/a1;->d:I

    .line 1365
    .line 1366
    goto :goto_31

    .line 1367
    :cond_4c
    :goto_2d
    if-ne v4, v5, :cond_4d

    .line 1368
    .line 1369
    const/4 v4, 0x1

    .line 1370
    goto :goto_2e

    .line 1371
    :cond_4d
    const/4 v4, 0x0

    .line 1372
    :goto_2e
    iget-object v5, v3, Lv4/a1;->a:Lv4/e;

    .line 1373
    .line 1374
    iget-object v6, v3, Lv4/a1;->c:Lv4/e;

    .line 1375
    .line 1376
    const/16 v7, 0x11

    .line 1377
    .line 1378
    if-eqz v4, :cond_4e

    .line 1379
    .line 1380
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1381
    .line 1382
    .line 1383
    invoke-interface {v6, v7, v5}, Lv4/w0;->d(ILjava/lang/Object;)V

    .line 1384
    .line 1385
    .line 1386
    goto :goto_2f

    .line 1387
    :cond_4e
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1388
    .line 1389
    .line 1390
    invoke-interface {v5, v7, v6}, Lv4/w0;->d(ILjava/lang/Object;)V

    .line 1391
    .line 1392
    .line 1393
    :goto_2f
    iget v4, v3, Lv4/a1;->d:I

    .line 1394
    .line 1395
    const/4 v5, 0x4

    .line 1396
    if-ne v4, v5, :cond_4f

    .line 1397
    .line 1398
    const/4 v4, 0x0

    .line 1399
    goto :goto_30

    .line 1400
    :cond_4f
    const/4 v4, 0x1

    .line 1401
    :goto_30
    iput v4, v3, Lv4/a1;->d:I

    .line 1402
    .line 1403
    :cond_50
    :goto_31
    add-int/lit8 v8, v8, 0x1

    .line 1404
    .line 1405
    goto :goto_2c

    .line 1406
    :cond_51
    iget-object v2, v1, Lv4/c0;->z:Lv4/u0;

    .line 1407
    .line 1408
    iget v2, v2, Lv4/u0;->e:I

    .line 1409
    .line 1410
    if-ne v2, v15, :cond_52

    .line 1411
    .line 1412
    invoke-virtual {v1}, Lv4/c0;->h0()V

    .line 1413
    .line 1414
    .line 1415
    :cond_52
    iget-object v2, v13, Lv4/j0;->i:Lv4/h0;

    .line 1416
    .line 1417
    iget-object v2, v2, Lv4/h0;->o:Lm5/u;

    .line 1418
    .line 1419
    const/4 v8, 0x0

    .line 1420
    :goto_32
    array-length v3, v0

    .line 1421
    if-ge v8, v3, :cond_57

    .line 1422
    .line 1423
    invoke-virtual {v2, v8}, Lm5/u;->b(I)Z

    .line 1424
    .line 1425
    .line 1426
    move-result v3

    .line 1427
    if-nez v3, :cond_53

    .line 1428
    .line 1429
    goto :goto_34

    .line 1430
    :cond_53
    aget-object v3, v0, v8

    .line 1431
    .line 1432
    iget-object v4, v3, Lv4/a1;->c:Lv4/e;

    .line 1433
    .line 1434
    iget-object v3, v3, Lv4/a1;->a:Lv4/e;

    .line 1435
    .line 1436
    invoke-static {v3}, Lv4/a1;->h(Lv4/e;)Z

    .line 1437
    .line 1438
    .line 1439
    move-result v5

    .line 1440
    if-eqz v5, :cond_54

    .line 1441
    .line 1442
    invoke-virtual {v3}, Lv4/e;->g()V

    .line 1443
    .line 1444
    .line 1445
    goto :goto_34

    .line 1446
    :cond_54
    if-eqz v4, :cond_56

    .line 1447
    .line 1448
    iget v3, v4, Lv4/e;->h:I

    .line 1449
    .line 1450
    if-eqz v3, :cond_55

    .line 1451
    .line 1452
    const/4 v3, 0x1

    .line 1453
    goto :goto_33

    .line 1454
    :cond_55
    const/4 v3, 0x0

    .line 1455
    :goto_33
    if-eqz v3, :cond_56

    .line 1456
    .line 1457
    invoke-virtual {v4}, Lv4/e;->g()V

    .line 1458
    .line 1459
    .line 1460
    :cond_56
    :goto_34
    add-int/lit8 v8, v8, 0x1

    .line 1461
    .line 1462
    goto :goto_32

    .line 1463
    :cond_57
    const/4 v7, 0x3

    .line 1464
    const/4 v8, 0x1

    .line 1465
    const-wide v23, -0x7fffffffffffffffL    # -4.9E-324

    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    goto/16 :goto_29

    .line 1471
    .line 1472
    :goto_35
    iget-object v0, v1, Lv4/c0;->U:Lv4/o;

    .line 1473
    .line 1474
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1475
    .line 1476
    .line 1477
    :goto_36
    iget-object v0, v1, Lv4/c0;->z:Lv4/u0;

    .line 1478
    .line 1479
    iget v0, v0, Lv4/u0;->e:I

    .line 1480
    .line 1481
    const/4 v9, 0x1

    .line 1482
    if-eq v0, v9, :cond_90

    .line 1483
    .line 1484
    const/4 v5, 0x4

    .line 1485
    if-ne v0, v5, :cond_58

    .line 1486
    .line 1487
    goto/16 :goto_54

    .line 1488
    .line 1489
    :cond_58
    iget-object v0, v1, Lv4/c0;->r:Lv4/j0;

    .line 1490
    .line 1491
    iget-object v0, v0, Lv4/j0;->i:Lv4/h0;

    .line 1492
    .line 1493
    if-nez v0, :cond_59

    .line 1494
    .line 1495
    invoke-virtual {v1, v11, v12}, Lv4/c0;->O(J)V

    .line 1496
    .line 1497
    .line 1498
    return-void

    .line 1499
    :cond_59
    const-string v2, "doSomeWork"

    .line 1500
    .line 1501
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 1502
    .line 1503
    .line 1504
    invoke-virtual {v1}, Lv4/c0;->n0()V

    .line 1505
    .line 1506
    .line 1507
    iget-boolean v2, v0, Lv4/h0;->e:Z

    .line 1508
    .line 1509
    if-eqz v2, :cond_66

    .line 1510
    .line 1511
    iget-object v2, v1, Lv4/c0;->p:Lp4/v;

    .line 1512
    .line 1513
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1514
    .line 1515
    .line 1516
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 1517
    .line 1518
    .line 1519
    move-result-wide v2

    .line 1520
    invoke-static {v2, v3}, Lp4/c0;->N(J)J

    .line 1521
    .line 1522
    .line 1523
    move-result-wide v2

    .line 1524
    iput-wide v2, v1, Lv4/c0;->P:J

    .line 1525
    .line 1526
    iget-object v2, v0, Lv4/h0;->a:Ljava/lang/Object;

    .line 1527
    .line 1528
    iget-object v3, v1, Lv4/c0;->z:Lv4/u0;

    .line 1529
    .line 1530
    iget-wide v3, v3, Lv4/u0;->s:J

    .line 1531
    .line 1532
    iget-wide v5, v1, Lv4/c0;->m:J

    .line 1533
    .line 1534
    sub-long/2addr v3, v5

    .line 1535
    invoke-interface {v2, v3, v4}, Lj5/b0;->i(J)V

    .line 1536
    .line 1537
    .line 1538
    const/4 v2, 0x1

    .line 1539
    const/4 v3, 0x1

    .line 1540
    const/4 v8, 0x0

    .line 1541
    :goto_37
    iget-object v4, v1, Lv4/c0;->a:[Lv4/a1;

    .line 1542
    .line 1543
    array-length v5, v4

    .line 1544
    if-ge v8, v5, :cond_67

    .line 1545
    .line 1546
    aget-object v4, v4, v8

    .line 1547
    .line 1548
    invoke-virtual {v4}, Lv4/a1;->c()I

    .line 1549
    .line 1550
    .line 1551
    move-result v5

    .line 1552
    if-nez v5, :cond_5a

    .line 1553
    .line 1554
    const/4 v5, 0x0

    .line 1555
    invoke-virtual {v1, v8, v5}, Lv4/c0;->A(IZ)V

    .line 1556
    .line 1557
    .line 1558
    goto/16 :goto_3f

    .line 1559
    .line 1560
    :cond_5a
    iget-wide v5, v1, Lv4/c0;->O:J

    .line 1561
    .line 1562
    iget-wide v9, v1, Lv4/c0;->P:J

    .line 1563
    .line 1564
    iget-object v7, v4, Lv4/a1;->c:Lv4/e;

    .line 1565
    .line 1566
    iget-object v13, v4, Lv4/a1;->a:Lv4/e;

    .line 1567
    .line 1568
    invoke-static {v13}, Lv4/a1;->h(Lv4/e;)Z

    .line 1569
    .line 1570
    .line 1571
    move-result v14

    .line 1572
    if-eqz v14, :cond_5b

    .line 1573
    .line 1574
    invoke-virtual {v13, v5, v6, v9, v10}, Lv4/e;->v(JJ)V

    .line 1575
    .line 1576
    .line 1577
    :cond_5b
    if-eqz v7, :cond_5d

    .line 1578
    .line 1579
    iget v13, v7, Lv4/e;->h:I

    .line 1580
    .line 1581
    if-eqz v13, :cond_5c

    .line 1582
    .line 1583
    const/4 v13, 0x1

    .line 1584
    goto :goto_38

    .line 1585
    :cond_5c
    const/4 v13, 0x0

    .line 1586
    :goto_38
    if-eqz v13, :cond_5d

    .line 1587
    .line 1588
    invoke-virtual {v7, v5, v6, v9, v10}, Lv4/e;->v(JJ)V

    .line 1589
    .line 1590
    .line 1591
    :cond_5d
    if-eqz v2, :cond_61

    .line 1592
    .line 1593
    iget-object v2, v4, Lv4/a1;->c:Lv4/e;

    .line 1594
    .line 1595
    iget-object v5, v4, Lv4/a1;->a:Lv4/e;

    .line 1596
    .line 1597
    invoke-static {v5}, Lv4/a1;->h(Lv4/e;)Z

    .line 1598
    .line 1599
    .line 1600
    move-result v6

    .line 1601
    if-eqz v6, :cond_5e

    .line 1602
    .line 1603
    invoke-virtual {v5}, Lv4/e;->k()Z

    .line 1604
    .line 1605
    .line 1606
    move-result v5

    .line 1607
    goto :goto_39

    .line 1608
    :cond_5e
    const/4 v5, 0x1

    .line 1609
    :goto_39
    if-eqz v2, :cond_60

    .line 1610
    .line 1611
    iget v6, v2, Lv4/e;->h:I

    .line 1612
    .line 1613
    if-eqz v6, :cond_5f

    .line 1614
    .line 1615
    const/4 v6, 0x1

    .line 1616
    goto :goto_3a

    .line 1617
    :cond_5f
    const/4 v6, 0x0

    .line 1618
    :goto_3a
    if-eqz v6, :cond_60

    .line 1619
    .line 1620
    invoke-virtual {v2}, Lv4/e;->k()Z

    .line 1621
    .line 1622
    .line 1623
    move-result v2

    .line 1624
    and-int/2addr v5, v2

    .line 1625
    :cond_60
    if-eqz v5, :cond_61

    .line 1626
    .line 1627
    const/4 v2, 0x1

    .line 1628
    goto :goto_3b

    .line 1629
    :cond_61
    const/4 v2, 0x0

    .line 1630
    :goto_3b
    invoke-virtual {v4, v0}, Lv4/a1;->d(Lv4/h0;)Lv4/e;

    .line 1631
    .line 1632
    .line 1633
    move-result-object v4

    .line 1634
    if-eqz v4, :cond_63

    .line 1635
    .line 1636
    invoke-virtual {v4}, Lv4/e;->j()Z

    .line 1637
    .line 1638
    .line 1639
    move-result v5

    .line 1640
    if-nez v5, :cond_63

    .line 1641
    .line 1642
    invoke-virtual {v4}, Lv4/e;->l()Z

    .line 1643
    .line 1644
    .line 1645
    move-result v5

    .line 1646
    if-nez v5, :cond_63

    .line 1647
    .line 1648
    invoke-virtual {v4}, Lv4/e;->k()Z

    .line 1649
    .line 1650
    .line 1651
    move-result v4

    .line 1652
    if-eqz v4, :cond_62

    .line 1653
    .line 1654
    goto :goto_3c

    .line 1655
    :cond_62
    const/4 v4, 0x0

    .line 1656
    goto :goto_3d

    .line 1657
    :cond_63
    :goto_3c
    const/4 v4, 0x1

    .line 1658
    :goto_3d
    invoke-virtual {v1, v8, v4}, Lv4/c0;->A(IZ)V

    .line 1659
    .line 1660
    .line 1661
    if-eqz v3, :cond_64

    .line 1662
    .line 1663
    if-eqz v4, :cond_64

    .line 1664
    .line 1665
    const/4 v3, 0x1

    .line 1666
    goto :goto_3e

    .line 1667
    :cond_64
    const/4 v3, 0x0

    .line 1668
    :goto_3e
    if-nez v4, :cond_65

    .line 1669
    .line 1670
    invoke-virtual {v1, v8}, Lv4/c0;->z(I)V

    .line 1671
    .line 1672
    .line 1673
    :cond_65
    :goto_3f
    add-int/lit8 v8, v8, 0x1

    .line 1674
    .line 1675
    goto/16 :goto_37

    .line 1676
    .line 1677
    :cond_66
    iget-object v2, v0, Lv4/h0;->a:Ljava/lang/Object;

    .line 1678
    .line 1679
    invoke-interface {v2}, Lj5/b0;->f()V

    .line 1680
    .line 1681
    .line 1682
    const/4 v2, 0x1

    .line 1683
    const/4 v3, 0x1

    .line 1684
    :cond_67
    iget-object v4, v0, Lv4/h0;->g:Lv4/i0;

    .line 1685
    .line 1686
    iget-wide v4, v4, Lv4/i0;->e:J

    .line 1687
    .line 1688
    if-eqz v2, :cond_69

    .line 1689
    .line 1690
    iget-boolean v2, v0, Lv4/h0;->e:Z

    .line 1691
    .line 1692
    if-eqz v2, :cond_69

    .line 1693
    .line 1694
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    cmp-long v2, v4, v6

    .line 1700
    .line 1701
    if-eqz v2, :cond_68

    .line 1702
    .line 1703
    iget-object v2, v1, Lv4/c0;->z:Lv4/u0;

    .line 1704
    .line 1705
    iget-wide v8, v2, Lv4/u0;->s:J

    .line 1706
    .line 1707
    cmp-long v2, v4, v8

    .line 1708
    .line 1709
    if-gtz v2, :cond_6a

    .line 1710
    .line 1711
    :cond_68
    const/4 v8, 0x1

    .line 1712
    goto :goto_40

    .line 1713
    :cond_69
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    :cond_6a
    const/4 v8, 0x0

    .line 1719
    :goto_40
    if-eqz v8, :cond_6b

    .line 1720
    .line 1721
    iget-boolean v2, v1, Lv4/c0;->D:Z

    .line 1722
    .line 1723
    if-eqz v2, :cond_6b

    .line 1724
    .line 1725
    const/4 v5, 0x0

    .line 1726
    iput-boolean v5, v1, Lv4/c0;->D:Z

    .line 1727
    .line 1728
    iget-object v2, v1, Lv4/c0;->z:Lv4/u0;

    .line 1729
    .line 1730
    iget v2, v2, Lv4/u0;->n:I

    .line 1731
    .line 1732
    const/4 v4, 0x5

    .line 1733
    invoke-virtual {v1, v5, v2, v5, v4}, Lv4/c0;->X(ZIZI)V

    .line 1734
    .line 1735
    .line 1736
    :cond_6b
    if-eqz v8, :cond_6d

    .line 1737
    .line 1738
    iget-object v2, v0, Lv4/h0;->g:Lv4/i0;

    .line 1739
    .line 1740
    iget-boolean v2, v2, Lv4/i0;->j:Z

    .line 1741
    .line 1742
    if-eqz v2, :cond_6d

    .line 1743
    .line 1744
    const/4 v5, 0x4

    .line 1745
    invoke-virtual {v1, v5}, Lv4/c0;->d0(I)V

    .line 1746
    .line 1747
    .line 1748
    invoke-virtual {v1}, Lv4/c0;->j0()V

    .line 1749
    .line 1750
    .line 1751
    :cond_6c
    const/4 v9, 0x1

    .line 1752
    goto/16 :goto_4a

    .line 1753
    .line 1754
    :cond_6d
    iget-object v2, v1, Lv4/c0;->z:Lv4/u0;

    .line 1755
    .line 1756
    iget v4, v2, Lv4/u0;->e:I

    .line 1757
    .line 1758
    const/4 v5, 0x2

    .line 1759
    if-ne v4, v5, :cond_79

    .line 1760
    .line 1761
    iget-object v4, v1, Lv4/c0;->r:Lv4/j0;

    .line 1762
    .line 1763
    iget v5, v1, Lv4/c0;->M:I

    .line 1764
    .line 1765
    if-nez v5, :cond_6e

    .line 1766
    .line 1767
    invoke-virtual {v1}, Lv4/c0;->v()Z

    .line 1768
    .line 1769
    .line 1770
    move-result v8

    .line 1771
    goto/16 :goto_46

    .line 1772
    .line 1773
    :cond_6e
    if-nez v3, :cond_70

    .line 1774
    .line 1775
    :cond_6f
    const/4 v8, 0x0

    .line 1776
    goto/16 :goto_46

    .line 1777
    .line 1778
    :cond_70
    iget-boolean v5, v2, Lv4/u0;->g:Z

    .line 1779
    .line 1780
    if-nez v5, :cond_72

    .line 1781
    .line 1782
    :cond_71
    :goto_41
    const/4 v8, 0x1

    .line 1783
    goto/16 :goto_46

    .line 1784
    .line 1785
    :cond_72
    iget-object v5, v4, Lv4/j0;->i:Lv4/h0;

    .line 1786
    .line 1787
    iget-object v2, v2, Lv4/u0;->a:Lm4/i1;

    .line 1788
    .line 1789
    iget-object v5, v5, Lv4/h0;->g:Lv4/i0;

    .line 1790
    .line 1791
    iget-object v5, v5, Lv4/i0;->a:Lj5/d0;

    .line 1792
    .line 1793
    invoke-virtual {v1, v2, v5}, Lv4/c0;->g0(Lm4/i1;Lj5/d0;)Z

    .line 1794
    .line 1795
    .line 1796
    move-result v2

    .line 1797
    if-eqz v2, :cond_73

    .line 1798
    .line 1799
    iget-object v2, v1, Lv4/c0;->t:Lv4/h;

    .line 1800
    .line 1801
    iget-wide v9, v2, Lv4/h;->h:J

    .line 1802
    .line 1803
    goto :goto_42

    .line 1804
    :cond_73
    move-wide v9, v6

    .line 1805
    :goto_42
    iget-object v2, v4, Lv4/j0;->l:Lv4/h0;

    .line 1806
    .line 1807
    invoke-virtual {v2}, Lv4/h0;->g()Z

    .line 1808
    .line 1809
    .line 1810
    move-result v4

    .line 1811
    if-eqz v4, :cond_74

    .line 1812
    .line 1813
    iget-object v4, v2, Lv4/h0;->g:Lv4/i0;

    .line 1814
    .line 1815
    iget-boolean v4, v4, Lv4/i0;->j:Z

    .line 1816
    .line 1817
    if-eqz v4, :cond_74

    .line 1818
    .line 1819
    const/4 v8, 0x1

    .line 1820
    goto :goto_43

    .line 1821
    :cond_74
    const/4 v8, 0x0

    .line 1822
    :goto_43
    iget-object v4, v2, Lv4/h0;->g:Lv4/i0;

    .line 1823
    .line 1824
    iget-object v4, v4, Lv4/i0;->a:Lj5/d0;

    .line 1825
    .line 1826
    invoke-virtual {v4}, Lj5/d0;->b()Z

    .line 1827
    .line 1828
    .line 1829
    move-result v4

    .line 1830
    if-eqz v4, :cond_75

    .line 1831
    .line 1832
    iget-boolean v4, v2, Lv4/h0;->e:Z

    .line 1833
    .line 1834
    if-nez v4, :cond_75

    .line 1835
    .line 1836
    const/4 v4, 0x1

    .line 1837
    goto :goto_44

    .line 1838
    :cond_75
    const/4 v4, 0x0

    .line 1839
    :goto_44
    if-nez v8, :cond_71

    .line 1840
    .line 1841
    if-eqz v4, :cond_76

    .line 1842
    .line 1843
    goto :goto_41

    .line 1844
    :cond_76
    invoke-virtual {v2}, Lv4/h0;->d()J

    .line 1845
    .line 1846
    .line 1847
    move-result-wide v4

    .line 1848
    invoke-virtual {v1, v4, v5}, Lv4/c0;->m(J)J

    .line 1849
    .line 1850
    .line 1851
    move-result-wide v4

    .line 1852
    iget-object v2, v1, Lv4/c0;->f:Lv4/j;

    .line 1853
    .line 1854
    iget-object v8, v1, Lv4/c0;->z:Lv4/u0;

    .line 1855
    .line 1856
    iget-object v8, v8, Lv4/u0;->a:Lm4/i1;

    .line 1857
    .line 1858
    iget-object v8, v1, Lv4/c0;->n:Lv4/k;

    .line 1859
    .line 1860
    invoke-virtual {v8}, Lv4/k;->e()Lm4/s0;

    .line 1861
    .line 1862
    .line 1863
    move-result-object v8

    .line 1864
    iget v8, v8, Lm4/s0;->a:F

    .line 1865
    .line 1866
    iget-object v13, v1, Lv4/c0;->z:Lv4/u0;

    .line 1867
    .line 1868
    iget-boolean v13, v13, Lv4/u0;->l:Z

    .line 1869
    .line 1870
    iget-boolean v13, v1, Lv4/c0;->E:Z

    .line 1871
    .line 1872
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1873
    .line 1874
    .line 1875
    invoke-static {v8, v4, v5}, Lp4/c0;->C(FJ)J

    .line 1876
    .line 1877
    .line 1878
    move-result-wide v4

    .line 1879
    if-eqz v13, :cond_77

    .line 1880
    .line 1881
    iget-wide v13, v2, Lv4/j;->e:J

    .line 1882
    .line 1883
    goto :goto_45

    .line 1884
    :cond_77
    iget-wide v13, v2, Lv4/j;->d:J

    .line 1885
    .line 1886
    :goto_45
    cmp-long v8, v9, v6

    .line 1887
    .line 1888
    if-eqz v8, :cond_78

    .line 1889
    .line 1890
    const-wide/16 v21, 0x2

    .line 1891
    .line 1892
    div-long v9, v9, v21

    .line 1893
    .line 1894
    invoke-static {v9, v10, v13, v14}, Ljava/lang/Math;->min(JJ)J

    .line 1895
    .line 1896
    .line 1897
    move-result-wide v13

    .line 1898
    :cond_78
    const-wide/16 v8, 0x0

    .line 1899
    .line 1900
    cmp-long v10, v13, v8

    .line 1901
    .line 1902
    if-lez v10, :cond_71

    .line 1903
    .line 1904
    cmp-long v8, v4, v13

    .line 1905
    .line 1906
    if-gez v8, :cond_71

    .line 1907
    .line 1908
    iget-boolean v4, v2, Lv4/j;->g:Z

    .line 1909
    .line 1910
    if-nez v4, :cond_6f

    .line 1911
    .line 1912
    iget-object v4, v2, Lv4/j;->a:Ln5/f;

    .line 1913
    .line 1914
    monitor-enter v4

    .line 1915
    :try_start_0
    iget v5, v4, Ln5/f;->d:I

    .line 1916
    .line 1917
    iget v8, v4, Ln5/f;->b:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1918
    .line 1919
    mul-int v5, v5, v8

    .line 1920
    .line 1921
    monitor-exit v4

    .line 1922
    invoke-virtual {v2}, Lv4/j;->b()I

    .line 1923
    .line 1924
    .line 1925
    move-result v2

    .line 1926
    if-lt v5, v2, :cond_6f

    .line 1927
    .line 1928
    goto/16 :goto_41

    .line 1929
    .line 1930
    :catchall_0
    move-exception v0

    .line 1931
    :try_start_1
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1932
    throw v0

    .line 1933
    :goto_46
    if-eqz v8, :cond_79

    .line 1934
    .line 1935
    invoke-virtual {v1, v15}, Lv4/c0;->d0(I)V

    .line 1936
    .line 1937
    .line 1938
    const/4 v2, 0x0

    .line 1939
    iput-object v2, v1, Lv4/c0;->S:Lv4/m;

    .line 1940
    .line 1941
    invoke-virtual {v1}, Lv4/c0;->f0()Z

    .line 1942
    .line 1943
    .line 1944
    move-result v2

    .line 1945
    if-eqz v2, :cond_6c

    .line 1946
    .line 1947
    const/4 v5, 0x0

    .line 1948
    invoke-virtual {v1, v5, v5}, Lv4/c0;->p0(ZZ)V

    .line 1949
    .line 1950
    .line 1951
    iget-object v2, v1, Lv4/c0;->n:Lv4/k;

    .line 1952
    .line 1953
    const/4 v9, 0x1

    .line 1954
    iput-boolean v9, v2, Lv4/k;->f:Z

    .line 1955
    .line 1956
    iget-object v2, v2, Lv4/k;->a:Lv4/c1;

    .line 1957
    .line 1958
    invoke-virtual {v2}, Lv4/c1;->f()V

    .line 1959
    .line 1960
    .line 1961
    invoke-virtual {v1}, Lv4/c0;->h0()V

    .line 1962
    .line 1963
    .line 1964
    goto :goto_4a

    .line 1965
    :cond_79
    const/4 v9, 0x1

    .line 1966
    iget-object v2, v1, Lv4/c0;->z:Lv4/u0;

    .line 1967
    .line 1968
    iget v2, v2, Lv4/u0;->e:I

    .line 1969
    .line 1970
    if-ne v2, v15, :cond_82

    .line 1971
    .line 1972
    iget v2, v1, Lv4/c0;->M:I

    .line 1973
    .line 1974
    if-nez v2, :cond_7a

    .line 1975
    .line 1976
    invoke-virtual {v1}, Lv4/c0;->v()Z

    .line 1977
    .line 1978
    .line 1979
    move-result v2

    .line 1980
    if-eqz v2, :cond_7b

    .line 1981
    .line 1982
    goto :goto_4a

    .line 1983
    :cond_7a
    if-nez v3, :cond_82

    .line 1984
    .line 1985
    :cond_7b
    invoke-virtual {v1}, Lv4/c0;->f0()Z

    .line 1986
    .line 1987
    .line 1988
    move-result v2

    .line 1989
    const/4 v5, 0x0

    .line 1990
    invoke-virtual {v1, v2, v5}, Lv4/c0;->p0(ZZ)V

    .line 1991
    .line 1992
    .line 1993
    const/4 v5, 0x2

    .line 1994
    invoke-virtual {v1, v5}, Lv4/c0;->d0(I)V

    .line 1995
    .line 1996
    .line 1997
    iget-boolean v2, v1, Lv4/c0;->E:Z

    .line 1998
    .line 1999
    if-eqz v2, :cond_81

    .line 2000
    .line 2001
    iget-object v2, v1, Lv4/c0;->r:Lv4/j0;

    .line 2002
    .line 2003
    iget-object v2, v2, Lv4/j0;->i:Lv4/h0;

    .line 2004
    .line 2005
    :goto_47
    if-eqz v2, :cond_7e

    .line 2006
    .line 2007
    iget-object v3, v2, Lv4/h0;->o:Lm5/u;

    .line 2008
    .line 2009
    iget-object v3, v3, Lm5/u;->c:[Lm5/r;

    .line 2010
    .line 2011
    array-length v4, v3

    .line 2012
    const/4 v8, 0x0

    .line 2013
    :goto_48
    if-ge v8, v4, :cond_7d

    .line 2014
    .line 2015
    aget-object v5, v3, v8

    .line 2016
    .line 2017
    if-eqz v5, :cond_7c

    .line 2018
    .line 2019
    invoke-interface {v5}, Lm5/r;->t()V

    .line 2020
    .line 2021
    .line 2022
    :cond_7c
    add-int/lit8 v8, v8, 0x1

    .line 2023
    .line 2024
    goto :goto_48

    .line 2025
    :cond_7d
    iget-object v2, v2, Lv4/h0;->m:Lv4/h0;

    .line 2026
    .line 2027
    goto :goto_47

    .line 2028
    :cond_7e
    iget-object v2, v1, Lv4/c0;->t:Lv4/h;

    .line 2029
    .line 2030
    iget-wide v3, v2, Lv4/h;->h:J

    .line 2031
    .line 2032
    cmp-long v5, v3, v6

    .line 2033
    .line 2034
    if-nez v5, :cond_7f

    .line 2035
    .line 2036
    goto :goto_49

    .line 2037
    :cond_7f
    iget-wide v13, v2, Lv4/h;->b:J

    .line 2038
    .line 2039
    add-long/2addr v3, v13

    .line 2040
    iput-wide v3, v2, Lv4/h;->h:J

    .line 2041
    .line 2042
    iget-wide v13, v2, Lv4/h;->g:J

    .line 2043
    .line 2044
    cmp-long v5, v13, v6

    .line 2045
    .line 2046
    if-eqz v5, :cond_80

    .line 2047
    .line 2048
    cmp-long v5, v3, v13

    .line 2049
    .line 2050
    if-lez v5, :cond_80

    .line 2051
    .line 2052
    iput-wide v13, v2, Lv4/h;->h:J

    .line 2053
    .line 2054
    :cond_80
    iput-wide v6, v2, Lv4/h;->l:J

    .line 2055
    .line 2056
    :cond_81
    :goto_49
    invoke-virtual {v1}, Lv4/c0;->j0()V

    .line 2057
    .line 2058
    .line 2059
    :cond_82
    :goto_4a
    iget-object v2, v1, Lv4/c0;->z:Lv4/u0;

    .line 2060
    .line 2061
    iget v2, v2, Lv4/u0;->e:I

    .line 2062
    .line 2063
    const/4 v5, 0x2

    .line 2064
    if-ne v2, v5, :cond_86

    .line 2065
    .line 2066
    const/4 v8, 0x0

    .line 2067
    :goto_4b
    iget-object v2, v1, Lv4/c0;->a:[Lv4/a1;

    .line 2068
    .line 2069
    array-length v3, v2

    .line 2070
    if-ge v8, v3, :cond_85

    .line 2071
    .line 2072
    aget-object v2, v2, v8

    .line 2073
    .line 2074
    invoke-virtual {v2, v0}, Lv4/a1;->d(Lv4/h0;)Lv4/e;

    .line 2075
    .line 2076
    .line 2077
    move-result-object v2

    .line 2078
    if-eqz v2, :cond_83

    .line 2079
    .line 2080
    const/4 v2, 0x1

    .line 2081
    goto :goto_4c

    .line 2082
    :cond_83
    const/4 v2, 0x0

    .line 2083
    :goto_4c
    if-eqz v2, :cond_84

    .line 2084
    .line 2085
    invoke-virtual {v1, v8}, Lv4/c0;->z(I)V

    .line 2086
    .line 2087
    .line 2088
    :cond_84
    add-int/lit8 v8, v8, 0x1

    .line 2089
    .line 2090
    goto :goto_4b

    .line 2091
    :cond_85
    iget-object v0, v1, Lv4/c0;->z:Lv4/u0;

    .line 2092
    .line 2093
    iget-boolean v2, v0, Lv4/u0;->g:Z

    .line 2094
    .line 2095
    if-nez v2, :cond_86

    .line 2096
    .line 2097
    iget-wide v2, v0, Lv4/u0;->r:J

    .line 2098
    .line 2099
    const-wide/32 v4, 0x7a120

    .line 2100
    .line 2101
    .line 2102
    cmp-long v0, v2, v4

    .line 2103
    .line 2104
    if-gez v0, :cond_86

    .line 2105
    .line 2106
    iget-object v0, v1, Lv4/c0;->r:Lv4/j0;

    .line 2107
    .line 2108
    iget-object v0, v0, Lv4/j0;->l:Lv4/h0;

    .line 2109
    .line 2110
    invoke-static {v0}, Lv4/c0;->u(Lv4/h0;)Z

    .line 2111
    .line 2112
    .line 2113
    move-result v0

    .line 2114
    if-eqz v0, :cond_86

    .line 2115
    .line 2116
    invoke-virtual {v1}, Lv4/c0;->f0()Z

    .line 2117
    .line 2118
    .line 2119
    move-result v0

    .line 2120
    if-eqz v0, :cond_86

    .line 2121
    .line 2122
    const/4 v8, 0x1

    .line 2123
    goto :goto_4d

    .line 2124
    :cond_86
    const/4 v8, 0x0

    .line 2125
    :goto_4d
    if-nez v8, :cond_87

    .line 2126
    .line 2127
    iput-wide v6, v1, Lv4/c0;->T:J

    .line 2128
    .line 2129
    goto :goto_4e

    .line 2130
    :cond_87
    iget-wide v2, v1, Lv4/c0;->T:J

    .line 2131
    .line 2132
    cmp-long v0, v2, v6

    .line 2133
    .line 2134
    if-nez v0, :cond_88

    .line 2135
    .line 2136
    iget-object v0, v1, Lv4/c0;->p:Lp4/v;

    .line 2137
    .line 2138
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2139
    .line 2140
    .line 2141
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 2142
    .line 2143
    .line 2144
    move-result-wide v2

    .line 2145
    iput-wide v2, v1, Lv4/c0;->T:J

    .line 2146
    .line 2147
    goto :goto_4e

    .line 2148
    :cond_88
    iget-object v0, v1, Lv4/c0;->p:Lp4/v;

    .line 2149
    .line 2150
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2151
    .line 2152
    .line 2153
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 2154
    .line 2155
    .line 2156
    move-result-wide v2

    .line 2157
    iget-wide v4, v1, Lv4/c0;->T:J

    .line 2158
    .line 2159
    sub-long/2addr v2, v4

    .line 2160
    const-wide/16 v4, 0xfa0

    .line 2161
    .line 2162
    cmp-long v0, v2, v4

    .line 2163
    .line 2164
    if-gez v0, :cond_8f

    .line 2165
    .line 2166
    :goto_4e
    invoke-virtual {v1}, Lv4/c0;->f0()Z

    .line 2167
    .line 2168
    .line 2169
    move-result v0

    .line 2170
    if-eqz v0, :cond_89

    .line 2171
    .line 2172
    iget-object v0, v1, Lv4/c0;->z:Lv4/u0;

    .line 2173
    .line 2174
    iget v0, v0, Lv4/u0;->e:I

    .line 2175
    .line 2176
    if-ne v0, v15, :cond_89

    .line 2177
    .line 2178
    const/4 v8, 0x1

    .line 2179
    goto :goto_4f

    .line 2180
    :cond_89
    const/4 v8, 0x0

    .line 2181
    :goto_4f
    iget-boolean v0, v1, Lv4/c0;->L:Z

    .line 2182
    .line 2183
    if-eqz v0, :cond_8a

    .line 2184
    .line 2185
    iget-boolean v0, v1, Lv4/c0;->K:Z

    .line 2186
    .line 2187
    if-eqz v0, :cond_8a

    .line 2188
    .line 2189
    if-eqz v8, :cond_8a

    .line 2190
    .line 2191
    goto :goto_50

    .line 2192
    :cond_8a
    const/4 v9, 0x0

    .line 2193
    :goto_50
    iget-object v0, v1, Lv4/c0;->z:Lv4/u0;

    .line 2194
    .line 2195
    iget-boolean v2, v0, Lv4/u0;->p:Z

    .line 2196
    .line 2197
    if-eq v2, v9, :cond_8b

    .line 2198
    .line 2199
    new-instance v21, Lv4/u0;

    .line 2200
    .line 2201
    iget-object v2, v0, Lv4/u0;->a:Lm4/i1;

    .line 2202
    .line 2203
    iget-object v3, v0, Lv4/u0;->b:Lj5/d0;

    .line 2204
    .line 2205
    iget-wide v4, v0, Lv4/u0;->c:J

    .line 2206
    .line 2207
    iget-wide v6, v0, Lv4/u0;->d:J

    .line 2208
    .line 2209
    iget v10, v0, Lv4/u0;->e:I

    .line 2210
    .line 2211
    iget-object v13, v0, Lv4/u0;->f:Lv4/m;

    .line 2212
    .line 2213
    iget-boolean v14, v0, Lv4/u0;->g:Z

    .line 2214
    .line 2215
    iget-object v15, v0, Lv4/u0;->h:Lj5/o1;

    .line 2216
    .line 2217
    move-object/from16 v22, v2

    .line 2218
    .line 2219
    iget-object v2, v0, Lv4/u0;->i:Lm5/u;

    .line 2220
    .line 2221
    move-object/from16 v32, v2

    .line 2222
    .line 2223
    iget-object v2, v0, Lv4/u0;->j:Ljava/util/List;

    .line 2224
    .line 2225
    move-object/from16 v33, v2

    .line 2226
    .line 2227
    iget-object v2, v0, Lv4/u0;->k:Lj5/d0;

    .line 2228
    .line 2229
    move-object/from16 v34, v2

    .line 2230
    .line 2231
    iget-boolean v2, v0, Lv4/u0;->l:Z

    .line 2232
    .line 2233
    move/from16 v35, v2

    .line 2234
    .line 2235
    iget v2, v0, Lv4/u0;->m:I

    .line 2236
    .line 2237
    move/from16 v36, v2

    .line 2238
    .line 2239
    iget v2, v0, Lv4/u0;->n:I

    .line 2240
    .line 2241
    move/from16 v37, v2

    .line 2242
    .line 2243
    iget-object v2, v0, Lv4/u0;->o:Lm4/s0;

    .line 2244
    .line 2245
    move-object/from16 v38, v2

    .line 2246
    .line 2247
    move-object/from16 v23, v3

    .line 2248
    .line 2249
    iget-wide v2, v0, Lv4/u0;->q:J

    .line 2250
    .line 2251
    move-wide/from16 v39, v2

    .line 2252
    .line 2253
    iget-wide v2, v0, Lv4/u0;->r:J

    .line 2254
    .line 2255
    move-wide/from16 v41, v2

    .line 2256
    .line 2257
    iget-wide v2, v0, Lv4/u0;->s:J

    .line 2258
    .line 2259
    move-wide/from16 v43, v2

    .line 2260
    .line 2261
    iget-wide v2, v0, Lv4/u0;->t:J

    .line 2262
    .line 2263
    move-wide/from16 v45, v2

    .line 2264
    .line 2265
    move-wide/from16 v24, v4

    .line 2266
    .line 2267
    move-wide/from16 v26, v6

    .line 2268
    .line 2269
    move/from16 v47, v9

    .line 2270
    .line 2271
    move/from16 v28, v10

    .line 2272
    .line 2273
    move-object/from16 v29, v13

    .line 2274
    .line 2275
    move/from16 v30, v14

    .line 2276
    .line 2277
    move-object/from16 v31, v15

    .line 2278
    .line 2279
    invoke-direct/range {v21 .. v47}, Lv4/u0;-><init>(Lm4/i1;Lj5/d0;JJILv4/m;ZLj5/o1;Lm5/u;Ljava/util/List;Lj5/d0;ZIILm4/s0;JJJJZ)V

    .line 2280
    .line 2281
    .line 2282
    move-object/from16 v0, v21

    .line 2283
    .line 2284
    iput-object v0, v1, Lv4/c0;->z:Lv4/u0;

    .line 2285
    .line 2286
    :goto_51
    const/4 v5, 0x0

    .line 2287
    goto :goto_52

    .line 2288
    :cond_8b
    move/from16 v47, v9

    .line 2289
    .line 2290
    goto :goto_51

    .line 2291
    :goto_52
    iput-boolean v5, v1, Lv4/c0;->K:Z

    .line 2292
    .line 2293
    if-nez v47, :cond_8e

    .line 2294
    .line 2295
    iget-object v0, v1, Lv4/c0;->z:Lv4/u0;

    .line 2296
    .line 2297
    iget v0, v0, Lv4/u0;->e:I

    .line 2298
    .line 2299
    const/4 v5, 0x4

    .line 2300
    if-ne v0, v5, :cond_8c

    .line 2301
    .line 2302
    goto :goto_53

    .line 2303
    :cond_8c
    if-nez v8, :cond_8d

    .line 2304
    .line 2305
    const/4 v5, 0x2

    .line 2306
    if-eq v0, v5, :cond_8d

    .line 2307
    .line 2308
    const/4 v15, 0x3

    .line 2309
    if-ne v0, v15, :cond_8e

    .line 2310
    .line 2311
    iget v0, v1, Lv4/c0;->M:I

    .line 2312
    .line 2313
    if-eqz v0, :cond_8e

    .line 2314
    .line 2315
    :cond_8d
    invoke-virtual {v1, v11, v12}, Lv4/c0;->O(J)V

    .line 2316
    .line 2317
    .line 2318
    :cond_8e
    :goto_53
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 2319
    .line 2320
    .line 2321
    return-void

    .line 2322
    :cond_8f
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2323
    .line 2324
    const-string v2, "Playback stuck buffering and not loading"

    .line 2325
    .line 2326
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 2327
    .line 2328
    .line 2329
    throw v0

    .line 2330
    :cond_90
    :goto_54
    return-void
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
    .line 2451
    .line 2452
    .line 2453
    .line 2454
    .line 2455
    .line 2456
    .line 2457
    .line 2458
    .line 2459
    .line 2460
    .line 2461
    .line 2462
    .line 2463
    .line 2464
    .line 2465
    .line 2466
    .line 2467
    .line 2468
    .line 2469
    .line 2470
    .line 2471
    .line 2472
    .line 2473
    .line 2474
    .line 2475
    .line 2476
    .line 2477
    .line 2478
    .line 2479
    .line 2480
    .line 2481
    .line 2482
    .line 2483
    .line 2484
    .line 2485
    .line 2486
    .line 2487
    .line 2488
    .line 2489
    .line 2490
    .line 2491
    .line 2492
    .line 2493
    .line 2494
    .line 2495
    .line 2496
    .line 2497
    .line 2498
    .line 2499
    .line 2500
    .line 2501
    .line 2502
    .line 2503
    .line 2504
    .line 2505
    .line 2506
    .line 2507
    .line 2508
    .line 2509
    .line 2510
    .line 2511
    .line 2512
    .line 2513
    .line 2514
    .line 2515
    .line 2516
    .line 2517
    .line 2518
    .line 2519
    .line 2520
    .line 2521
    .line 2522
    .line 2523
    .line 2524
    .line 2525
    .line 2526
    .line 2527
    .line 2528
    .line 2529
    .line 2530
    .line 2531
    .line 2532
    .line 2533
    .line 2534
    .line 2535
    .line 2536
    .line 2537
    .line 2538
    .line 2539
    .line 2540
    .line 2541
    .line 2542
    .line 2543
    .line 2544
    .line 2545
    .line 2546
    .line 2547
    .line 2548
    .line 2549
    .line 2550
    .line 2551
    .line 2552
    .line 2553
    .line 2554
    .line 2555
    .line 2556
    .line 2557
    .line 2558
    .line 2559
    .line 2560
    .line 2561
    .line 2562
    .line 2563
    .line 2564
    .line 2565
    .line 2566
    .line 2567
    .line 2568
    .line 2569
    .line 2570
    .line 2571
    .line 2572
    .line 2573
    .line 2574
    .line 2575
    .line 2576
    .line 2577
    .line 2578
    .line 2579
    .line 2580
    .line 2581
    .line 2582
    .line 2583
    .line 2584
    .line 2585
    .line 2586
    .line 2587
    .line 2588
    .line 2589
    .line 2590
    .line 2591
    .line 2592
    .line 2593
    .line 2594
    .line 2595
    .line 2596
    .line 2597
    .line 2598
    .line 2599
    .line 2600
    .line 2601
    .line 2602
    .line 2603
    .line 2604
    .line 2605
    .line 2606
    .line 2607
    .line 2608
    .line 2609
    .line 2610
    .line 2611
    .line 2612
    .line 2613
    .line 2614
    .line 2615
    .line 2616
    .line 2617
    .line 2618
    .line 2619
    .line 2620
    .line 2621
    .line 2622
    .line 2623
    .line 2624
    .line 2625
    .line 2626
    .line 2627
    .line 2628
    .line 2629
    .line 2630
    .line 2631
    .line 2632
    .line 2633
    .line 2634
    .line 2635
    .line 2636
    .line 2637
    .line 2638
    .line 2639
    .line 2640
    .line 2641
    .line 2642
    .line 2643
    .line 2644
    .line 2645
    .line 2646
    .line 2647
    .line 2648
    .line 2649
    .line 2650
    .line 2651
    .line 2652
    .line 2653
    .line 2654
    .line 2655
    .line 2656
    .line 2657
    .line 2658
    .line 2659
    .line 2660
    .line 2661
    .line 2662
    .line 2663
    .line 2664
    .line 2665
    .line 2666
    .line 2667
    .line 2668
    .line 2669
    .line 2670
    .line 2671
    .line 2672
    .line 2673
    .line 2674
    .line 2675
    .line 2676
    .line 2677
    .line 2678
    .line 2679
    .line 2680
    .line 2681
    .line 2682
    .line 2683
    .line 2684
    .line 2685
    .line 2686
    .line 2687
    .line 2688
    .line 2689
    .line 2690
    .line 2691
    .line 2692
    .line 2693
    .line 2694
    .line 2695
    .line 2696
    .line 2697
    .line 2698
    .line 2699
    .line 2700
    .line 2701
    .line 2702
    .line 2703
    .line 2704
    .line 2705
    .line 2706
    .line 2707
    .line 2708
    .line 2709
    .line 2710
    .line 2711
    .line 2712
    .line 2713
    .line 2714
    .line 2715
    .line 2716
    .line 2717
    .line 2718
    .line 2719
    .line 2720
    .line 2721
    .line 2722
    .line 2723
    .line 2724
    .line 2725
    .line 2726
    .line 2727
    .line 2728
    .line 2729
    .line 2730
    .line 2731
    .line 2732
    .line 2733
    .line 2734
    .line 2735
    .line 2736
    .line 2737
    .line 2738
    .line 2739
    .line 2740
    .line 2741
    .line 2742
    .line 2743
    .line 2744
    .line 2745
    .line 2746
    .line 2747
    .line 2748
    .line 2749
    .line 2750
    .line 2751
    .line 2752
    .line 2753
    .line 2754
    .line 2755
    .line 2756
    .line 2757
    .line 2758
    .line 2759
    .line 2760
    .line 2761
    .line 2762
    .line 2763
    .line 2764
    .line 2765
    .line 2766
    .line 2767
    .line 2768
    .line 2769
    .line 2770
    .line 2771
    .line 2772
    .line 2773
    .line 2774
    .line 2775
    .line 2776
    .line 2777
    .line 2778
    .line 2779
    .line 2780
    .line 2781
    .line 2782
    .line 2783
    .line 2784
    .line 2785
    .line 2786
    .line 2787
    .line 2788
    .line 2789
    .line 2790
    .line 2791
    .line 2792
    .line 2793
    .line 2794
    .line 2795
    .line 2796
    .line 2797
    .line 2798
    .line 2799
    .line 2800
    .line 2801
    .line 2802
    .line 2803
    .line 2804
    .line 2805
    .line 2806
    .line 2807
    .line 2808
    .line 2809
    .line 2810
    .line 2811
    .line 2812
    .line 2813
    .line 2814
    .line 2815
    .line 2816
    .line 2817
    .line 2818
    .line 2819
    .line 2820
    .line 2821
    .line 2822
    .line 2823
    .line 2824
    .line 2825
    .line 2826
    .line 2827
    .line 2828
    .line 2829
    .line 2830
    .line 2831
    .line 2832
    .line 2833
    .line 2834
    .line 2835
    .line 2836
    .line 2837
    .line 2838
    .line 2839
    .line 2840
    .line 2841
    .line 2842
    .line 2843
    .line 2844
    .line 2845
    .line 2846
    .line 2847
    .line 2848
    .line 2849
    .line 2850
    .line 2851
    .line 2852
    .line 2853
    .line 2854
    .line 2855
    .line 2856
    .line 2857
    .line 2858
    .line 2859
    .line 2860
    .line 2861
    .line 2862
    .line 2863
    .line 2864
    .line 2865
    .line 2866
    .line 2867
    .line 2868
    .line 2869
    .line 2870
    .line 2871
    .line 2872
    .line 2873
    .line 2874
    .line 2875
    .line 2876
    .line 2877
    .line 2878
    .line 2879
    .line 2880
    .line 2881
    .line 2882
    .line 2883
    .line 2884
    .line 2885
    .line 2886
    .line 2887
    .line 2888
    .line 2889
    .line 2890
    .line 2891
    .line 2892
    .line 2893
    .line 2894
    .line 2895
    .line 2896
    .line 2897
    .line 2898
    .line 2899
    .line 2900
    .line 2901
    .line 2902
    .line 2903
    .line 2904
    .line 2905
    .line 2906
    .line 2907
    .line 2908
    .line 2909
    .line 2910
    .line 2911
    .line 2912
    .line 2913
    .line 2914
    .line 2915
    .line 2916
    .line 2917
    .line 2918
    .line 2919
    .line 2920
    .line 2921
    .line 2922
    .line 2923
    .line 2924
    .line 2925
    .line 2926
    .line 2927
    .line 2928
    .line 2929
    .line 2930
    .line 2931
    .line 2932
    .line 2933
    .line 2934
    .line 2935
    .line 2936
    .line 2937
    .line 2938
    .line 2939
    .line 2940
    .line 2941
    .line 2942
    .line 2943
    .line 2944
    .line 2945
    .line 2946
    .line 2947
    .line 2948
    .line 2949
    .line 2950
    .line 2951
    .line 2952
    .line 2953
    .line 2954
    .line 2955
    .line 2956
    .line 2957
    .line 2958
    .line 2959
    .line 2960
    .line 2961
    .line 2962
    .line 2963
    .line 2964
    .line 2965
    .line 2966
    .line 2967
    .line 2968
    .line 2969
    .line 2970
    .line 2971
    .line 2972
    .line 2973
    .line 2974
    .line 2975
    .line 2976
    .line 2977
    .line 2978
    .line 2979
    .line 2980
    .line 2981
    .line 2982
    .line 2983
    .line 2984
    .line 2985
    .line 2986
    .line 2987
    .line 2988
    .line 2989
    .line 2990
    .line 2991
    .line 2992
    .line 2993
    .line 2994
    .line 2995
    .line 2996
    .line 2997
    .line 2998
    .line 2999
    .line 3000
    .line 3001
    .line 3002
    .line 3003
    .line 3004
    .line 3005
    .line 3006
    .line 3007
    .line 3008
    .line 3009
    .line 3010
    .line 3011
    .line 3012
    .line 3013
    .line 3014
    .line 3015
    .line 3016
    .line 3017
    .line 3018
    .line 3019
    .line 3020
    .line 3021
    .line 3022
    .line 3023
    .line 3024
    .line 3025
    .line 3026
    .line 3027
    .line 3028
    .line 3029
    .line 3030
    .line 3031
    .line 3032
    .line 3033
    .line 3034
    .line 3035
    .line 3036
    .line 3037
    .line 3038
    .line 3039
    .line 3040
    .line 3041
    .line 3042
    .line 3043
    .line 3044
    .line 3045
    .line 3046
    .line 3047
    .line 3048
    .line 3049
    .line 3050
    .line 3051
    .line 3052
    .line 3053
    .line 3054
    .line 3055
    .line 3056
    .line 3057
    .line 3058
    .line 3059
    .line 3060
    .line 3061
    .line 3062
    .line 3063
    .line 3064
    .line 3065
    .line 3066
    .line 3067
    .line 3068
    .line 3069
    .line 3070
    .line 3071
    .line 3072
    .line 3073
    .line 3074
    .line 3075
    .line 3076
    .line 3077
    .line 3078
    .line 3079
    .line 3080
    .line 3081
    .line 3082
    .line 3083
    .line 3084
    .line 3085
    .line 3086
    .line 3087
    .line 3088
    .line 3089
    .line 3090
    .line 3091
    .line 3092
    .line 3093
    .line 3094
    .line 3095
    .line 3096
    .line 3097
    .line 3098
    .line 3099
    .line 3100
    .line 3101
    .line 3102
    .line 3103
    .line 3104
    .line 3105
    .line 3106
    .line 3107
    .line 3108
    .line 3109
    .line 3110
    .line 3111
    .line 3112
    .line 3113
    .line 3114
    .line 3115
    .line 3116
    .line 3117
    .line 3118
    .line 3119
    .line 3120
    .line 3121
    .line 3122
    .line 3123
    .line 3124
    .line 3125
    .line 3126
    .line 3127
    .line 3128
    .line 3129
    .line 3130
    .line 3131
    .line 3132
    .line 3133
    .line 3134
    .line 3135
    .line 3136
    .line 3137
    .line 3138
    .line 3139
    .line 3140
    .line 3141
    .line 3142
    .line 3143
    .line 3144
    .line 3145
    .line 3146
    .line 3147
    .line 3148
    .line 3149
    .line 3150
    .line 3151
    .line 3152
    .line 3153
    .line 3154
    .line 3155
    .line 3156
    .line 3157
    .line 3158
    .line 3159
    .line 3160
    .line 3161
    .line 3162
    .line 3163
    .line 3164
    .line 3165
    .line 3166
    .line 3167
    .line 3168
    .line 3169
    .line 3170
    .line 3171
    .line 3172
    .line 3173
    .line 3174
    .line 3175
    .line 3176
    .line 3177
    .line 3178
    .line 3179
    .line 3180
    .line 3181
    .line 3182
    .line 3183
    .line 3184
    .line 3185
    .line 3186
    .line 3187
    .line 3188
    .line 3189
    .line 3190
    .line 3191
    .line 3192
    .line 3193
    .line 3194
    .line 3195
    .line 3196
    .line 3197
    .line 3198
    .line 3199
    .line 3200
    .line 3201
    .line 3202
    .line 3203
    .line 3204
    .line 3205
    .line 3206
    .line 3207
    .line 3208
    .line 3209
    .line 3210
    .line 3211
    .line 3212
    .line 3213
    .line 3214
    .line 3215
    .line 3216
    .line 3217
    .line 3218
    .line 3219
    .line 3220
    .line 3221
    .line 3222
    .line 3223
    .line 3224
    .line 3225
    .line 3226
    .line 3227
    .line 3228
    .line 3229
    .line 3230
    .line 3231
    .line 3232
    .line 3233
    .line 3234
    .line 3235
    .line 3236
    .line 3237
    .line 3238
    .line 3239
    .line 3240
    .line 3241
    .line 3242
    .line 3243
    .line 3244
    .line 3245
    .line 3246
    .line 3247
    .line 3248
    .line 3249
    .line 3250
    .line 3251
    .line 3252
    .line 3253
    .line 3254
    .line 3255
    .line 3256
    .line 3257
    .line 3258
    .line 3259
    .line 3260
    .line 3261
    .line 3262
    .line 3263
    .line 3264
    .line 3265
    .line 3266
    .line 3267
    .line 3268
    .line 3269
    .line 3270
    .line 3271
    .line 3272
    .line 3273
    .line 3274
    .line 3275
    .line 3276
    .line 3277
    .line 3278
    .line 3279
    .line 3280
    .line 3281
    .line 3282
    .line 3283
    .line 3284
    .line 3285
    .line 3286
    .line 3287
    .line 3288
    .line 3289
    .line 3290
    .line 3291
    .line 3292
    .line 3293
    .line 3294
    .line 3295
    .line 3296
    .line 3297
    .line 3298
    .line 3299
    .line 3300
    .line 3301
    .line 3302
    .line 3303
    .line 3304
    .line 3305
    .line 3306
    .line 3307
    .line 3308
    .line 3309
    .line 3310
    .line 3311
    .line 3312
    .line 3313
    .line 3314
    .line 3315
    .line 3316
    .line 3317
    .line 3318
    .line 3319
    .line 3320
    .line 3321
    .line 3322
    .line 3323
    .line 3324
    .line 3325
    .line 3326
    .line 3327
    .line 3328
    .line 3329
    .line 3330
    .line 3331
    .line 3332
    .line 3333
    .line 3334
    .line 3335
    .line 3336
    .line 3337
    .line 3338
    .line 3339
    .line 3340
    .line 3341
    .line 3342
    .line 3343
    .line 3344
    .line 3345
    .line 3346
    .line 3347
    .line 3348
    .line 3349
    .line 3350
    .line 3351
    .line 3352
    .line 3353
    .line 3354
    .line 3355
    .line 3356
    .line 3357
    .line 3358
    .line 3359
    .line 3360
    .line 3361
    .line 3362
    .line 3363
    .line 3364
    .line 3365
    .line 3366
    .line 3367
    .line 3368
    .line 3369
    .line 3370
    .line 3371
    .line 3372
    .line 3373
    .line 3374
    .line 3375
    .line 3376
    .line 3377
    .line 3378
    .line 3379
    .line 3380
    .line 3381
    .line 3382
    .line 3383
    .line 3384
    .line 3385
    .line 3386
    .line 3387
    .line 3388
    .line 3389
    .line 3390
    .line 3391
    .line 3392
    .line 3393
    .line 3394
    .line 3395
    .line 3396
    .line 3397
    .line 3398
    .line 3399
    .line 3400
    .line 3401
    .line 3402
    .line 3403
    .line 3404
    .line 3405
    .line 3406
    .line 3407
    .line 3408
    .line 3409
    .line 3410
    .line 3411
    .line 3412
    .line 3413
    .line 3414
    .line 3415
    .line 3416
    .line 3417
    .line 3418
    .line 3419
    .line 3420
    .line 3421
    .line 3422
    .line 3423
    .line 3424
    .line 3425
    .line 3426
    .line 3427
    .line 3428
    .line 3429
    .line 3430
    .line 3431
    .line 3432
    .line 3433
    .line 3434
    .line 3435
    .line 3436
    .line 3437
    .line 3438
    .line 3439
    .line 3440
    .line 3441
    .line 3442
    .line 3443
    .line 3444
    .line 3445
    .line 3446
    .line 3447
    .line 3448
    .line 3449
    .line 3450
    .line 3451
    .line 3452
    .line 3453
    .line 3454
    .line 3455
    .line 3456
    .line 3457
    .line 3458
    .line 3459
    .line 3460
    .line 3461
    .line 3462
    .line 3463
    .line 3464
    .line 3465
    .line 3466
    .line 3467
    .line 3468
    .line 3469
    .line 3470
    .line 3471
    .line 3472
    .line 3473
    .line 3474
    .line 3475
    .line 3476
    .line 3477
    .line 3478
    .line 3479
    .line 3480
    .line 3481
    .line 3482
    .line 3483
    .line 3484
    .line 3485
    .line 3486
    .line 3487
    .line 3488
    .line 3489
    .line 3490
    .line 3491
    .line 3492
    .line 3493
    .line 3494
    .line 3495
    .line 3496
    .line 3497
    .line 3498
    .line 3499
    .line 3500
    .line 3501
    .line 3502
    .line 3503
    .line 3504
    .line 3505
    .line 3506
    .line 3507
    .line 3508
    .line 3509
    .line 3510
    .line 3511
    .line 3512
    .line 3513
    .line 3514
    .line 3515
    .line 3516
    .line 3517
    .line 3518
    .line 3519
    .line 3520
    .line 3521
    .line 3522
    .line 3523
    .line 3524
    .line 3525
    .line 3526
    .line 3527
    .line 3528
    .line 3529
    .line 3530
    .line 3531
    .line 3532
    .line 3533
    .line 3534
    .line 3535
    .line 3536
    .line 3537
    .line 3538
    .line 3539
    .line 3540
    .line 3541
    .line 3542
    .line 3543
    .line 3544
    .line 3545
    .line 3546
    .line 3547
    .line 3548
    .line 3549
    .line 3550
    .line 3551
    .line 3552
    .line 3553
    .line 3554
    .line 3555
    .line 3556
    .line 3557
    .line 3558
    .line 3559
    .line 3560
    .line 3561
    .line 3562
    .line 3563
    .line 3564
    .line 3565
    .line 3566
    .line 3567
    .line 3568
    .line 3569
    .line 3570
    .line 3571
    .line 3572
    .line 3573
    .line 3574
    .line 3575
    .line 3576
    .line 3577
    .line 3578
    .line 3579
    .line 3580
    .line 3581
    .line 3582
    .line 3583
    .line 3584
    .line 3585
    .line 3586
    .line 3587
    .line 3588
    .line 3589
    .line 3590
    .line 3591
    .line 3592
    .line 3593
    .line 3594
    .line 3595
    .line 3596
    .line 3597
    .line 3598
    .line 3599
    .line 3600
    .line 3601
    .line 3602
    .line 3603
    .line 3604
    .line 3605
    .line 3606
    .line 3607
    .line 3608
    .line 3609
    .line 3610
    .line 3611
    .line 3612
    .line 3613
    .line 3614
    .line 3615
    .line 3616
    .line 3617
    .line 3618
    .line 3619
    .line 3620
    .line 3621
    .line 3622
    .line 3623
    .line 3624
    .line 3625
    .line 3626
    .line 3627
    .line 3628
    .line 3629
    .line 3630
    .line 3631
    .line 3632
    .line 3633
    .line 3634
    .line 3635
    .line 3636
    .line 3637
    .line 3638
    .line 3639
    .line 3640
    .line 3641
    .line 3642
    .line 3643
    .line 3644
    .line 3645
    .line 3646
    .line 3647
    .line 3648
    .line 3649
    .line 3650
    .line 3651
    .line 3652
    .line 3653
    .line 3654
    .line 3655
    .line 3656
    .line 3657
    .line 3658
    .line 3659
    .line 3660
    .line 3661
    .line 3662
    .line 3663
    .line 3664
    .line 3665
    .line 3666
    .line 3667
    .line 3668
    .line 3669
    .line 3670
    .line 3671
    .line 3672
    .line 3673
    .line 3674
    .line 3675
    .line 3676
    .line 3677
    .line 3678
    .line 3679
    .line 3680
    .line 3681
    .line 3682
    .line 3683
    .line 3684
    .line 3685
    .line 3686
    .line 3687
    .line 3688
    .line 3689
    .line 3690
    .line 3691
    .line 3692
    .line 3693
    .line 3694
    .line 3695
    .line 3696
    .line 3697
    .line 3698
    .line 3699
    .line 3700
    .line 3701
    .line 3702
    .line 3703
    .line 3704
    .line 3705
    .line 3706
    .line 3707
    .line 3708
    .line 3709
    .line 3710
    .line 3711
    .line 3712
    .line 3713
    .line 3714
    .line 3715
    .line 3716
    .line 3717
    .line 3718
    .line 3719
    .line 3720
    .line 3721
    .line 3722
    .line 3723
    .line 3724
    .line 3725
    .line 3726
    .line 3727
    .line 3728
    .line 3729
    .line 3730
    .line 3731
    .line 3732
    .line 3733
    .line 3734
    .line 3735
    .line 3736
    .line 3737
    .line 3738
    .line 3739
    .line 3740
    .line 3741
    .line 3742
    .line 3743
    .line 3744
    .line 3745
    .line 3746
    .line 3747
    .line 3748
    .line 3749
    .line 3750
.end method

.method public final g0(Lm4/i1;Lj5/d0;)Z
    .locals 3

    .line 1
    invoke-virtual {p2}, Lj5/d0;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p1}, Lm4/i1;->p()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object p2, p2, Lj5/d0;->a:Ljava/lang/Object;

    .line 15
    .line 16
    iget-object v0, p0, Lv4/c0;->l:Lm4/f1;

    .line 17
    .line 18
    invoke-virtual {p1, p2, v0}, Lm4/i1;->g(Ljava/lang/Object;Lm4/f1;)Lm4/f1;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    iget p2, p2, Lm4/f1;->c:I

    .line 23
    .line 24
    iget-object v0, p0, Lv4/c0;->k:Lm4/h1;

    .line 25
    .line 26
    invoke-virtual {p1, p2, v0}, Lm4/i1;->n(ILm4/h1;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Lm4/h1;->a()Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    iget-boolean p1, v0, Lm4/h1;->i:Z

    .line 36
    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    iget-wide p1, v0, Lm4/h1;->f:J

    .line 40
    .line 41
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    cmp-long v2, p1, v0

    .line 47
    .line 48
    if-eqz v2, :cond_1

    .line 49
    .line 50
    const/4 p1, 0x1

    .line 51
    return p1

    .line 52
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 53
    return p1
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
.end method

.method public final h(Lv4/h0;IZJ)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lv4/c0;->a:[Lv4/a1;

    .line 6
    .line 7
    aget-object v10, v2, p2

    .line 8
    .line 9
    invoke-virtual {v10}, Lv4/a1;->g()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    move v3, v2

    .line 14
    iget-object v2, v10, Lv4/a1;->a:Lv4/e;

    .line 15
    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    goto/16 :goto_9

    .line 19
    .line 20
    :cond_0
    iget-object v3, v0, Lv4/c0;->r:Lv4/j0;

    .line 21
    .line 22
    iget-object v3, v3, Lv4/j0;->i:Lv4/h0;

    .line 23
    .line 24
    const/4 v4, 0x1

    .line 25
    if-ne v1, v3, :cond_1

    .line 26
    .line 27
    const/4 v12, 0x1

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const/4 v12, 0x0

    .line 30
    :goto_0
    iget-object v3, v1, Lv4/h0;->o:Lm5/u;

    .line 31
    .line 32
    iget-object v5, v3, Lm5/u;->b:[Lv4/z0;

    .line 33
    .line 34
    aget-object v5, v5, p2

    .line 35
    .line 36
    iget-object v3, v3, Lm5/u;->c:[Lm5/r;

    .line 37
    .line 38
    aget-object v3, v3, p2

    .line 39
    .line 40
    invoke-virtual {v0}, Lv4/c0;->f0()Z

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    if-eqz v6, :cond_2

    .line 45
    .line 46
    iget-object v6, v0, Lv4/c0;->z:Lv4/u0;

    .line 47
    .line 48
    iget v6, v6, Lv4/u0;->e:I

    .line 49
    .line 50
    const/4 v7, 0x3

    .line 51
    if-ne v6, v7, :cond_2

    .line 52
    .line 53
    const/4 v13, 0x1

    .line 54
    goto :goto_1

    .line 55
    :cond_2
    const/4 v13, 0x0

    .line 56
    :goto_1
    if-nez p3, :cond_3

    .line 57
    .line 58
    if-eqz v13, :cond_3

    .line 59
    .line 60
    const/4 v14, 0x1

    .line 61
    goto :goto_2

    .line 62
    :cond_3
    const/4 v14, 0x0

    .line 63
    :goto_2
    iget v6, v0, Lv4/c0;->M:I

    .line 64
    .line 65
    add-int/2addr v6, v4

    .line 66
    iput v6, v0, Lv4/c0;->M:I

    .line 67
    .line 68
    iget-object v6, v1, Lv4/h0;->c:[Lj5/c1;

    .line 69
    .line 70
    aget-object v6, v6, p2

    .line 71
    .line 72
    iget-wide v7, v1, Lv4/h0;->p:J

    .line 73
    .line 74
    iget-object v9, v1, Lv4/h0;->g:Lv4/i0;

    .line 75
    .line 76
    iget-object v9, v9, Lv4/i0;->a:Lj5/d0;

    .line 77
    .line 78
    move-object v15, v2

    .line 79
    iget-object v2, v10, Lv4/a1;->c:Lv4/e;

    .line 80
    .line 81
    if-eqz v3, :cond_4

    .line 82
    .line 83
    invoke-interface {v3}, Lm5/r;->length()I

    .line 84
    .line 85
    .line 86
    move-result v16

    .line 87
    move/from16 v11, v16

    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_4
    const/4 v11, 0x0

    .line 91
    :goto_3
    new-array v4, v11, [Lm4/q;

    .line 92
    .line 93
    move-object/from16 p2, v4

    .line 94
    .line 95
    const/4 v4, 0x0

    .line 96
    :goto_4
    if-ge v4, v11, :cond_5

    .line 97
    .line 98
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    invoke-interface {v3, v4}, Lm5/r;->g(I)Lm4/q;

    .line 102
    .line 103
    .line 104
    move-result-object v17

    .line 105
    aput-object v17, p2, v4

    .line 106
    .line 107
    add-int/lit8 v4, v4, 0x1

    .line 108
    .line 109
    goto :goto_4

    .line 110
    :cond_5
    iget v3, v10, Lv4/a1;->d:I

    .line 111
    .line 112
    iget-object v11, v0, Lv4/c0;->n:Lv4/k;

    .line 113
    .line 114
    if-eqz v3, :cond_6

    .line 115
    .line 116
    const/4 v4, 0x2

    .line 117
    if-eq v3, v4, :cond_6

    .line 118
    .line 119
    const/4 v4, 0x4

    .line 120
    if-ne v3, v4, :cond_7

    .line 121
    .line 122
    :cond_6
    move-object/from16 v2, p2

    .line 123
    .line 124
    move-object v4, v6

    .line 125
    const/4 v3, 0x1

    .line 126
    goto :goto_6

    .line 127
    :cond_7
    const/4 v3, 0x1

    .line 128
    iput-boolean v3, v10, Lv4/a1;->f:Z

    .line 129
    .line 130
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    iget v4, v2, Lv4/e;->h:I

    .line 134
    .line 135
    if-nez v4, :cond_8

    .line 136
    .line 137
    const/4 v4, 0x1

    .line 138
    goto :goto_5

    .line 139
    :cond_8
    const/4 v4, 0x0

    .line 140
    :goto_5
    invoke-static {v4}, Lp4/c;->i(Z)V

    .line 141
    .line 142
    .line 143
    iput-object v5, v2, Lv4/e;->d:Lv4/z0;

    .line 144
    .line 145
    iput v3, v2, Lv4/e;->h:I

    .line 146
    .line 147
    invoke-virtual {v2, v14, v12}, Lv4/e;->n(ZZ)V

    .line 148
    .line 149
    .line 150
    move-object/from16 v3, p2

    .line 151
    .line 152
    move-object v4, v6

    .line 153
    move-wide/from16 v5, p4

    .line 154
    .line 155
    invoke-virtual/range {v2 .. v9}, Lv4/e;->w([Lm4/q;Lj5/c1;JJLj5/d0;)V

    .line 156
    .line 157
    .line 158
    move-wide v6, v5

    .line 159
    const/4 v3, 0x0

    .line 160
    iput-boolean v3, v2, Lv4/e;->n:Z

    .line 161
    .line 162
    iput-wide v6, v2, Lv4/e;->l:J

    .line 163
    .line 164
    iput-wide v6, v2, Lv4/e;->m:J

    .line 165
    .line 166
    invoke-virtual {v2, v6, v7, v14}, Lv4/e;->o(JZ)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v11, v2}, Lv4/k;->d(Lv4/e;)V

    .line 170
    .line 171
    .line 172
    goto :goto_8

    .line 173
    :goto_6
    iput-boolean v3, v10, Lv4/a1;->e:Z

    .line 174
    .line 175
    iget v6, v15, Lv4/e;->h:I

    .line 176
    .line 177
    if-nez v6, :cond_9

    .line 178
    .line 179
    const/4 v6, 0x1

    .line 180
    goto :goto_7

    .line 181
    :cond_9
    const/4 v6, 0x0

    .line 182
    :goto_7
    invoke-static {v6}, Lp4/c;->i(Z)V

    .line 183
    .line 184
    .line 185
    iput-object v5, v15, Lv4/e;->d:Lv4/z0;

    .line 186
    .line 187
    iput v3, v15, Lv4/e;->h:I

    .line 188
    .line 189
    invoke-virtual {v15, v14, v12}, Lv4/e;->n(ZZ)V

    .line 190
    .line 191
    .line 192
    move-wide/from16 v5, p4

    .line 193
    .line 194
    move-object v3, v2

    .line 195
    move-object v2, v15

    .line 196
    invoke-virtual/range {v2 .. v9}, Lv4/e;->w([Lm4/q;Lj5/c1;JJLj5/d0;)V

    .line 197
    .line 198
    .line 199
    const/4 v3, 0x0

    .line 200
    iput-boolean v3, v15, Lv4/e;->n:Z

    .line 201
    .line 202
    iput-wide v5, v15, Lv4/e;->l:J

    .line 203
    .line 204
    iput-wide v5, v15, Lv4/e;->m:J

    .line 205
    .line 206
    invoke-virtual {v15, v5, v6, v14}, Lv4/e;->o(JZ)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v11, v15}, Lv4/k;->d(Lv4/e;)V

    .line 210
    .line 211
    .line 212
    :goto_8
    new-instance v2, Lv4/w;

    .line 213
    .line 214
    invoke-direct {v2, v0}, Lv4/w;-><init>(Lv4/c0;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v10, v1}, Lv4/a1;->d(Lv4/h0;)Lv4/e;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    const/16 v3, 0xb

    .line 225
    .line 226
    invoke-interface {v1, v3, v2}, Lv4/w0;->d(ILjava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    if-eqz v13, :cond_a

    .line 230
    .line 231
    if-eqz v12, :cond_a

    .line 232
    .line 233
    invoke-virtual {v10}, Lv4/a1;->n()V

    .line 234
    .line 235
    .line 236
    :cond_a
    :goto_9
    return-void
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
.end method

.method public final h0()V
    .locals 4

    .line 1
    iget-object v0, p0, Lv4/c0;->r:Lv4/j0;

    .line 2
    .line 3
    iget-object v0, v0, Lv4/j0;->i:Lv4/h0;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_2

    .line 8
    :cond_0
    iget-object v0, v0, Lv4/h0;->o:Lm5/u;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    :goto_0
    iget-object v2, p0, Lv4/c0;->a:[Lv4/a1;

    .line 12
    .line 13
    array-length v3, v2

    .line 14
    if-ge v1, v3, :cond_2

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lm5/u;->b(I)Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-nez v3, :cond_1

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    aget-object v2, v2, v1

    .line 24
    .line 25
    invoke-virtual {v2}, Lv4/a1;->n()V

    .line 26
    .line 27
    .line 28
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    :goto_2
    return-void
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

.method public final handleMessage(Landroid/os/Message;)Z
    .locals 13

    .line 1
    const-string v2, "Playback error"

    .line 2
    .line 3
    const-string v3, "ExoPlayerImplInternal"

    .line 4
    .line 5
    const/4 v4, 0x2

    .line 6
    const/16 v5, 0x3e8

    .line 7
    .line 8
    const/4 v6, 0x4

    .line 9
    const/4 v11, 0x0

    .line 10
    const/4 v12, 0x1

    .line 11
    :try_start_0
    iget v7, p1, Landroid/os/Message;->what:I

    .line 12
    .line 13
    packed-switch v7, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    :pswitch_0
    return v11

    .line 17
    :pswitch_1
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Landroid/util/Pair;

    .line 20
    .line 21
    iget-object v7, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 22
    .line 23
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 26
    .line 27
    invoke-virtual {p0, v7, v0}, Lv4/c0;->e0(Ljava/lang/Object;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    .line 28
    .line 29
    .line 30
    goto/16 :goto_10

    .line 31
    .line 32
    :catch_0
    move-exception v0

    .line 33
    goto/16 :goto_4

    .line 34
    .line 35
    :catch_1
    move-exception v0

    .line 36
    goto/16 :goto_5

    .line 37
    .line 38
    :catch_2
    move-exception v0

    .line 39
    goto/16 :goto_6

    .line 40
    .line 41
    :catch_3
    move-exception v0

    .line 42
    goto/16 :goto_7

    .line 43
    .line 44
    :catch_4
    move-exception v0

    .line 45
    goto/16 :goto_8

    .line 46
    .line 47
    :catch_5
    move-exception v0

    .line 48
    goto/16 :goto_a

    .line 49
    .line 50
    :catch_6
    move-exception v0

    .line 51
    goto/16 :goto_b

    .line 52
    .line 53
    :pswitch_2
    invoke-virtual {p0}, Lv4/c0;->D()V

    .line 54
    .line 55
    .line 56
    goto/16 :goto_10

    .line 57
    .line 58
    :pswitch_3
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v0, Lv4/o;

    .line 61
    .line 62
    invoke-virtual {p0, v0}, Lv4/c0;->Z(Lv4/o;)V

    .line 63
    .line 64
    .line 65
    goto/16 :goto_10

    .line 66
    .line 67
    :pswitch_4
    iget v7, p1, Landroid/os/Message;->arg1:I

    .line 68
    .line 69
    iget v8, p1, Landroid/os/Message;->arg2:I

    .line 70
    .line 71
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v0, Ljava/util/List;

    .line 74
    .line 75
    invoke-virtual {p0, v7, v8, v0}, Lv4/c0;->m0(IILjava/util/List;)V

    .line 76
    .line 77
    .line 78
    goto/16 :goto_10

    .line 79
    .line 80
    :pswitch_5
    invoke-virtual {p0}, Lv4/c0;->H()V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, v12}, Lv4/c0;->P(Z)V

    .line 84
    .line 85
    .line 86
    goto/16 :goto_10

    .line 87
    .line 88
    :pswitch_6
    invoke-virtual {p0}, Lv4/c0;->H()V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0, v12}, Lv4/c0;->P(Z)V

    .line 92
    .line 93
    .line 94
    goto/16 :goto_10

    .line 95
    .line 96
    :pswitch_7
    iget v0, p1, Landroid/os/Message;->arg1:I

    .line 97
    .line 98
    if-eqz v0, :cond_0

    .line 99
    .line 100
    const/4 v0, 0x1

    .line 101
    goto :goto_0

    .line 102
    :cond_0
    const/4 v0, 0x0

    .line 103
    :goto_0
    invoke-virtual {p0, v0}, Lv4/c0;->W(Z)V

    .line 104
    .line 105
    .line 106
    goto/16 :goto_10

    .line 107
    .line 108
    :pswitch_8
    invoke-virtual {p0}, Lv4/c0;->B()V

    .line 109
    .line 110
    .line 111
    goto/16 :goto_10

    .line 112
    .line 113
    :pswitch_9
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v0, Lj5/f1;

    .line 116
    .line 117
    invoke-virtual {p0, v0}, Lv4/c0;->c0(Lj5/f1;)V

    .line 118
    .line 119
    .line 120
    goto/16 :goto_10

    .line 121
    .line 122
    :pswitch_a
    iget v7, p1, Landroid/os/Message;->arg1:I

    .line 123
    .line 124
    iget v8, p1, Landroid/os/Message;->arg2:I

    .line 125
    .line 126
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v0, Lj5/f1;

    .line 129
    .line 130
    invoke-virtual {p0, v7, v8, v0}, Lv4/c0;->G(IILj5/f1;)V

    .line 131
    .line 132
    .line 133
    goto/16 :goto_10

    .line 134
    .line 135
    :pswitch_b
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v0, Lv4/y;

    .line 138
    .line 139
    invoke-virtual {p0, v0}, Lv4/c0;->C(Lv4/y;)V

    .line 140
    .line 141
    .line 142
    goto/16 :goto_10

    .line 143
    .line 144
    :pswitch_c
    iget-object v7, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v7, Lv4/x;

    .line 147
    .line 148
    iget v0, p1, Landroid/os/Message;->arg1:I

    .line 149
    .line 150
    invoke-virtual {p0, v7, v0}, Lv4/c0;->b(Lv4/x;I)V

    .line 151
    .line 152
    .line 153
    goto/16 :goto_10

    .line 154
    .line 155
    :pswitch_d
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v0, Lv4/x;

    .line 158
    .line 159
    invoke-virtual {p0, v0}, Lv4/c0;->V(Lv4/x;)V

    .line 160
    .line 161
    .line 162
    goto/16 :goto_10

    .line 163
    .line 164
    :pswitch_e
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v0, Lm4/s0;

    .line 167
    .line 168
    iget v7, v0, Lm4/s0;->a:F

    .line 169
    .line 170
    invoke-virtual {p0, v0, v7, v12, v11}, Lv4/c0;->s(Lm4/s0;FZZ)V

    .line 171
    .line 172
    .line 173
    goto/16 :goto_10

    .line 174
    .line 175
    :pswitch_f
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v0, Lv4/x0;

    .line 178
    .line 179
    invoke-virtual {p0, v0}, Lv4/c0;->T(Lv4/x0;)V

    .line 180
    .line 181
    .line 182
    goto/16 :goto_10

    .line 183
    .line 184
    :pswitch_10
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v0, Lv4/x0;

    .line 187
    .line 188
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    invoke-virtual {p0, v0}, Lv4/c0;->S(Lv4/x0;)V

    .line 192
    .line 193
    .line 194
    goto/16 :goto_10

    .line 195
    .line 196
    :pswitch_11
    iget v7, p1, Landroid/os/Message;->arg1:I

    .line 197
    .line 198
    if-eqz v7, :cond_1

    .line 199
    .line 200
    const/4 v7, 0x1

    .line 201
    goto :goto_1

    .line 202
    :cond_1
    const/4 v7, 0x0

    .line 203
    :goto_1
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 206
    .line 207
    invoke-virtual {p0, v7, v0}, Lv4/c0;->U(ZLjava/util/concurrent/atomic/AtomicBoolean;)V

    .line 208
    .line 209
    .line 210
    goto/16 :goto_10

    .line 211
    .line 212
    :pswitch_12
    iget v0, p1, Landroid/os/Message;->arg1:I

    .line 213
    .line 214
    if-eqz v0, :cond_2

    .line 215
    .line 216
    const/4 v0, 0x1

    .line 217
    goto :goto_2

    .line 218
    :cond_2
    const/4 v0, 0x0

    .line 219
    :goto_2
    invoke-virtual {p0, v0}, Lv4/c0;->b0(Z)V

    .line 220
    .line 221
    .line 222
    goto/16 :goto_10

    .line 223
    .line 224
    :pswitch_13
    iget v0, p1, Landroid/os/Message;->arg1:I

    .line 225
    .line 226
    invoke-virtual {p0, v0}, Lv4/c0;->a0(I)V

    .line 227
    .line 228
    .line 229
    goto/16 :goto_10

    .line 230
    .line 231
    :pswitch_14
    invoke-virtual {p0}, Lv4/c0;->H()V

    .line 232
    .line 233
    .line 234
    goto/16 :goto_10

    .line 235
    .line 236
    :pswitch_15
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 237
    .line 238
    check-cast v0, Lj5/b0;

    .line 239
    .line 240
    invoke-virtual {p0, v0}, Lv4/c0;->n(Lj5/b0;)V

    .line 241
    .line 242
    .line 243
    goto/16 :goto_10

    .line 244
    .line 245
    :pswitch_16
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 246
    .line 247
    check-cast v0, Lj5/b0;

    .line 248
    .line 249
    invoke-virtual {p0, v0}, Lv4/c0;->r(Lj5/b0;)V

    .line 250
    .line 251
    .line 252
    goto/16 :goto_10

    .line 253
    .line 254
    :pswitch_17
    invoke-virtual {p0}, Lv4/c0;->E()V

    .line 255
    .line 256
    .line 257
    return v12

    .line 258
    :pswitch_18
    invoke-virtual {p0, v11, v12}, Lv4/c0;->i0(ZZ)V

    .line 259
    .line 260
    .line 261
    goto/16 :goto_10

    .line 262
    .line 263
    :pswitch_19
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 264
    .line 265
    check-cast v0, Lv4/b1;

    .line 266
    .line 267
    iput-object v0, p0, Lv4/c0;->y:Lv4/b1;

    .line 268
    .line 269
    goto/16 :goto_10

    .line 270
    .line 271
    :pswitch_1a
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 272
    .line 273
    check-cast v0, Lm4/s0;

    .line 274
    .line 275
    invoke-virtual {p0, v0}, Lv4/c0;->Y(Lm4/s0;)V

    .line 276
    .line 277
    .line 278
    goto/16 :goto_10

    .line 279
    .line 280
    :pswitch_1b
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 281
    .line 282
    check-cast v0, Lv4/b0;

    .line 283
    .line 284
    invoke-virtual {p0, v0}, Lv4/c0;->Q(Lv4/b0;)V

    .line 285
    .line 286
    .line 287
    goto/16 :goto_10

    .line 288
    .line 289
    :pswitch_1c
    invoke-virtual {p0}, Lv4/c0;->g()V

    .line 290
    .line 291
    .line 292
    goto/16 :goto_10

    .line 293
    .line 294
    :pswitch_1d
    iget v7, p1, Landroid/os/Message;->arg1:I

    .line 295
    .line 296
    if-eqz v7, :cond_3

    .line 297
    .line 298
    const/4 v7, 0x1

    .line 299
    goto :goto_3

    .line 300
    :cond_3
    const/4 v7, 0x0

    .line 301
    :goto_3
    iget v0, p1, Landroid/os/Message;->arg2:I

    .line 302
    .line 303
    shr-int/lit8 v8, v0, 0x4

    .line 304
    .line 305
    and-int/lit8 v0, v0, 0xf

    .line 306
    .line 307
    invoke-virtual {p0, v7, v8, v12, v0}, Lv4/c0;->X(ZIZI)V
    :try_end_0
    .catch Lv4/m; {:try_start_0 .. :try_end_0} :catch_6
    .catch Lb5/k; {:try_start_0 .. :try_end_0} :catch_5
    .catch Lm4/p0; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ls4/j; {:try_start_0 .. :try_end_0} :catch_3
    .catch Lj5/b; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 308
    .line 309
    .line 310
    goto/16 :goto_10

    .line 311
    .line 312
    :goto_4
    instance-of v6, v0, Ljava/lang/IllegalStateException;

    .line 313
    .line 314
    if-nez v6, :cond_4

    .line 315
    .line 316
    instance-of v6, v0, Ljava/lang/IllegalArgumentException;

    .line 317
    .line 318
    if-eqz v6, :cond_5

    .line 319
    .line 320
    :cond_4
    const/16 v5, 0x3ec

    .line 321
    .line 322
    :cond_5
    new-instance v6, Lv4/m;

    .line 323
    .line 324
    invoke-direct {v6, v4, v0, v5}, Lv4/m;-><init>(ILjava/lang/Exception;I)V

    .line 325
    .line 326
    .line 327
    invoke-static {v3, v2, v6}, Lp4/c;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {p0, v12, v11}, Lv4/c0;->i0(ZZ)V

    .line 331
    .line 332
    .line 333
    iget-object v0, p0, Lv4/c0;->z:Lv4/u0;

    .line 334
    .line 335
    invoke-virtual {v0, v6}, Lv4/u0;->d(Lv4/m;)Lv4/u0;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    iput-object v0, p0, Lv4/c0;->z:Lv4/u0;

    .line 340
    .line 341
    goto/16 :goto_10

    .line 342
    .line 343
    :goto_5
    const/16 v2, 0x7d0

    .line 344
    .line 345
    invoke-virtual {p0, v0, v2}, Lv4/c0;->o(Ljava/io/IOException;I)V

    .line 346
    .line 347
    .line 348
    goto/16 :goto_10

    .line 349
    .line 350
    :goto_6
    const/16 v2, 0x3ea

    .line 351
    .line 352
    invoke-virtual {p0, v0, v2}, Lv4/c0;->o(Ljava/io/IOException;I)V

    .line 353
    .line 354
    .line 355
    goto/16 :goto_10

    .line 356
    .line 357
    :goto_7
    iget v2, v0, Ls4/j;->a:I

    .line 358
    .line 359
    invoke-virtual {p0, v0, v2}, Lv4/c0;->o(Ljava/io/IOException;I)V

    .line 360
    .line 361
    .line 362
    goto/16 :goto_10

    .line 363
    .line 364
    :goto_8
    iget-boolean v2, v0, Lm4/p0;->a:Z

    .line 365
    .line 366
    iget v3, v0, Lm4/p0;->b:I

    .line 367
    .line 368
    if-ne v3, v12, :cond_7

    .line 369
    .line 370
    if-eqz v2, :cond_6

    .line 371
    .line 372
    const/16 v2, 0xbb9

    .line 373
    .line 374
    const/16 v5, 0xbb9

    .line 375
    .line 376
    goto :goto_9

    .line 377
    :cond_6
    const/16 v2, 0xbbb

    .line 378
    .line 379
    const/16 v5, 0xbbb

    .line 380
    .line 381
    goto :goto_9

    .line 382
    :cond_7
    if-ne v3, v6, :cond_9

    .line 383
    .line 384
    if-eqz v2, :cond_8

    .line 385
    .line 386
    const/16 v2, 0xbba

    .line 387
    .line 388
    const/16 v5, 0xbba

    .line 389
    .line 390
    goto :goto_9

    .line 391
    :cond_8
    const/16 v2, 0xbbc

    .line 392
    .line 393
    const/16 v5, 0xbbc

    .line 394
    .line 395
    :cond_9
    :goto_9
    invoke-virtual {p0, v0, v5}, Lv4/c0;->o(Ljava/io/IOException;I)V

    .line 396
    .line 397
    .line 398
    goto/16 :goto_10

    .line 399
    .line 400
    :goto_a
    iget v2, v0, Lb5/k;->a:I

    .line 401
    .line 402
    invoke-virtual {p0, v0, v2}, Lv4/c0;->o(Ljava/io/IOException;I)V

    .line 403
    .line 404
    .line 405
    goto/16 :goto_10

    .line 406
    .line 407
    :goto_b
    iget v5, v0, Lv4/m;->j:I

    .line 408
    .line 409
    iget-object v7, p0, Lv4/c0;->a:[Lv4/a1;

    .line 410
    .line 411
    iget-object v8, p0, Lv4/c0;->r:Lv4/j0;

    .line 412
    .line 413
    if-ne v5, v12, :cond_b

    .line 414
    .line 415
    iget-object v5, v8, Lv4/j0;->j:Lv4/h0;

    .line 416
    .line 417
    if-eqz v5, :cond_b

    .line 418
    .line 419
    array-length v9, v7

    .line 420
    iget v10, v0, Lv4/m;->l:I

    .line 421
    .line 422
    rem-int v9, v10, v9

    .line 423
    .line 424
    aget-object v9, v7, v9

    .line 425
    .line 426
    invoke-virtual {v9, v10}, Lv4/a1;->i(I)Z

    .line 427
    .line 428
    .line 429
    move-result v9

    .line 430
    if-eqz v9, :cond_a

    .line 431
    .line 432
    iget-object v9, v5, Lv4/h0;->m:Lv4/h0;

    .line 433
    .line 434
    if-eqz v9, :cond_a

    .line 435
    .line 436
    iget-object v5, v9, Lv4/h0;->g:Lv4/i0;

    .line 437
    .line 438
    iget-object v5, v5, Lv4/i0;->a:Lj5/d0;

    .line 439
    .line 440
    goto :goto_c

    .line 441
    :cond_a
    iget-object v5, v5, Lv4/h0;->g:Lv4/i0;

    .line 442
    .line 443
    iget-object v5, v5, Lv4/i0;->a:Lj5/d0;

    .line 444
    .line 445
    :goto_c
    invoke-virtual {v0, v5}, Lv4/m;->c(Lj5/d0;)Lv4/m;

    .line 446
    .line 447
    .line 448
    move-result-object v0

    .line 449
    :cond_b
    iget-boolean v5, v0, Lv4/m;->p:Z

    .line 450
    .line 451
    iget-object v9, p0, Lv4/c0;->h:Lp4/x;

    .line 452
    .line 453
    if-eqz v5, :cond_e

    .line 454
    .line 455
    iget-object v5, p0, Lv4/c0;->S:Lv4/m;

    .line 456
    .line 457
    if-eqz v5, :cond_c

    .line 458
    .line 459
    iget v5, v0, Lm4/r0;->a:I

    .line 460
    .line 461
    const/16 v10, 0x138c

    .line 462
    .line 463
    if-eq v5, v10, :cond_c

    .line 464
    .line 465
    const/16 v10, 0x138b

    .line 466
    .line 467
    if-ne v5, v10, :cond_e

    .line 468
    .line 469
    :cond_c
    const-string v2, "Recoverable renderer error"

    .line 470
    .line 471
    invoke-static {v3, v2, v0}, Lp4/c;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 472
    .line 473
    .line 474
    iget-object v2, p0, Lv4/c0;->S:Lv4/m;

    .line 475
    .line 476
    if-eqz v2, :cond_d

    .line 477
    .line 478
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 479
    .line 480
    .line 481
    iget-object v0, p0, Lv4/c0;->S:Lv4/m;

    .line 482
    .line 483
    goto :goto_d

    .line 484
    :cond_d
    iput-object v0, p0, Lv4/c0;->S:Lv4/m;

    .line 485
    .line 486
    :goto_d
    const/16 v2, 0x19

    .line 487
    .line 488
    invoke-virtual {v9, v2, v0}, Lp4/x;->a(ILjava/lang/Object;)Lp4/w;

    .line 489
    .line 490
    .line 491
    move-result-object v0

    .line 492
    iget-object v2, v9, Lp4/x;->a:Landroid/os/Handler;

    .line 493
    .line 494
    iget-object v3, v0, Lp4/w;->a:Landroid/os/Message;

    .line 495
    .line 496
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 497
    .line 498
    .line 499
    invoke-virtual {v2, v3}, Landroid/os/Handler;->sendMessageAtFrontOfQueue(Landroid/os/Message;)Z

    .line 500
    .line 501
    .line 502
    invoke-virtual {v0}, Lp4/w;->a()V

    .line 503
    .line 504
    .line 505
    goto/16 :goto_10

    .line 506
    .line 507
    :cond_e
    iget v5, v0, Lv4/m;->j:I

    .line 508
    .line 509
    if-ne v5, v12, :cond_10

    .line 510
    .line 511
    iget v5, v0, Lv4/m;->l:I

    .line 512
    .line 513
    array-length v10, v7

    .line 514
    rem-int v10, v5, v10

    .line 515
    .line 516
    aget-object v7, v7, v10

    .line 517
    .line 518
    invoke-virtual {v7, v5}, Lv4/a1;->i(I)Z

    .line 519
    .line 520
    .line 521
    move-result v5

    .line 522
    if-eqz v5, :cond_10

    .line 523
    .line 524
    iput-boolean v12, p0, Lv4/c0;->W:Z

    .line 525
    .line 526
    invoke-virtual {p0}, Lv4/c0;->e()V

    .line 527
    .line 528
    .line 529
    iget-object v0, v8, Lv4/j0;->k:Lv4/h0;

    .line 530
    .line 531
    iget-object v2, v8, Lv4/j0;->i:Lv4/h0;

    .line 532
    .line 533
    if-eq v2, v0, :cond_f

    .line 534
    .line 535
    :goto_e
    if-eqz v2, :cond_f

    .line 536
    .line 537
    iget-object v3, v2, Lv4/h0;->m:Lv4/h0;

    .line 538
    .line 539
    if-eq v3, v0, :cond_f

    .line 540
    .line 541
    move-object v2, v3

    .line 542
    goto :goto_e

    .line 543
    :cond_f
    invoke-virtual {v8, v2}, Lv4/j0;->n(Lv4/h0;)I

    .line 544
    .line 545
    .line 546
    iget-object v0, p0, Lv4/c0;->z:Lv4/u0;

    .line 547
    .line 548
    iget v0, v0, Lv4/u0;->e:I

    .line 549
    .line 550
    if-eq v0, v6, :cond_14

    .line 551
    .line 552
    invoke-virtual {p0}, Lv4/c0;->w()V

    .line 553
    .line 554
    .line 555
    invoke-virtual {v9, v4}, Lp4/x;->e(I)Z

    .line 556
    .line 557
    .line 558
    goto :goto_10

    .line 559
    :cond_10
    iget-object v4, p0, Lv4/c0;->S:Lv4/m;

    .line 560
    .line 561
    if-eqz v4, :cond_11

    .line 562
    .line 563
    invoke-virtual {v4, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 564
    .line 565
    .line 566
    iget-object v0, p0, Lv4/c0;->S:Lv4/m;

    .line 567
    .line 568
    :cond_11
    invoke-static {v3, v2, v0}, Lp4/c;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 569
    .line 570
    .line 571
    iget v2, v0, Lv4/m;->j:I

    .line 572
    .line 573
    if-ne v2, v12, :cond_13

    .line 574
    .line 575
    iget-object v2, v8, Lv4/j0;->i:Lv4/h0;

    .line 576
    .line 577
    iget-object v3, v8, Lv4/j0;->j:Lv4/h0;

    .line 578
    .line 579
    if-eq v2, v3, :cond_13

    .line 580
    .line 581
    :goto_f
    iget-object v2, v8, Lv4/j0;->i:Lv4/h0;

    .line 582
    .line 583
    iget-object v3, v8, Lv4/j0;->j:Lv4/h0;

    .line 584
    .line 585
    if-eq v2, v3, :cond_12

    .line 586
    .line 587
    invoke-virtual {v8}, Lv4/j0;->a()Lv4/h0;

    .line 588
    .line 589
    .line 590
    goto :goto_f

    .line 591
    :cond_12
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 592
    .line 593
    .line 594
    invoke-virtual {p0}, Lv4/c0;->y()V

    .line 595
    .line 596
    .line 597
    iget-object v2, v2, Lv4/h0;->g:Lv4/i0;

    .line 598
    .line 599
    iget-object v3, v2, Lv4/i0;->a:Lj5/d0;

    .line 600
    .line 601
    move-object v5, v3

    .line 602
    iget-wide v3, v2, Lv4/i0;->b:J

    .line 603
    .line 604
    iget-wide v6, v2, Lv4/i0;->c:J

    .line 605
    .line 606
    const/4 v9, 0x1

    .line 607
    const/4 v10, 0x0

    .line 608
    move-object v2, v5

    .line 609
    move-wide v5, v6

    .line 610
    move-wide v7, v3

    .line 611
    move-object v1, p0

    .line 612
    invoke-virtual/range {v1 .. v10}, Lv4/c0;->t(Lj5/d0;JJJZI)Lv4/u0;

    .line 613
    .line 614
    .line 615
    move-result-object v2

    .line 616
    iput-object v2, p0, Lv4/c0;->z:Lv4/u0;

    .line 617
    .line 618
    :cond_13
    invoke-virtual {p0, v12, v11}, Lv4/c0;->i0(ZZ)V

    .line 619
    .line 620
    .line 621
    iget-object v2, p0, Lv4/c0;->z:Lv4/u0;

    .line 622
    .line 623
    invoke-virtual {v2, v0}, Lv4/u0;->d(Lv4/m;)Lv4/u0;

    .line 624
    .line 625
    .line 626
    move-result-object v0

    .line 627
    iput-object v0, p0, Lv4/c0;->z:Lv4/u0;

    .line 628
    .line 629
    :cond_14
    :goto_10
    invoke-virtual {p0}, Lv4/c0;->y()V

    .line 630
    .line 631
    .line 632
    return v12

    .line 633
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
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
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
.end method

.method public final i([ZJ)V
    .locals 8

    .line 1
    iget-object v0, p0, Lv4/c0;->r:Lv4/j0;

    .line 2
    .line 3
    iget-object v2, v0, Lv4/j0;->j:Lv4/h0;

    .line 4
    .line 5
    iget-object v0, v2, Lv4/h0;->o:Lm5/u;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    :goto_0
    iget-object v7, p0, Lv4/c0;->a:[Lv4/a1;

    .line 10
    .line 11
    array-length v4, v7

    .line 12
    if-ge v3, v4, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0, v3}, Lm5/u;->b(I)Z

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    if-nez v4, :cond_0

    .line 19
    .line 20
    aget-object v4, v7, v3

    .line 21
    .line 22
    invoke-virtual {v4}, Lv4/a1;->l()V

    .line 23
    .line 24
    .line 25
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const/4 v3, 0x0

    .line 29
    :goto_1
    array-length v1, v7

    .line 30
    if-ge v3, v1, :cond_4

    .line 31
    .line 32
    invoke-virtual {v0, v3}, Lm5/u;->b(I)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    aget-object v1, v7, v3

    .line 39
    .line 40
    invoke-virtual {v1, v2}, Lv4/a1;->d(Lv4/h0;)Lv4/e;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    if-eqz v1, :cond_3

    .line 45
    .line 46
    :cond_2
    move-wide v5, p2

    .line 47
    goto :goto_2

    .line 48
    :cond_3
    aget-boolean v4, p1, v3

    .line 49
    .line 50
    move-object v1, p0

    .line 51
    move-wide v5, p2

    .line 52
    invoke-virtual/range {v1 .. v6}, Lv4/c0;->h(Lv4/h0;IZJ)V

    .line 53
    .line 54
    .line 55
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 56
    .line 57
    move-wide p2, v5

    .line 58
    goto :goto_1

    .line 59
    :cond_4
    return-void
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
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
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
.end method

.method public final i0(ZZ)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    if-nez p1, :cond_1

    .line 4
    .line 5
    iget-boolean p1, p0, Lv4/c0;->J:Z

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    goto :goto_1

    .line 12
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 13
    :goto_1
    invoke-virtual {p0, p1, v1, v0, v1}, Lv4/c0;->I(ZZZZ)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lv4/c0;->A:Lv4/z;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lv4/z;->c(I)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lv4/c0;->f:Lv4/j;

    .line 22
    .line 23
    iget-object p2, p1, Lv4/j;->i:Ljava/util/HashMap;

    .line 24
    .line 25
    iget-object v1, p0, Lv4/c0;->u:Lw4/k;

    .line 26
    .line 27
    invoke-virtual {p2, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    if-eqz p2, :cond_2

    .line 32
    .line 33
    invoke-virtual {p1}, Lv4/j;->d()V

    .line 34
    .line 35
    .line 36
    :cond_2
    invoke-virtual {p0, v0}, Lv4/c0;->d0(I)V

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
.end method

.method public final j(Lm4/i1;Ljava/lang/Object;J)J
    .locals 5

    .line 1
    iget-object v0, p0, Lv4/c0;->l:Lm4/f1;

    .line 2
    .line 3
    invoke-virtual {p1, p2, v0}, Lm4/i1;->g(Ljava/lang/Object;Lm4/f1;)Lm4/f1;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    iget p2, p2, Lm4/f1;->c:I

    .line 8
    .line 9
    iget-object v1, p0, Lv4/c0;->k:Lm4/h1;

    .line 10
    .line 11
    invoke-virtual {p1, p2, v1}, Lm4/i1;->n(ILm4/h1;)V

    .line 12
    .line 13
    .line 14
    iget-wide p1, v1, Lm4/h1;->f:J

    .line 15
    .line 16
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    cmp-long v4, p1, v2

    .line 22
    .line 23
    if-eqz v4, :cond_1

    .line 24
    .line 25
    invoke-virtual {v1}, Lm4/h1;->a()Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    iget-boolean p1, v1, Lm4/h1;->i:Z

    .line 32
    .line 33
    if-nez p1, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    iget-wide p1, v1, Lm4/h1;->g:J

    .line 37
    .line 38
    invoke-static {p1, p2}, Lp4/c0;->z(J)J

    .line 39
    .line 40
    .line 41
    move-result-wide p1

    .line 42
    iget-wide v1, v1, Lm4/h1;->f:J

    .line 43
    .line 44
    sub-long/2addr p1, v1

    .line 45
    invoke-static {p1, p2}, Lp4/c0;->N(J)J

    .line 46
    .line 47
    .line 48
    move-result-wide p1

    .line 49
    iget-wide v0, v0, Lm4/f1;->e:J

    .line 50
    .line 51
    add-long/2addr p3, v0

    .line 52
    sub-long/2addr p1, p3

    .line 53
    return-wide p1

    .line 54
    :cond_1
    :goto_0
    return-wide v2
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
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method

.method public final j0()V
    .locals 6

    .line 1
    iget-object v0, p0, Lv4/c0;->n:Lv4/k;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-boolean v1, v0, Lv4/k;->f:Z

    .line 5
    .line 6
    iget-object v0, v0, Lv4/k;->a:Lv4/c1;

    .line 7
    .line 8
    iget-boolean v2, v0, Lv4/c1;->b:Z

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Lv4/c1;->b()J

    .line 13
    .line 14
    .line 15
    move-result-wide v2

    .line 16
    invoke-virtual {v0, v2, v3}, Lv4/c1;->d(J)V

    .line 17
    .line 18
    .line 19
    iput-boolean v1, v0, Lv4/c1;->b:Z

    .line 20
    .line 21
    :cond_0
    iget-object v0, p0, Lv4/c0;->a:[Lv4/a1;

    .line 22
    .line 23
    array-length v2, v0

    .line 24
    :goto_0
    if-ge v1, v2, :cond_3

    .line 25
    .line 26
    aget-object v3, v0, v1

    .line 27
    .line 28
    iget-object v4, v3, Lv4/a1;->c:Lv4/e;

    .line 29
    .line 30
    iget-object v3, v3, Lv4/a1;->a:Lv4/e;

    .line 31
    .line 32
    invoke-static {v3}, Lv4/a1;->h(Lv4/e;)Z

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    if-eqz v5, :cond_1

    .line 37
    .line 38
    invoke-static {v3}, Lv4/a1;->b(Lv4/e;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    if-eqz v4, :cond_2

    .line 42
    .line 43
    iget v3, v4, Lv4/e;->h:I

    .line 44
    .line 45
    if-eqz v3, :cond_2

    .line 46
    .line 47
    invoke-static {v4}, Lv4/a1;->b(Lv4/e;)V

    .line 48
    .line 49
    .line 50
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_3
    return-void
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

.method public final k(Lv4/h0;)J
    .locals 8

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const-wide/16 v0, 0x0

    .line 4
    .line 5
    return-wide v0

    .line 6
    :cond_0
    iget-wide v0, p1, Lv4/h0;->p:J

    .line 7
    .line 8
    iget-boolean v2, p1, Lv4/h0;->e:Z

    .line 9
    .line 10
    if-nez v2, :cond_1

    .line 11
    .line 12
    return-wide v0

    .line 13
    :cond_1
    const/4 v2, 0x0

    .line 14
    :goto_0
    iget-object v3, p0, Lv4/c0;->a:[Lv4/a1;

    .line 15
    .line 16
    array-length v4, v3

    .line 17
    if-ge v2, v4, :cond_4

    .line 18
    .line 19
    aget-object v4, v3, v2

    .line 20
    .line 21
    invoke-virtual {v4, p1}, Lv4/a1;->d(Lv4/h0;)Lv4/e;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    if-eqz v4, :cond_3

    .line 26
    .line 27
    aget-object v3, v3, v2

    .line 28
    .line 29
    invoke-virtual {v3, p1}, Lv4/a1;->d(Lv4/h0;)Lv4/e;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    iget-wide v3, v3, Lv4/e;->m:J

    .line 37
    .line 38
    const-wide/high16 v5, -0x8000000000000000L

    .line 39
    .line 40
    cmp-long v7, v3, v5

    .line 41
    .line 42
    if-nez v7, :cond_2

    .line 43
    .line 44
    return-wide v5

    .line 45
    :cond_2
    invoke-static {v3, v4, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 46
    .line 47
    .line 48
    move-result-wide v0

    .line 49
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_4
    return-wide v0
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

.method public final k0()V
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lv4/c0;->r:Lv4/j0;

    .line 4
    .line 5
    iget-object v1, v1, Lv4/j0;->l:Lv4/h0;

    .line 6
    .line 7
    iget-boolean v2, v0, Lv4/c0;->G:Z

    .line 8
    .line 9
    if-nez v2, :cond_1

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iget-object v1, v1, Lv4/h0;->a:Ljava/lang/Object;

    .line 14
    .line 15
    invoke-interface {v1}, Lj5/e1;->m()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v1, 0x0

    .line 23
    const/4 v11, 0x0

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    :goto_0
    const/4 v1, 0x1

    .line 26
    const/4 v11, 0x1

    .line 27
    :goto_1
    iget-object v1, v0, Lv4/c0;->z:Lv4/u0;

    .line 28
    .line 29
    iget-boolean v2, v1, Lv4/u0;->g:Z

    .line 30
    .line 31
    if-eq v11, v2, :cond_2

    .line 32
    .line 33
    new-instance v2, Lv4/u0;

    .line 34
    .line 35
    iget-object v3, v1, Lv4/u0;->a:Lm4/i1;

    .line 36
    .line 37
    iget-object v4, v1, Lv4/u0;->b:Lj5/d0;

    .line 38
    .line 39
    iget-wide v5, v1, Lv4/u0;->c:J

    .line 40
    .line 41
    iget-wide v7, v1, Lv4/u0;->d:J

    .line 42
    .line 43
    iget v9, v1, Lv4/u0;->e:I

    .line 44
    .line 45
    iget-object v10, v1, Lv4/u0;->f:Lv4/m;

    .line 46
    .line 47
    iget-object v12, v1, Lv4/u0;->h:Lj5/o1;

    .line 48
    .line 49
    iget-object v13, v1, Lv4/u0;->i:Lm5/u;

    .line 50
    .line 51
    iget-object v14, v1, Lv4/u0;->j:Ljava/util/List;

    .line 52
    .line 53
    iget-object v15, v1, Lv4/u0;->k:Lj5/d0;

    .line 54
    .line 55
    move-object/from16 v16, v2

    .line 56
    .line 57
    iget-boolean v2, v1, Lv4/u0;->l:Z

    .line 58
    .line 59
    move/from16 v17, v2

    .line 60
    .line 61
    iget v2, v1, Lv4/u0;->m:I

    .line 62
    .line 63
    move/from16 v18, v2

    .line 64
    .line 65
    iget v2, v1, Lv4/u0;->n:I

    .line 66
    .line 67
    move/from16 v19, v2

    .line 68
    .line 69
    iget-object v2, v1, Lv4/u0;->o:Lm4/s0;

    .line 70
    .line 71
    move-object/from16 v21, v2

    .line 72
    .line 73
    move-object/from16 v20, v3

    .line 74
    .line 75
    iget-wide v2, v1, Lv4/u0;->q:J

    .line 76
    .line 77
    move-wide/from16 v22, v2

    .line 78
    .line 79
    iget-wide v2, v1, Lv4/u0;->r:J

    .line 80
    .line 81
    move-wide/from16 v24, v2

    .line 82
    .line 83
    iget-wide v2, v1, Lv4/u0;->s:J

    .line 84
    .line 85
    move-wide/from16 v26, v2

    .line 86
    .line 87
    iget-wide v2, v1, Lv4/u0;->t:J

    .line 88
    .line 89
    iget-boolean v1, v1, Lv4/u0;->p:Z

    .line 90
    .line 91
    move/from16 v28, v1

    .line 92
    .line 93
    move-wide/from16 v29, v2

    .line 94
    .line 95
    move-object/from16 v2, v16

    .line 96
    .line 97
    move/from16 v16, v17

    .line 98
    .line 99
    move/from16 v17, v18

    .line 100
    .line 101
    move/from16 v18, v19

    .line 102
    .line 103
    move-object/from16 v3, v20

    .line 104
    .line 105
    move-object/from16 v19, v21

    .line 106
    .line 107
    move-wide/from16 v20, v22

    .line 108
    .line 109
    move-wide/from16 v22, v24

    .line 110
    .line 111
    move-wide/from16 v24, v26

    .line 112
    .line 113
    move-wide/from16 v26, v29

    .line 114
    .line 115
    invoke-direct/range {v2 .. v28}, Lv4/u0;-><init>(Lm4/i1;Lj5/d0;JJILv4/m;ZLj5/o1;Lm5/u;Ljava/util/List;Lj5/d0;ZIILm4/s0;JJJJZ)V

    .line 116
    .line 117
    .line 118
    iput-object v2, v0, Lv4/c0;->z:Lv4/u0;

    .line 119
    .line 120
    :cond_2
    return-void
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
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
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
.end method

.method public final l(Lm4/i1;)Landroid/util/Pair;
    .locals 9

    .line 1
    invoke-virtual {p1}, Lm4/i1;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object p1, Lv4/u0;->u:Lj5/d0;

    .line 10
    .line 11
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {p1, v0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1

    .line 20
    :cond_0
    iget-boolean v0, p0, Lv4/c0;->I:Z

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Lm4/i1;->a(Z)I

    .line 23
    .line 24
    .line 25
    move-result v6

    .line 26
    iget-object v5, p0, Lv4/c0;->l:Lm4/f1;

    .line 27
    .line 28
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    iget-object v4, p0, Lv4/c0;->k:Lm4/h1;

    .line 34
    .line 35
    move-object v3, p1

    .line 36
    invoke-virtual/range {v3 .. v8}, Lm4/i1;->i(Lm4/h1;Lm4/f1;IJ)Landroid/util/Pair;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iget-object v0, p0, Lv4/c0;->r:Lv4/j0;

    .line 41
    .line 42
    iget-object v4, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 43
    .line 44
    invoke-virtual {v0, v3, v4, v1, v2}, Lv4/j0;->p(Lm4/i1;Ljava/lang/Object;J)Lj5/d0;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p1, Ljava/lang/Long;

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 53
    .line 54
    .line 55
    move-result-wide v4

    .line 56
    invoke-virtual {v0}, Lj5/d0;->b()Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-eqz p1, :cond_2

    .line 61
    .line 62
    iget-object p1, v0, Lj5/d0;->a:Ljava/lang/Object;

    .line 63
    .line 64
    iget-object v4, p0, Lv4/c0;->l:Lm4/f1;

    .line 65
    .line 66
    invoke-virtual {v3, p1, v4}, Lm4/i1;->g(Ljava/lang/Object;Lm4/f1;)Lm4/f1;

    .line 67
    .line 68
    .line 69
    iget p1, v0, Lj5/d0;->c:I

    .line 70
    .line 71
    iget v3, v0, Lj5/d0;->b:I

    .line 72
    .line 73
    invoke-virtual {v4, v3}, Lm4/f1;->f(I)I

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    if-ne p1, v3, :cond_1

    .line 78
    .line 79
    iget-object p1, v4, Lm4/f1;->g:Lm4/b;

    .line 80
    .line 81
    iget-wide v1, p1, Lm4/b;->b:J

    .line 82
    .line 83
    :cond_1
    move-wide v4, v1

    .line 84
    :cond_2
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-static {v0, p1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    return-object p1
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

.method public final l0(Lm5/u;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lv4/c0;->r:Lv4/j0;

    .line 2
    .line 3
    iget-object v0, v0, Lv4/j0;->l:Lv4/h0;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lv4/h0;->d()J

    .line 9
    .line 10
    .line 11
    move-result-wide v1

    .line 12
    invoke-virtual {p0, v1, v2}, Lv4/c0;->m(J)J

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Lv4/c0;->z:Lv4/u0;

    .line 16
    .line 17
    iget-object v1, v1, Lv4/u0;->a:Lm4/i1;

    .line 18
    .line 19
    iget-object v0, v0, Lv4/h0;->g:Lv4/i0;

    .line 20
    .line 21
    iget-object v0, v0, Lv4/i0;->a:Lj5/d0;

    .line 22
    .line 23
    invoke-virtual {p0, v1, v0}, Lv4/c0;->g0(Lm4/i1;Lj5/d0;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    iget-object v0, p0, Lv4/c0;->t:Lv4/h;

    .line 30
    .line 31
    iget-wide v0, v0, Lv4/h;->h:J

    .line 32
    .line 33
    :cond_0
    iget-object v0, p0, Lv4/c0;->z:Lv4/u0;

    .line 34
    .line 35
    iget-object v0, v0, Lv4/u0;->a:Lm4/i1;

    .line 36
    .line 37
    iget-object v0, p0, Lv4/c0;->n:Lv4/k;

    .line 38
    .line 39
    invoke-virtual {v0}, Lv4/k;->e()Lm4/s0;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iget v0, v0, Lm4/s0;->a:F

    .line 44
    .line 45
    iget-object v0, p0, Lv4/c0;->z:Lv4/u0;

    .line 46
    .line 47
    iget-boolean v0, v0, Lv4/u0;->l:Z

    .line 48
    .line 49
    iget-object p1, p1, Lm5/u;->c:[Lm5/r;

    .line 50
    .line 51
    iget-object v0, p0, Lv4/c0;->f:Lv4/j;

    .line 52
    .line 53
    iget-object v1, v0, Lv4/j;->i:Ljava/util/HashMap;

    .line 54
    .line 55
    iget-object v2, p0, Lv4/c0;->u:Lw4/k;

    .line 56
    .line 57
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    check-cast v1, Lv4/i;

    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    iget v2, v0, Lv4/j;->f:I

    .line 67
    .line 68
    const/4 v3, -0x1

    .line 69
    if-ne v2, v3, :cond_3

    .line 70
    .line 71
    array-length v2, p1

    .line 72
    const/4 v3, 0x0

    .line 73
    const/4 v4, 0x0

    .line 74
    const/4 v5, 0x0

    .line 75
    :goto_0
    const/high16 v6, 0xc80000

    .line 76
    .line 77
    if-ge v4, v2, :cond_2

    .line 78
    .line 79
    aget-object v7, p1, v4

    .line 80
    .line 81
    if-eqz v7, :cond_1

    .line 82
    .line 83
    invoke-interface {v7}, Lm5/r;->b()Lm4/j1;

    .line 84
    .line 85
    .line 86
    move-result-object v7

    .line 87
    iget v7, v7, Lm4/j1;->c:I

    .line 88
    .line 89
    const/high16 v8, 0x20000

    .line 90
    .line 91
    packed-switch v7, :pswitch_data_0

    .line 92
    .line 93
    .line 94
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 95
    .line 96
    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 97
    .line 98
    .line 99
    throw p1

    .line 100
    :pswitch_0
    const/high16 v6, 0x20000

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :pswitch_1
    const/high16 v6, 0x7d00000

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :pswitch_2
    const/high16 v6, 0x89a0000

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :pswitch_3
    const/4 v6, 0x0

    .line 110
    :goto_1
    :pswitch_4
    add-int/2addr v5, v6

    .line 111
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_2
    invoke-static {v6, v5}, Ljava/lang/Math;->max(II)I

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    :cond_3
    iput v2, v1, Lv4/i;->b:I

    .line 119
    .line 120
    invoke-virtual {v0}, Lv4/j;->d()V

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    nop

    .line 125
    :pswitch_data_0
    .packed-switch -0x2
        :pswitch_3
        :pswitch_4
        :pswitch_2
        :pswitch_4
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
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

.method public final m(J)J
    .locals 7

    .line 1
    iget-object v0, p0, Lv4/c0;->r:Lv4/j0;

    .line 2
    .line 3
    iget-object v0, v0, Lv4/j0;->l:Lv4/h0;

    .line 4
    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-wide v1

    .line 10
    :cond_0
    iget-wide v3, p0, Lv4/c0;->O:J

    .line 11
    .line 12
    iget-wide v5, v0, Lv4/h0;->p:J

    .line 13
    .line 14
    sub-long/2addr v3, v5

    .line 15
    sub-long/2addr p1, v3

    .line 16
    invoke-static {v1, v2, p1, p2}, Ljava/lang/Math;->max(JJ)J

    .line 17
    .line 18
    .line 19
    move-result-wide p1

    .line 20
    return-wide p1
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
.end method

.method public final m0(IILjava/util/List;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lv4/c0;->A:Lv4/z;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Lv4/z;->c(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lv4/c0;->s:Lv4/t0;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v2, v0, Lv4/t0;->b:Ljava/util/ArrayList;

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    if-ltz p1, :cond_0

    .line 16
    .line 17
    if-gt p1, p2, :cond_0

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-gt p2, v4, :cond_0

    .line 24
    .line 25
    const/4 v4, 0x1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v4, 0x0

    .line 28
    :goto_0
    invoke-static {v4}, Lp4/c;->c(Z)V

    .line 29
    .line 30
    .line 31
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    sub-int v5, p2, p1

    .line 36
    .line 37
    if-ne v4, v5, :cond_1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const/4 v1, 0x0

    .line 41
    :goto_1
    invoke-static {v1}, Lp4/c;->c(Z)V

    .line 42
    .line 43
    .line 44
    move v1, p1

    .line 45
    :goto_2
    if-ge v1, p2, :cond_2

    .line 46
    .line 47
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    check-cast v4, Lv4/s0;

    .line 52
    .line 53
    iget-object v4, v4, Lv4/s0;->a:Lj5/y;

    .line 54
    .line 55
    sub-int v5, v1, p1

    .line 56
    .line 57
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    check-cast v5, Lm4/i0;

    .line 62
    .line 63
    invoke-virtual {v4, v5}, Lj5/y;->t(Lm4/i0;)V

    .line 64
    .line 65
    .line 66
    add-int/lit8 v1, v1, 0x1

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_2
    invoke-virtual {v0}, Lv4/t0;->b()Lm4/i1;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {p0, p1, v3}, Lv4/c0;->q(Lm4/i1;Z)V

    .line 74
    .line 75
    .line 76
    return-void
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
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method

.method public final n(Lj5/b0;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lv4/c0;->r:Lv4/j0;

    .line 2
    .line 3
    iget-object v1, v0, Lv4/j0;->l:Lv4/h0;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v1, v1, Lv4/h0;->a:Ljava/lang/Object;

    .line 8
    .line 9
    if-ne v1, p1, :cond_0

    .line 10
    .line 11
    iget-wide v1, p0, Lv4/c0;->O:J

    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, Lv4/j0;->m(J)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lv4/c0;->w()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iget-object v0, v0, Lv4/j0;->m:Lv4/h0;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    iget-object v0, v0, Lv4/h0;->a:Ljava/lang/Object;

    .line 25
    .line 26
    if-ne v0, p1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, Lv4/c0;->x()V

    .line 29
    .line 30
    .line 31
    :cond_1
    return-void
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public final n0()V
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lv4/c0;->r:Lv4/j0;

    .line 4
    .line 5
    iget-object v1, v1, Lv4/j0;->i:Lv4/h0;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    goto/16 :goto_e

    .line 10
    .line 11
    :cond_0
    iget-boolean v2, v1, Lv4/h0;->e:Z

    .line 12
    .line 13
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    iget-object v2, v1, Lv4/h0;->a:Ljava/lang/Object;

    .line 21
    .line 22
    invoke-interface {v2}, Lj5/b0;->p()J

    .line 23
    .line 24
    .line 25
    move-result-wide v2

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    move-wide v2, v10

    .line 28
    :goto_0
    const/4 v12, 0x2

    .line 29
    const/16 v13, 0x10

    .line 30
    .line 31
    const/4 v14, 0x1

    .line 32
    const/4 v15, 0x0

    .line 33
    cmp-long v4, v2, v10

    .line 34
    .line 35
    if-eqz v4, :cond_3

    .line 36
    .line 37
    invoke-virtual {v1}, Lv4/h0;->g()Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-nez v4, :cond_2

    .line 42
    .line 43
    iget-object v4, v0, Lv4/c0;->r:Lv4/j0;

    .line 44
    .line 45
    invoke-virtual {v4, v1}, Lv4/j0;->n(Lv4/h0;)I

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v15}, Lv4/c0;->p(Z)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Lv4/c0;->w()V

    .line 52
    .line 53
    .line 54
    :cond_2
    invoke-virtual {v0, v2, v3}, Lv4/c0;->K(J)V

    .line 55
    .line 56
    .line 57
    iget-object v1, v0, Lv4/c0;->z:Lv4/u0;

    .line 58
    .line 59
    iget-wide v4, v1, Lv4/u0;->s:J

    .line 60
    .line 61
    cmp-long v1, v2, v4

    .line 62
    .line 63
    if-eqz v1, :cond_13

    .line 64
    .line 65
    iget-object v1, v0, Lv4/c0;->z:Lv4/u0;

    .line 66
    .line 67
    iget-object v4, v1, Lv4/u0;->b:Lj5/d0;

    .line 68
    .line 69
    iget-wide v5, v1, Lv4/u0;->c:J

    .line 70
    .line 71
    const/4 v8, 0x1

    .line 72
    const/4 v9, 0x5

    .line 73
    move-object v1, v4

    .line 74
    move-wide v4, v5

    .line 75
    move-wide v6, v2

    .line 76
    invoke-virtual/range {v0 .. v9}, Lv4/c0;->t(Lj5/d0;JJJZI)Lv4/u0;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    iput-object v1, v0, Lv4/c0;->z:Lv4/u0;

    .line 81
    .line 82
    goto/16 :goto_7

    .line 83
    .line 84
    :cond_3
    iget-object v2, v0, Lv4/c0;->n:Lv4/k;

    .line 85
    .line 86
    iget-object v3, v0, Lv4/c0;->r:Lv4/j0;

    .line 87
    .line 88
    iget-object v3, v3, Lv4/j0;->j:Lv4/h0;

    .line 89
    .line 90
    if-eq v1, v3, :cond_4

    .line 91
    .line 92
    const/4 v3, 0x1

    .line 93
    goto :goto_1

    .line 94
    :cond_4
    const/4 v3, 0x0

    .line 95
    :goto_1
    iget-object v4, v2, Lv4/k;->a:Lv4/c1;

    .line 96
    .line 97
    iget-object v5, v2, Lv4/k;->c:Lv4/e;

    .line 98
    .line 99
    if-eqz v5, :cond_9

    .line 100
    .line 101
    invoke-virtual {v5}, Lv4/e;->k()Z

    .line 102
    .line 103
    .line 104
    move-result v5

    .line 105
    if-nez v5, :cond_9

    .line 106
    .line 107
    if-eqz v3, :cond_5

    .line 108
    .line 109
    iget-object v5, v2, Lv4/k;->c:Lv4/e;

    .line 110
    .line 111
    iget v5, v5, Lv4/e;->h:I

    .line 112
    .line 113
    if-ne v5, v12, :cond_9

    .line 114
    .line 115
    :cond_5
    iget-object v5, v2, Lv4/k;->c:Lv4/e;

    .line 116
    .line 117
    invoke-virtual {v5}, Lv4/e;->l()Z

    .line 118
    .line 119
    .line 120
    move-result v5

    .line 121
    if-nez v5, :cond_6

    .line 122
    .line 123
    if-nez v3, :cond_9

    .line 124
    .line 125
    iget-object v3, v2, Lv4/k;->c:Lv4/e;

    .line 126
    .line 127
    invoke-virtual {v3}, Lv4/e;->j()Z

    .line 128
    .line 129
    .line 130
    move-result v3

    .line 131
    if-eqz v3, :cond_6

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_6
    iget-object v3, v2, Lv4/k;->d:Lv4/g0;

    .line 135
    .line 136
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    invoke-interface {v3}, Lv4/g0;->b()J

    .line 140
    .line 141
    .line 142
    move-result-wide v5

    .line 143
    iget-boolean v7, v2, Lv4/k;->e:Z

    .line 144
    .line 145
    if-eqz v7, :cond_8

    .line 146
    .line 147
    invoke-virtual {v4}, Lv4/c1;->b()J

    .line 148
    .line 149
    .line 150
    move-result-wide v7

    .line 151
    cmp-long v9, v5, v7

    .line 152
    .line 153
    if-gez v9, :cond_7

    .line 154
    .line 155
    iget-boolean v3, v4, Lv4/c1;->b:Z

    .line 156
    .line 157
    if-eqz v3, :cond_a

    .line 158
    .line 159
    invoke-virtual {v4}, Lv4/c1;->b()J

    .line 160
    .line 161
    .line 162
    move-result-wide v5

    .line 163
    invoke-virtual {v4, v5, v6}, Lv4/c1;->d(J)V

    .line 164
    .line 165
    .line 166
    iput-boolean v15, v4, Lv4/c1;->b:Z

    .line 167
    .line 168
    goto :goto_3

    .line 169
    :cond_7
    iput-boolean v15, v2, Lv4/k;->e:Z

    .line 170
    .line 171
    iget-boolean v7, v2, Lv4/k;->f:Z

    .line 172
    .line 173
    if-eqz v7, :cond_8

    .line 174
    .line 175
    invoke-virtual {v4}, Lv4/c1;->f()V

    .line 176
    .line 177
    .line 178
    :cond_8
    invoke-virtual {v4, v5, v6}, Lv4/c1;->d(J)V

    .line 179
    .line 180
    .line 181
    invoke-interface {v3}, Lv4/g0;->e()Lm4/s0;

    .line 182
    .line 183
    .line 184
    move-result-object v3

    .line 185
    iget-object v5, v4, Lv4/c1;->e:Lm4/s0;

    .line 186
    .line 187
    invoke-virtual {v3, v5}, Lm4/s0;->equals(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v5

    .line 191
    if-nez v5, :cond_a

    .line 192
    .line 193
    invoke-virtual {v4, v3}, Lv4/c1;->a(Lm4/s0;)V

    .line 194
    .line 195
    .line 196
    iget-object v4, v2, Lv4/k;->b:Lv4/c0;

    .line 197
    .line 198
    iget-object v4, v4, Lv4/c0;->h:Lp4/x;

    .line 199
    .line 200
    invoke-virtual {v4, v13, v3}, Lp4/x;->a(ILjava/lang/Object;)Lp4/w;

    .line 201
    .line 202
    .line 203
    move-result-object v3

    .line 204
    invoke-virtual {v3}, Lp4/w;->b()V

    .line 205
    .line 206
    .line 207
    goto :goto_3

    .line 208
    :cond_9
    :goto_2
    iput-boolean v14, v2, Lv4/k;->e:Z

    .line 209
    .line 210
    iget-boolean v3, v2, Lv4/k;->f:Z

    .line 211
    .line 212
    if-eqz v3, :cond_a

    .line 213
    .line 214
    invoke-virtual {v4}, Lv4/c1;->f()V

    .line 215
    .line 216
    .line 217
    :cond_a
    :goto_3
    invoke-virtual {v2}, Lv4/k;->b()J

    .line 218
    .line 219
    .line 220
    move-result-wide v2

    .line 221
    iput-wide v2, v0, Lv4/c0;->O:J

    .line 222
    .line 223
    iget-wide v4, v1, Lv4/h0;->p:J

    .line 224
    .line 225
    sub-long/2addr v2, v4

    .line 226
    iget-object v1, v0, Lv4/c0;->z:Lv4/u0;

    .line 227
    .line 228
    iget-wide v4, v1, Lv4/u0;->s:J

    .line 229
    .line 230
    iget-object v1, v0, Lv4/c0;->o:Ljava/util/ArrayList;

    .line 231
    .line 232
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 233
    .line 234
    .line 235
    move-result v1

    .line 236
    if-nez v1, :cond_11

    .line 237
    .line 238
    iget-object v1, v0, Lv4/c0;->z:Lv4/u0;

    .line 239
    .line 240
    iget-object v1, v1, Lv4/u0;->b:Lj5/d0;

    .line 241
    .line 242
    invoke-virtual {v1}, Lj5/d0;->b()Z

    .line 243
    .line 244
    .line 245
    move-result v1

    .line 246
    if-eqz v1, :cond_b

    .line 247
    .line 248
    goto :goto_6

    .line 249
    :cond_b
    iget-boolean v1, v0, Lv4/c0;->R:Z

    .line 250
    .line 251
    if-eqz v1, :cond_c

    .line 252
    .line 253
    iput-boolean v15, v0, Lv4/c0;->R:Z

    .line 254
    .line 255
    :cond_c
    iget-object v1, v0, Lv4/c0;->z:Lv4/u0;

    .line 256
    .line 257
    iget-object v4, v1, Lv4/u0;->a:Lm4/i1;

    .line 258
    .line 259
    iget-object v1, v1, Lv4/u0;->b:Lj5/d0;

    .line 260
    .line 261
    iget-object v1, v1, Lj5/d0;->a:Ljava/lang/Object;

    .line 262
    .line 263
    invoke-virtual {v4, v1}, Lm4/i1;->b(Ljava/lang/Object;)I

    .line 264
    .line 265
    .line 266
    iget v1, v0, Lv4/c0;->Q:I

    .line 267
    .line 268
    iget-object v4, v0, Lv4/c0;->o:Ljava/util/ArrayList;

    .line 269
    .line 270
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 271
    .line 272
    .line 273
    move-result v4

    .line 274
    invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I

    .line 275
    .line 276
    .line 277
    move-result v1

    .line 278
    if-lez v1, :cond_e

    .line 279
    .line 280
    iget-object v4, v0, Lv4/c0;->o:Ljava/util/ArrayList;

    .line 281
    .line 282
    add-int/lit8 v5, v1, -0x1

    .line 283
    .line 284
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v4

    .line 288
    if-nez v4, :cond_d

    .line 289
    .line 290
    goto :goto_4

    .line 291
    :cond_d
    new-instance v1, Ljava/lang/ClassCastException;

    .line 292
    .line 293
    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    .line 294
    .line 295
    .line 296
    throw v1

    .line 297
    :cond_e
    :goto_4
    iget-object v4, v0, Lv4/c0;->o:Ljava/util/ArrayList;

    .line 298
    .line 299
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 300
    .line 301
    .line 302
    move-result v4

    .line 303
    if-ge v1, v4, :cond_10

    .line 304
    .line 305
    iget-object v4, v0, Lv4/c0;->o:Ljava/util/ArrayList;

    .line 306
    .line 307
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v4

    .line 311
    if-nez v4, :cond_f

    .line 312
    .line 313
    goto :goto_5

    .line 314
    :cond_f
    new-instance v1, Ljava/lang/ClassCastException;

    .line 315
    .line 316
    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    .line 317
    .line 318
    .line 319
    throw v1

    .line 320
    :cond_10
    :goto_5
    iput v1, v0, Lv4/c0;->Q:I

    .line 321
    .line 322
    :cond_11
    :goto_6
    iget-object v1, v0, Lv4/c0;->n:Lv4/k;

    .line 323
    .line 324
    invoke-virtual {v1}, Lv4/k;->c()Z

    .line 325
    .line 326
    .line 327
    move-result v1

    .line 328
    if-eqz v1, :cond_12

    .line 329
    .line 330
    iget-object v1, v0, Lv4/c0;->A:Lv4/z;

    .line 331
    .line 332
    iget-boolean v1, v1, Lv4/z;->c:Z

    .line 333
    .line 334
    xor-int/lit8 v8, v1, 0x1

    .line 335
    .line 336
    iget-object v1, v0, Lv4/c0;->z:Lv4/u0;

    .line 337
    .line 338
    iget-object v4, v1, Lv4/u0;->b:Lj5/d0;

    .line 339
    .line 340
    iget-wide v5, v1, Lv4/u0;->c:J

    .line 341
    .line 342
    const/4 v9, 0x6

    .line 343
    move-object v1, v4

    .line 344
    move-wide v4, v5

    .line 345
    move-wide v6, v2

    .line 346
    invoke-virtual/range {v0 .. v9}, Lv4/c0;->t(Lj5/d0;JJJZI)Lv4/u0;

    .line 347
    .line 348
    .line 349
    move-result-object v1

    .line 350
    iput-object v1, v0, Lv4/c0;->z:Lv4/u0;

    .line 351
    .line 352
    goto :goto_7

    .line 353
    :cond_12
    iget-object v1, v0, Lv4/c0;->z:Lv4/u0;

    .line 354
    .line 355
    iput-wide v2, v1, Lv4/u0;->s:J

    .line 356
    .line 357
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 358
    .line 359
    .line 360
    move-result-wide v2

    .line 361
    iput-wide v2, v1, Lv4/u0;->t:J

    .line 362
    .line 363
    :cond_13
    :goto_7
    iget-object v1, v0, Lv4/c0;->r:Lv4/j0;

    .line 364
    .line 365
    iget-object v1, v1, Lv4/j0;->l:Lv4/h0;

    .line 366
    .line 367
    iget-object v2, v0, Lv4/c0;->z:Lv4/u0;

    .line 368
    .line 369
    invoke-virtual {v1}, Lv4/h0;->d()J

    .line 370
    .line 371
    .line 372
    move-result-wide v3

    .line 373
    iput-wide v3, v2, Lv4/u0;->q:J

    .line 374
    .line 375
    iget-object v1, v0, Lv4/c0;->z:Lv4/u0;

    .line 376
    .line 377
    iget-wide v2, v1, Lv4/u0;->q:J

    .line 378
    .line 379
    invoke-virtual {v0, v2, v3}, Lv4/c0;->m(J)J

    .line 380
    .line 381
    .line 382
    move-result-wide v2

    .line 383
    iput-wide v2, v1, Lv4/u0;->r:J

    .line 384
    .line 385
    iget-object v1, v0, Lv4/c0;->z:Lv4/u0;

    .line 386
    .line 387
    iget-boolean v2, v1, Lv4/u0;->l:Z

    .line 388
    .line 389
    if-eqz v2, :cond_1d

    .line 390
    .line 391
    iget v2, v1, Lv4/u0;->e:I

    .line 392
    .line 393
    const/4 v3, 0x3

    .line 394
    if-ne v2, v3, :cond_1d

    .line 395
    .line 396
    iget-object v2, v1, Lv4/u0;->a:Lm4/i1;

    .line 397
    .line 398
    iget-object v1, v1, Lv4/u0;->b:Lj5/d0;

    .line 399
    .line 400
    invoke-virtual {v0, v2, v1}, Lv4/c0;->g0(Lm4/i1;Lj5/d0;)Z

    .line 401
    .line 402
    .line 403
    move-result v1

    .line 404
    if-eqz v1, :cond_1d

    .line 405
    .line 406
    iget-object v1, v0, Lv4/c0;->z:Lv4/u0;

    .line 407
    .line 408
    iget-object v2, v1, Lv4/u0;->o:Lm4/s0;

    .line 409
    .line 410
    iget v2, v2, Lm4/s0;->a:F

    .line 411
    .line 412
    const/high16 v4, 0x3f800000    # 1.0f

    .line 413
    .line 414
    cmpl-float v2, v2, v4

    .line 415
    .line 416
    if-nez v2, :cond_1d

    .line 417
    .line 418
    iget-object v2, v0, Lv4/c0;->t:Lv4/h;

    .line 419
    .line 420
    iget-object v5, v1, Lv4/u0;->a:Lm4/i1;

    .line 421
    .line 422
    iget-object v6, v1, Lv4/u0;->b:Lj5/d0;

    .line 423
    .line 424
    iget-object v6, v6, Lj5/d0;->a:Ljava/lang/Object;

    .line 425
    .line 426
    iget-wide v7, v1, Lv4/u0;->s:J

    .line 427
    .line 428
    invoke-virtual {v0, v5, v6, v7, v8}, Lv4/c0;->j(Lm4/i1;Ljava/lang/Object;J)J

    .line 429
    .line 430
    .line 431
    move-result-wide v5

    .line 432
    iget-object v1, v0, Lv4/c0;->z:Lv4/u0;

    .line 433
    .line 434
    iget-wide v7, v1, Lv4/u0;->r:J

    .line 435
    .line 436
    move-wide/from16 v16, v10

    .line 437
    .line 438
    iget-wide v10, v2, Lv4/h;->c:J

    .line 439
    .line 440
    cmp-long v1, v10, v16

    .line 441
    .line 442
    if-nez v1, :cond_14

    .line 443
    .line 444
    :goto_8
    const/4 v7, 0x0

    .line 445
    goto/16 :goto_d

    .line 446
    .line 447
    :cond_14
    sub-long v7, v5, v7

    .line 448
    .line 449
    iget-wide v9, v2, Lv4/h;->m:J

    .line 450
    .line 451
    cmp-long v1, v9, v16

    .line 452
    .line 453
    if-nez v1, :cond_15

    .line 454
    .line 455
    iput-wide v7, v2, Lv4/h;->m:J

    .line 456
    .line 457
    const-wide/16 v7, 0x0

    .line 458
    .line 459
    iput-wide v7, v2, Lv4/h;->n:J

    .line 460
    .line 461
    goto :goto_9

    .line 462
    :cond_15
    long-to-float v1, v9

    .line 463
    const v9, 0x3f7fbe77    # 0.999f

    .line 464
    .line 465
    .line 466
    mul-float v1, v1, v9

    .line 467
    .line 468
    long-to-float v10, v7

    .line 469
    const v11, 0x3a831200    # 9.999871E-4f

    .line 470
    .line 471
    .line 472
    mul-float v10, v10, v11

    .line 473
    .line 474
    add-float/2addr v10, v1

    .line 475
    const v1, 0x3f7fbe77    # 0.999f

    .line 476
    .line 477
    .line 478
    float-to-long v9, v10

    .line 479
    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->max(JJ)J

    .line 480
    .line 481
    .line 482
    move-result-wide v9

    .line 483
    iput-wide v9, v2, Lv4/h;->m:J

    .line 484
    .line 485
    sub-long/2addr v7, v9

    .line 486
    invoke-static {v7, v8}, Ljava/lang/Math;->abs(J)J

    .line 487
    .line 488
    .line 489
    move-result-wide v7

    .line 490
    iget-wide v9, v2, Lv4/h;->n:J

    .line 491
    .line 492
    long-to-float v9, v9

    .line 493
    mul-float v9, v9, v1

    .line 494
    .line 495
    long-to-float v1, v7

    .line 496
    mul-float v11, v11, v1

    .line 497
    .line 498
    add-float/2addr v11, v9

    .line 499
    float-to-long v7, v11

    .line 500
    iput-wide v7, v2, Lv4/h;->n:J

    .line 501
    .line 502
    :goto_9
    iget-wide v7, v2, Lv4/h;->l:J

    .line 503
    .line 504
    cmp-long v1, v7, v16

    .line 505
    .line 506
    if-eqz v1, :cond_16

    .line 507
    .line 508
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 509
    .line 510
    .line 511
    move-result-wide v7

    .line 512
    const-wide/16 v18, 0x3e8

    .line 513
    .line 514
    iget-wide v9, v2, Lv4/h;->l:J

    .line 515
    .line 516
    sub-long/2addr v7, v9

    .line 517
    cmp-long v1, v7, v18

    .line 518
    .line 519
    if-gez v1, :cond_17

    .line 520
    .line 521
    iget v4, v2, Lv4/h;->k:F

    .line 522
    .line 523
    goto :goto_8

    .line 524
    :cond_16
    const-wide/16 v18, 0x3e8

    .line 525
    .line 526
    :cond_17
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 527
    .line 528
    .line 529
    move-result-wide v7

    .line 530
    iput-wide v7, v2, Lv4/h;->l:J

    .line 531
    .line 532
    iget-wide v7, v2, Lv4/h;->m:J

    .line 533
    .line 534
    const-wide/16 v20, 0x3

    .line 535
    .line 536
    iget-wide v9, v2, Lv4/h;->n:J

    .line 537
    .line 538
    mul-long v9, v9, v20

    .line 539
    .line 540
    add-long v24, v9, v7

    .line 541
    .line 542
    iget-wide v7, v2, Lv4/h;->h:J

    .line 543
    .line 544
    const v1, 0x33d6bf95    # 1.0E-7f

    .line 545
    .line 546
    .line 547
    cmp-long v9, v7, v24

    .line 548
    .line 549
    if-lez v9, :cond_1a

    .line 550
    .line 551
    invoke-static/range {v18 .. v19}, Lp4/c0;->N(J)J

    .line 552
    .line 553
    .line 554
    move-result-wide v7

    .line 555
    iget v9, v2, Lv4/h;->k:F

    .line 556
    .line 557
    sub-float/2addr v9, v4

    .line 558
    long-to-float v7, v7

    .line 559
    mul-float v9, v9, v7

    .line 560
    .line 561
    float-to-long v8, v9

    .line 562
    iget v10, v2, Lv4/h;->i:F

    .line 563
    .line 564
    sub-float/2addr v10, v4

    .line 565
    mul-float v10, v10, v7

    .line 566
    .line 567
    float-to-long v10, v10

    .line 568
    add-long/2addr v8, v10

    .line 569
    iget-wide v10, v2, Lv4/h;->e:J

    .line 570
    .line 571
    const/4 v7, 0x0

    .line 572
    const/16 v18, 0x1

    .line 573
    .line 574
    iget-wide v14, v2, Lv4/h;->h:J

    .line 575
    .line 576
    sub-long/2addr v14, v8

    .line 577
    new-array v8, v3, [J

    .line 578
    .line 579
    aput-wide v24, v8, v7

    .line 580
    .line 581
    aput-wide v10, v8, v18

    .line 582
    .line 583
    aput-wide v14, v8, v12

    .line 584
    .line 585
    aget-wide v9, v8, v7

    .line 586
    .line 587
    const/4 v14, 0x1

    .line 588
    :goto_a
    if-ge v14, v3, :cond_19

    .line 589
    .line 590
    aget-wide v11, v8, v14

    .line 591
    .line 592
    cmp-long v15, v11, v9

    .line 593
    .line 594
    if-lez v15, :cond_18

    .line 595
    .line 596
    move-wide v9, v11

    .line 597
    :cond_18
    add-int/lit8 v14, v14, 0x1

    .line 598
    .line 599
    goto :goto_a

    .line 600
    :cond_19
    iput-wide v9, v2, Lv4/h;->h:J

    .line 601
    .line 602
    goto :goto_b

    .line 603
    :cond_1a
    const/4 v7, 0x0

    .line 604
    iget v3, v2, Lv4/h;->k:F

    .line 605
    .line 606
    sub-float/2addr v3, v4

    .line 607
    const/4 v8, 0x0

    .line 608
    invoke-static {v8, v3}, Ljava/lang/Math;->max(FF)F

    .line 609
    .line 610
    .line 611
    move-result v3

    .line 612
    div-float/2addr v3, v1

    .line 613
    float-to-long v8, v3

    .line 614
    sub-long v20, v5, v8

    .line 615
    .line 616
    iget-wide v8, v2, Lv4/h;->h:J

    .line 617
    .line 618
    move-wide/from16 v22, v8

    .line 619
    .line 620
    invoke-static/range {v20 .. v25}, Lp4/c0;->j(JJJ)J

    .line 621
    .line 622
    .line 623
    move-result-wide v8

    .line 624
    iput-wide v8, v2, Lv4/h;->h:J

    .line 625
    .line 626
    iget-wide v10, v2, Lv4/h;->g:J

    .line 627
    .line 628
    cmp-long v3, v10, v16

    .line 629
    .line 630
    if-eqz v3, :cond_1b

    .line 631
    .line 632
    cmp-long v3, v8, v10

    .line 633
    .line 634
    if-lez v3, :cond_1b

    .line 635
    .line 636
    iput-wide v10, v2, Lv4/h;->h:J

    .line 637
    .line 638
    :cond_1b
    :goto_b
    iget-wide v8, v2, Lv4/h;->h:J

    .line 639
    .line 640
    sub-long/2addr v5, v8

    .line 641
    invoke-static {v5, v6}, Ljava/lang/Math;->abs(J)J

    .line 642
    .line 643
    .line 644
    move-result-wide v8

    .line 645
    iget-wide v10, v2, Lv4/h;->a:J

    .line 646
    .line 647
    cmp-long v3, v8, v10

    .line 648
    .line 649
    if-gez v3, :cond_1c

    .line 650
    .line 651
    iput v4, v2, Lv4/h;->k:F

    .line 652
    .line 653
    goto :goto_c

    .line 654
    :cond_1c
    long-to-float v3, v5

    .line 655
    mul-float v1, v1, v3

    .line 656
    .line 657
    add-float/2addr v1, v4

    .line 658
    iget v3, v2, Lv4/h;->j:F

    .line 659
    .line 660
    iget v4, v2, Lv4/h;->i:F

    .line 661
    .line 662
    invoke-static {v1, v3, v4}, Lp4/c0;->h(FFF)F

    .line 663
    .line 664
    .line 665
    move-result v1

    .line 666
    iput v1, v2, Lv4/h;->k:F

    .line 667
    .line 668
    :goto_c
    iget v4, v2, Lv4/h;->k:F

    .line 669
    .line 670
    :goto_d
    iget-object v1, v0, Lv4/c0;->n:Lv4/k;

    .line 671
    .line 672
    invoke-virtual {v1}, Lv4/k;->e()Lm4/s0;

    .line 673
    .line 674
    .line 675
    move-result-object v1

    .line 676
    iget v1, v1, Lm4/s0;->a:F

    .line 677
    .line 678
    cmpl-float v1, v1, v4

    .line 679
    .line 680
    if-eqz v1, :cond_1d

    .line 681
    .line 682
    iget-object v1, v0, Lv4/c0;->z:Lv4/u0;

    .line 683
    .line 684
    iget-object v1, v1, Lv4/u0;->o:Lm4/s0;

    .line 685
    .line 686
    new-instance v2, Lm4/s0;

    .line 687
    .line 688
    iget v1, v1, Lm4/s0;->b:F

    .line 689
    .line 690
    invoke-direct {v2, v4, v1}, Lm4/s0;-><init>(FF)V

    .line 691
    .line 692
    .line 693
    iget-object v1, v0, Lv4/c0;->h:Lp4/x;

    .line 694
    .line 695
    invoke-virtual {v1, v13}, Lp4/x;->d(I)V

    .line 696
    .line 697
    .line 698
    iget-object v1, v0, Lv4/c0;->n:Lv4/k;

    .line 699
    .line 700
    invoke-virtual {v1, v2}, Lv4/k;->a(Lm4/s0;)V

    .line 701
    .line 702
    .line 703
    iget-object v1, v0, Lv4/c0;->z:Lv4/u0;

    .line 704
    .line 705
    iget-object v1, v1, Lv4/u0;->o:Lm4/s0;

    .line 706
    .line 707
    iget-object v2, v0, Lv4/c0;->n:Lv4/k;

    .line 708
    .line 709
    invoke-virtual {v2}, Lv4/k;->e()Lm4/s0;

    .line 710
    .line 711
    .line 712
    move-result-object v2

    .line 713
    iget v2, v2, Lm4/s0;->a:F

    .line 714
    .line 715
    invoke-virtual {v0, v1, v2, v7, v7}, Lv4/c0;->s(Lm4/s0;FZZ)V

    .line 716
    .line 717
    .line 718
    :cond_1d
    :goto_e
    return-void
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
.end method

.method public final o(Ljava/io/IOException;I)V
    .locals 2

    .line 1
    new-instance v0, Lv4/m;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, p1, p2}, Lv4/m;-><init>(ILjava/lang/Exception;I)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Lv4/c0;->r:Lv4/j0;

    .line 8
    .line 9
    iget-object p1, p1, Lv4/j0;->i:Lv4/h0;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iget-object p1, p1, Lv4/h0;->g:Lv4/i0;

    .line 14
    .line 15
    iget-object p1, p1, Lv4/i0;->a:Lj5/d0;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lv4/m;->c(Lj5/d0;)Lv4/m;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :cond_0
    const-string p1, "ExoPlayerImplInternal"

    .line 22
    .line 23
    const-string p2, "Playback error"

    .line 24
    .line 25
    invoke-static {p1, p2, v0}, Lp4/c;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v1, v1}, Lv4/c0;->i0(ZZ)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lv4/c0;->z:Lv4/u0;

    .line 32
    .line 33
    invoke-virtual {p1, v0}, Lv4/u0;->d(Lv4/m;)Lv4/u0;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iput-object p1, p0, Lv4/c0;->z:Lv4/u0;

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
.end method

.method public final o0(Lm4/i1;Lj5/d0;Lm4/i1;Lj5/d0;JZ)V
    .locals 8

    .line 1
    invoke-virtual {p0, p1, p2}, Lv4/c0;->g0(Lm4/i1;Lj5/d0;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p2, Lj5/d0;->a:Ljava/lang/Object;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p2}, Lj5/d0;->b()Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    sget-object p1, Lm4/s0;->d:Lm4/s0;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object p1, p0, Lv4/c0;->z:Lv4/u0;

    .line 19
    .line 20
    iget-object p1, p1, Lv4/u0;->o:Lm4/s0;

    .line 21
    .line 22
    :goto_0
    iget-object p2, p0, Lv4/c0;->n:Lv4/k;

    .line 23
    .line 24
    invoke-virtual {p2}, Lv4/k;->e()Lm4/s0;

    .line 25
    .line 26
    .line 27
    move-result-object p3

    .line 28
    invoke-virtual {p3, p1}, Lm4/s0;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p3

    .line 32
    if-nez p3, :cond_7

    .line 33
    .line 34
    iget-object p3, p0, Lv4/c0;->h:Lp4/x;

    .line 35
    .line 36
    const/16 p4, 0x10

    .line 37
    .line 38
    invoke-virtual {p3, p4}, Lp4/x;->d(I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2, p1}, Lv4/k;->a(Lm4/s0;)V

    .line 42
    .line 43
    .line 44
    iget-object p2, p0, Lv4/c0;->z:Lv4/u0;

    .line 45
    .line 46
    iget-object p2, p2, Lv4/u0;->o:Lm4/s0;

    .line 47
    .line 48
    iget p1, p1, Lm4/s0;->a:F

    .line 49
    .line 50
    const/4 p3, 0x0

    .line 51
    invoke-virtual {p0, p2, p1, p3, p3}, Lv4/c0;->s(Lm4/s0;FZZ)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_1
    iget-object p2, p0, Lv4/c0;->l:Lm4/f1;

    .line 56
    .line 57
    invoke-virtual {p1, v1, p2}, Lm4/i1;->g(Ljava/lang/Object;Lm4/f1;)Lm4/f1;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iget v0, v0, Lm4/f1;->c:I

    .line 62
    .line 63
    iget-object v2, p0, Lv4/c0;->k:Lm4/h1;

    .line 64
    .line 65
    invoke-virtual {p1, v0, v2}, Lm4/i1;->n(ILm4/h1;)V

    .line 66
    .line 67
    .line 68
    iget-object v0, v2, Lm4/h1;->j:Lm4/c0;

    .line 69
    .line 70
    iget-object v3, p0, Lv4/c0;->t:Lv4/h;

    .line 71
    .line 72
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    iget-wide v4, v0, Lm4/c0;->a:J

    .line 76
    .line 77
    invoke-static {v4, v5}, Lp4/c0;->N(J)J

    .line 78
    .line 79
    .line 80
    move-result-wide v4

    .line 81
    iput-wide v4, v3, Lv4/h;->c:J

    .line 82
    .line 83
    iget-wide v4, v0, Lm4/c0;->b:J

    .line 84
    .line 85
    invoke-static {v4, v5}, Lp4/c0;->N(J)J

    .line 86
    .line 87
    .line 88
    move-result-wide v4

    .line 89
    iput-wide v4, v3, Lv4/h;->f:J

    .line 90
    .line 91
    iget-wide v4, v0, Lm4/c0;->c:J

    .line 92
    .line 93
    invoke-static {v4, v5}, Lp4/c0;->N(J)J

    .line 94
    .line 95
    .line 96
    move-result-wide v4

    .line 97
    iput-wide v4, v3, Lv4/h;->g:J

    .line 98
    .line 99
    iget v4, v0, Lm4/c0;->d:F

    .line 100
    .line 101
    const v5, -0x800001

    .line 102
    .line 103
    .line 104
    cmpl-float v6, v4, v5

    .line 105
    .line 106
    if-eqz v6, :cond_2

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_2
    const v4, 0x3f7851ec    # 0.97f

    .line 110
    .line 111
    .line 112
    :goto_1
    iput v4, v3, Lv4/h;->j:F

    .line 113
    .line 114
    iget v0, v0, Lm4/c0;->e:F

    .line 115
    .line 116
    cmpl-float v5, v0, v5

    .line 117
    .line 118
    if-eqz v5, :cond_3

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_3
    const v0, 0x3f83d70a    # 1.03f

    .line 122
    .line 123
    .line 124
    :goto_2
    iput v0, v3, Lv4/h;->i:F

    .line 125
    .line 126
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    const/high16 v7, 0x3f800000    # 1.0f

    .line 132
    .line 133
    cmpl-float v4, v4, v7

    .line 134
    .line 135
    if-nez v4, :cond_4

    .line 136
    .line 137
    cmpl-float v0, v0, v7

    .line 138
    .line 139
    if-nez v0, :cond_4

    .line 140
    .line 141
    iput-wide v5, v3, Lv4/h;->c:J

    .line 142
    .line 143
    :cond_4
    invoke-virtual {v3}, Lv4/h;->a()V

    .line 144
    .line 145
    .line 146
    cmp-long v0, p5, v5

    .line 147
    .line 148
    if-eqz v0, :cond_5

    .line 149
    .line 150
    invoke-virtual {p0, p1, v1, p5, p6}, Lv4/c0;->j(Lm4/i1;Ljava/lang/Object;J)J

    .line 151
    .line 152
    .line 153
    move-result-wide p1

    .line 154
    iput-wide p1, v3, Lv4/h;->d:J

    .line 155
    .line 156
    invoke-virtual {v3}, Lv4/h;->a()V

    .line 157
    .line 158
    .line 159
    return-void

    .line 160
    :cond_5
    iget-object p1, v2, Lm4/h1;->a:Ljava/lang/Object;

    .line 161
    .line 162
    invoke-virtual {p3}, Lm4/i1;->p()Z

    .line 163
    .line 164
    .line 165
    move-result p5

    .line 166
    if-nez p5, :cond_6

    .line 167
    .line 168
    iget-object p4, p4, Lj5/d0;->a:Ljava/lang/Object;

    .line 169
    .line 170
    invoke-virtual {p3, p4, p2}, Lm4/i1;->g(Ljava/lang/Object;Lm4/f1;)Lm4/f1;

    .line 171
    .line 172
    .line 173
    move-result-object p2

    .line 174
    iget p2, p2, Lm4/f1;->c:I

    .line 175
    .line 176
    const-wide/16 p4, 0x0

    .line 177
    .line 178
    invoke-virtual {p3, p2, v2, p4, p5}, Lm4/i1;->m(ILm4/h1;J)Lm4/h1;

    .line 179
    .line 180
    .line 181
    move-result-object p2

    .line 182
    iget-object p2, p2, Lm4/h1;->a:Ljava/lang/Object;

    .line 183
    .line 184
    goto :goto_3

    .line 185
    :cond_6
    const/4 p2, 0x0

    .line 186
    :goto_3
    invoke-static {p2, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result p1

    .line 190
    if-eqz p1, :cond_8

    .line 191
    .line 192
    if-eqz p7, :cond_7

    .line 193
    .line 194
    goto :goto_4

    .line 195
    :cond_7
    return-void

    .line 196
    :cond_8
    :goto_4
    iput-wide v5, v3, Lv4/h;->d:J

    .line 197
    .line 198
    invoke-virtual {v3}, Lv4/h;->a()V

    .line 199
    .line 200
    .line 201
    return-void
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
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
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

.method public final p(Z)V
    .locals 5

    .line 1
    iget-object v0, p0, Lv4/c0;->r:Lv4/j0;

    .line 2
    .line 3
    iget-object v0, v0, Lv4/j0;->l:Lv4/h0;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lv4/c0;->z:Lv4/u0;

    .line 8
    .line 9
    iget-object v1, v1, Lv4/u0;->b:Lj5/d0;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v1, v0, Lv4/h0;->g:Lv4/i0;

    .line 13
    .line 14
    iget-object v1, v1, Lv4/i0;->a:Lj5/d0;

    .line 15
    .line 16
    :goto_0
    iget-object v2, p0, Lv4/c0;->z:Lv4/u0;

    .line 17
    .line 18
    iget-object v2, v2, Lv4/u0;->k:Lj5/d0;

    .line 19
    .line 20
    invoke-virtual {v2, v1}, Lj5/d0;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-nez v2, :cond_1

    .line 25
    .line 26
    iget-object v3, p0, Lv4/c0;->z:Lv4/u0;

    .line 27
    .line 28
    invoke-virtual {v3, v1}, Lv4/u0;->a(Lj5/d0;)Lv4/u0;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iput-object v1, p0, Lv4/c0;->z:Lv4/u0;

    .line 33
    .line 34
    :cond_1
    iget-object v1, p0, Lv4/c0;->z:Lv4/u0;

    .line 35
    .line 36
    if-nez v0, :cond_2

    .line 37
    .line 38
    iget-wide v3, v1, Lv4/u0;->s:J

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    invoke-virtual {v0}, Lv4/h0;->d()J

    .line 42
    .line 43
    .line 44
    move-result-wide v3

    .line 45
    :goto_1
    iput-wide v3, v1, Lv4/u0;->q:J

    .line 46
    .line 47
    iget-object v1, p0, Lv4/c0;->z:Lv4/u0;

    .line 48
    .line 49
    iget-wide v3, v1, Lv4/u0;->q:J

    .line 50
    .line 51
    invoke-virtual {p0, v3, v4}, Lv4/c0;->m(J)J

    .line 52
    .line 53
    .line 54
    move-result-wide v3

    .line 55
    iput-wide v3, v1, Lv4/u0;->r:J

    .line 56
    .line 57
    if-eqz v2, :cond_3

    .line 58
    .line 59
    if-eqz p1, :cond_4

    .line 60
    .line 61
    :cond_3
    if-eqz v0, :cond_4

    .line 62
    .line 63
    iget-boolean p1, v0, Lv4/h0;->e:Z

    .line 64
    .line 65
    if-eqz p1, :cond_4

    .line 66
    .line 67
    iget-object p1, v0, Lv4/h0;->o:Lm5/u;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, Lv4/c0;->l0(Lm5/u;)V

    .line 70
    .line 71
    .line 72
    :cond_4
    return-void
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

.method public final p0(ZZ)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lv4/c0;->E:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    if-nez p2, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Lv4/c0;->p:Lp4/v;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 13
    .line 14
    .line 15
    move-result-wide p1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    :goto_0
    iput-wide p1, p0, Lv4/c0;->F:J

    .line 23
    .line 24
    return-void
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

.method public final q(Lm4/i1;Z)V
    .locals 37

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lv4/c0;->z:Lv4/u0;

    .line 4
    .line 5
    iget-object v3, v1, Lv4/c0;->N:Lv4/b0;

    .line 6
    .line 7
    iget-object v9, v1, Lv4/c0;->r:Lv4/j0;

    .line 8
    .line 9
    iget v4, v1, Lv4/c0;->H:I

    .line 10
    .line 11
    iget-boolean v5, v1, Lv4/c0;->I:Z

    .line 12
    .line 13
    iget-object v2, v1, Lv4/c0;->k:Lm4/h1;

    .line 14
    .line 15
    iget-object v8, v1, Lv4/c0;->l:Lm4/f1;

    .line 16
    .line 17
    invoke-virtual/range {p1 .. p1}, Lm4/i1;->p()Z

    .line 18
    .line 19
    .line 20
    move-result v6

    .line 21
    const/4 v10, 0x4

    .line 22
    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    if-eqz v6, :cond_0

    .line 28
    .line 29
    new-instance v18, Lv4/a0;

    .line 30
    .line 31
    sget-object v19, Lv4/u0;->u:Lj5/d0;

    .line 32
    .line 33
    const/16 v25, 0x1

    .line 34
    .line 35
    const/16 v26, 0x0

    .line 36
    .line 37
    const-wide/16 v20, 0x0

    .line 38
    .line 39
    const-wide v22, -0x7fffffffffffffffL    # -4.9E-324

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    const/16 v24, 0x0

    .line 45
    .line 46
    invoke-direct/range {v18 .. v26}, Lv4/a0;-><init>(Lj5/d0;JJZZZ)V

    .line 47
    .line 48
    .line 49
    move-object/from16 v2, p1

    .line 50
    .line 51
    move-object/from16 v10, v18

    .line 52
    .line 53
    const/4 v14, -0x1

    .line 54
    goto/16 :goto_17

    .line 55
    .line 56
    :cond_0
    iget-object v6, v0, Lv4/u0;->b:Lj5/d0;

    .line 57
    .line 58
    iget-object v14, v6, Lj5/d0;->a:Ljava/lang/Object;

    .line 59
    .line 60
    iget-object v7, v0, Lv4/u0;->a:Lm4/i1;

    .line 61
    .line 62
    invoke-virtual {v7}, Lm4/i1;->p()Z

    .line 63
    .line 64
    .line 65
    move-result v20

    .line 66
    if-nez v20, :cond_2

    .line 67
    .line 68
    iget-object v15, v6, Lj5/d0;->a:Ljava/lang/Object;

    .line 69
    .line 70
    invoke-virtual {v7, v15, v8}, Lm4/i1;->g(Ljava/lang/Object;Lm4/f1;)Lm4/f1;

    .line 71
    .line 72
    .line 73
    move-result-object v7

    .line 74
    iget-boolean v7, v7, Lm4/f1;->f:Z

    .line 75
    .line 76
    if-eqz v7, :cond_1

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_1
    const/4 v15, 0x0

    .line 80
    goto :goto_1

    .line 81
    :cond_2
    :goto_0
    const/4 v15, 0x1

    .line 82
    :goto_1
    iget-object v7, v0, Lv4/u0;->b:Lj5/d0;

    .line 83
    .line 84
    invoke-virtual {v7}, Lj5/d0;->b()Z

    .line 85
    .line 86
    .line 87
    move-result v7

    .line 88
    if-nez v7, :cond_4

    .line 89
    .line 90
    if-eqz v15, :cond_3

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_3
    iget-wide v11, v0, Lv4/u0;->s:J

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_4
    :goto_2
    iget-wide v11, v0, Lv4/u0;->c:J

    .line 97
    .line 98
    :goto_3
    if-eqz v3, :cond_8

    .line 99
    .line 100
    move-object v7, v6

    .line 101
    move v6, v5

    .line 102
    move v5, v4

    .line 103
    const/4 v4, 0x1

    .line 104
    move-object v13, v7

    .line 105
    move-object v7, v2

    .line 106
    move-object/from16 v2, p1

    .line 107
    .line 108
    invoke-static/range {v2 .. v8}, Lv4/c0;->M(Lm4/i1;Lv4/b0;ZIZLm4/h1;Lm4/f1;)Landroid/util/Pair;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    if-nez v4, :cond_5

    .line 113
    .line 114
    invoke-virtual {v2, v6}, Lm4/i1;->a(Z)I

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    move v5, v3

    .line 119
    move-wide v3, v11

    .line 120
    const/4 v6, 0x0

    .line 121
    const/16 v19, 0x1

    .line 122
    .line 123
    const/16 v24, 0x0

    .line 124
    .line 125
    goto :goto_6

    .line 126
    :cond_5
    iget-wide v5, v3, Lv4/b0;->c:J

    .line 127
    .line 128
    cmp-long v3, v5, v16

    .line 129
    .line 130
    if-nez v3, :cond_6

    .line 131
    .line 132
    iget-object v3, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 133
    .line 134
    invoke-virtual {v2, v3, v8}, Lm4/i1;->g(Ljava/lang/Object;Lm4/f1;)Lm4/f1;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    iget v3, v3, Lm4/f1;->c:I

    .line 139
    .line 140
    move v5, v3

    .line 141
    move-wide/from16 v24, v11

    .line 142
    .line 143
    const/4 v6, 0x0

    .line 144
    goto :goto_4

    .line 145
    :cond_6
    iget-object v14, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 146
    .line 147
    iget-object v3, v4, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v3, Ljava/lang/Long;

    .line 150
    .line 151
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 152
    .line 153
    .line 154
    move-result-wide v3

    .line 155
    move-wide/from16 v24, v3

    .line 156
    .line 157
    const/4 v5, -0x1

    .line 158
    const/4 v6, 0x1

    .line 159
    :goto_4
    iget v3, v0, Lv4/u0;->e:I

    .line 160
    .line 161
    if-ne v3, v10, :cond_7

    .line 162
    .line 163
    const/4 v3, 0x1

    .line 164
    goto :goto_5

    .line 165
    :cond_7
    const/4 v3, 0x0

    .line 166
    :goto_5
    move/from16 v19, v6

    .line 167
    .line 168
    move v6, v3

    .line 169
    move-wide/from16 v3, v24

    .line 170
    .line 171
    move/from16 v24, v19

    .line 172
    .line 173
    const/16 v19, 0x0

    .line 174
    .line 175
    :goto_6
    move-object v10, v7

    .line 176
    move v7, v5

    .line 177
    move-wide v4, v3

    .line 178
    move-object v3, v10

    .line 179
    move/from16 v32, v6

    .line 180
    .line 181
    move-object v6, v14

    .line 182
    move/from16 v33, v19

    .line 183
    .line 184
    move/from16 v34, v24

    .line 185
    .line 186
    const/4 v14, -0x1

    .line 187
    move-wide/from16 v24, v11

    .line 188
    .line 189
    const-wide/16 v10, 0x0

    .line 190
    .line 191
    goto/16 :goto_b

    .line 192
    .line 193
    :cond_8
    move-object v7, v2

    .line 194
    move-object v13, v6

    .line 195
    move-object/from16 v2, p1

    .line 196
    .line 197
    move v6, v5

    .line 198
    move v5, v4

    .line 199
    iget-object v3, v0, Lv4/u0;->a:Lm4/i1;

    .line 200
    .line 201
    invoke-virtual {v3}, Lm4/i1;->p()Z

    .line 202
    .line 203
    .line 204
    move-result v3

    .line 205
    if-eqz v3, :cond_9

    .line 206
    .line 207
    invoke-virtual {v2, v6}, Lm4/i1;->a(Z)I

    .line 208
    .line 209
    .line 210
    move-result v3

    .line 211
    move-object v4, v7

    .line 212
    move v7, v3

    .line 213
    move-object v3, v4

    .line 214
    move-wide v4, v11

    .line 215
    move-wide/from16 v24, v4

    .line 216
    .line 217
    move-object v6, v14

    .line 218
    const-wide/16 v10, 0x0

    .line 219
    .line 220
    const/4 v14, -0x1

    .line 221
    :goto_7
    const/16 v32, 0x0

    .line 222
    .line 223
    const/16 v33, 0x0

    .line 224
    .line 225
    :goto_8
    const/16 v34, 0x0

    .line 226
    .line 227
    goto/16 :goto_b

    .line 228
    .line 229
    :cond_9
    invoke-virtual {v2, v14}, Lm4/i1;->b(Ljava/lang/Object;)I

    .line 230
    .line 231
    .line 232
    move-result v3

    .line 233
    const/4 v4, -0x1

    .line 234
    if-ne v3, v4, :cond_b

    .line 235
    .line 236
    move-object v3, v7

    .line 237
    iget-object v7, v0, Lv4/u0;->a:Lm4/i1;

    .line 238
    .line 239
    move-object v4, v8

    .line 240
    move-object v8, v2

    .line 241
    move-object v2, v3

    .line 242
    move-object v3, v4

    .line 243
    move v4, v5

    .line 244
    move v5, v6

    .line 245
    move-object v6, v14

    .line 246
    const/4 v14, -0x1

    .line 247
    invoke-static/range {v2 .. v8}, Lv4/c0;->N(Lm4/h1;Lm4/f1;IZLjava/lang/Object;Lm4/i1;Lm4/i1;)I

    .line 248
    .line 249
    .line 250
    move-result v4

    .line 251
    move-object/from16 v35, v3

    .line 252
    .line 253
    move-object v3, v2

    .line 254
    move-object v2, v8

    .line 255
    move-object/from16 v8, v35

    .line 256
    .line 257
    if-ne v4, v14, :cond_a

    .line 258
    .line 259
    invoke-virtual {v2, v5}, Lm4/i1;->a(Z)I

    .line 260
    .line 261
    .line 262
    move-result v4

    .line 263
    move v7, v4

    .line 264
    const/4 v4, 0x1

    .line 265
    goto :goto_9

    .line 266
    :cond_a
    move v7, v4

    .line 267
    const/4 v4, 0x0

    .line 268
    :goto_9
    move/from16 v33, v4

    .line 269
    .line 270
    move-wide v4, v11

    .line 271
    move-wide/from16 v24, v4

    .line 272
    .line 273
    const-wide/16 v10, 0x0

    .line 274
    .line 275
    const/16 v32, 0x0

    .line 276
    .line 277
    goto :goto_8

    .line 278
    :cond_b
    move-object v3, v7

    .line 279
    move-object v6, v14

    .line 280
    const/4 v14, -0x1

    .line 281
    cmp-long v4, v11, v16

    .line 282
    .line 283
    if-nez v4, :cond_c

    .line 284
    .line 285
    invoke-virtual {v2, v6, v8}, Lm4/i1;->g(Ljava/lang/Object;Lm4/f1;)Lm4/f1;

    .line 286
    .line 287
    .line 288
    move-result-object v4

    .line 289
    iget v7, v4, Lm4/f1;->c:I

    .line 290
    .line 291
    move-wide v4, v11

    .line 292
    move-wide/from16 v24, v4

    .line 293
    .line 294
    const-wide/16 v10, 0x0

    .line 295
    .line 296
    goto :goto_7

    .line 297
    :cond_c
    if-eqz v15, :cond_e

    .line 298
    .line 299
    iget-object v4, v0, Lv4/u0;->a:Lm4/i1;

    .line 300
    .line 301
    iget-object v5, v13, Lj5/d0;->a:Ljava/lang/Object;

    .line 302
    .line 303
    invoke-virtual {v4, v5, v8}, Lm4/i1;->g(Ljava/lang/Object;Lm4/f1;)Lm4/f1;

    .line 304
    .line 305
    .line 306
    iget-object v4, v0, Lv4/u0;->a:Lm4/i1;

    .line 307
    .line 308
    iget v5, v8, Lm4/f1;->c:I

    .line 309
    .line 310
    move-wide/from16 v24, v11

    .line 311
    .line 312
    const-wide/16 v10, 0x0

    .line 313
    .line 314
    invoke-virtual {v4, v5, v3, v10, v11}, Lm4/i1;->m(ILm4/h1;J)Lm4/h1;

    .line 315
    .line 316
    .line 317
    move-result-object v4

    .line 318
    iget v4, v4, Lm4/h1;->n:I

    .line 319
    .line 320
    iget-object v5, v0, Lv4/u0;->a:Lm4/i1;

    .line 321
    .line 322
    iget-object v7, v13, Lj5/d0;->a:Ljava/lang/Object;

    .line 323
    .line 324
    invoke-virtual {v5, v7}, Lm4/i1;->b(Ljava/lang/Object;)I

    .line 325
    .line 326
    .line 327
    move-result v5

    .line 328
    if-ne v4, v5, :cond_d

    .line 329
    .line 330
    iget-wide v4, v8, Lm4/f1;->e:J

    .line 331
    .line 332
    add-long v4, v24, v4

    .line 333
    .line 334
    invoke-virtual {v2, v6, v8}, Lm4/i1;->g(Ljava/lang/Object;Lm4/f1;)Lm4/f1;

    .line 335
    .line 336
    .line 337
    move-result-object v6

    .line 338
    iget v6, v6, Lm4/f1;->c:I

    .line 339
    .line 340
    move-wide/from16 v35, v4

    .line 341
    .line 342
    move v5, v6

    .line 343
    move-wide/from16 v6, v35

    .line 344
    .line 345
    move-object v4, v8

    .line 346
    invoke-virtual/range {v2 .. v7}, Lm4/i1;->i(Lm4/h1;Lm4/f1;IJ)Landroid/util/Pair;

    .line 347
    .line 348
    .line 349
    move-result-object v5

    .line 350
    iget-object v2, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 351
    .line 352
    iget-object v4, v5, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 353
    .line 354
    check-cast v4, Ljava/lang/Long;

    .line 355
    .line 356
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 357
    .line 358
    .line 359
    move-result-wide v4

    .line 360
    goto :goto_a

    .line 361
    :cond_d
    move-object v2, v6

    .line 362
    move-wide/from16 v4, v24

    .line 363
    .line 364
    :goto_a
    move-object v6, v2

    .line 365
    const/4 v7, -0x1

    .line 366
    const/16 v32, 0x0

    .line 367
    .line 368
    const/16 v33, 0x0

    .line 369
    .line 370
    const/16 v34, 0x1

    .line 371
    .line 372
    goto :goto_b

    .line 373
    :cond_e
    move-wide/from16 v24, v11

    .line 374
    .line 375
    const-wide/16 v10, 0x0

    .line 376
    .line 377
    move-wide/from16 v4, v24

    .line 378
    .line 379
    const/4 v7, -0x1

    .line 380
    goto/16 :goto_7

    .line 381
    .line 382
    :goto_b
    if-eq v7, v14, :cond_f

    .line 383
    .line 384
    move v5, v7

    .line 385
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    move-object/from16 v2, p1

    .line 391
    .line 392
    move-object v4, v8

    .line 393
    invoke-virtual/range {v2 .. v7}, Lm4/i1;->i(Lm4/h1;Lm4/f1;IJ)Landroid/util/Pair;

    .line 394
    .line 395
    .line 396
    move-result-object v3

    .line 397
    iget-object v6, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 398
    .line 399
    iget-object v3, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 400
    .line 401
    check-cast v3, Ljava/lang/Long;

    .line 402
    .line 403
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 404
    .line 405
    .line 406
    move-result-wide v4

    .line 407
    move-wide/from16 v30, v16

    .line 408
    .line 409
    goto :goto_c

    .line 410
    :cond_f
    move-object/from16 v2, p1

    .line 411
    .line 412
    move-wide/from16 v22, v4

    .line 413
    .line 414
    move-wide/from16 v30, v4

    .line 415
    .line 416
    :goto_c
    invoke-virtual {v9, v2, v6, v4, v5}, Lv4/j0;->p(Lm4/i1;Ljava/lang/Object;J)Lj5/d0;

    .line 417
    .line 418
    .line 419
    move-result-object v3

    .line 420
    iget v7, v3, Lj5/d0;->e:I

    .line 421
    .line 422
    if-eq v7, v14, :cond_11

    .line 423
    .line 424
    iget v9, v13, Lj5/d0;->e:I

    .line 425
    .line 426
    if-eq v9, v14, :cond_10

    .line 427
    .line 428
    if-lt v7, v9, :cond_10

    .line 429
    .line 430
    goto :goto_d

    .line 431
    :cond_10
    const/4 v7, 0x0

    .line 432
    goto :goto_e

    .line 433
    :cond_11
    :goto_d
    const/4 v7, 0x1

    .line 434
    :goto_e
    iget-object v9, v13, Lj5/d0;->a:Ljava/lang/Object;

    .line 435
    .line 436
    invoke-virtual {v9, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 437
    .line 438
    .line 439
    move-result v9

    .line 440
    if-eqz v9, :cond_12

    .line 441
    .line 442
    invoke-virtual {v13}, Lj5/d0;->b()Z

    .line 443
    .line 444
    .line 445
    move-result v9

    .line 446
    if-nez v9, :cond_12

    .line 447
    .line 448
    invoke-virtual {v3}, Lj5/d0;->b()Z

    .line 449
    .line 450
    .line 451
    move-result v9

    .line 452
    if-nez v9, :cond_12

    .line 453
    .line 454
    if-eqz v7, :cond_12

    .line 455
    .line 456
    const/4 v7, 0x1

    .line 457
    goto :goto_f

    .line 458
    :cond_12
    const/4 v7, 0x0

    .line 459
    :goto_f
    invoke-virtual {v2, v6, v8}, Lm4/i1;->g(Ljava/lang/Object;Lm4/f1;)Lm4/f1;

    .line 460
    .line 461
    .line 462
    move-result-object v6

    .line 463
    if-nez v15, :cond_14

    .line 464
    .line 465
    cmp-long v9, v24, v30

    .line 466
    .line 467
    if-nez v9, :cond_14

    .line 468
    .line 469
    iget-object v9, v13, Lj5/d0;->a:Ljava/lang/Object;

    .line 470
    .line 471
    iget v12, v13, Lj5/d0;->c:I

    .line 472
    .line 473
    iget v15, v13, Lj5/d0;->b:I

    .line 474
    .line 475
    iget-object v10, v3, Lj5/d0;->a:Ljava/lang/Object;

    .line 476
    .line 477
    invoke-virtual {v9, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 478
    .line 479
    .line 480
    move-result v9

    .line 481
    if-nez v9, :cond_13

    .line 482
    .line 483
    goto :goto_11

    .line 484
    :cond_13
    invoke-virtual {v13}, Lj5/d0;->b()Z

    .line 485
    .line 486
    .line 487
    move-result v9

    .line 488
    if-eqz v9, :cond_15

    .line 489
    .line 490
    invoke-virtual {v6, v15}, Lm4/f1;->h(I)Z

    .line 491
    .line 492
    .line 493
    move-result v9

    .line 494
    if-eqz v9, :cond_15

    .line 495
    .line 496
    invoke-virtual {v6, v15, v12}, Lm4/f1;->e(II)I

    .line 497
    .line 498
    .line 499
    move-result v9

    .line 500
    const/4 v10, 0x4

    .line 501
    if-eq v9, v10, :cond_14

    .line 502
    .line 503
    invoke-virtual {v6, v15, v12}, Lm4/f1;->e(II)I

    .line 504
    .line 505
    .line 506
    move-result v6

    .line 507
    const/4 v9, 0x2

    .line 508
    if-eq v6, v9, :cond_14

    .line 509
    .line 510
    :goto_10
    const/4 v6, 0x1

    .line 511
    goto :goto_12

    .line 512
    :cond_14
    :goto_11
    const/4 v6, 0x0

    .line 513
    goto :goto_12

    .line 514
    :cond_15
    invoke-virtual {v3}, Lj5/d0;->b()Z

    .line 515
    .line 516
    .line 517
    move-result v9

    .line 518
    if-eqz v9, :cond_14

    .line 519
    .line 520
    iget v9, v3, Lj5/d0;->b:I

    .line 521
    .line 522
    invoke-virtual {v6, v9}, Lm4/f1;->h(I)Z

    .line 523
    .line 524
    .line 525
    move-result v6

    .line 526
    if-eqz v6, :cond_14

    .line 527
    .line 528
    goto :goto_10

    .line 529
    :goto_12
    if-nez v7, :cond_17

    .line 530
    .line 531
    if-eqz v6, :cond_16

    .line 532
    .line 533
    goto :goto_13

    .line 534
    :cond_16
    move-object v6, v3

    .line 535
    goto :goto_14

    .line 536
    :cond_17
    :goto_13
    move-object v6, v13

    .line 537
    :goto_14
    invoke-virtual {v6}, Lj5/d0;->b()Z

    .line 538
    .line 539
    .line 540
    move-result v3

    .line 541
    if-eqz v3, :cond_18

    .line 542
    .line 543
    invoke-virtual {v6, v13}, Lj5/d0;->equals(Ljava/lang/Object;)Z

    .line 544
    .line 545
    .line 546
    move-result v3

    .line 547
    if-eqz v3, :cond_19

    .line 548
    .line 549
    iget-wide v4, v0, Lv4/u0;->s:J

    .line 550
    .line 551
    :cond_18
    :goto_15
    move-wide/from16 v28, v4

    .line 552
    .line 553
    goto :goto_16

    .line 554
    :cond_19
    iget-object v0, v6, Lj5/d0;->a:Ljava/lang/Object;

    .line 555
    .line 556
    invoke-virtual {v2, v0, v8}, Lm4/i1;->g(Ljava/lang/Object;Lm4/f1;)Lm4/f1;

    .line 557
    .line 558
    .line 559
    iget v0, v6, Lj5/d0;->c:I

    .line 560
    .line 561
    iget v3, v6, Lj5/d0;->b:I

    .line 562
    .line 563
    invoke-virtual {v8, v3}, Lm4/f1;->f(I)I

    .line 564
    .line 565
    .line 566
    move-result v3

    .line 567
    if-ne v0, v3, :cond_1a

    .line 568
    .line 569
    iget-object v0, v8, Lm4/f1;->g:Lm4/b;

    .line 570
    .line 571
    iget-wide v3, v0, Lm4/b;->b:J

    .line 572
    .line 573
    move-wide v4, v3

    .line 574
    goto :goto_15

    .line 575
    :cond_1a
    const-wide/16 v4, 0x0

    .line 576
    .line 577
    goto :goto_15

    .line 578
    :goto_16
    new-instance v26, Lv4/a0;

    .line 579
    .line 580
    move-object/from16 v27, v6

    .line 581
    .line 582
    invoke-direct/range {v26 .. v34}, Lv4/a0;-><init>(Lj5/d0;JJZZZ)V

    .line 583
    .line 584
    .line 585
    move-object/from16 v10, v26

    .line 586
    .line 587
    :goto_17
    iget-object v11, v10, Lv4/a0;->a:Lj5/d0;

    .line 588
    .line 589
    iget-wide v12, v10, Lv4/a0;->c:J

    .line 590
    .line 591
    iget-boolean v6, v10, Lv4/a0;->d:Z

    .line 592
    .line 593
    iget-wide v3, v10, Lv4/a0;->b:J

    .line 594
    .line 595
    iget-object v0, v1, Lv4/c0;->z:Lv4/u0;

    .line 596
    .line 597
    iget-object v0, v0, Lv4/u0;->b:Lj5/d0;

    .line 598
    .line 599
    invoke-virtual {v0, v11}, Lj5/d0;->equals(Ljava/lang/Object;)Z

    .line 600
    .line 601
    .line 602
    move-result v0

    .line 603
    if-eqz v0, :cond_1c

    .line 604
    .line 605
    iget-object v0, v1, Lv4/c0;->z:Lv4/u0;

    .line 606
    .line 607
    iget-wide v7, v0, Lv4/u0;->s:J

    .line 608
    .line 609
    cmp-long v0, v3, v7

    .line 610
    .line 611
    if-eqz v0, :cond_1b

    .line 612
    .line 613
    goto :goto_18

    .line 614
    :cond_1b
    const/4 v15, 0x0

    .line 615
    goto :goto_19

    .line 616
    :cond_1c
    :goto_18
    const/4 v15, 0x1

    .line 617
    :goto_19
    const/16 v24, 0x3

    .line 618
    .line 619
    :try_start_0
    iget-boolean v0, v10, Lv4/a0;->e:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 620
    .line 621
    if-eqz v0, :cond_1e

    .line 622
    .line 623
    :try_start_1
    iget-object v0, v1, Lv4/c0;->z:Lv4/u0;

    .line 624
    .line 625
    iget v0, v0, Lv4/u0;->e:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 626
    .line 627
    const/4 v7, 0x1

    .line 628
    if-eq v0, v7, :cond_1d

    .line 629
    .line 630
    const/4 v8, 0x4

    .line 631
    :try_start_2
    invoke-virtual {v1, v8}, Lv4/c0;->d0(I)V

    .line 632
    .line 633
    .line 634
    :goto_1a
    const/4 v9, 0x0

    .line 635
    goto :goto_1c

    .line 636
    :catchall_0
    move-exception v0

    .line 637
    :goto_1b
    move-object v14, v11

    .line 638
    move-object v11, v2

    .line 639
    move-object v2, v14

    .line 640
    move-wide/from16 v22, v3

    .line 641
    .line 642
    const/4 v14, 0x0

    .line 643
    const/16 v19, 0x4

    .line 644
    .line 645
    const/16 v20, 0x1

    .line 646
    .line 647
    goto/16 :goto_2f

    .line 648
    .line 649
    :cond_1d
    const/4 v8, 0x4

    .line 650
    goto :goto_1a

    .line 651
    :goto_1c
    invoke-virtual {v1, v9, v9, v9, v7}, Lv4/c0;->I(ZZZZ)V

    .line 652
    .line 653
    .line 654
    goto :goto_1d

    .line 655
    :catchall_1
    move-exception v0

    .line 656
    const/4 v7, 0x1

    .line 657
    const/4 v8, 0x4

    .line 658
    goto :goto_1b

    .line 659
    :cond_1e
    const/4 v7, 0x1

    .line 660
    const/4 v8, 0x4

    .line 661
    :goto_1d
    iget-object v0, v1, Lv4/c0;->a:[Lv4/a1;

    .line 662
    .line 663
    array-length v9, v0

    .line 664
    const/4 v5, 0x0

    .line 665
    :goto_1e
    if-ge v5, v9, :cond_21

    .line 666
    .line 667
    aget-object v7, v0, v5

    .line 668
    .line 669
    iget-object v8, v7, Lv4/a1;->a:Lv4/e;

    .line 670
    .line 671
    iget-object v14, v8, Lv4/e;->p:Lm4/i1;

    .line 672
    .line 673
    sget v26, Lp4/c0;->a:I

    .line 674
    .line 675
    invoke-static {v14, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 676
    .line 677
    .line 678
    move-result v14

    .line 679
    if-nez v14, :cond_1f

    .line 680
    .line 681
    iput-object v2, v8, Lv4/e;->p:Lm4/i1;

    .line 682
    .line 683
    :cond_1f
    iget-object v7, v7, Lv4/a1;->c:Lv4/e;

    .line 684
    .line 685
    if-eqz v7, :cond_20

    .line 686
    .line 687
    iget-object v8, v7, Lv4/e;->p:Lm4/i1;

    .line 688
    .line 689
    invoke-static {v8, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 690
    .line 691
    .line 692
    move-result v8

    .line 693
    if-nez v8, :cond_20

    .line 694
    .line 695
    iput-object v2, v7, Lv4/e;->p:Lm4/i1;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 696
    .line 697
    :cond_20
    add-int/lit8 v5, v5, 0x1

    .line 698
    .line 699
    const/4 v7, 0x1

    .line 700
    const/4 v8, 0x4

    .line 701
    const/4 v14, -0x1

    .line 702
    goto :goto_1e

    .line 703
    :cond_21
    if-nez v15, :cond_27

    .line 704
    .line 705
    :try_start_3
    iget-object v0, v1, Lv4/c0;->r:Lv4/j0;

    .line 706
    .line 707
    iget-object v0, v0, Lv4/j0;->j:Lv4/h0;

    .line 708
    .line 709
    if-nez v0, :cond_22

    .line 710
    .line 711
    const-wide/16 v6, 0x0

    .line 712
    .line 713
    goto :goto_1f

    .line 714
    :cond_22
    invoke-virtual {v1, v0}, Lv4/c0;->k(Lv4/h0;)J

    .line 715
    .line 716
    .line 717
    move-result-wide v5

    .line 718
    move-wide v6, v5

    .line 719
    :goto_1f
    invoke-virtual {v1}, Lv4/c0;->d()Z

    .line 720
    .line 721
    .line 722
    move-result v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_6

    .line 723
    if-eqz v0, :cond_24

    .line 724
    .line 725
    :try_start_4
    iget-object v0, v1, Lv4/c0;->r:Lv4/j0;

    .line 726
    .line 727
    iget-object v0, v0, Lv4/j0;->k:Lv4/h0;

    .line 728
    .line 729
    if-nez v0, :cond_23

    .line 730
    .line 731
    goto :goto_20

    .line 732
    :cond_23
    invoke-virtual {v1, v0}, Lv4/c0;->k(Lv4/h0;)J

    .line 733
    .line 734
    .line 735
    move-result-wide v8
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 736
    goto :goto_21

    .line 737
    :cond_24
    :goto_20
    const-wide/16 v8, 0x0

    .line 738
    .line 739
    :goto_21
    :try_start_5
    iget-object v2, v1, Lv4/c0;->r:Lv4/j0;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 740
    .line 741
    move-wide/from16 v22, v3

    .line 742
    .line 743
    :try_start_6
    iget-wide v4, v1, Lv4/c0;->O:J
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 744
    .line 745
    move-object/from16 v3, p1

    .line 746
    .line 747
    const/4 v14, 0x0

    .line 748
    const/16 v19, 0x4

    .line 749
    .line 750
    const/16 v20, 0x1

    .line 751
    .line 752
    :try_start_7
    invoke-virtual/range {v2 .. v9}, Lv4/j0;->s(Lm4/i1;JJJ)I

    .line 753
    .line 754
    .line 755
    move-result v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 756
    move-object v8, v3

    .line 757
    and-int/lit8 v2, v0, 0x1

    .line 758
    .line 759
    if-eqz v2, :cond_25

    .line 760
    .line 761
    const/4 v9, 0x0

    .line 762
    :try_start_8
    invoke-virtual {v1, v9}, Lv4/c0;->P(Z)V

    .line 763
    .line 764
    .line 765
    goto :goto_24

    .line 766
    :catchall_2
    move-exception v0

    .line 767
    :goto_22
    move-object v2, v11

    .line 768
    :goto_23
    move-object v11, v8

    .line 769
    goto/16 :goto_2f

    .line 770
    .line 771
    :cond_25
    const/16 v21, 0x2

    .line 772
    .line 773
    and-int/lit8 v0, v0, 0x2

    .line 774
    .line 775
    if-eqz v0, :cond_26

    .line 776
    .line 777
    invoke-virtual {v1}, Lv4/c0;->e()V

    .line 778
    .line 779
    .line 780
    :cond_26
    :goto_24
    move-object v2, v11

    .line 781
    goto/16 :goto_2a

    .line 782
    .line 783
    :catchall_3
    move-exception v0

    .line 784
    move-object v8, v3

    .line 785
    goto :goto_22

    .line 786
    :catchall_4
    move-exception v0

    .line 787
    move-object/from16 v8, p1

    .line 788
    .line 789
    :goto_25
    const/4 v14, 0x0

    .line 790
    const/16 v19, 0x4

    .line 791
    .line 792
    const/16 v20, 0x1

    .line 793
    .line 794
    goto :goto_22

    .line 795
    :catchall_5
    move-exception v0

    .line 796
    move-object/from16 v8, p1

    .line 797
    .line 798
    :goto_26
    move-wide/from16 v22, v3

    .line 799
    .line 800
    goto :goto_25

    .line 801
    :catchall_6
    move-exception v0

    .line 802
    move-object v8, v2

    .line 803
    goto :goto_26

    .line 804
    :cond_27
    move-object v8, v2

    .line 805
    move-wide/from16 v22, v3

    .line 806
    .line 807
    const/4 v14, 0x0

    .line 808
    const/16 v19, 0x4

    .line 809
    .line 810
    const/16 v20, 0x1

    .line 811
    .line 812
    invoke-virtual {v8}, Lm4/i1;->p()Z

    .line 813
    .line 814
    .line 815
    move-result v0

    .line 816
    if-nez v0, :cond_26

    .line 817
    .line 818
    iget-object v0, v1, Lv4/c0;->r:Lv4/j0;

    .line 819
    .line 820
    iget-object v0, v0, Lv4/j0;->i:Lv4/h0;

    .line 821
    .line 822
    :goto_27
    if-eqz v0, :cond_29

    .line 823
    .line 824
    iget-object v2, v0, Lv4/h0;->g:Lv4/i0;

    .line 825
    .line 826
    iget-object v2, v2, Lv4/i0;->a:Lj5/d0;

    .line 827
    .line 828
    invoke-virtual {v2, v11}, Lj5/d0;->equals(Ljava/lang/Object;)Z

    .line 829
    .line 830
    .line 831
    move-result v2

    .line 832
    if-eqz v2, :cond_28

    .line 833
    .line 834
    iget-object v2, v1, Lv4/c0;->r:Lv4/j0;

    .line 835
    .line 836
    iget-object v3, v0, Lv4/h0;->g:Lv4/i0;

    .line 837
    .line 838
    invoke-virtual {v2, v8, v3}, Lv4/j0;->h(Lm4/i1;Lv4/i0;)Lv4/i0;

    .line 839
    .line 840
    .line 841
    move-result-object v2

    .line 842
    iput-object v2, v0, Lv4/h0;->g:Lv4/i0;

    .line 843
    .line 844
    invoke-virtual {v0}, Lv4/h0;->k()V

    .line 845
    .line 846
    .line 847
    :cond_28
    iget-object v0, v0, Lv4/h0;->m:Lv4/h0;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 848
    .line 849
    goto :goto_27

    .line 850
    :cond_29
    :try_start_9
    iget-object v0, v1, Lv4/c0;->r:Lv4/j0;

    .line 851
    .line 852
    iget-object v2, v0, Lv4/j0;->i:Lv4/h0;

    .line 853
    .line 854
    iget-object v0, v0, Lv4/j0;->j:Lv4/h0;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_8

    .line 855
    .line 856
    if-eq v2, v0, :cond_2a

    .line 857
    .line 858
    const/4 v5, 0x1

    .line 859
    :goto_28
    move-object v2, v11

    .line 860
    move-wide/from16 v3, v22

    .line 861
    .line 862
    goto :goto_29

    .line 863
    :cond_2a
    const/4 v5, 0x0

    .line 864
    goto :goto_28

    .line 865
    :goto_29
    :try_start_a
    invoke-virtual/range {v1 .. v6}, Lv4/c0;->R(Lj5/d0;JZZ)J

    .line 866
    .line 867
    .line 868
    move-result-wide v3
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    .line 869
    move-wide/from16 v22, v3

    .line 870
    .line 871
    goto :goto_2a

    .line 872
    :catchall_7
    move-exception v0

    .line 873
    move-wide/from16 v22, v3

    .line 874
    .line 875
    goto :goto_23

    .line 876
    :catchall_8
    move-exception v0

    .line 877
    goto :goto_22

    .line 878
    :goto_2a
    iget-object v0, v1, Lv4/c0;->z:Lv4/u0;

    .line 879
    .line 880
    iget-object v4, v0, Lv4/u0;->a:Lm4/i1;

    .line 881
    .line 882
    iget-object v5, v0, Lv4/u0;->b:Lj5/d0;

    .line 883
    .line 884
    iget-boolean v0, v10, Lv4/a0;->f:Z

    .line 885
    .line 886
    if-eqz v0, :cond_2b

    .line 887
    .line 888
    move-wide/from16 v6, v22

    .line 889
    .line 890
    goto :goto_2b

    .line 891
    :cond_2b
    move-wide/from16 v6, v16

    .line 892
    .line 893
    :goto_2b
    const/4 v8, 0x0

    .line 894
    move-object v3, v2

    .line 895
    move-object/from16 v2, p1

    .line 896
    .line 897
    invoke-virtual/range {v1 .. v8}, Lv4/c0;->o0(Lm4/i1;Lj5/d0;Lm4/i1;Lj5/d0;JZ)V

    .line 898
    .line 899
    .line 900
    move-object v11, v2

    .line 901
    move-object v2, v3

    .line 902
    if-nez v15, :cond_2c

    .line 903
    .line 904
    iget-object v0, v1, Lv4/c0;->z:Lv4/u0;

    .line 905
    .line 906
    iget-wide v3, v0, Lv4/u0;->c:J

    .line 907
    .line 908
    cmp-long v0, v12, v3

    .line 909
    .line 910
    if-eqz v0, :cond_2f

    .line 911
    .line 912
    :cond_2c
    iget-object v0, v1, Lv4/c0;->z:Lv4/u0;

    .line 913
    .line 914
    iget-object v3, v0, Lv4/u0;->b:Lj5/d0;

    .line 915
    .line 916
    iget-object v3, v3, Lj5/d0;->a:Ljava/lang/Object;

    .line 917
    .line 918
    iget-object v0, v0, Lv4/u0;->a:Lm4/i1;

    .line 919
    .line 920
    if-eqz v15, :cond_2d

    .line 921
    .line 922
    if-eqz p2, :cond_2d

    .line 923
    .line 924
    invoke-virtual {v0}, Lm4/i1;->p()Z

    .line 925
    .line 926
    .line 927
    move-result v4

    .line 928
    if-nez v4, :cond_2d

    .line 929
    .line 930
    iget-object v4, v1, Lv4/c0;->l:Lm4/f1;

    .line 931
    .line 932
    invoke-virtual {v0, v3, v4}, Lm4/i1;->g(Ljava/lang/Object;Lm4/f1;)Lm4/f1;

    .line 933
    .line 934
    .line 935
    move-result-object v0

    .line 936
    iget-boolean v0, v0, Lm4/f1;->f:Z

    .line 937
    .line 938
    if-nez v0, :cond_2d

    .line 939
    .line 940
    const/4 v9, 0x1

    .line 941
    goto :goto_2c

    .line 942
    :cond_2d
    const/4 v9, 0x0

    .line 943
    :goto_2c
    iget-object v0, v1, Lv4/c0;->z:Lv4/u0;

    .line 944
    .line 945
    iget-wide v7, v0, Lv4/u0;->d:J

    .line 946
    .line 947
    invoke-virtual {v11, v3}, Lm4/i1;->b(Ljava/lang/Object;)I

    .line 948
    .line 949
    .line 950
    move-result v0

    .line 951
    const/4 v4, -0x1

    .line 952
    if-ne v0, v4, :cond_2e

    .line 953
    .line 954
    const/4 v10, 0x4

    .line 955
    :goto_2d
    move-wide v5, v12

    .line 956
    move-wide/from16 v3, v22

    .line 957
    .line 958
    goto :goto_2e

    .line 959
    :cond_2e
    const/4 v10, 0x3

    .line 960
    goto :goto_2d

    .line 961
    :goto_2e
    invoke-virtual/range {v1 .. v10}, Lv4/c0;->t(Lj5/d0;JJJZI)Lv4/u0;

    .line 962
    .line 963
    .line 964
    move-result-object v0

    .line 965
    iput-object v0, v1, Lv4/c0;->z:Lv4/u0;

    .line 966
    .line 967
    :cond_2f
    invoke-virtual {v1}, Lv4/c0;->J()V

    .line 968
    .line 969
    .line 970
    iget-object v0, v1, Lv4/c0;->z:Lv4/u0;

    .line 971
    .line 972
    iget-object v0, v0, Lv4/u0;->a:Lm4/i1;

    .line 973
    .line 974
    invoke-virtual {v1, v11, v0}, Lv4/c0;->L(Lm4/i1;Lm4/i1;)V

    .line 975
    .line 976
    .line 977
    iget-object v0, v1, Lv4/c0;->z:Lv4/u0;

    .line 978
    .line 979
    invoke-virtual {v0, v11}, Lv4/u0;->g(Lm4/i1;)Lv4/u0;

    .line 980
    .line 981
    .line 982
    move-result-object v0

    .line 983
    iput-object v0, v1, Lv4/c0;->z:Lv4/u0;

    .line 984
    .line 985
    invoke-virtual {v11}, Lm4/i1;->p()Z

    .line 986
    .line 987
    .line 988
    move-result v0

    .line 989
    if-nez v0, :cond_30

    .line 990
    .line 991
    iput-object v14, v1, Lv4/c0;->N:Lv4/b0;

    .line 992
    .line 993
    :cond_30
    const/4 v9, 0x0

    .line 994
    invoke-virtual {v1, v9}, Lv4/c0;->p(Z)V

    .line 995
    .line 996
    .line 997
    iget-object v0, v1, Lv4/c0;->h:Lp4/x;

    .line 998
    .line 999
    const/4 v9, 0x2

    .line 1000
    invoke-virtual {v0, v9}, Lp4/x;->e(I)Z

    .line 1001
    .line 1002
    .line 1003
    return-void

    .line 1004
    :goto_2f
    iget-object v3, v1, Lv4/c0;->z:Lv4/u0;

    .line 1005
    .line 1006
    iget-object v4, v3, Lv4/u0;->a:Lm4/i1;

    .line 1007
    .line 1008
    iget-object v5, v3, Lv4/u0;->b:Lj5/d0;

    .line 1009
    .line 1010
    iget-boolean v3, v10, Lv4/a0;->f:Z

    .line 1011
    .line 1012
    if-eqz v3, :cond_31

    .line 1013
    .line 1014
    move-wide/from16 v6, v22

    .line 1015
    .line 1016
    goto :goto_30

    .line 1017
    :cond_31
    move-wide/from16 v6, v16

    .line 1018
    .line 1019
    :goto_30
    const/4 v8, 0x0

    .line 1020
    move-object v3, v2

    .line 1021
    move-object v2, v11

    .line 1022
    invoke-virtual/range {v1 .. v8}, Lv4/c0;->o0(Lm4/i1;Lj5/d0;Lm4/i1;Lj5/d0;JZ)V

    .line 1023
    .line 1024
    .line 1025
    move-object v2, v3

    .line 1026
    if-nez v15, :cond_32

    .line 1027
    .line 1028
    iget-object v3, v1, Lv4/c0;->z:Lv4/u0;

    .line 1029
    .line 1030
    iget-wide v3, v3, Lv4/u0;->c:J

    .line 1031
    .line 1032
    cmp-long v5, v12, v3

    .line 1033
    .line 1034
    if-eqz v5, :cond_35

    .line 1035
    .line 1036
    :cond_32
    iget-object v3, v1, Lv4/c0;->z:Lv4/u0;

    .line 1037
    .line 1038
    iget-object v4, v3, Lv4/u0;->b:Lj5/d0;

    .line 1039
    .line 1040
    iget-object v4, v4, Lj5/d0;->a:Ljava/lang/Object;

    .line 1041
    .line 1042
    iget-object v3, v3, Lv4/u0;->a:Lm4/i1;

    .line 1043
    .line 1044
    if-eqz v15, :cond_33

    .line 1045
    .line 1046
    if-eqz p2, :cond_33

    .line 1047
    .line 1048
    invoke-virtual {v3}, Lm4/i1;->p()Z

    .line 1049
    .line 1050
    .line 1051
    move-result v5

    .line 1052
    if-nez v5, :cond_33

    .line 1053
    .line 1054
    iget-object v5, v1, Lv4/c0;->l:Lm4/f1;

    .line 1055
    .line 1056
    invoke-virtual {v3, v4, v5}, Lm4/i1;->g(Ljava/lang/Object;Lm4/f1;)Lm4/f1;

    .line 1057
    .line 1058
    .line 1059
    move-result-object v3

    .line 1060
    iget-boolean v3, v3, Lm4/f1;->f:Z

    .line 1061
    .line 1062
    if-nez v3, :cond_33

    .line 1063
    .line 1064
    const/4 v9, 0x1

    .line 1065
    goto :goto_31

    .line 1066
    :cond_33
    const/4 v9, 0x0

    .line 1067
    :goto_31
    iget-object v3, v1, Lv4/c0;->z:Lv4/u0;

    .line 1068
    .line 1069
    iget-wide v7, v3, Lv4/u0;->d:J

    .line 1070
    .line 1071
    invoke-virtual {v11, v4}, Lm4/i1;->b(Ljava/lang/Object;)I

    .line 1072
    .line 1073
    .line 1074
    move-result v3

    .line 1075
    const/4 v4, -0x1

    .line 1076
    if-ne v3, v4, :cond_34

    .line 1077
    .line 1078
    const/4 v10, 0x4

    .line 1079
    :goto_32
    move-wide v5, v12

    .line 1080
    move-wide/from16 v3, v22

    .line 1081
    .line 1082
    goto :goto_33

    .line 1083
    :cond_34
    const/4 v10, 0x3

    .line 1084
    goto :goto_32

    .line 1085
    :goto_33
    invoke-virtual/range {v1 .. v10}, Lv4/c0;->t(Lj5/d0;JJJZI)Lv4/u0;

    .line 1086
    .line 1087
    .line 1088
    move-result-object v2

    .line 1089
    iput-object v2, v1, Lv4/c0;->z:Lv4/u0;

    .line 1090
    .line 1091
    :cond_35
    invoke-virtual {v1}, Lv4/c0;->J()V

    .line 1092
    .line 1093
    .line 1094
    iget-object v2, v1, Lv4/c0;->z:Lv4/u0;

    .line 1095
    .line 1096
    iget-object v2, v2, Lv4/u0;->a:Lm4/i1;

    .line 1097
    .line 1098
    invoke-virtual {v1, v11, v2}, Lv4/c0;->L(Lm4/i1;Lm4/i1;)V

    .line 1099
    .line 1100
    .line 1101
    iget-object v2, v1, Lv4/c0;->z:Lv4/u0;

    .line 1102
    .line 1103
    invoke-virtual {v2, v11}, Lv4/u0;->g(Lm4/i1;)Lv4/u0;

    .line 1104
    .line 1105
    .line 1106
    move-result-object v2

    .line 1107
    iput-object v2, v1, Lv4/c0;->z:Lv4/u0;

    .line 1108
    .line 1109
    invoke-virtual {v11}, Lm4/i1;->p()Z

    .line 1110
    .line 1111
    .line 1112
    move-result v2

    .line 1113
    if-nez v2, :cond_36

    .line 1114
    .line 1115
    iput-object v14, v1, Lv4/c0;->N:Lv4/b0;

    .line 1116
    .line 1117
    :cond_36
    const/4 v9, 0x0

    .line 1118
    invoke-virtual {v1, v9}, Lv4/c0;->p(Z)V

    .line 1119
    .line 1120
    .line 1121
    iget-object v2, v1, Lv4/c0;->h:Lp4/x;

    .line 1122
    .line 1123
    const/4 v9, 0x2

    .line 1124
    invoke-virtual {v2, v9}, Lp4/x;->e(I)Z

    .line 1125
    .line 1126
    .line 1127
    throw v0
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
    .line 2451
    .line 2452
    .line 2453
    .line 2454
    .line 2455
    .line 2456
    .line 2457
    .line 2458
    .line 2459
    .line 2460
    .line 2461
    .line 2462
    .line 2463
    .line 2464
    .line 2465
    .line 2466
    .line 2467
    .line 2468
    .line 2469
    .line 2470
    .line 2471
    .line 2472
    .line 2473
    .line 2474
    .line 2475
    .line 2476
    .line 2477
    .line 2478
    .line 2479
    .line 2480
    .line 2481
    .line 2482
    .line 2483
    .line 2484
    .line 2485
    .line 2486
    .line 2487
    .line 2488
    .line 2489
    .line 2490
    .line 2491
    .line 2492
    .line 2493
    .line 2494
    .line 2495
    .line 2496
    .line 2497
    .line 2498
    .line 2499
    .line 2500
    .line 2501
    .line 2502
    .line 2503
    .line 2504
    .line 2505
    .line 2506
    .line 2507
    .line 2508
    .line 2509
    .line 2510
    .line 2511
    .line 2512
    .line 2513
    .line 2514
    .line 2515
    .line 2516
    .line 2517
    .line 2518
    .line 2519
    .line 2520
    .line 2521
    .line 2522
    .line 2523
    .line 2524
    .line 2525
    .line 2526
    .line 2527
    .line 2528
    .line 2529
    .line 2530
    .line 2531
    .line 2532
    .line 2533
    .line 2534
    .line 2535
    .line 2536
    .line 2537
    .line 2538
    .line 2539
    .line 2540
    .line 2541
    .line 2542
    .line 2543
    .line 2544
    .line 2545
    .line 2546
    .line 2547
    .line 2548
    .line 2549
    .line 2550
    .line 2551
    .line 2552
    .line 2553
    .line 2554
    .line 2555
    .line 2556
    .line 2557
    .line 2558
    .line 2559
    .line 2560
    .line 2561
    .line 2562
    .line 2563
    .line 2564
    .line 2565
    .line 2566
    .line 2567
    .line 2568
    .line 2569
    .line 2570
    .line 2571
    .line 2572
    .line 2573
    .line 2574
    .line 2575
    .line 2576
    .line 2577
    .line 2578
    .line 2579
    .line 2580
    .line 2581
    .line 2582
    .line 2583
    .line 2584
    .line 2585
    .line 2586
    .line 2587
    .line 2588
    .line 2589
    .line 2590
    .line 2591
    .line 2592
    .line 2593
    .line 2594
    .line 2595
    .line 2596
    .line 2597
    .line 2598
    .line 2599
    .line 2600
    .line 2601
    .line 2602
    .line 2603
    .line 2604
    .line 2605
    .line 2606
    .line 2607
    .line 2608
    .line 2609
    .line 2610
    .line 2611
    .line 2612
    .line 2613
    .line 2614
    .line 2615
    .line 2616
    .line 2617
    .line 2618
    .line 2619
    .line 2620
    .line 2621
    .line 2622
    .line 2623
    .line 2624
    .line 2625
    .line 2626
    .line 2627
    .line 2628
    .line 2629
    .line 2630
    .line 2631
    .line 2632
    .line 2633
    .line 2634
    .line 2635
    .line 2636
    .line 2637
    .line 2638
    .line 2639
    .line 2640
    .line 2641
    .line 2642
    .line 2643
    .line 2644
    .line 2645
    .line 2646
    .line 2647
    .line 2648
    .line 2649
    .line 2650
    .line 2651
    .line 2652
    .line 2653
    .line 2654
    .line 2655
    .line 2656
    .line 2657
    .line 2658
    .line 2659
    .line 2660
    .line 2661
    .line 2662
    .line 2663
    .line 2664
    .line 2665
    .line 2666
    .line 2667
    .line 2668
    .line 2669
    .line 2670
    .line 2671
    .line 2672
    .line 2673
    .line 2674
    .line 2675
    .line 2676
    .line 2677
    .line 2678
    .line 2679
    .line 2680
    .line 2681
    .line 2682
    .line 2683
    .line 2684
    .line 2685
    .line 2686
    .line 2687
    .line 2688
    .line 2689
    .line 2690
    .line 2691
    .line 2692
    .line 2693
    .line 2694
    .line 2695
    .line 2696
    .line 2697
    .line 2698
    .line 2699
    .line 2700
    .line 2701
    .line 2702
    .line 2703
    .line 2704
    .line 2705
    .line 2706
    .line 2707
    .line 2708
    .line 2709
    .line 2710
    .line 2711
    .line 2712
    .line 2713
    .line 2714
    .line 2715
    .line 2716
    .line 2717
    .line 2718
    .line 2719
    .line 2720
    .line 2721
    .line 2722
    .line 2723
    .line 2724
    .line 2725
    .line 2726
    .line 2727
    .line 2728
    .line 2729
    .line 2730
    .line 2731
    .line 2732
    .line 2733
    .line 2734
    .line 2735
    .line 2736
    .line 2737
    .line 2738
    .line 2739
    .line 2740
    .line 2741
    .line 2742
    .line 2743
    .line 2744
    .line 2745
    .line 2746
    .line 2747
    .line 2748
    .line 2749
    .line 2750
    .line 2751
    .line 2752
    .line 2753
    .line 2754
    .line 2755
    .line 2756
    .line 2757
    .line 2758
    .line 2759
    .line 2760
    .line 2761
    .line 2762
    .line 2763
    .line 2764
    .line 2765
    .line 2766
    .line 2767
    .line 2768
    .line 2769
    .line 2770
    .line 2771
    .line 2772
    .line 2773
    .line 2774
    .line 2775
    .line 2776
    .line 2777
    .line 2778
    .line 2779
    .line 2780
    .line 2781
    .line 2782
    .line 2783
    .line 2784
    .line 2785
    .line 2786
    .line 2787
    .line 2788
    .line 2789
    .line 2790
    .line 2791
    .line 2792
    .line 2793
    .line 2794
    .line 2795
    .line 2796
    .line 2797
    .line 2798
    .line 2799
    .line 2800
    .line 2801
    .line 2802
    .line 2803
    .line 2804
    .line 2805
    .line 2806
    .line 2807
    .line 2808
    .line 2809
    .line 2810
    .line 2811
    .line 2812
    .line 2813
    .line 2814
    .line 2815
    .line 2816
    .line 2817
    .line 2818
    .line 2819
    .line 2820
    .line 2821
    .line 2822
    .line 2823
    .line 2824
    .line 2825
    .line 2826
    .line 2827
    .line 2828
    .line 2829
    .line 2830
    .line 2831
    .line 2832
    .line 2833
    .line 2834
    .line 2835
    .line 2836
    .line 2837
    .line 2838
    .line 2839
    .line 2840
    .line 2841
    .line 2842
    .line 2843
    .line 2844
    .line 2845
    .line 2846
    .line 2847
    .line 2848
    .line 2849
    .line 2850
    .line 2851
    .line 2852
    .line 2853
    .line 2854
    .line 2855
    .line 2856
    .line 2857
    .line 2858
    .line 2859
    .line 2860
    .line 2861
    .line 2862
    .line 2863
    .line 2864
    .line 2865
    .line 2866
    .line 2867
    .line 2868
    .line 2869
    .line 2870
    .line 2871
    .line 2872
    .line 2873
    .line 2874
    .line 2875
    .line 2876
    .line 2877
    .line 2878
    .line 2879
    .line 2880
    .line 2881
    .line 2882
    .line 2883
    .line 2884
    .line 2885
    .line 2886
    .line 2887
    .line 2888
    .line 2889
    .line 2890
    .line 2891
    .line 2892
    .line 2893
    .line 2894
    .line 2895
    .line 2896
    .line 2897
    .line 2898
    .line 2899
    .line 2900
    .line 2901
    .line 2902
    .line 2903
    .line 2904
    .line 2905
    .line 2906
    .line 2907
    .line 2908
    .line 2909
    .line 2910
    .line 2911
    .line 2912
    .line 2913
    .line 2914
    .line 2915
    .line 2916
    .line 2917
    .line 2918
    .line 2919
    .line 2920
    .line 2921
    .line 2922
    .line 2923
    .line 2924
    .line 2925
    .line 2926
    .line 2927
    .line 2928
    .line 2929
    .line 2930
    .line 2931
    .line 2932
    .line 2933
    .line 2934
    .line 2935
    .line 2936
    .line 2937
    .line 2938
    .line 2939
    .line 2940
    .line 2941
    .line 2942
    .line 2943
    .line 2944
    .line 2945
    .line 2946
    .line 2947
    .line 2948
    .line 2949
    .line 2950
    .line 2951
    .line 2952
    .line 2953
    .line 2954
    .line 2955
    .line 2956
    .line 2957
    .line 2958
    .line 2959
    .line 2960
    .line 2961
    .line 2962
    .line 2963
    .line 2964
    .line 2965
    .line 2966
    .line 2967
    .line 2968
    .line 2969
    .line 2970
    .line 2971
    .line 2972
    .line 2973
    .line 2974
    .line 2975
    .line 2976
    .line 2977
    .line 2978
    .line 2979
    .line 2980
    .line 2981
    .line 2982
    .line 2983
    .line 2984
    .line 2985
    .line 2986
    .line 2987
    .line 2988
    .line 2989
    .line 2990
    .line 2991
    .line 2992
    .line 2993
    .line 2994
    .line 2995
    .line 2996
    .line 2997
    .line 2998
    .line 2999
    .line 3000
    .line 3001
    .line 3002
    .line 3003
    .line 3004
    .line 3005
    .line 3006
    .line 3007
    .line 3008
    .line 3009
    .line 3010
    .line 3011
    .line 3012
    .line 3013
    .line 3014
    .line 3015
    .line 3016
    .line 3017
    .line 3018
    .line 3019
    .line 3020
    .line 3021
    .line 3022
    .line 3023
    .line 3024
    .line 3025
    .line 3026
    .line 3027
    .line 3028
    .line 3029
    .line 3030
    .line 3031
    .line 3032
    .line 3033
    .line 3034
    .line 3035
    .line 3036
    .line 3037
    .line 3038
    .line 3039
    .line 3040
    .line 3041
    .line 3042
    .line 3043
    .line 3044
    .line 3045
    .line 3046
    .line 3047
    .line 3048
    .line 3049
    .line 3050
    .line 3051
    .line 3052
    .line 3053
    .line 3054
    .line 3055
    .line 3056
    .line 3057
    .line 3058
    .line 3059
    .line 3060
    .line 3061
    .line 3062
    .line 3063
    .line 3064
    .line 3065
    .line 3066
    .line 3067
    .line 3068
    .line 3069
    .line 3070
    .line 3071
    .line 3072
    .line 3073
    .line 3074
    .line 3075
    .line 3076
    .line 3077
    .line 3078
    .line 3079
    .line 3080
    .line 3081
    .line 3082
    .line 3083
    .line 3084
    .line 3085
    .line 3086
    .line 3087
    .line 3088
    .line 3089
    .line 3090
    .line 3091
    .line 3092
    .line 3093
    .line 3094
    .line 3095
    .line 3096
    .line 3097
    .line 3098
    .line 3099
    .line 3100
    .line 3101
    .line 3102
    .line 3103
    .line 3104
    .line 3105
    .line 3106
    .line 3107
    .line 3108
    .line 3109
    .line 3110
    .line 3111
    .line 3112
    .line 3113
    .line 3114
    .line 3115
    .line 3116
    .line 3117
    .line 3118
    .line 3119
    .line 3120
    .line 3121
    .line 3122
    .line 3123
    .line 3124
    .line 3125
    .line 3126
    .line 3127
    .line 3128
    .line 3129
    .line 3130
    .line 3131
    .line 3132
    .line 3133
    .line 3134
    .line 3135
    .line 3136
    .line 3137
    .line 3138
    .line 3139
    .line 3140
    .line 3141
    .line 3142
    .line 3143
    .line 3144
    .line 3145
    .line 3146
    .line 3147
    .line 3148
    .line 3149
    .line 3150
    .line 3151
    .line 3152
    .line 3153
    .line 3154
    .line 3155
    .line 3156
    .line 3157
    .line 3158
    .line 3159
    .line 3160
    .line 3161
    .line 3162
    .line 3163
    .line 3164
    .line 3165
    .line 3166
    .line 3167
    .line 3168
    .line 3169
    .line 3170
    .line 3171
    .line 3172
    .line 3173
    .line 3174
    .line 3175
    .line 3176
    .line 3177
    .line 3178
    .line 3179
    .line 3180
    .line 3181
    .line 3182
    .line 3183
    .line 3184
    .line 3185
    .line 3186
    .line 3187
    .line 3188
    .line 3189
    .line 3190
    .line 3191
    .line 3192
    .line 3193
    .line 3194
    .line 3195
    .line 3196
    .line 3197
    .line 3198
    .line 3199
    .line 3200
    .line 3201
    .line 3202
    .line 3203
    .line 3204
    .line 3205
    .line 3206
    .line 3207
    .line 3208
    .line 3209
    .line 3210
    .line 3211
    .line 3212
    .line 3213
    .line 3214
    .line 3215
    .line 3216
    .line 3217
    .line 3218
    .line 3219
    .line 3220
    .line 3221
    .line 3222
    .line 3223
    .line 3224
    .line 3225
    .line 3226
    .line 3227
    .line 3228
    .line 3229
    .line 3230
    .line 3231
    .line 3232
    .line 3233
    .line 3234
    .line 3235
    .line 3236
    .line 3237
    .line 3238
    .line 3239
    .line 3240
    .line 3241
    .line 3242
    .line 3243
    .line 3244
    .line 3245
    .line 3246
    .line 3247
    .line 3248
    .line 3249
    .line 3250
    .line 3251
    .line 3252
    .line 3253
    .line 3254
    .line 3255
    .line 3256
    .line 3257
    .line 3258
    .line 3259
    .line 3260
    .line 3261
    .line 3262
    .line 3263
    .line 3264
    .line 3265
    .line 3266
    .line 3267
    .line 3268
    .line 3269
    .line 3270
    .line 3271
    .line 3272
    .line 3273
    .line 3274
    .line 3275
    .line 3276
    .line 3277
    .line 3278
    .line 3279
    .line 3280
    .line 3281
    .line 3282
    .line 3283
    .line 3284
    .line 3285
    .line 3286
    .line 3287
    .line 3288
    .line 3289
    .line 3290
    .line 3291
    .line 3292
    .line 3293
    .line 3294
    .line 3295
    .line 3296
    .line 3297
    .line 3298
    .line 3299
    .line 3300
    .line 3301
    .line 3302
    .line 3303
    .line 3304
    .line 3305
    .line 3306
    .line 3307
    .line 3308
    .line 3309
    .line 3310
    .line 3311
    .line 3312
    .line 3313
    .line 3314
    .line 3315
    .line 3316
    .line 3317
    .line 3318
    .line 3319
    .line 3320
    .line 3321
    .line 3322
    .line 3323
    .line 3324
    .line 3325
    .line 3326
    .line 3327
    .line 3328
    .line 3329
    .line 3330
    .line 3331
    .line 3332
    .line 3333
    .line 3334
    .line 3335
    .line 3336
    .line 3337
    .line 3338
    .line 3339
    .line 3340
    .line 3341
    .line 3342
    .line 3343
    .line 3344
    .line 3345
    .line 3346
    .line 3347
    .line 3348
    .line 3349
    .line 3350
    .line 3351
    .line 3352
    .line 3353
    .line 3354
    .line 3355
    .line 3356
    .line 3357
    .line 3358
    .line 3359
    .line 3360
    .line 3361
    .line 3362
    .line 3363
    .line 3364
    .line 3365
    .line 3366
    .line 3367
    .line 3368
    .line 3369
    .line 3370
    .line 3371
    .line 3372
    .line 3373
    .line 3374
    .line 3375
    .line 3376
    .line 3377
    .line 3378
    .line 3379
    .line 3380
    .line 3381
    .line 3382
    .line 3383
    .line 3384
    .line 3385
    .line 3386
    .line 3387
    .line 3388
    .line 3389
    .line 3390
    .line 3391
    .line 3392
    .line 3393
    .line 3394
    .line 3395
    .line 3396
    .line 3397
    .line 3398
    .line 3399
    .line 3400
    .line 3401
    .line 3402
    .line 3403
    .line 3404
    .line 3405
    .line 3406
    .line 3407
    .line 3408
    .line 3409
    .line 3410
    .line 3411
    .line 3412
    .line 3413
    .line 3414
    .line 3415
    .line 3416
    .line 3417
    .line 3418
    .line 3419
    .line 3420
    .line 3421
    .line 3422
    .line 3423
    .line 3424
    .line 3425
    .line 3426
    .line 3427
    .line 3428
    .line 3429
    .line 3430
    .line 3431
    .line 3432
    .line 3433
    .line 3434
    .line 3435
    .line 3436
    .line 3437
    .line 3438
    .line 3439
    .line 3440
    .line 3441
    .line 3442
    .line 3443
    .line 3444
    .line 3445
    .line 3446
    .line 3447
    .line 3448
    .line 3449
    .line 3450
    .line 3451
    .line 3452
    .line 3453
    .line 3454
    .line 3455
    .line 3456
    .line 3457
    .line 3458
    .line 3459
    .line 3460
    .line 3461
    .line 3462
    .line 3463
    .line 3464
    .line 3465
    .line 3466
    .line 3467
    .line 3468
    .line 3469
    .line 3470
    .line 3471
    .line 3472
    .line 3473
    .line 3474
    .line 3475
    .line 3476
    .line 3477
    .line 3478
    .line 3479
    .line 3480
    .line 3481
    .line 3482
    .line 3483
    .line 3484
    .line 3485
    .line 3486
    .line 3487
    .line 3488
    .line 3489
    .line 3490
    .line 3491
    .line 3492
    .line 3493
    .line 3494
    .line 3495
    .line 3496
    .line 3497
    .line 3498
    .line 3499
    .line 3500
    .line 3501
    .line 3502
    .line 3503
    .line 3504
    .line 3505
    .line 3506
    .line 3507
    .line 3508
    .line 3509
    .line 3510
    .line 3511
    .line 3512
    .line 3513
    .line 3514
    .line 3515
    .line 3516
    .line 3517
    .line 3518
    .line 3519
    .line 3520
    .line 3521
    .line 3522
    .line 3523
    .line 3524
    .line 3525
    .line 3526
    .line 3527
    .line 3528
    .line 3529
    .line 3530
    .line 3531
    .line 3532
    .line 3533
    .line 3534
    .line 3535
    .line 3536
    .line 3537
    .line 3538
    .line 3539
    .line 3540
    .line 3541
    .line 3542
    .line 3543
    .line 3544
    .line 3545
    .line 3546
    .line 3547
    .line 3548
    .line 3549
    .line 3550
    .line 3551
    .line 3552
    .line 3553
    .line 3554
    .line 3555
    .line 3556
    .line 3557
    .line 3558
    .line 3559
    .line 3560
    .line 3561
    .line 3562
    .line 3563
    .line 3564
    .line 3565
    .line 3566
    .line 3567
    .line 3568
    .line 3569
    .line 3570
    .line 3571
    .line 3572
    .line 3573
    .line 3574
    .line 3575
    .line 3576
    .line 3577
    .line 3578
    .line 3579
    .line 3580
    .line 3581
    .line 3582
    .line 3583
    .line 3584
    .line 3585
    .line 3586
    .line 3587
    .line 3588
    .line 3589
    .line 3590
    .line 3591
    .line 3592
    .line 3593
    .line 3594
    .line 3595
    .line 3596
    .line 3597
    .line 3598
    .line 3599
    .line 3600
    .line 3601
    .line 3602
    .line 3603
    .line 3604
    .line 3605
    .line 3606
    .line 3607
    .line 3608
    .line 3609
    .line 3610
    .line 3611
    .line 3612
    .line 3613
    .line 3614
    .line 3615
    .line 3616
    .line 3617
    .line 3618
    .line 3619
    .line 3620
    .line 3621
    .line 3622
    .line 3623
    .line 3624
    .line 3625
    .line 3626
    .line 3627
    .line 3628
    .line 3629
    .line 3630
    .line 3631
    .line 3632
    .line 3633
    .line 3634
    .line 3635
    .line 3636
    .line 3637
    .line 3638
    .line 3639
    .line 3640
    .line 3641
    .line 3642
    .line 3643
    .line 3644
    .line 3645
    .line 3646
    .line 3647
    .line 3648
    .line 3649
    .line 3650
    .line 3651
    .line 3652
    .line 3653
    .line 3654
    .line 3655
    .line 3656
    .line 3657
    .line 3658
    .line 3659
    .line 3660
    .line 3661
    .line 3662
    .line 3663
    .line 3664
    .line 3665
    .line 3666
    .line 3667
    .line 3668
    .line 3669
    .line 3670
    .line 3671
    .line 3672
    .line 3673
    .line 3674
    .line 3675
    .line 3676
    .line 3677
    .line 3678
    .line 3679
    .line 3680
    .line 3681
    .line 3682
    .line 3683
    .line 3684
    .line 3685
    .line 3686
    .line 3687
    .line 3688
    .line 3689
    .line 3690
    .line 3691
    .line 3692
    .line 3693
    .line 3694
    .line 3695
    .line 3696
    .line 3697
    .line 3698
    .line 3699
    .line 3700
    .line 3701
    .line 3702
    .line 3703
    .line 3704
    .line 3705
    .line 3706
    .line 3707
    .line 3708
    .line 3709
    .line 3710
    .line 3711
    .line 3712
    .line 3713
    .line 3714
    .line 3715
    .line 3716
    .line 3717
    .line 3718
    .line 3719
    .line 3720
    .line 3721
    .line 3722
    .line 3723
    .line 3724
    .line 3725
    .line 3726
    .line 3727
    .line 3728
    .line 3729
    .line 3730
    .line 3731
    .line 3732
    .line 3733
    .line 3734
    .line 3735
    .line 3736
    .line 3737
    .line 3738
    .line 3739
    .line 3740
    .line 3741
    .line 3742
    .line 3743
    .line 3744
    .line 3745
    .line 3746
    .line 3747
    .line 3748
    .line 3749
    .line 3750
    .line 3751
    .line 3752
    .line 3753
    .line 3754
    .line 3755
    .line 3756
    .line 3757
    .line 3758
    .line 3759
    .line 3760
    .line 3761
    .line 3762
    .line 3763
    .line 3764
    .line 3765
    .line 3766
    .line 3767
    .line 3768
    .line 3769
    .line 3770
    .line 3771
    .line 3772
    .line 3773
    .line 3774
    .line 3775
    .line 3776
    .line 3777
    .line 3778
    .line 3779
    .line 3780
    .line 3781
    .line 3782
    .line 3783
    .line 3784
    .line 3785
    .line 3786
    .line 3787
    .line 3788
    .line 3789
    .line 3790
    .line 3791
    .line 3792
    .line 3793
    .line 3794
    .line 3795
    .line 3796
    .line 3797
    .line 3798
    .line 3799
    .line 3800
    .line 3801
    .line 3802
    .line 3803
    .line 3804
    .line 3805
    .line 3806
    .line 3807
    .line 3808
    .line 3809
    .line 3810
    .line 3811
    .line 3812
    .line 3813
    .line 3814
    .line 3815
    .line 3816
    .line 3817
    .line 3818
    .line 3819
    .line 3820
    .line 3821
    .line 3822
    .line 3823
    .line 3824
    .line 3825
    .line 3826
    .line 3827
    .line 3828
    .line 3829
    .line 3830
    .line 3831
    .line 3832
    .line 3833
    .line 3834
    .line 3835
    .line 3836
    .line 3837
    .line 3838
    .line 3839
    .line 3840
    .line 3841
    .line 3842
    .line 3843
    .line 3844
    .line 3845
    .line 3846
    .line 3847
    .line 3848
    .line 3849
    .line 3850
    .line 3851
    .line 3852
    .line 3853
    .line 3854
    .line 3855
    .line 3856
    .line 3857
    .line 3858
    .line 3859
    .line 3860
    .line 3861
    .line 3862
    .line 3863
    .line 3864
    .line 3865
    .line 3866
    .line 3867
    .line 3868
    .line 3869
    .line 3870
    .line 3871
    .line 3872
    .line 3873
    .line 3874
    .line 3875
    .line 3876
    .line 3877
    .line 3878
    .line 3879
    .line 3880
    .line 3881
    .line 3882
    .line 3883
    .line 3884
    .line 3885
    .line 3886
    .line 3887
    .line 3888
    .line 3889
    .line 3890
    .line 3891
    .line 3892
    .line 3893
    .line 3894
    .line 3895
    .line 3896
    .line 3897
    .line 3898
    .line 3899
    .line 3900
    .line 3901
    .line 3902
    .line 3903
    .line 3904
    .line 3905
    .line 3906
    .line 3907
    .line 3908
    .line 3909
    .line 3910
    .line 3911
    .line 3912
    .line 3913
    .line 3914
    .line 3915
    .line 3916
    .line 3917
    .line 3918
    .line 3919
    .line 3920
    .line 3921
    .line 3922
    .line 3923
    .line 3924
    .line 3925
    .line 3926
    .line 3927
    .line 3928
    .line 3929
    .line 3930
    .line 3931
    .line 3932
    .line 3933
    .line 3934
    .line 3935
    .line 3936
    .line 3937
    .line 3938
    .line 3939
    .line 3940
    .line 3941
    .line 3942
    .line 3943
    .line 3944
    .line 3945
    .line 3946
    .line 3947
    .line 3948
    .line 3949
    .line 3950
    .line 3951
    .line 3952
    .line 3953
    .line 3954
    .line 3955
    .line 3956
    .line 3957
    .line 3958
    .line 3959
    .line 3960
    .line 3961
    .line 3962
    .line 3963
    .line 3964
    .line 3965
    .line 3966
    .line 3967
    .line 3968
    .line 3969
    .line 3970
    .line 3971
    .line 3972
    .line 3973
    .line 3974
    .line 3975
    .line 3976
    .line 3977
    .line 3978
    .line 3979
    .line 3980
    .line 3981
    .line 3982
    .line 3983
    .line 3984
    .line 3985
    .line 3986
    .line 3987
    .line 3988
    .line 3989
    .line 3990
    .line 3991
    .line 3992
    .line 3993
    .line 3994
    .line 3995
    .line 3996
    .line 3997
    .line 3998
    .line 3999
    .line 4000
    .line 4001
    .line 4002
    .line 4003
    .line 4004
    .line 4005
    .line 4006
    .line 4007
    .line 4008
    .line 4009
    .line 4010
    .line 4011
    .line 4012
    .line 4013
    .line 4014
    .line 4015
    .line 4016
    .line 4017
    .line 4018
    .line 4019
    .line 4020
    .line 4021
    .line 4022
    .line 4023
    .line 4024
.end method

.method public final declared-synchronized q0(Lj5/o;J)V
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lv4/c0;->p:Lp4/v;

    .line 3
    .line 4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    add-long/2addr v0, p2

    .line 12
    const/4 v2, 0x0

    .line 13
    :goto_0
    invoke-virtual {p1}, Lj5/o;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    check-cast v3, Ljava/lang/Boolean;

    .line 18
    .line 19
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 20
    .line 21
    .line 22
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    if-nez v3, :cond_0

    .line 24
    .line 25
    const-wide/16 v3, 0x0

    .line 26
    .line 27
    cmp-long v5, p2, v3

    .line 28
    .line 29
    if-lez v5, :cond_0

    .line 30
    .line 31
    :try_start_1
    iget-object v3, p0, Lv4/c0;->p:Lp4/v;

    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, p2, p3}, Ljava/lang/Object;->wait(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :catchall_0
    move-exception p1

    .line 41
    goto :goto_2

    .line 42
    :catch_0
    const/4 p2, 0x1

    .line 43
    const/4 v2, 0x1

    .line 44
    :goto_1
    :try_start_2
    iget-object p2, p0, Lv4/c0;->p:Lp4/v;

    .line 45
    .line 46
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 50
    .line 51
    .line 52
    move-result-wide p2

    .line 53
    sub-long p2, v0, p2

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    if-eqz v2, :cond_1

    .line 57
    .line 58
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 63
    .line 64
    .line 65
    :cond_1
    monitor-exit p0

    .line 66
    return-void

    .line 67
    :goto_2
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 68
    throw p1
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
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
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
.end method

.method public final r(Lj5/b0;)V
    .locals 12

    .line 1
    iget-object v0, p0, Lv4/c0;->r:Lv4/j0;

    .line 2
    .line 3
    iget-object v1, v0, Lv4/j0;->l:Lv4/h0;

    .line 4
    .line 5
    iget-object v2, p0, Lv4/c0;->n:Lv4/k;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    if-eqz v1, :cond_2

    .line 9
    .line 10
    iget-object v4, v1, Lv4/h0;->a:Ljava/lang/Object;

    .line 11
    .line 12
    if-ne v4, p1, :cond_2

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-boolean p1, v1, Lv4/h0;->e:Z

    .line 18
    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    invoke-virtual {v2}, Lv4/k;->e()Lm4/s0;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget p1, p1, Lm4/s0;->a:F

    .line 26
    .line 27
    iget-object v2, p0, Lv4/c0;->z:Lv4/u0;

    .line 28
    .line 29
    iget-object v4, v2, Lv4/u0;->a:Lm4/i1;

    .line 30
    .line 31
    iget-boolean v2, v2, Lv4/u0;->l:Z

    .line 32
    .line 33
    invoke-virtual {v1, p1, v4, v2}, Lv4/h0;->f(FLm4/i1;Z)V

    .line 34
    .line 35
    .line 36
    :cond_0
    iget-object p1, v1, Lv4/h0;->o:Lm5/u;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Lv4/c0;->l0(Lm5/u;)V

    .line 39
    .line 40
    .line 41
    iget-object p1, v0, Lv4/j0;->i:Lv4/h0;

    .line 42
    .line 43
    if-ne v1, p1, :cond_1

    .line 44
    .line 45
    iget-object p1, v1, Lv4/h0;->g:Lv4/i0;

    .line 46
    .line 47
    iget-wide v4, p1, Lv4/i0;->b:J

    .line 48
    .line 49
    invoke-virtual {p0, v4, v5}, Lv4/c0;->K(J)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, Lv4/c0;->a:[Lv4/a1;

    .line 53
    .line 54
    array-length p1, p1

    .line 55
    new-array p1, p1, [Z

    .line 56
    .line 57
    iget-object v0, v0, Lv4/j0;->j:Lv4/h0;

    .line 58
    .line 59
    invoke-virtual {v0}, Lv4/h0;->e()J

    .line 60
    .line 61
    .line 62
    move-result-wide v4

    .line 63
    invoke-virtual {p0, p1, v4, v5}, Lv4/c0;->i([ZJ)V

    .line 64
    .line 65
    .line 66
    iput-boolean v3, v1, Lv4/h0;->h:Z

    .line 67
    .line 68
    iget-object p1, p0, Lv4/c0;->z:Lv4/u0;

    .line 69
    .line 70
    iget-object v3, p1, Lv4/u0;->b:Lj5/d0;

    .line 71
    .line 72
    iget-object v0, v1, Lv4/h0;->g:Lv4/i0;

    .line 73
    .line 74
    iget-wide v4, v0, Lv4/i0;->b:J

    .line 75
    .line 76
    iget-wide v6, p1, Lv4/u0;->c:J

    .line 77
    .line 78
    const/4 v10, 0x0

    .line 79
    const/4 v11, 0x5

    .line 80
    move-wide v8, v4

    .line 81
    move-object v2, p0

    .line 82
    invoke-virtual/range {v2 .. v11}, Lv4/c0;->t(Lj5/d0;JJJZI)Lv4/u0;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    move-object v1, v2

    .line 87
    iput-object p1, v1, Lv4/c0;->z:Lv4/u0;

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_1
    move-object v1, p0

    .line 91
    :goto_0
    invoke-virtual {p0}, Lv4/c0;->w()V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :cond_2
    move-object v1, p0

    .line 96
    const/4 v4, 0x0

    .line 97
    :goto_1
    iget-object v5, v0, Lv4/j0;->q:Ljava/util/ArrayList;

    .line 98
    .line 99
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 100
    .line 101
    .line 102
    move-result v5

    .line 103
    if-ge v4, v5, :cond_4

    .line 104
    .line 105
    iget-object v5, v0, Lv4/j0;->q:Ljava/util/ArrayList;

    .line 106
    .line 107
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    check-cast v5, Lv4/h0;

    .line 112
    .line 113
    iget-object v6, v5, Lv4/h0;->a:Ljava/lang/Object;

    .line 114
    .line 115
    if-ne v6, p1, :cond_3

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_3
    add-int/lit8 v4, v4, 0x1

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_4
    const/4 v5, 0x0

    .line 122
    :goto_2
    if-eqz v5, :cond_5

    .line 123
    .line 124
    iget-boolean v4, v5, Lv4/h0;->e:Z

    .line 125
    .line 126
    xor-int/2addr v3, v4

    .line 127
    invoke-static {v3}, Lp4/c;->i(Z)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v2}, Lv4/k;->e()Lm4/s0;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    iget v2, v2, Lm4/s0;->a:F

    .line 135
    .line 136
    iget-object v3, v1, Lv4/c0;->z:Lv4/u0;

    .line 137
    .line 138
    iget-object v4, v3, Lv4/u0;->a:Lm4/i1;

    .line 139
    .line 140
    iget-boolean v3, v3, Lv4/u0;->l:Z

    .line 141
    .line 142
    invoke-virtual {v5, v2, v4, v3}, Lv4/h0;->f(FLm4/i1;Z)V

    .line 143
    .line 144
    .line 145
    iget-object v0, v0, Lv4/j0;->m:Lv4/h0;

    .line 146
    .line 147
    if-eqz v0, :cond_5

    .line 148
    .line 149
    iget-object v0, v0, Lv4/h0;->a:Ljava/lang/Object;

    .line 150
    .line 151
    if-ne v0, p1, :cond_5

    .line 152
    .line 153
    invoke-virtual {p0}, Lv4/c0;->x()V

    .line 154
    .line 155
    .line 156
    :cond_5
    return-void
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

.method public final s(Lm4/s0;FZZ)V
    .locals 4

    .line 1
    if-eqz p3, :cond_1

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    iget-object p3, p0, Lv4/c0;->A:Lv4/z;

    .line 6
    .line 7
    const/4 p4, 0x1

    .line 8
    invoke-virtual {p3, p4}, Lv4/z;->c(I)V

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object p3, p0, Lv4/c0;->z:Lv4/u0;

    .line 12
    .line 13
    invoke-virtual {p3, p1}, Lv4/u0;->e(Lm4/s0;)Lv4/u0;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    iput-object p3, p0, Lv4/c0;->z:Lv4/u0;

    .line 18
    .line 19
    :cond_1
    iget p3, p1, Lm4/s0;->a:F

    .line 20
    .line 21
    iget-object p4, p0, Lv4/c0;->r:Lv4/j0;

    .line 22
    .line 23
    iget-object p4, p4, Lv4/j0;->i:Lv4/h0;

    .line 24
    .line 25
    :goto_0
    const/4 v0, 0x0

    .line 26
    if-eqz p4, :cond_4

    .line 27
    .line 28
    iget-object v1, p4, Lv4/h0;->o:Lm5/u;

    .line 29
    .line 30
    iget-object v1, v1, Lm5/u;->c:[Lm5/r;

    .line 31
    .line 32
    array-length v2, v1

    .line 33
    :goto_1
    if-ge v0, v2, :cond_3

    .line 34
    .line 35
    aget-object v3, v1, v0

    .line 36
    .line 37
    if-eqz v3, :cond_2

    .line 38
    .line 39
    invoke-interface {v3, p3}, Lm5/r;->p(F)V

    .line 40
    .line 41
    .line 42
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_3
    iget-object p4, p4, Lv4/h0;->m:Lv4/h0;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_4
    iget-object p3, p0, Lv4/c0;->a:[Lv4/a1;

    .line 49
    .line 50
    array-length p4, p3

    .line 51
    :goto_2
    if-ge v0, p4, :cond_6

    .line 52
    .line 53
    aget-object v1, p3, v0

    .line 54
    .line 55
    iget v2, p1, Lm4/s0;->a:F

    .line 56
    .line 57
    iget-object v3, v1, Lv4/a1;->a:Lv4/e;

    .line 58
    .line 59
    invoke-virtual {v3, p2, v2}, Lv4/e;->x(FF)V

    .line 60
    .line 61
    .line 62
    iget-object v1, v1, Lv4/a1;->c:Lv4/e;

    .line 63
    .line 64
    if-eqz v1, :cond_5

    .line 65
    .line 66
    invoke-virtual {v1, p2, v2}, Lv4/e;->x(FF)V

    .line 67
    .line 68
    .line 69
    :cond_5
    add-int/lit8 v0, v0, 0x1

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_6
    return-void
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
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
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
.end method

.method public final t(Lj5/d0;JJJZI)Lv4/u0;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-wide/from16 v5, p4

    .line 6
    .line 7
    move/from16 v1, p9

    .line 8
    .line 9
    iget-boolean v3, v0, Lv4/c0;->R:Z

    .line 10
    .line 11
    const/4 v7, 0x0

    .line 12
    if-nez v3, :cond_1

    .line 13
    .line 14
    iget-object v3, v0, Lv4/c0;->z:Lv4/u0;

    .line 15
    .line 16
    iget-wide v8, v3, Lv4/u0;->s:J

    .line 17
    .line 18
    cmp-long v3, p2, v8

    .line 19
    .line 20
    if-nez v3, :cond_1

    .line 21
    .line 22
    iget-object v3, v0, Lv4/c0;->z:Lv4/u0;

    .line 23
    .line 24
    iget-object v3, v3, Lv4/u0;->b:Lj5/d0;

    .line 25
    .line 26
    invoke-virtual {v2, v3}, Lj5/d0;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-nez v3, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 v3, 0x0

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    :goto_0
    const/4 v3, 0x1

    .line 36
    :goto_1
    iput-boolean v3, v0, Lv4/c0;->R:Z

    .line 37
    .line 38
    invoke-virtual {v0}, Lv4/c0;->J()V

    .line 39
    .line 40
    .line 41
    iget-object v3, v0, Lv4/c0;->z:Lv4/u0;

    .line 42
    .line 43
    iget-object v8, v3, Lv4/u0;->h:Lj5/o1;

    .line 44
    .line 45
    iget-object v9, v3, Lv4/u0;->i:Lm5/u;

    .line 46
    .line 47
    iget-object v10, v3, Lv4/u0;->j:Ljava/util/List;

    .line 48
    .line 49
    iget-object v11, v0, Lv4/c0;->s:Lv4/t0;

    .line 50
    .line 51
    iget-boolean v11, v11, Lv4/t0;->k:Z

    .line 52
    .line 53
    if-eqz v11, :cond_f

    .line 54
    .line 55
    iget-object v3, v0, Lv4/c0;->r:Lv4/j0;

    .line 56
    .line 57
    iget-object v3, v3, Lv4/j0;->i:Lv4/h0;

    .line 58
    .line 59
    if-nez v3, :cond_2

    .line 60
    .line 61
    sget-object v8, Lj5/o1;->d:Lj5/o1;

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_2
    iget-object v8, v3, Lv4/h0;->n:Lj5/o1;

    .line 65
    .line 66
    :goto_2
    if-nez v3, :cond_3

    .line 67
    .line 68
    iget-object v9, v0, Lv4/c0;->e:Lm5/u;

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_3
    iget-object v9, v3, Lv4/h0;->o:Lm5/u;

    .line 72
    .line 73
    :goto_3
    iget-object v10, v9, Lm5/u;->c:[Lm5/r;

    .line 74
    .line 75
    new-instance v11, Lya/f0;

    .line 76
    .line 77
    const/4 v12, 0x4

    .line 78
    invoke-direct {v11, v12}, Lya/c0;-><init>(I)V

    .line 79
    .line 80
    .line 81
    array-length v12, v10

    .line 82
    const/4 v13, 0x0

    .line 83
    const/4 v14, 0x0

    .line 84
    :goto_4
    if-ge v13, v12, :cond_6

    .line 85
    .line 86
    aget-object v15, v10, v13

    .line 87
    .line 88
    if-eqz v15, :cond_5

    .line 89
    .line 90
    invoke-interface {v15, v7}, Lm5/r;->g(I)Lm4/q;

    .line 91
    .line 92
    .line 93
    move-result-object v15

    .line 94
    iget-object v15, v15, Lm4/q;->l:Lm4/n0;

    .line 95
    .line 96
    if-nez v15, :cond_4

    .line 97
    .line 98
    new-instance v15, Lm4/n0;

    .line 99
    .line 100
    new-array v4, v7, [Lm4/m0;

    .line 101
    .line 102
    invoke-direct {v15, v4}, Lm4/n0;-><init>([Lm4/m0;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v11, v15}, Lya/c0;->a(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    goto :goto_5

    .line 109
    :cond_4
    invoke-virtual {v11, v15}, Lya/c0;->a(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    const/4 v14, 0x1

    .line 113
    :cond_5
    :goto_5
    add-int/lit8 v13, v13, 0x1

    .line 114
    .line 115
    goto :goto_4

    .line 116
    :cond_6
    if-eqz v14, :cond_7

    .line 117
    .line 118
    invoke-virtual {v11}, Lya/f0;->f()Lya/a1;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    :goto_6
    move-object v10, v4

    .line 123
    goto :goto_7

    .line 124
    :cond_7
    sget-object v4, Lya/i0;->b:Lya/g0;

    .line 125
    .line 126
    sget-object v4, Lya/a1;->e:Lya/a1;

    .line 127
    .line 128
    goto :goto_6

    .line 129
    :goto_7
    if-eqz v3, :cond_8

    .line 130
    .line 131
    iget-object v4, v3, Lv4/h0;->g:Lv4/i0;

    .line 132
    .line 133
    iget-wide v11, v4, Lv4/i0;->c:J

    .line 134
    .line 135
    cmp-long v13, v11, v5

    .line 136
    .line 137
    if-eqz v13, :cond_8

    .line 138
    .line 139
    invoke-virtual {v4, v5, v6}, Lv4/i0;->a(J)Lv4/i0;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    iput-object v4, v3, Lv4/h0;->g:Lv4/i0;

    .line 144
    .line 145
    :cond_8
    iget-object v3, v0, Lv4/c0;->a:[Lv4/a1;

    .line 146
    .line 147
    iget-object v4, v0, Lv4/c0;->r:Lv4/j0;

    .line 148
    .line 149
    iget-object v4, v4, Lv4/j0;->i:Lv4/h0;

    .line 150
    .line 151
    if-eqz v4, :cond_e

    .line 152
    .line 153
    iget-object v4, v4, Lv4/h0;->o:Lm5/u;

    .line 154
    .line 155
    const/4 v11, 0x0

    .line 156
    const/4 v12, 0x0

    .line 157
    :goto_8
    array-length v13, v3

    .line 158
    if-ge v11, v13, :cond_b

    .line 159
    .line 160
    invoke-virtual {v4, v11}, Lm5/u;->b(I)Z

    .line 161
    .line 162
    .line 163
    move-result v13

    .line 164
    if-eqz v13, :cond_a

    .line 165
    .line 166
    aget-object v13, v3, v11

    .line 167
    .line 168
    iget-object v13, v13, Lv4/a1;->a:Lv4/e;

    .line 169
    .line 170
    iget v13, v13, Lv4/e;->b:I

    .line 171
    .line 172
    const/4 v14, 0x1

    .line 173
    if-eq v13, v14, :cond_9

    .line 174
    .line 175
    const/4 v14, 0x0

    .line 176
    goto :goto_9

    .line 177
    :cond_9
    iget-object v13, v4, Lm5/u;->b:[Lv4/z0;

    .line 178
    .line 179
    aget-object v13, v13, v11

    .line 180
    .line 181
    iget v13, v13, Lv4/z0;->a:I

    .line 182
    .line 183
    if-eqz v13, :cond_a

    .line 184
    .line 185
    const/4 v12, 0x1

    .line 186
    :cond_a
    add-int/lit8 v11, v11, 0x1

    .line 187
    .line 188
    goto :goto_8

    .line 189
    :cond_b
    const/4 v14, 0x1

    .line 190
    :goto_9
    if-eqz v12, :cond_c

    .line 191
    .line 192
    if-eqz v14, :cond_c

    .line 193
    .line 194
    const/4 v14, 0x1

    .line 195
    goto :goto_a

    .line 196
    :cond_c
    const/4 v14, 0x0

    .line 197
    :goto_a
    iget-boolean v3, v0, Lv4/c0;->L:Z

    .line 198
    .line 199
    if-ne v14, v3, :cond_d

    .line 200
    .line 201
    goto :goto_b

    .line 202
    :cond_d
    iput-boolean v14, v0, Lv4/c0;->L:Z

    .line 203
    .line 204
    if-nez v14, :cond_e

    .line 205
    .line 206
    iget-object v3, v0, Lv4/c0;->z:Lv4/u0;

    .line 207
    .line 208
    iget-boolean v3, v3, Lv4/u0;->p:Z

    .line 209
    .line 210
    if-eqz v3, :cond_e

    .line 211
    .line 212
    iget-object v3, v0, Lv4/c0;->h:Lp4/x;

    .line 213
    .line 214
    const/4 v4, 0x2

    .line 215
    invoke-virtual {v3, v4}, Lp4/x;->e(I)Z

    .line 216
    .line 217
    .line 218
    :cond_e
    :goto_b
    move-object v11, v8

    .line 219
    move-object v12, v9

    .line 220
    move-object v13, v10

    .line 221
    goto :goto_c

    .line 222
    :cond_f
    iget-object v3, v3, Lv4/u0;->b:Lj5/d0;

    .line 223
    .line 224
    invoke-virtual {v2, v3}, Lj5/d0;->equals(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result v3

    .line 228
    if-nez v3, :cond_e

    .line 229
    .line 230
    sget-object v8, Lj5/o1;->d:Lj5/o1;

    .line 231
    .line 232
    iget-object v9, v0, Lv4/c0;->e:Lm5/u;

    .line 233
    .line 234
    sget-object v10, Lya/a1;->e:Lya/a1;

    .line 235
    .line 236
    goto :goto_b

    .line 237
    :goto_c
    if-eqz p8, :cond_12

    .line 238
    .line 239
    iget-object v3, v0, Lv4/c0;->A:Lv4/z;

    .line 240
    .line 241
    iget-boolean v4, v3, Lv4/z;->c:Z

    .line 242
    .line 243
    if-eqz v4, :cond_11

    .line 244
    .line 245
    iget v4, v3, Lv4/z;->d:I

    .line 246
    .line 247
    const/4 v8, 0x5

    .line 248
    if-eq v4, v8, :cond_11

    .line 249
    .line 250
    if-ne v1, v8, :cond_10

    .line 251
    .line 252
    const/4 v4, 0x1

    .line 253
    goto :goto_d

    .line 254
    :cond_10
    const/4 v4, 0x0

    .line 255
    :goto_d
    invoke-static {v4}, Lp4/c;->c(Z)V

    .line 256
    .line 257
    .line 258
    goto :goto_e

    .line 259
    :cond_11
    const/4 v14, 0x1

    .line 260
    iput-boolean v14, v3, Lv4/z;->b:Z

    .line 261
    .line 262
    iput-boolean v14, v3, Lv4/z;->c:Z

    .line 263
    .line 264
    iput v1, v3, Lv4/z;->d:I

    .line 265
    .line 266
    :cond_12
    :goto_e
    iget-object v1, v0, Lv4/c0;->z:Lv4/u0;

    .line 267
    .line 268
    iget-wide v3, v1, Lv4/u0;->q:J

    .line 269
    .line 270
    invoke-virtual {v0, v3, v4}, Lv4/c0;->m(J)J

    .line 271
    .line 272
    .line 273
    move-result-wide v9

    .line 274
    move-wide/from16 v3, p2

    .line 275
    .line 276
    move-wide/from16 v7, p6

    .line 277
    .line 278
    invoke-virtual/range {v1 .. v13}, Lv4/u0;->b(Lj5/d0;JJJJLj5/o1;Lm5/u;Ljava/util/List;)Lv4/u0;

    .line 279
    .line 280
    .line 281
    move-result-object v1

    .line 282
    return-object v1
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
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

.method public final v()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lv4/c0;->r:Lv4/j0;

    .line 2
    .line 3
    iget-object v0, v0, Lv4/j0;->i:Lv4/h0;

    .line 4
    .line 5
    iget-object v1, v0, Lv4/h0;->g:Lv4/i0;

    .line 6
    .line 7
    iget-wide v1, v1, Lv4/i0;->e:J

    .line 8
    .line 9
    iget-boolean v0, v0, Lv4/h0;->e:Z

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    cmp-long v0, v1, v3

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    iget-object v0, p0, Lv4/c0;->z:Lv4/u0;

    .line 23
    .line 24
    iget-wide v3, v0, Lv4/u0;->s:J

    .line 25
    .line 26
    cmp-long v0, v3, v1

    .line 27
    .line 28
    if-ltz v0, :cond_0

    .line 29
    .line 30
    invoke-virtual {p0}, Lv4/c0;->f0()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    :cond_0
    const/4 v0, 0x1

    .line 37
    return v0

    .line 38
    :cond_1
    const/4 v0, 0x0

    .line 39
    return v0
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
.end method

.method public final w()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lv4/c0;->r:Lv4/j0;

    .line 4
    .line 5
    iget-object v1, v1, Lv4/j0;->l:Lv4/h0;

    .line 6
    .line 7
    invoke-static {v1}, Lv4/c0;->u(Lv4/h0;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    const-wide/16 v4, 0x0

    .line 17
    .line 18
    const/4 v6, 0x0

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    goto/16 :goto_2

    .line 23
    .line 24
    :cond_0
    iget-object v1, v0, Lv4/c0;->r:Lv4/j0;

    .line 25
    .line 26
    iget-object v1, v1, Lv4/j0;->l:Lv4/h0;

    .line 27
    .line 28
    iget-boolean v7, v1, Lv4/h0;->e:Z

    .line 29
    .line 30
    if-nez v7, :cond_1

    .line 31
    .line 32
    move-wide v7, v4

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    iget-object v7, v1, Lv4/h0;->a:Ljava/lang/Object;

    .line 35
    .line 36
    invoke-interface {v7}, Lj5/e1;->d()J

    .line 37
    .line 38
    .line 39
    move-result-wide v7

    .line 40
    :goto_0
    invoke-virtual {v0, v7, v8}, Lv4/c0;->m(J)J

    .line 41
    .line 42
    .line 43
    move-result-wide v11

    .line 44
    iget-object v7, v0, Lv4/c0;->r:Lv4/j0;

    .line 45
    .line 46
    iget-object v7, v7, Lv4/j0;->i:Lv4/h0;

    .line 47
    .line 48
    iget-object v7, v0, Lv4/c0;->z:Lv4/u0;

    .line 49
    .line 50
    iget-object v7, v7, Lv4/u0;->a:Lm4/i1;

    .line 51
    .line 52
    iget-object v1, v1, Lv4/h0;->g:Lv4/i0;

    .line 53
    .line 54
    iget-object v1, v1, Lv4/i0;->a:Lj5/d0;

    .line 55
    .line 56
    invoke-virtual {v0, v7, v1}, Lv4/c0;->g0(Lm4/i1;Lj5/d0;)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_2

    .line 61
    .line 62
    iget-object v1, v0, Lv4/c0;->t:Lv4/h;

    .line 63
    .line 64
    iget-wide v7, v1, Lv4/h;->h:J

    .line 65
    .line 66
    move-wide v15, v7

    .line 67
    goto :goto_1

    .line 68
    :cond_2
    move-wide v15, v2

    .line 69
    :goto_1
    new-instance v9, Lv4/d0;

    .line 70
    .line 71
    iget-object v10, v0, Lv4/c0;->u:Lw4/k;

    .line 72
    .line 73
    iget-object v1, v0, Lv4/c0;->z:Lv4/u0;

    .line 74
    .line 75
    iget-object v1, v1, Lv4/u0;->a:Lm4/i1;

    .line 76
    .line 77
    iget-object v1, v0, Lv4/c0;->n:Lv4/k;

    .line 78
    .line 79
    invoke-virtual {v1}, Lv4/k;->e()Lm4/s0;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    iget v13, v1, Lm4/s0;->a:F

    .line 84
    .line 85
    iget-object v1, v0, Lv4/c0;->z:Lv4/u0;

    .line 86
    .line 87
    iget-boolean v1, v1, Lv4/u0;->l:Z

    .line 88
    .line 89
    iget-boolean v14, v0, Lv4/c0;->E:Z

    .line 90
    .line 91
    invoke-direct/range {v9 .. v16}, Lv4/d0;-><init>(Lw4/k;JFZJ)V

    .line 92
    .line 93
    .line 94
    iget-object v1, v0, Lv4/c0;->f:Lv4/j;

    .line 95
    .line 96
    invoke-virtual {v1, v9}, Lv4/j;->c(Lv4/d0;)Z

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    iget-object v7, v0, Lv4/c0;->r:Lv4/j0;

    .line 101
    .line 102
    iget-object v7, v7, Lv4/j0;->i:Lv4/h0;

    .line 103
    .line 104
    if-nez v1, :cond_4

    .line 105
    .line 106
    iget-boolean v8, v7, Lv4/h0;->e:Z

    .line 107
    .line 108
    if-eqz v8, :cond_4

    .line 109
    .line 110
    const-wide/32 v13, 0x7a120

    .line 111
    .line 112
    .line 113
    cmp-long v8, v11, v13

    .line 114
    .line 115
    if-gez v8, :cond_4

    .line 116
    .line 117
    iget-wide v10, v0, Lv4/c0;->m:J

    .line 118
    .line 119
    cmp-long v8, v10, v4

    .line 120
    .line 121
    if-gtz v8, :cond_3

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_3
    iget-object v1, v7, Lv4/h0;->a:Ljava/lang/Object;

    .line 125
    .line 126
    iget-object v7, v0, Lv4/c0;->z:Lv4/u0;

    .line 127
    .line 128
    iget-wide v7, v7, Lv4/u0;->s:J

    .line 129
    .line 130
    invoke-interface {v1, v7, v8}, Lj5/b0;->i(J)V

    .line 131
    .line 132
    .line 133
    iget-object v1, v0, Lv4/c0;->f:Lv4/j;

    .line 134
    .line 135
    invoke-virtual {v1, v9}, Lv4/j;->c(Lv4/d0;)Z

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    :cond_4
    :goto_2
    iput-boolean v1, v0, Lv4/c0;->G:Z

    .line 140
    .line 141
    if-eqz v1, :cond_a

    .line 142
    .line 143
    iget-object v1, v0, Lv4/c0;->r:Lv4/j0;

    .line 144
    .line 145
    iget-object v1, v1, Lv4/j0;->l:Lv4/h0;

    .line 146
    .line 147
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    new-instance v7, Lv4/e0;

    .line 151
    .line 152
    invoke-direct {v7}, Lv4/e0;-><init>()V

    .line 153
    .line 154
    .line 155
    iget-wide v8, v0, Lv4/c0;->O:J

    .line 156
    .line 157
    iget-wide v10, v1, Lv4/h0;->p:J

    .line 158
    .line 159
    sub-long/2addr v8, v10

    .line 160
    iput-wide v8, v7, Lv4/e0;->a:J

    .line 161
    .line 162
    iget-object v8, v0, Lv4/c0;->n:Lv4/k;

    .line 163
    .line 164
    invoke-virtual {v8}, Lv4/k;->e()Lm4/s0;

    .line 165
    .line 166
    .line 167
    move-result-object v8

    .line 168
    iget v8, v8, Lm4/s0;->a:F

    .line 169
    .line 170
    const/4 v9, 0x0

    .line 171
    const/4 v10, 0x1

    .line 172
    cmpl-float v9, v8, v9

    .line 173
    .line 174
    if-gtz v9, :cond_6

    .line 175
    .line 176
    const v9, -0x800001

    .line 177
    .line 178
    .line 179
    cmpl-float v9, v8, v9

    .line 180
    .line 181
    if-nez v9, :cond_5

    .line 182
    .line 183
    goto :goto_3

    .line 184
    :cond_5
    const/4 v9, 0x0

    .line 185
    goto :goto_4

    .line 186
    :cond_6
    :goto_3
    const/4 v9, 0x1

    .line 187
    :goto_4
    invoke-static {v9}, Lp4/c;->c(Z)V

    .line 188
    .line 189
    .line 190
    iput v8, v7, Lv4/e0;->b:F

    .line 191
    .line 192
    iget-wide v8, v0, Lv4/c0;->F:J

    .line 193
    .line 194
    cmp-long v11, v8, v4

    .line 195
    .line 196
    if-gez v11, :cond_8

    .line 197
    .line 198
    cmp-long v4, v8, v2

    .line 199
    .line 200
    if-nez v4, :cond_7

    .line 201
    .line 202
    goto :goto_5

    .line 203
    :cond_7
    const/4 v2, 0x0

    .line 204
    goto :goto_6

    .line 205
    :cond_8
    :goto_5
    const/4 v2, 0x1

    .line 206
    :goto_6
    invoke-static {v2}, Lp4/c;->c(Z)V

    .line 207
    .line 208
    .line 209
    iput-wide v8, v7, Lv4/e0;->c:J

    .line 210
    .line 211
    new-instance v2, Lv4/f0;

    .line 212
    .line 213
    invoke-direct {v2, v7}, Lv4/f0;-><init>(Lv4/e0;)V

    .line 214
    .line 215
    .line 216
    iget-object v3, v1, Lv4/h0;->m:Lv4/h0;

    .line 217
    .line 218
    if-nez v3, :cond_9

    .line 219
    .line 220
    const/4 v6, 0x1

    .line 221
    :cond_9
    invoke-static {v6}, Lp4/c;->i(Z)V

    .line 222
    .line 223
    .line 224
    iget-object v1, v1, Lv4/h0;->a:Ljava/lang/Object;

    .line 225
    .line 226
    invoke-interface {v1, v2}, Lj5/e1;->e(Lv4/f0;)Z

    .line 227
    .line 228
    .line 229
    :cond_a
    invoke-virtual {v0}, Lv4/c0;->k0()V

    .line 230
    .line 231
    .line 232
    return-void
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
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
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
.end method

.method public final x()V
    .locals 10

    .line 1
    iget-object v0, p0, Lv4/c0;->r:Lv4/j0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lv4/j0;->k()V

    .line 4
    .line 5
    .line 6
    iget-object v0, v0, Lv4/j0;->m:Lv4/h0;

    .line 7
    .line 8
    if-eqz v0, :cond_a

    .line 9
    .line 10
    iget-object v1, v0, Lv4/h0;->a:Ljava/lang/Object;

    .line 11
    .line 12
    iget-boolean v2, v0, Lv4/h0;->d:Z

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    iget-boolean v2, v0, Lv4/h0;->e:Z

    .line 17
    .line 18
    if-eqz v2, :cond_a

    .line 19
    .line 20
    :cond_0
    invoke-interface {v1}, Lj5/e1;->m()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-nez v2, :cond_a

    .line 25
    .line 26
    iget-object v2, p0, Lv4/c0;->z:Lv4/u0;

    .line 27
    .line 28
    iget-object v2, v2, Lv4/u0;->a:Lm4/i1;

    .line 29
    .line 30
    iget-boolean v2, v0, Lv4/h0;->e:Z

    .line 31
    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    invoke-interface {v1}, Lj5/e1;->t()J

    .line 35
    .line 36
    .line 37
    :cond_1
    iget-object v2, p0, Lv4/c0;->f:Lv4/j;

    .line 38
    .line 39
    iget-object v2, v2, Lv4/j;->i:Ljava/util/HashMap;

    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_3

    .line 54
    .line 55
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    check-cast v3, Lv4/i;

    .line 60
    .line 61
    iget-boolean v3, v3, Lv4/i;->a:Z

    .line 62
    .line 63
    if-eqz v3, :cond_2

    .line 64
    .line 65
    goto :goto_5

    .line 66
    :cond_3
    iget-boolean v2, v0, Lv4/h0;->d:Z

    .line 67
    .line 68
    const/4 v3, 0x1

    .line 69
    if-nez v2, :cond_4

    .line 70
    .line 71
    iget-object v2, v0, Lv4/h0;->g:Lv4/i0;

    .line 72
    .line 73
    iget-wide v4, v2, Lv4/i0;->b:J

    .line 74
    .line 75
    iput-boolean v3, v0, Lv4/h0;->d:Z

    .line 76
    .line 77
    invoke-interface {v1, p0, v4, v5}, Lj5/b0;->g(Lj5/a0;J)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_4
    new-instance v2, Lv4/e0;

    .line 82
    .line 83
    invoke-direct {v2}, Lv4/e0;-><init>()V

    .line 84
    .line 85
    .line 86
    iget-wide v4, p0, Lv4/c0;->O:J

    .line 87
    .line 88
    iget-wide v6, v0, Lv4/h0;->p:J

    .line 89
    .line 90
    sub-long/2addr v4, v6

    .line 91
    iput-wide v4, v2, Lv4/e0;->a:J

    .line 92
    .line 93
    iget-object v4, p0, Lv4/c0;->n:Lv4/k;

    .line 94
    .line 95
    invoke-virtual {v4}, Lv4/k;->e()Lm4/s0;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    iget v4, v4, Lm4/s0;->a:F

    .line 100
    .line 101
    const/4 v5, 0x0

    .line 102
    const/4 v6, 0x0

    .line 103
    cmpl-float v5, v4, v5

    .line 104
    .line 105
    if-gtz v5, :cond_6

    .line 106
    .line 107
    const v5, -0x800001

    .line 108
    .line 109
    .line 110
    cmpl-float v5, v4, v5

    .line 111
    .line 112
    if-nez v5, :cond_5

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_5
    const/4 v5, 0x0

    .line 116
    goto :goto_1

    .line 117
    :cond_6
    :goto_0
    const/4 v5, 0x1

    .line 118
    :goto_1
    invoke-static {v5}, Lp4/c;->c(Z)V

    .line 119
    .line 120
    .line 121
    iput v4, v2, Lv4/e0;->b:F

    .line 122
    .line 123
    iget-wide v4, p0, Lv4/c0;->F:J

    .line 124
    .line 125
    const-wide/16 v7, 0x0

    .line 126
    .line 127
    cmp-long v9, v4, v7

    .line 128
    .line 129
    if-gez v9, :cond_8

    .line 130
    .line 131
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    cmp-long v9, v4, v7

    .line 137
    .line 138
    if-nez v9, :cond_7

    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_7
    const/4 v7, 0x0

    .line 142
    goto :goto_3

    .line 143
    :cond_8
    :goto_2
    const/4 v7, 0x1

    .line 144
    :goto_3
    invoke-static {v7}, Lp4/c;->c(Z)V

    .line 145
    .line 146
    .line 147
    iput-wide v4, v2, Lv4/e0;->c:J

    .line 148
    .line 149
    new-instance v4, Lv4/f0;

    .line 150
    .line 151
    invoke-direct {v4, v2}, Lv4/f0;-><init>(Lv4/e0;)V

    .line 152
    .line 153
    .line 154
    iget-object v0, v0, Lv4/h0;->m:Lv4/h0;

    .line 155
    .line 156
    if-nez v0, :cond_9

    .line 157
    .line 158
    goto :goto_4

    .line 159
    :cond_9
    const/4 v3, 0x0

    .line 160
    :goto_4
    invoke-static {v3}, Lp4/c;->i(Z)V

    .line 161
    .line 162
    .line 163
    invoke-interface {v1, v4}, Lj5/e1;->e(Lv4/f0;)Z

    .line 164
    .line 165
    .line 166
    :cond_a
    :goto_5
    return-void
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
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
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
.end method

.method public final y()V
    .locals 5

    .line 1
    iget-object v0, p0, Lv4/c0;->A:Lv4/z;

    .line 2
    .line 3
    iget-object v1, p0, Lv4/c0;->z:Lv4/u0;

    .line 4
    .line 5
    iget-boolean v2, v0, Lv4/z;->b:Z

    .line 6
    .line 7
    iget-object v3, v0, Lv4/z;->e:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, Lv4/u0;

    .line 10
    .line 11
    if-eq v3, v1, :cond_0

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v3, 0x0

    .line 16
    :goto_0
    or-int/2addr v2, v3

    .line 17
    iput-boolean v2, v0, Lv4/z;->b:Z

    .line 18
    .line 19
    iput-object v1, v0, Lv4/z;->e:Ljava/lang/Object;

    .line 20
    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    iget-object v1, p0, Lv4/c0;->q:Lv4/q;

    .line 24
    .line 25
    iget-object v1, v1, Lv4/q;->b:Lv4/v;

    .line 26
    .line 27
    iget-object v2, v1, Lv4/v;->j:Lp4/x;

    .line 28
    .line 29
    new-instance v3, Lb5/h;

    .line 30
    .line 31
    const/16 v4, 0x1a

    .line 32
    .line 33
    invoke-direct {v3, v4, v1, v0}, Lb5/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2, v3}, Lp4/x;->c(Ljava/lang/Runnable;)Z

    .line 37
    .line 38
    .line 39
    new-instance v0, Lv4/z;

    .line 40
    .line 41
    iget-object v1, p0, Lv4/c0;->z:Lv4/u0;

    .line 42
    .line 43
    invoke-direct {v0, v1}, Lv4/z;-><init>(Lv4/u0;)V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, Lv4/c0;->A:Lv4/z;

    .line 47
    .line 48
    :cond_1
    return-void
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

.method public final z(I)V
    .locals 10

    .line 1
    iget-object v0, p0, Lv4/c0;->a:[Lv4/a1;

    .line 2
    .line 3
    aget-object v1, v0, p1

    .line 4
    .line 5
    :try_start_0
    iget-object v0, p0, Lv4/c0;->r:Lv4/j0;

    .line 6
    .line 7
    iget-object v0, v0, Lv4/j0;->i:Lv4/h0;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v0}, Lv4/a1;->d(Lv4/h0;)Lv4/e;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-object v0, v0, Lv4/e;->i:Lj5/c1;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-interface {v0}, Lj5/c1;->b()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :catch_0
    move-exception v0

    .line 29
    goto :goto_0

    .line 30
    :catch_1
    move-exception v0

    .line 31
    :goto_0
    iget-object v1, v1, Lv4/a1;->a:Lv4/e;

    .line 32
    .line 33
    iget v1, v1, Lv4/e;->b:I

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    if-eq v1, v2, :cond_1

    .line 37
    .line 38
    const/4 v2, 0x5

    .line 39
    if-ne v1, v2, :cond_0

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_0
    throw v0

    .line 43
    :cond_1
    :goto_1
    iget-object v1, p0, Lv4/c0;->r:Lv4/j0;

    .line 44
    .line 45
    iget-object v1, v1, Lv4/j0;->i:Lv4/h0;

    .line 46
    .line 47
    iget-object v1, v1, Lv4/h0;->o:Lm5/u;

    .line 48
    .line 49
    new-instance v2, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    const-string v3, "Disabling track due to error: "

    .line 52
    .line 53
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    iget-object v3, v1, Lm5/u;->c:[Lm5/r;

    .line 57
    .line 58
    aget-object v3, v3, p1

    .line 59
    .line 60
    invoke-interface {v3}, Lm5/r;->m()Lm4/q;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-static {v3}, Lm4/q;->c(Lm4/q;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    const-string v3, "ExoPlayerImplInternal"

    .line 76
    .line 77
    invoke-static {v3, v2, v0}, Lp4/c;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 78
    .line 79
    .line 80
    new-instance v5, Lm5/u;

    .line 81
    .line 82
    iget-object v0, v1, Lm5/u;->b:[Lv4/z0;

    .line 83
    .line 84
    invoke-virtual {v0}, [Lv4/z0;->clone()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    check-cast v0, [Lv4/z0;

    .line 89
    .line 90
    iget-object v2, v1, Lm5/u;->c:[Lm5/r;

    .line 91
    .line 92
    invoke-virtual {v2}, [Lm5/r;->clone()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    check-cast v2, [Lm5/r;

    .line 97
    .line 98
    iget-object v3, v1, Lm5/u;->d:Lm4/q1;

    .line 99
    .line 100
    iget-object v1, v1, Lm5/u;->e:Ljava/lang/Object;

    .line 101
    .line 102
    invoke-direct {v5, v0, v2, v3, v1}, Lm5/u;-><init>([Lv4/z0;[Lm5/r;Lm4/q1;Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    iget-object v0, v5, Lm5/u;->b:[Lv4/z0;

    .line 106
    .line 107
    const/4 v1, 0x0

    .line 108
    aput-object v1, v0, p1

    .line 109
    .line 110
    iget-object v0, v5, Lm5/u;->c:[Lm5/r;

    .line 111
    .line 112
    aput-object v1, v0, p1

    .line 113
    .line 114
    invoke-virtual {p0, p1}, Lv4/c0;->f(I)V

    .line 115
    .line 116
    .line 117
    iget-object p1, p0, Lv4/c0;->r:Lv4/j0;

    .line 118
    .line 119
    iget-object v4, p1, Lv4/j0;->i:Lv4/h0;

    .line 120
    .line 121
    iget-object p1, p0, Lv4/c0;->z:Lv4/u0;

    .line 122
    .line 123
    iget-wide v6, p1, Lv4/u0;->s:J

    .line 124
    .line 125
    iget-object p1, v4, Lv4/h0;->j:[Lv4/e;

    .line 126
    .line 127
    array-length p1, p1

    .line 128
    new-array v9, p1, [Z

    .line 129
    .line 130
    const/4 v8, 0x0

    .line 131
    invoke-virtual/range {v4 .. v9}, Lv4/h0;->a(Lm5/u;JZ[Z)J

    .line 132
    .line 133
    .line 134
    return-void
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
