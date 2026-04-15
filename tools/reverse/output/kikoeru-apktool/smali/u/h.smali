.class public final Lu/h;
.super Lac/i;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public final synthetic e:I

.field public f:Ljc/v;

.field public g:I

.field public final synthetic h:F

.field public i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Lu/k1;


# direct methods
.method public constructor <init>(FLu/i;Lu/y1;Lyb/c;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lu/h;->e:I

    .line 1
    iput p1, p0, Lu/h;->h:F

    iput-object p2, p0, Lu/h;->j:Ljava/lang/Object;

    iput-object p3, p0, Lu/h;->k:Lu/k1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lac/i;-><init>(ILyb/c;)V

    return-void
.end method

.method public constructor <init>(Lv/f;FLic/k;Lu/k1;Lyb/c;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lu/h;->e:I

    .line 2
    iput-object p1, p0, Lu/h;->i:Ljava/lang/Object;

    iput p2, p0, Lu/h;->h:F

    iput-object p3, p0, Lu/h;->j:Ljava/lang/Object;

    iput-object p4, p0, Lu/h;->k:Lu/k1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lac/i;-><init>(ILyb/c;)V

    return-void
.end method


# virtual methods
.method public final o(Ljava/lang/Object;Lyb/c;)Lyb/c;
    .locals 6

    .line 1
    iget p1, p0, Lu/h;->e:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lu/h;

    .line 7
    .line 8
    iget-object p1, p0, Lu/h;->i:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v1, p1

    .line 11
    check-cast v1, Lv/f;

    .line 12
    .line 13
    iget-object p1, p0, Lu/h;->j:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v3, p1

    .line 16
    check-cast v3, Lic/k;

    .line 17
    .line 18
    iget-object v4, p0, Lu/h;->k:Lu/k1;

    .line 19
    .line 20
    iget v2, p0, Lu/h;->h:F

    .line 21
    .line 22
    move-object v5, p2

    .line 23
    invoke-direct/range {v0 .. v5}, Lu/h;-><init>(Lv/f;FLic/k;Lu/k1;Lyb/c;)V

    .line 24
    .line 25
    .line 26
    return-object v0

    .line 27
    :pswitch_0
    move-object v5, p2

    .line 28
    new-instance p1, Lu/h;

    .line 29
    .line 30
    iget-object p2, p0, Lu/h;->j:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p2, Lu/i;

    .line 33
    .line 34
    iget-object v0, p0, Lu/h;->k:Lu/k1;

    .line 35
    .line 36
    check-cast v0, Lu/y1;

    .line 37
    .line 38
    iget v1, p0, Lu/h;->h:F

    .line 39
    .line 40
    invoke-direct {p1, v1, p2, v0, v5}, Lu/h;-><init>(FLu/i;Lu/y1;Lyb/c;)V

    .line 41
    .line 42
    .line 43
    return-object p1

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lu/h;->e:I

    .line 2
    .line 3
    check-cast p1, Lhf/y;

    .line 4
    .line 5
    check-cast p2, Lyb/c;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lu/h;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lu/h;

    .line 15
    .line 16
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lu/h;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lu/h;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lu/h;

    .line 28
    .line 29
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lu/h;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final u(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    iget v0, v5, Lu/h;->e:I

    .line 4
    .line 5
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    sget-object v7, Lzb/a;->a:Lzb/a;

    .line 8
    .line 9
    const/4 v6, 0x0

    .line 10
    iget v2, v5, Lu/h;->h:F

    .line 11
    .line 12
    iget-object v3, v5, Lu/h;->j:Ljava/lang/Object;

    .line 13
    .line 14
    const/4 v4, 0x1

    .line 15
    const/4 v8, 0x0

    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    move-object v9, v3

    .line 20
    check-cast v9, Lic/k;

    .line 21
    .line 22
    iget-object v0, v5, Lu/h;->i:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Lv/f;

    .line 25
    .line 26
    iget-object v10, v0, Lv/f;->a:Lm0/w;

    .line 27
    .line 28
    iget v3, v5, Lu/h;->g:I

    .line 29
    .line 30
    const/4 v11, 0x2

    .line 31
    if-eqz v3, :cond_2

    .line 32
    .line 33
    if-eq v3, v4, :cond_1

    .line 34
    .line 35
    if-ne v3, v11, :cond_0

    .line 36
    .line 37
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    move-object/from16 v0, p1

    .line 41
    .line 42
    goto/16 :goto_9

    .line 43
    .line 44
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw v0

    .line 50
    :cond_1
    iget-object v1, v5, Lu/h;->f:Ljc/v;

    .line 51
    .line 52
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    move-object v6, v1

    .line 56
    const/16 v17, 0x0

    .line 57
    .line 58
    move-object/from16 v1, p1

    .line 59
    .line 60
    goto/16 :goto_3

    .line 61
    .line 62
    :cond_2
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    iget-object v1, v0, Lv/f;->b:Lr/t;

    .line 66
    .line 67
    sget-object v3, Lr/w1;->a:Lr/v1;

    .line 68
    .line 69
    new-instance v3, Lb0/w1;

    .line 70
    .line 71
    iget-object v1, v1, Lr/t;->a:Li7/p2;

    .line 72
    .line 73
    const/16 v12, 0x10

    .line 74
    .line 75
    invoke-direct {v3, v12, v1}, Lb0/w1;-><init>(ILjava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    new-instance v1, Lr/l;

    .line 79
    .line 80
    invoke-direct {v1, v6}, Lr/l;-><init>(F)V

    .line 81
    .line 82
    .line 83
    new-instance v12, Lr/l;

    .line 84
    .line 85
    invoke-direct {v12, v2}, Lr/l;-><init>(F)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v3, v1, v12}, Lb0/w1;->P(Lr/p;Lr/p;)Lr/p;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    check-cast v1, Lr/l;

    .line 93
    .line 94
    iget v1, v1, Lr/l;->a:F

    .line 95
    .line 96
    iget-object v3, v10, Lm0/w;->b:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v3, Ld0/d;

    .line 99
    .line 100
    iget-object v12, v3, Ld0/f0;->p:Lx0/e1;

    .line 101
    .line 102
    invoke-virtual {v3}, Ld0/f0;->m()I

    .line 103
    .line 104
    .line 105
    move-result v13

    .line 106
    invoke-virtual {v12}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v14

    .line 110
    check-cast v14, Ld0/w;

    .line 111
    .line 112
    iget v14, v14, Ld0/w;->c:I

    .line 113
    .line 114
    add-int/2addr v14, v13

    .line 115
    if-nez v14, :cond_3

    .line 116
    .line 117
    move-object/from16 v16, v7

    .line 118
    .line 119
    const/4 v1, 0x0

    .line 120
    const/16 v17, 0x0

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_3
    cmpg-float v13, v2, v6

    .line 124
    .line 125
    if-gez v13, :cond_4

    .line 126
    .line 127
    iget v13, v3, Ld0/f0;->e:I

    .line 128
    .line 129
    add-int/2addr v13, v4

    .line 130
    goto :goto_0

    .line 131
    :cond_4
    iget v13, v3, Ld0/f0;->e:I

    .line 132
    .line 133
    :goto_0
    int-to-float v15, v14

    .line 134
    div-float/2addr v1, v15

    .line 135
    float-to-int v1, v1

    .line 136
    add-int/2addr v1, v13

    .line 137
    invoke-virtual {v3}, Ld0/d;->l()I

    .line 138
    .line 139
    .line 140
    move-result v15

    .line 141
    invoke-static {v1, v8, v15}, Lnh/b;->k(III)I

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    invoke-virtual {v3}, Ld0/f0;->m()I

    .line 146
    .line 147
    .line 148
    invoke-virtual {v12}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v12

    .line 152
    check-cast v12, Ld0/w;

    .line 153
    .line 154
    iget v12, v12, Ld0/w;->c:I

    .line 155
    .line 156
    int-to-long v11, v13

    .line 157
    move-object/from16 v16, v7

    .line 158
    .line 159
    const/16 v17, 0x0

    .line 160
    .line 161
    int-to-long v6, v4

    .line 162
    sub-long v18, v11, v6

    .line 163
    .line 164
    const-wide/16 v20, 0x0

    .line 165
    .line 166
    cmp-long v22, v18, v20

    .line 167
    .line 168
    if-gez v22, :cond_5

    .line 169
    .line 170
    move-wide/from16 v4, v20

    .line 171
    .line 172
    goto :goto_1

    .line 173
    :cond_5
    move-wide/from16 v4, v18

    .line 174
    .line 175
    :goto_1
    long-to-int v5, v4

    .line 176
    add-long/2addr v11, v6

    .line 177
    const-wide/32 v6, 0x7fffffff

    .line 178
    .line 179
    .line 180
    cmp-long v4, v11, v6

    .line 181
    .line 182
    if-lez v4, :cond_6

    .line 183
    .line 184
    move-wide v11, v6

    .line 185
    :cond_6
    long-to-int v4, v11

    .line 186
    invoke-static {v1, v5, v4}, Lnh/b;->k(III)I

    .line 187
    .line 188
    .line 189
    move-result v1

    .line 190
    invoke-virtual {v3}, Ld0/d;->l()I

    .line 191
    .line 192
    .line 193
    move-result v3

    .line 194
    invoke-static {v1, v8, v3}, Lnh/b;->k(III)I

    .line 195
    .line 196
    .line 197
    move-result v1

    .line 198
    sub-int/2addr v1, v13

    .line 199
    mul-int v1, v1, v14

    .line 200
    .line 201
    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    .line 202
    .line 203
    .line 204
    move-result v1

    .line 205
    sub-int/2addr v1, v14

    .line 206
    if-gez v1, :cond_7

    .line 207
    .line 208
    const/4 v1, 0x0

    .line 209
    :cond_7
    if-nez v1, :cond_8

    .line 210
    .line 211
    int-to-float v1, v1

    .line 212
    goto :goto_2

    .line 213
    :cond_8
    int-to-float v1, v1

    .line 214
    invoke-static {v2}, Ljava/lang/Math;->signum(F)F

    .line 215
    .line 216
    .line 217
    move-result v3

    .line 218
    mul-float v3, v3, v1

    .line 219
    .line 220
    move v1, v3

    .line 221
    :goto_2
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 222
    .line 223
    .line 224
    move-result v3

    .line 225
    if-eqz v3, :cond_9

    .line 226
    .line 227
    const-string v3, "calculateApproachOffset returned NaN. Please use a valid value."

    .line 228
    .line 229
    invoke-static {v3}, Lx/a;->c(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    :cond_9
    new-instance v6, Ljc/v;

    .line 233
    .line 234
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 235
    .line 236
    .line 237
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 238
    .line 239
    .line 240
    move-result v1

    .line 241
    invoke-static {v2}, Ljava/lang/Math;->signum(F)F

    .line 242
    .line 243
    .line 244
    move-result v2

    .line 245
    mul-float v2, v2, v1

    .line 246
    .line 247
    iput v2, v6, Ljc/v;->a:F

    .line 248
    .line 249
    new-instance v1, Ljava/lang/Float;

    .line 250
    .line 251
    invoke-direct {v1, v2}, Ljava/lang/Float;-><init>(F)V

    .line 252
    .line 253
    .line 254
    invoke-interface {v9, v1}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    iget v2, v6, Ljc/v;->a:F

    .line 258
    .line 259
    new-instance v4, Lv/c;

    .line 260
    .line 261
    const/4 v1, 0x1

    .line 262
    invoke-direct {v4, v6, v9, v1}, Lv/c;-><init>(Ljc/v;Lic/k;I)V

    .line 263
    .line 264
    .line 265
    move-object/from16 v5, p0

    .line 266
    .line 267
    iput-object v6, v5, Lu/h;->f:Ljc/v;

    .line 268
    .line 269
    iput v1, v5, Lu/h;->g:I

    .line 270
    .line 271
    iget-object v1, v5, Lu/h;->k:Lu/k1;

    .line 272
    .line 273
    iget v3, v5, Lu/h;->h:F

    .line 274
    .line 275
    invoke-static/range {v0 .. v5}, Lv/f;->b(Lv/f;Lu/k1;FFLv/c;Lac/c;)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    move-object/from16 v7, v16

    .line 280
    .line 281
    if-ne v1, v7, :cond_a

    .line 282
    .line 283
    goto/16 :goto_8

    .line 284
    .line 285
    :cond_a
    :goto_3
    check-cast v1, Lr/k;

    .line 286
    .line 287
    invoke-virtual {v1}, Lr/k;->a()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v2

    .line 291
    check-cast v2, Ljava/lang/Number;

    .line 292
    .line 293
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 294
    .line 295
    .line 296
    move-result v2

    .line 297
    iget-object v3, v10, Lm0/w;->b:Ljava/lang/Object;

    .line 298
    .line 299
    check-cast v3, Ld0/d;

    .line 300
    .line 301
    invoke-virtual {v3}, Ld0/f0;->k()Ld0/w;

    .line 302
    .line 303
    .line 304
    move-result-object v4

    .line 305
    iget-object v4, v4, Ld0/w;->m:Lv/k;

    .line 306
    .line 307
    invoke-virtual {v3}, Ld0/f0;->k()Ld0/w;

    .line 308
    .line 309
    .line 310
    move-result-object v11

    .line 311
    iget-object v11, v11, Ld0/w;->a:Ljava/util/List;

    .line 312
    .line 313
    move-object v12, v11

    .line 314
    check-cast v12, Ljava/util/Collection;

    .line 315
    .line 316
    invoke-interface {v12}, Ljava/util/Collection;->size()I

    .line 317
    .line 318
    .line 319
    move-result v12

    .line 320
    const/high16 p1, -0x800000    # Float.NEGATIVE_INFINITY

    .line 321
    .line 322
    const/4 v13, 0x0

    .line 323
    const/high16 v16, -0x800000    # Float.NEGATIVE_INFINITY

    .line 324
    .line 325
    const/high16 v18, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 326
    .line 327
    :goto_4
    if-ge v13, v12, :cond_d

    .line 328
    .line 329
    invoke-interface {v11, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v19

    .line 333
    const/high16 v20, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 334
    .line 335
    move-object/from16 v14, v19

    .line 336
    .line 337
    check-cast v14, Ld0/j;

    .line 338
    .line 339
    invoke-virtual {v3}, Ld0/f0;->k()Ld0/w;

    .line 340
    .line 341
    .line 342
    move-result-object v19

    .line 343
    invoke-static/range {v19 .. v19}, Landroid/support/v4/media/session/b;->H(Ld0/w;)I

    .line 344
    .line 345
    .line 346
    invoke-virtual {v3}, Ld0/f0;->k()Ld0/w;

    .line 347
    .line 348
    .line 349
    move-result-object v15

    .line 350
    iget v15, v15, Ld0/w;->f:I

    .line 351
    .line 352
    invoke-virtual {v3}, Ld0/f0;->k()Ld0/w;

    .line 353
    .line 354
    .line 355
    move-result-object v15

    .line 356
    iget v15, v15, Ld0/w;->d:I

    .line 357
    .line 358
    invoke-virtual {v3}, Ld0/f0;->k()Ld0/w;

    .line 359
    .line 360
    .line 361
    move-result-object v15

    .line 362
    iget v15, v15, Ld0/w;->b:I

    .line 363
    .line 364
    iget v14, v14, Ld0/j;->l:I

    .line 365
    .line 366
    invoke-virtual {v3}, Ld0/d;->l()I

    .line 367
    .line 368
    .line 369
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 370
    .line 371
    .line 372
    int-to-float v15, v8

    .line 373
    int-to-float v14, v14

    .line 374
    sub-float/2addr v14, v15

    .line 375
    cmpg-float v15, v14, v17

    .line 376
    .line 377
    if-gtz v15, :cond_b

    .line 378
    .line 379
    cmpl-float v15, v14, v16

    .line 380
    .line 381
    if-lez v15, :cond_b

    .line 382
    .line 383
    move/from16 v16, v14

    .line 384
    .line 385
    :cond_b
    cmpl-float v15, v14, v17

    .line 386
    .line 387
    if-ltz v15, :cond_c

    .line 388
    .line 389
    cmpg-float v15, v14, v18

    .line 390
    .line 391
    if-gez v15, :cond_c

    .line 392
    .line 393
    move/from16 v18, v14

    .line 394
    .line 395
    :cond_c
    add-int/lit8 v13, v13, 0x1

    .line 396
    .line 397
    goto :goto_4

    .line 398
    :cond_d
    const/high16 v20, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 399
    .line 400
    cmpg-float v4, v16, p1

    .line 401
    .line 402
    if-nez v4, :cond_e

    .line 403
    .line 404
    move/from16 v16, v18

    .line 405
    .line 406
    :cond_e
    cmpg-float v4, v18, v20

    .line 407
    .line 408
    if-nez v4, :cond_f

    .line 409
    .line 410
    move/from16 v18, v16

    .line 411
    .line 412
    :cond_f
    invoke-virtual {v3}, Ld0/f0;->d()Z

    .line 413
    .line 414
    .line 415
    move-result v4

    .line 416
    if-nez v4, :cond_11

    .line 417
    .line 418
    invoke-static {v3, v2}, Lud/b;->u(Ld0/d;F)Z

    .line 419
    .line 420
    .line 421
    move-result v4

    .line 422
    if-eqz v4, :cond_10

    .line 423
    .line 424
    const/16 v16, 0x0

    .line 425
    .line 426
    :cond_10
    const/16 v18, 0x0

    .line 427
    .line 428
    :cond_11
    invoke-virtual {v3}, Ld0/f0;->c()Z

    .line 429
    .line 430
    .line 431
    move-result v4

    .line 432
    if-nez v4, :cond_13

    .line 433
    .line 434
    invoke-static {v3, v2}, Lud/b;->u(Ld0/d;F)Z

    .line 435
    .line 436
    .line 437
    move-result v3

    .line 438
    if-nez v3, :cond_12

    .line 439
    .line 440
    const/4 v3, 0x0

    .line 441
    const/4 v4, 0x0

    .line 442
    goto :goto_5

    .line 443
    :cond_12
    move/from16 v4, v18

    .line 444
    .line 445
    const/4 v3, 0x0

    .line 446
    goto :goto_5

    .line 447
    :cond_13
    move/from16 v3, v16

    .line 448
    .line 449
    move/from16 v4, v18

    .line 450
    .line 451
    :goto_5
    iget-object v10, v10, Lm0/w;->c:Ljava/lang/Object;

    .line 452
    .line 453
    check-cast v10, Lcg/d0;

    .line 454
    .line 455
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 456
    .line 457
    .line 458
    move-result-object v2

    .line 459
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 460
    .line 461
    .line 462
    move-result-object v11

    .line 463
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 464
    .line 465
    .line 466
    move-result-object v12

    .line 467
    invoke-virtual {v10, v2, v11, v12}, Lcg/d0;->g(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 468
    .line 469
    .line 470
    move-result-object v2

    .line 471
    check-cast v2, Ljava/lang/Number;

    .line 472
    .line 473
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 474
    .line 475
    .line 476
    move-result v2

    .line 477
    cmpg-float v10, v2, v3

    .line 478
    .line 479
    if-nez v10, :cond_14

    .line 480
    .line 481
    goto :goto_6

    .line 482
    :cond_14
    cmpg-float v10, v2, v4

    .line 483
    .line 484
    if-nez v10, :cond_15

    .line 485
    .line 486
    goto :goto_6

    .line 487
    :cond_15
    cmpg-float v10, v2, v17

    .line 488
    .line 489
    if-nez v10, :cond_16

    .line 490
    .line 491
    goto :goto_6

    .line 492
    :cond_16
    new-instance v10, Ljava/lang/StringBuilder;

    .line 493
    .line 494
    const-string v11, "Final Snapping Offset Should Be one of "

    .line 495
    .line 496
    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 497
    .line 498
    .line 499
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 500
    .line 501
    .line 502
    const-string v3, ", "

    .line 503
    .line 504
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 505
    .line 506
    .line 507
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 508
    .line 509
    .line 510
    const-string v3, " or 0.0"

    .line 511
    .line 512
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 513
    .line 514
    .line 515
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 516
    .line 517
    .line 518
    move-result-object v3

    .line 519
    invoke-static {v3}, Lx/a;->c(Ljava/lang/String;)V

    .line 520
    .line 521
    .line 522
    :goto_6
    cmpg-float v3, v2, v20

    .line 523
    .line 524
    if-nez v3, :cond_17

    .line 525
    .line 526
    goto :goto_7

    .line 527
    :cond_17
    cmpg-float v3, v2, p1

    .line 528
    .line 529
    if-nez v3, :cond_18

    .line 530
    .line 531
    :goto_7
    const/4 v2, 0x0

    .line 532
    :cond_18
    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    .line 533
    .line 534
    .line 535
    move-result v3

    .line 536
    if-eqz v3, :cond_19

    .line 537
    .line 538
    const-string v3, "calculateSnapOffset returned NaN. Please use a valid value."

    .line 539
    .line 540
    invoke-static {v3}, Lx/a;->c(Ljava/lang/String;)V

    .line 541
    .line 542
    .line 543
    :cond_19
    iput v2, v6, Ljc/v;->a:F

    .line 544
    .line 545
    const/16 v3, 0x1e

    .line 546
    .line 547
    const/4 v4, 0x0

    .line 548
    invoke-static {v1, v4, v4, v3}, Lr/d;->l(Lr/k;FFI)Lr/k;

    .line 549
    .line 550
    .line 551
    move-result-object v3

    .line 552
    iget-object v4, v0, Lv/f;->c:Lr/z0;

    .line 553
    .line 554
    new-instance v0, Lv/c;

    .line 555
    .line 556
    invoke-direct {v0, v6, v9, v8}, Lv/c;-><init>(Ljc/v;Lic/k;I)V

    .line 557
    .line 558
    .line 559
    const/4 v1, 0x0

    .line 560
    iput-object v1, v5, Lu/h;->f:Ljc/v;

    .line 561
    .line 562
    const/4 v15, 0x2

    .line 563
    iput v15, v5, Lu/h;->g:I

    .line 564
    .line 565
    move-object v1, v0

    .line 566
    iget-object v0, v5, Lu/h;->k:Lu/k1;

    .line 567
    .line 568
    move-object v5, v1

    .line 569
    move v1, v2

    .line 570
    move-object/from16 v6, p0

    .line 571
    .line 572
    invoke-static/range {v0 .. v6}, Lv/j;->c(Lu/k1;FFLr/k;Lr/z0;Lic/k;Lac/c;)Ljava/lang/Object;

    .line 573
    .line 574
    .line 575
    move-result-object v0

    .line 576
    move-object v5, v6

    .line 577
    if-ne v0, v7, :cond_1a

    .line 578
    .line 579
    :goto_8
    move-object v0, v7

    .line 580
    :cond_1a
    :goto_9
    return-object v0

    .line 581
    :pswitch_0
    iget v0, v5, Lu/h;->g:I

    .line 582
    .line 583
    if-eqz v0, :cond_1c

    .line 584
    .line 585
    const/4 v4, 0x1

    .line 586
    if-ne v0, v4, :cond_1b

    .line 587
    .line 588
    iget-object v0, v5, Lu/h;->i:Ljava/lang/Object;

    .line 589
    .line 590
    check-cast v0, Lr/k;

    .line 591
    .line 592
    iget-object v1, v5, Lu/h;->f:Ljc/v;

    .line 593
    .line 594
    :try_start_0
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1

    .line 595
    .line 596
    .line 597
    goto :goto_a

    .line 598
    :cond_1b
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 599
    .line 600
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 601
    .line 602
    .line 603
    throw v0

    .line 604
    :cond_1c
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 605
    .line 606
    .line 607
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 608
    .line 609
    .line 610
    move-result v0

    .line 611
    const/high16 v1, 0x3f800000    # 1.0f

    .line 612
    .line 613
    cmpl-float v0, v0, v1

    .line 614
    .line 615
    if-lez v0, :cond_1e

    .line 616
    .line 617
    new-instance v1, Ljc/v;

    .line 618
    .line 619
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 620
    .line 621
    .line 622
    iput v2, v1, Ljc/v;->a:F

    .line 623
    .line 624
    new-instance v0, Ljc/v;

    .line 625
    .line 626
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 627
    .line 628
    .line 629
    const/16 v4, 0x1c

    .line 630
    .line 631
    const/4 v6, 0x0

    .line 632
    invoke-static {v6, v2, v4}, Lr/d;->b(FFI)Lr/k;

    .line 633
    .line 634
    .line 635
    move-result-object v2

    .line 636
    :try_start_1
    check-cast v3, Lu/i;

    .line 637
    .line 638
    iget-object v4, v3, Lu/i;->a:Lr/t;

    .line 639
    .line 640
    new-instance v6, Lcg/b;

    .line 641
    .line 642
    iget-object v9, v5, Lu/h;->k:Lu/k1;

    .line 643
    .line 644
    check-cast v9, Lu/y1;

    .line 645
    .line 646
    invoke-direct {v6, v0, v9, v1, v3}, Lcg/b;-><init>(Ljc/v;Lu/y1;Ljc/v;Lu/i;)V

    .line 647
    .line 648
    .line 649
    iput-object v1, v5, Lu/h;->f:Ljc/v;

    .line 650
    .line 651
    iput-object v2, v5, Lu/h;->i:Ljava/lang/Object;

    .line 652
    .line 653
    const/4 v0, 0x1

    .line 654
    iput v0, v5, Lu/h;->g:I

    .line 655
    .line 656
    invoke-static {v2, v4, v8, v6, v5}, Lr/d;->f(Lr/k;Lr/t;ZLic/k;Lac/c;)Ljava/lang/Object;

    .line 657
    .line 658
    .line 659
    move-result-object v0
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    .line 660
    if-ne v0, v7, :cond_1d

    .line 661
    .line 662
    goto :goto_b

    .line 663
    :catch_0
    move-object v0, v2

    .line 664
    :catch_1
    invoke-virtual {v0}, Lr/k;->a()Ljava/lang/Object;

    .line 665
    .line 666
    .line 667
    move-result-object v0

    .line 668
    check-cast v0, Ljava/lang/Number;

    .line 669
    .line 670
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 671
    .line 672
    .line 673
    move-result v0

    .line 674
    iput v0, v1, Ljc/v;->a:F

    .line 675
    .line 676
    :cond_1d
    :goto_a
    iget v2, v1, Ljc/v;->a:F

    .line 677
    .line 678
    :cond_1e
    new-instance v7, Ljava/lang/Float;

    .line 679
    .line 680
    invoke-direct {v7, v2}, Ljava/lang/Float;-><init>(F)V

    .line 681
    .line 682
    .line 683
    :goto_b
    return-object v7

    .line 684
    nop

    .line 685
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
