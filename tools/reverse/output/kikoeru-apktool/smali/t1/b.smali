.class public final Lt1/b;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final a:Lt1/d;

.field public b:Lf3/c;

.field public c:Lf3/m;

.field public d:Lic/k;

.field public final e:Lq/a0;

.field public f:Landroid/graphics/Outline;

.field public g:Z

.field public h:J

.field public i:J

.field public j:F

.field public k:Lq1/h0;

.field public l:Lq1/e0;

.field public m:Lq1/h;

.field public n:Z

.field public o:Ls1/b;

.field public p:Lp4/p;

.field public q:I

.field public final r:La0/v;

.field public s:Z

.field public t:J

.field public u:J

.field public v:J

.field public w:Z

.field public x:Landroid/graphics/RectF;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    .line 2
    .line 3
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "toLowerCase(...)"

    .line 10
    .line 11
    invoke-static {v0, v1}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v1, "robolectric"

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 24
    .line 25
    const/16 v1, 0x1c

    .line 26
    .line 27
    if-lt v0, v1, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const/16 v1, 0x16

    .line 31
    .line 32
    if-lt v0, v1, :cond_2

    .line 33
    .line 34
    sget-object v0, Lt1/c;->e:Lt1/c;

    .line 35
    .line 36
    invoke-virtual {v0}, Lt1/c;->a()Z

    .line 37
    .line 38
    .line 39
    :cond_2
    :goto_0
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
.end method

.method public constructor <init>(Lt1/d;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lt1/b;->a:Lt1/d;

    .line 5
    .line 6
    sget-object v0, Ls1/c;->a:Lf3/d;

    .line 7
    .line 8
    iput-object v0, p0, Lt1/b;->b:Lf3/c;

    .line 9
    .line 10
    sget-object v0, Lf3/m;->a:Lf3/m;

    .line 11
    .line 12
    iput-object v0, p0, Lt1/b;->c:Lf3/m;

    .line 13
    .line 14
    sget-object v0, Lt1/a;->c:Lt1/a;

    .line 15
    .line 16
    iput-object v0, p0, Lt1/b;->d:Lic/k;

    .line 17
    .line 18
    new-instance v0, Lq/a0;

    .line 19
    .line 20
    const/16 v1, 0xa

    .line 21
    .line 22
    invoke-direct {v0, v1, p0}, Lq/a0;-><init>(ILjava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lt1/b;->e:Lq/a0;

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    iput-boolean v0, p0, Lt1/b;->g:Z

    .line 29
    .line 30
    const-wide/16 v0, 0x0

    .line 31
    .line 32
    iput-wide v0, p0, Lt1/b;->h:J

    .line 33
    .line 34
    const-wide v2, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    iput-wide v2, p0, Lt1/b;->i:J

    .line 40
    .line 41
    new-instance v4, La0/v;

    .line 42
    .line 43
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 44
    .line 45
    .line 46
    iput-object v4, p0, Lt1/b;->r:La0/v;

    .line 47
    .line 48
    const/4 v4, 0x0

    .line 49
    invoke-interface {p1, v4}, Lt1/d;->E(Z)V

    .line 50
    .line 51
    .line 52
    iput-wide v0, p0, Lt1/b;->t:J

    .line 53
    .line 54
    iput-wide v0, p0, Lt1/b;->u:J

    .line 55
    .line 56
    iput-wide v2, p0, Lt1/b;->v:J

    .line 57
    .line 58
    return-void
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
.method public final a()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-boolean v1, v0, Lt1/b;->g:Z

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_10

    .line 7
    .line 8
    iget-boolean v1, v0, Lt1/b;->w:Z

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    iget-object v4, v0, Lt1/b;->a:Lt1/d;

    .line 12
    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    invoke-interface {v4}, Lt1/d;->L()F

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v5, 0x0

    .line 20
    cmpl-float v1, v1, v5

    .line 21
    .line 22
    if-lez v1, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-interface {v4, v2}, Lt1/d;->E(Z)V

    .line 26
    .line 27
    .line 28
    const-wide/16 v5, 0x0

    .line 29
    .line 30
    invoke-interface {v4, v3, v5, v6}, Lt1/d;->q(Landroid/graphics/Outline;J)V

    .line 31
    .line 32
    .line 33
    goto/16 :goto_5

    .line 34
    .line 35
    :cond_1
    :goto_0
    iget-object v1, v0, Lt1/b;->l:Lq1/e0;

    .line 36
    .line 37
    const-wide v5, 0xffffffffL

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    const/16 v7, 0x20

    .line 43
    .line 44
    if-eqz v1, :cond_d

    .line 45
    .line 46
    iget-object v8, v0, Lt1/b;->x:Landroid/graphics/RectF;

    .line 47
    .line 48
    if-nez v8, :cond_2

    .line 49
    .line 50
    new-instance v8, Landroid/graphics/RectF;

    .line 51
    .line 52
    invoke-direct {v8}, Landroid/graphics/RectF;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-object v8, v0, Lt1/b;->x:Landroid/graphics/RectF;

    .line 56
    .line 57
    :cond_2
    instance-of v9, v1, Lq1/h;

    .line 58
    .line 59
    const-string v10, "Unable to obtain android.graphics.Path"

    .line 60
    .line 61
    if-eqz v9, :cond_c

    .line 62
    .line 63
    move-object v11, v1

    .line 64
    check-cast v11, Lq1/h;

    .line 65
    .line 66
    iget-object v11, v11, Lq1/h;->a:Landroid/graphics/Path;

    .line 67
    .line 68
    invoke-virtual {v11, v8, v2}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 69
    .line 70
    .line 71
    sget v11, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 72
    .line 73
    const/16 v12, 0x1c

    .line 74
    .line 75
    const/4 v13, 0x1

    .line 76
    if-gt v11, v12, :cond_5

    .line 77
    .line 78
    move-object v12, v1

    .line 79
    check-cast v12, Lq1/h;

    .line 80
    .line 81
    iget-object v12, v12, Lq1/h;->a:Landroid/graphics/Path;

    .line 82
    .line 83
    invoke-virtual {v12}, Landroid/graphics/Path;->isConvex()Z

    .line 84
    .line 85
    .line 86
    move-result v12

    .line 87
    if-eqz v12, :cond_3

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_3
    iget-object v9, v0, Lt1/b;->f:Landroid/graphics/Outline;

    .line 91
    .line 92
    if-eqz v9, :cond_4

    .line 93
    .line 94
    invoke-virtual {v9}, Landroid/graphics/Outline;->setEmpty()V

    .line 95
    .line 96
    .line 97
    :cond_4
    iput-boolean v13, v0, Lt1/b;->n:Z

    .line 98
    .line 99
    move-object v12, v3

    .line 100
    goto :goto_3

    .line 101
    :cond_5
    :goto_1
    iget-object v12, v0, Lt1/b;->f:Landroid/graphics/Outline;

    .line 102
    .line 103
    if-nez v12, :cond_6

    .line 104
    .line 105
    new-instance v12, Landroid/graphics/Outline;

    .line 106
    .line 107
    invoke-direct {v12}, Landroid/graphics/Outline;-><init>()V

    .line 108
    .line 109
    .line 110
    iput-object v12, v0, Lt1/b;->f:Landroid/graphics/Outline;

    .line 111
    .line 112
    :cond_6
    const/16 v14, 0x1e

    .line 113
    .line 114
    if-lt v11, v14, :cond_8

    .line 115
    .line 116
    if-eqz v9, :cond_7

    .line 117
    .line 118
    move-object v9, v1

    .line 119
    check-cast v9, Lq1/h;

    .line 120
    .line 121
    iget-object v9, v9, Lq1/h;->a:Landroid/graphics/Path;

    .line 122
    .line 123
    invoke-static {v12, v9}, Lb7/u0;->n(Landroid/graphics/Outline;Landroid/graphics/Path;)V

    .line 124
    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_7
    new-instance v1, Ljava/lang/UnsupportedOperationException;

    .line 128
    .line 129
    invoke-direct {v1, v10}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    throw v1

    .line 133
    :cond_8
    if-eqz v9, :cond_b

    .line 134
    .line 135
    move-object v9, v1

    .line 136
    check-cast v9, Lq1/h;

    .line 137
    .line 138
    iget-object v9, v9, Lq1/h;->a:Landroid/graphics/Path;

    .line 139
    .line 140
    invoke-virtual {v12, v9}, Landroid/graphics/Outline;->setConvexPath(Landroid/graphics/Path;)V

    .line 141
    .line 142
    .line 143
    :goto_2
    invoke-virtual {v12}, Landroid/graphics/Outline;->canClip()Z

    .line 144
    .line 145
    .line 146
    move-result v9

    .line 147
    xor-int/2addr v9, v13

    .line 148
    iput-boolean v9, v0, Lt1/b;->n:Z

    .line 149
    .line 150
    :goto_3
    iput-object v1, v0, Lt1/b;->l:Lq1/e0;

    .line 151
    .line 152
    if-eqz v12, :cond_9

    .line 153
    .line 154
    invoke-interface {v4}, Lt1/d;->a()F

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    invoke-virtual {v12, v1}, Landroid/graphics/Outline;->setAlpha(F)V

    .line 159
    .line 160
    .line 161
    move-object v3, v12

    .line 162
    :cond_9
    invoke-virtual {v8}, Landroid/graphics/RectF;->width()F

    .line 163
    .line 164
    .line 165
    move-result v1

    .line 166
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    invoke-virtual {v8}, Landroid/graphics/RectF;->height()F

    .line 171
    .line 172
    .line 173
    move-result v8

    .line 174
    invoke-static {v8}, Ljava/lang/Math;->round(F)I

    .line 175
    .line 176
    .line 177
    move-result v8

    .line 178
    int-to-long v9, v1

    .line 179
    shl-long/2addr v9, v7

    .line 180
    int-to-long v7, v8

    .line 181
    and-long/2addr v5, v7

    .line 182
    or-long/2addr v5, v9

    .line 183
    invoke-interface {v4, v3, v5, v6}, Lt1/d;->q(Landroid/graphics/Outline;J)V

    .line 184
    .line 185
    .line 186
    iget-boolean v1, v0, Lt1/b;->n:Z

    .line 187
    .line 188
    if-eqz v1, :cond_a

    .line 189
    .line 190
    iget-boolean v1, v0, Lt1/b;->w:Z

    .line 191
    .line 192
    if-eqz v1, :cond_a

    .line 193
    .line 194
    invoke-interface {v4, v2}, Lt1/d;->E(Z)V

    .line 195
    .line 196
    .line 197
    invoke-interface {v4}, Lt1/d;->f()V

    .line 198
    .line 199
    .line 200
    goto/16 :goto_5

    .line 201
    .line 202
    :cond_a
    iget-boolean v1, v0, Lt1/b;->w:Z

    .line 203
    .line 204
    invoke-interface {v4, v1}, Lt1/d;->E(Z)V

    .line 205
    .line 206
    .line 207
    goto/16 :goto_5

    .line 208
    .line 209
    :cond_b
    new-instance v1, Ljava/lang/UnsupportedOperationException;

    .line 210
    .line 211
    invoke-direct {v1, v10}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    throw v1

    .line 215
    :cond_c
    new-instance v1, Ljava/lang/UnsupportedOperationException;

    .line 216
    .line 217
    invoke-direct {v1, v10}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    throw v1

    .line 221
    :cond_d
    iget-boolean v1, v0, Lt1/b;->w:Z

    .line 222
    .line 223
    invoke-interface {v4, v1}, Lt1/d;->E(Z)V

    .line 224
    .line 225
    .line 226
    iget-object v1, v0, Lt1/b;->f:Landroid/graphics/Outline;

    .line 227
    .line 228
    if-nez v1, :cond_e

    .line 229
    .line 230
    new-instance v1, Landroid/graphics/Outline;

    .line 231
    .line 232
    invoke-direct {v1}, Landroid/graphics/Outline;-><init>()V

    .line 233
    .line 234
    .line 235
    iput-object v1, v0, Lt1/b;->f:Landroid/graphics/Outline;

    .line 236
    .line 237
    :cond_e
    move-object v8, v1

    .line 238
    iget-wide v9, v0, Lt1/b;->u:J

    .line 239
    .line 240
    invoke-static {v9, v10}, Lgh/g;->R(J)J

    .line 241
    .line 242
    .line 243
    move-result-wide v9

    .line 244
    iget-wide v11, v0, Lt1/b;->h:J

    .line 245
    .line 246
    iget-wide v13, v0, Lt1/b;->i:J

    .line 247
    .line 248
    const-wide v15, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    cmp-long v1, v13, v15

    .line 254
    .line 255
    if-nez v1, :cond_f

    .line 256
    .line 257
    move-wide v14, v9

    .line 258
    goto :goto_4

    .line 259
    :cond_f
    move-wide v14, v13

    .line 260
    :goto_4
    shr-long v9, v11, v7

    .line 261
    .line 262
    long-to-int v1, v9

    .line 263
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 264
    .line 265
    .line 266
    move-result v3

    .line 267
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 268
    .line 269
    .line 270
    move-result v9

    .line 271
    and-long/2addr v11, v5

    .line 272
    long-to-int v3, v11

    .line 273
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 274
    .line 275
    .line 276
    move-result v10

    .line 277
    invoke-static {v10}, Ljava/lang/Math;->round(F)I

    .line 278
    .line 279
    .line 280
    move-result v10

    .line 281
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 282
    .line 283
    .line 284
    move-result v1

    .line 285
    shr-long v11, v14, v7

    .line 286
    .line 287
    long-to-int v7, v11

    .line 288
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 289
    .line 290
    .line 291
    move-result v7

    .line 292
    add-float/2addr v7, v1

    .line 293
    invoke-static {v7}, Ljava/lang/Math;->round(F)I

    .line 294
    .line 295
    .line 296
    move-result v11

    .line 297
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 298
    .line 299
    .line 300
    move-result v1

    .line 301
    and-long/2addr v5, v14

    .line 302
    long-to-int v3, v5

    .line 303
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 304
    .line 305
    .line 306
    move-result v3

    .line 307
    add-float/2addr v3, v1

    .line 308
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 309
    .line 310
    .line 311
    move-result v12

    .line 312
    iget v13, v0, Lt1/b;->j:F

    .line 313
    .line 314
    invoke-virtual/range {v8 .. v13}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    .line 315
    .line 316
    .line 317
    invoke-interface {v4}, Lt1/d;->a()F

    .line 318
    .line 319
    .line 320
    move-result v1

    .line 321
    invoke-virtual {v8, v1}, Landroid/graphics/Outline;->setAlpha(F)V

    .line 322
    .line 323
    .line 324
    invoke-static {v14, v15}, Lgh/g;->N(J)J

    .line 325
    .line 326
    .line 327
    move-result-wide v5

    .line 328
    invoke-interface {v4, v8, v5, v6}, Lt1/d;->q(Landroid/graphics/Outline;J)V

    .line 329
    .line 330
    .line 331
    :cond_10
    :goto_5
    iput-boolean v2, v0, Lt1/b;->g:Z

    .line 332
    .line 333
    return-void
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

.method public final b()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-boolean v1, v0, Lt1/b;->s:Z

    .line 4
    .line 5
    if-eqz v1, :cond_6

    .line 6
    .line 7
    iget v1, v0, Lt1/b;->q:I

    .line 8
    .line 9
    if-nez v1, :cond_6

    .line 10
    .line 11
    iget-object v1, v0, Lt1/b;->r:La0/v;

    .line 12
    .line 13
    iget-object v2, v1, La0/v;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v2, Lt1/b;

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    iget v3, v2, Lt1/b;->q:I

    .line 20
    .line 21
    add-int/lit8 v3, v3, -0x1

    .line 22
    .line 23
    iput v3, v2, Lt1/b;->q:I

    .line 24
    .line 25
    invoke-virtual {v2}, Lt1/b;->b()V

    .line 26
    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    iput-object v2, v1, La0/v;->b:Ljava/lang/Object;

    .line 30
    .line 31
    :cond_0
    iget-object v1, v1, La0/v;->d:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v1, Lo/l0;

    .line 34
    .line 35
    if-eqz v1, :cond_5

    .line 36
    .line 37
    iget-object v2, v1, Lo/l0;->b:[Ljava/lang/Object;

    .line 38
    .line 39
    iget-object v3, v1, Lo/l0;->a:[J

    .line 40
    .line 41
    array-length v4, v3

    .line 42
    add-int/lit8 v4, v4, -0x2

    .line 43
    .line 44
    if-ltz v4, :cond_4

    .line 45
    .line 46
    const/4 v5, 0x0

    .line 47
    const/4 v6, 0x0

    .line 48
    :goto_0
    aget-wide v7, v3, v6

    .line 49
    .line 50
    not-long v9, v7

    .line 51
    const/4 v11, 0x7

    .line 52
    shl-long/2addr v9, v11

    .line 53
    and-long/2addr v9, v7

    .line 54
    const-wide v11, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    and-long/2addr v9, v11

    .line 60
    cmp-long v13, v9, v11

    .line 61
    .line 62
    if-eqz v13, :cond_3

    .line 63
    .line 64
    sub-int v9, v6, v4

    .line 65
    .line 66
    not-int v9, v9

    .line 67
    ushr-int/lit8 v9, v9, 0x1f

    .line 68
    .line 69
    const/16 v10, 0x8

    .line 70
    .line 71
    rsub-int/lit8 v9, v9, 0x8

    .line 72
    .line 73
    const/4 v11, 0x0

    .line 74
    :goto_1
    if-ge v11, v9, :cond_2

    .line 75
    .line 76
    const-wide/16 v12, 0xff

    .line 77
    .line 78
    and-long/2addr v12, v7

    .line 79
    const-wide/16 v14, 0x80

    .line 80
    .line 81
    cmp-long v16, v12, v14

    .line 82
    .line 83
    if-gez v16, :cond_1

    .line 84
    .line 85
    shl-int/lit8 v12, v6, 0x3

    .line 86
    .line 87
    add-int/2addr v12, v11

    .line 88
    aget-object v12, v2, v12

    .line 89
    .line 90
    check-cast v12, Lt1/b;

    .line 91
    .line 92
    iget v13, v12, Lt1/b;->q:I

    .line 93
    .line 94
    add-int/lit8 v13, v13, -0x1

    .line 95
    .line 96
    iput v13, v12, Lt1/b;->q:I

    .line 97
    .line 98
    invoke-virtual {v12}, Lt1/b;->b()V

    .line 99
    .line 100
    .line 101
    :cond_1
    shr-long/2addr v7, v10

    .line 102
    add-int/lit8 v11, v11, 0x1

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_2
    if-ne v9, v10, :cond_4

    .line 106
    .line 107
    :cond_3
    if-eq v6, v4, :cond_4

    .line 108
    .line 109
    add-int/lit8 v6, v6, 0x1

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_4
    invoke-virtual {v1}, Lo/l0;->b()V

    .line 113
    .line 114
    .line 115
    :cond_5
    iget-object v1, v0, Lt1/b;->a:Lt1/d;

    .line 116
    .line 117
    invoke-interface {v1}, Lt1/d;->f()V

    .line 118
    .line 119
    .line 120
    :cond_6
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

.method public final c(Ls1/d;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lt1/b;->r:La0/v;

    .line 4
    .line 5
    iget-object v2, v1, La0/v;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Lt1/b;

    .line 8
    .line 9
    iput-object v2, v1, La0/v;->c:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v2, v1, La0/v;->d:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, Lo/l0;

    .line 14
    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    invoke-virtual {v2}, Lo/l0;->h()Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-eqz v3, :cond_1

    .line 22
    .line 23
    iget-object v3, v1, La0/v;->e:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v3, Lo/l0;

    .line 26
    .line 27
    if-nez v3, :cond_0

    .line 28
    .line 29
    sget v3, Lo/t0;->a:I

    .line 30
    .line 31
    new-instance v3, Lo/l0;

    .line 32
    .line 33
    invoke-direct {v3}, Lo/l0;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object v3, v1, La0/v;->e:Ljava/lang/Object;

    .line 37
    .line 38
    :cond_0
    invoke-virtual {v3, v2}, Lo/l0;->k(Lo/l0;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2}, Lo/l0;->b()V

    .line 42
    .line 43
    .line 44
    :cond_1
    const/4 v2, 0x1

    .line 45
    iput-boolean v2, v1, La0/v;->a:Z

    .line 46
    .line 47
    iget-object v2, v0, Lt1/b;->d:Lic/k;

    .line 48
    .line 49
    move-object/from16 v3, p1

    .line 50
    .line 51
    invoke-interface {v2, v3}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    const/4 v2, 0x0

    .line 55
    iput-boolean v2, v1, La0/v;->a:Z

    .line 56
    .line 57
    iget-object v3, v1, La0/v;->c:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v3, Lt1/b;

    .line 60
    .line 61
    if-eqz v3, :cond_2

    .line 62
    .line 63
    iget v4, v3, Lt1/b;->q:I

    .line 64
    .line 65
    add-int/lit8 v4, v4, -0x1

    .line 66
    .line 67
    iput v4, v3, Lt1/b;->q:I

    .line 68
    .line 69
    invoke-virtual {v3}, Lt1/b;->b()V

    .line 70
    .line 71
    .line 72
    :cond_2
    iget-object v1, v1, La0/v;->e:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v1, Lo/l0;

    .line 75
    .line 76
    if-eqz v1, :cond_7

    .line 77
    .line 78
    invoke-virtual {v1}, Lo/l0;->h()Z

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    if-eqz v3, :cond_7

    .line 83
    .line 84
    iget-object v3, v1, Lo/l0;->b:[Ljava/lang/Object;

    .line 85
    .line 86
    iget-object v4, v1, Lo/l0;->a:[J

    .line 87
    .line 88
    array-length v5, v4

    .line 89
    add-int/lit8 v5, v5, -0x2

    .line 90
    .line 91
    if-ltz v5, :cond_6

    .line 92
    .line 93
    const/4 v6, 0x0

    .line 94
    :goto_0
    aget-wide v7, v4, v6

    .line 95
    .line 96
    not-long v9, v7

    .line 97
    const/4 v11, 0x7

    .line 98
    shl-long/2addr v9, v11

    .line 99
    and-long/2addr v9, v7

    .line 100
    const-wide v11, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    and-long/2addr v9, v11

    .line 106
    cmp-long v13, v9, v11

    .line 107
    .line 108
    if-eqz v13, :cond_5

    .line 109
    .line 110
    sub-int v9, v6, v5

    .line 111
    .line 112
    not-int v9, v9

    .line 113
    ushr-int/lit8 v9, v9, 0x1f

    .line 114
    .line 115
    const/16 v10, 0x8

    .line 116
    .line 117
    rsub-int/lit8 v9, v9, 0x8

    .line 118
    .line 119
    const/4 v11, 0x0

    .line 120
    :goto_1
    if-ge v11, v9, :cond_4

    .line 121
    .line 122
    const-wide/16 v12, 0xff

    .line 123
    .line 124
    and-long/2addr v12, v7

    .line 125
    const-wide/16 v14, 0x80

    .line 126
    .line 127
    cmp-long v16, v12, v14

    .line 128
    .line 129
    if-gez v16, :cond_3

    .line 130
    .line 131
    shl-int/lit8 v12, v6, 0x3

    .line 132
    .line 133
    add-int/2addr v12, v11

    .line 134
    aget-object v12, v3, v12

    .line 135
    .line 136
    check-cast v12, Lt1/b;

    .line 137
    .line 138
    iget v13, v12, Lt1/b;->q:I

    .line 139
    .line 140
    add-int/lit8 v13, v13, -0x1

    .line 141
    .line 142
    iput v13, v12, Lt1/b;->q:I

    .line 143
    .line 144
    invoke-virtual {v12}, Lt1/b;->b()V

    .line 145
    .line 146
    .line 147
    :cond_3
    shr-long/2addr v7, v10

    .line 148
    add-int/lit8 v11, v11, 0x1

    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_4
    if-ne v9, v10, :cond_6

    .line 152
    .line 153
    :cond_5
    if-eq v6, v5, :cond_6

    .line 154
    .line 155
    add-int/lit8 v6, v6, 0x1

    .line 156
    .line 157
    goto :goto_0

    .line 158
    :cond_6
    invoke-virtual {v1}, Lo/l0;->b()V

    .line 159
    .line 160
    .line 161
    :cond_7
    return-void
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

.method public final d()Lq1/h0;
    .locals 13

    .line 1
    iget-object v0, p0, Lt1/b;->k:Lq1/h0;

    .line 2
    .line 3
    iget-object v1, p0, Lt1/b;->l:Lq1/e0;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    if-eqz v1, :cond_1

    .line 9
    .line 10
    new-instance v0, Lq1/b0;

    .line 11
    .line 12
    invoke-direct {v0, v1}, Lq1/b0;-><init>(Lq1/e0;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lt1/b;->k:Lq1/h0;

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_1
    iget-wide v0, p0, Lt1/b;->u:J

    .line 19
    .line 20
    invoke-static {v0, v1}, Lgh/g;->R(J)J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    iget-wide v2, p0, Lt1/b;->h:J

    .line 25
    .line 26
    iget-wide v4, p0, Lt1/b;->i:J

    .line 27
    .line 28
    const-wide v6, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    cmp-long v8, v4, v6

    .line 34
    .line 35
    if-nez v8, :cond_2

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    move-wide v0, v4

    .line 39
    :goto_0
    const/16 v4, 0x20

    .line 40
    .line 41
    shr-long v5, v2, v4

    .line 42
    .line 43
    long-to-int v6, v5

    .line 44
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 45
    .line 46
    .line 47
    move-result v7

    .line 48
    const-wide v5, 0xffffffffL

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    and-long/2addr v2, v5

    .line 54
    long-to-int v3, v2

    .line 55
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 56
    .line 57
    .line 58
    move-result v8

    .line 59
    shr-long v2, v0, v4

    .line 60
    .line 61
    long-to-int v3, v2

    .line 62
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    add-float v9, v2, v7

    .line 67
    .line 68
    and-long/2addr v0, v5

    .line 69
    long-to-int v1, v0

    .line 70
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    add-float v10, v0, v8

    .line 75
    .line 76
    iget v0, p0, Lt1/b;->j:F

    .line 77
    .line 78
    const/4 v1, 0x0

    .line 79
    cmpl-float v1, v0, v1

    .line 80
    .line 81
    if-lez v1, :cond_3

    .line 82
    .line 83
    new-instance v1, Lq1/d0;

    .line 84
    .line 85
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    int-to-long v2, v2

    .line 90
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    int-to-long v11, v0

    .line 95
    shl-long/2addr v2, v4

    .line 96
    and-long/2addr v5, v11

    .line 97
    or-long v11, v2, v5

    .line 98
    .line 99
    invoke-static/range {v7 .. v12}, Lnd/h;->b(FFFFJ)Lp1/d;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-direct {v1, v0}, Lq1/d0;-><init>(Lp1/d;)V

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_3
    new-instance v1, Lq1/c0;

    .line 108
    .line 109
    new-instance v0, Lp1/c;

    .line 110
    .line 111
    invoke-direct {v0, v7, v8, v9, v10}, Lp1/c;-><init>(FFFF)V

    .line 112
    .line 113
    .line 114
    invoke-direct {v1, v0}, Lq1/c0;-><init>(Lp1/c;)V

    .line 115
    .line 116
    .line 117
    :goto_1
    iput-object v1, p0, Lt1/b;->k:Lq1/h0;

    .line 118
    .line 119
    return-object v1
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
.end method

.method public final e(Lf3/c;Lf3/m;JLic/k;)V
    .locals 6

    .line 1
    iget-wide v0, p0, Lt1/b;->u:J

    .line 2
    .line 3
    invoke-static {v0, v1, p3, p4}, Lf3/l;->b(JJ)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lt1/b;->a:Lt1/d;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iput-wide p3, p0, Lt1/b;->u:J

    .line 12
    .line 13
    iget-wide v2, p0, Lt1/b;->t:J

    .line 14
    .line 15
    const/16 v0, 0x20

    .line 16
    .line 17
    shr-long v4, v2, v0

    .line 18
    .line 19
    long-to-int v0, v4

    .line 20
    const-wide v4, 0xffffffffL

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    and-long/2addr v2, v4

    .line 26
    long-to-int v3, v2

    .line 27
    invoke-interface {v1, v0, v3, p3, p4}, Lt1/d;->t(IIJ)V

    .line 28
    .line 29
    .line 30
    iget-wide p3, p0, Lt1/b;->i:J

    .line 31
    .line 32
    const-wide v2, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    cmp-long v0, p3, v2

    .line 38
    .line 39
    if-nez v0, :cond_0

    .line 40
    .line 41
    const/4 p3, 0x1

    .line 42
    iput-boolean p3, p0, Lt1/b;->g:Z

    .line 43
    .line 44
    invoke-virtual {p0}, Lt1/b;->a()V

    .line 45
    .line 46
    .line 47
    :cond_0
    iput-object p1, p0, Lt1/b;->b:Lf3/c;

    .line 48
    .line 49
    iput-object p2, p0, Lt1/b;->c:Lf3/m;

    .line 50
    .line 51
    iput-object p5, p0, Lt1/b;->d:Lic/k;

    .line 52
    .line 53
    iget-object p3, p0, Lt1/b;->e:Lq/a0;

    .line 54
    .line 55
    invoke-interface {v1, p1, p2, p0, p3}, Lt1/d;->G(Lf3/c;Lf3/m;Lt1/b;Lq/a0;)V

    .line 56
    .line 57
    .line 58
    return-void
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

.method public final f(F)V
    .locals 2

    .line 1
    iget-object v0, p0, Lt1/b;->a:Lt1/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lt1/d;->a()F

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    cmpg-float v1, v1, p1

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-interface {v0, p1}, Lt1/d;->k(F)V

    .line 13
    .line 14
    .line 15
    return-void
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

.method public final g(JJF)V
    .locals 2

    .line 1
    iget-wide v0, p0, Lt1/b;->h:J

    .line 2
    .line 3
    invoke-static {v0, v1, p1, p2}, Lp1/b;->c(JJ)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-wide v0, p0, Lt1/b;->i:J

    .line 10
    .line 11
    invoke-static {v0, v1, p3, p4}, Lp1/e;->a(JJ)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget v0, p0, Lt1/b;->j:F

    .line 18
    .line 19
    cmpg-float v0, v0, p5

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    iget-object v0, p0, Lt1/b;->l:Lq1/e0;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return-void

    .line 29
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 30
    iput-object v0, p0, Lt1/b;->k:Lq1/h0;

    .line 31
    .line 32
    iput-object v0, p0, Lt1/b;->l:Lq1/e0;

    .line 33
    .line 34
    const/4 v0, 0x1

    .line 35
    iput-boolean v0, p0, Lt1/b;->g:Z

    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    iput-boolean v0, p0, Lt1/b;->n:Z

    .line 39
    .line 40
    iput-wide p1, p0, Lt1/b;->h:J

    .line 41
    .line 42
    iput-wide p3, p0, Lt1/b;->i:J

    .line 43
    .line 44
    iput p5, p0, Lt1/b;->j:F

    .line 45
    .line 46
    invoke-virtual {p0}, Lt1/b;->a()V

    .line 47
    .line 48
    .line 49
    return-void
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
