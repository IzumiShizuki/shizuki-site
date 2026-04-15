.class public final synthetic Lt9/d;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/q;


# instance fields
.field public final synthetic a:Lj7/b;

.field public final synthetic b:Lt9/g;


# direct methods
.method public synthetic constructor <init>(Lj7/b;Lt9/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lt9/d;->a:Lj7/b;

    .line 5
    .line 6
    iput-object p2, p0, Lt9/d;->b:Lt9/g;

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


# virtual methods
.method public final k(La0/d;Ljava/lang/Integer;Ljava/lang/Object;Lx0/o;Ljava/lang/Integer;)Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v5, p4

    .line 4
    .line 5
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Integer;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    move-object/from16 v2, p3

    .line 10
    .line 11
    check-cast v2, Lc9/b;

    .line 12
    .line 13
    invoke-virtual/range {p5 .. p5}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    and-int/lit8 v4, v3, 0x30

    .line 18
    .line 19
    if-nez v4, :cond_1

    .line 20
    .line 21
    invoke-virtual {v5, v1}, Lx0/o;->d(I)Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-eqz v4, :cond_0

    .line 26
    .line 27
    const/16 v4, 0x20

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/16 v4, 0x10

    .line 31
    .line 32
    :goto_0
    or-int/2addr v4, v3

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move v4, v3

    .line 35
    :goto_1
    and-int/lit16 v3, v3, 0x180

    .line 36
    .line 37
    if-nez v3, :cond_3

    .line 38
    .line 39
    invoke-virtual {v5, v2}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_2

    .line 44
    .line 45
    const/16 v3, 0x100

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_2
    const/16 v3, 0x80

    .line 49
    .line 50
    :goto_2
    or-int/2addr v4, v3

    .line 51
    :cond_3
    and-int/lit16 v3, v4, 0x491

    .line 52
    .line 53
    const/16 v6, 0x490

    .line 54
    .line 55
    const/4 v7, 0x1

    .line 56
    const/4 v8, 0x0

    .line 57
    if-eq v3, v6, :cond_4

    .line 58
    .line 59
    const/4 v3, 0x1

    .line 60
    goto :goto_3

    .line 61
    :cond_4
    const/4 v3, 0x0

    .line 62
    :goto_3
    and-int/2addr v4, v7

    .line 63
    invoke-virtual {v5, v4, v3}, Lx0/o;->N(IZ)Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-eqz v3, :cond_c

    .line 68
    .line 69
    if-nez v2, :cond_5

    .line 70
    .line 71
    const v1, 0x4765262a

    .line 72
    .line 73
    .line 74
    invoke-virtual {v5, v1}, Lx0/o;->W(I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v5, v8}, Lx0/o;->p(Z)V

    .line 78
    .line 79
    .line 80
    goto/16 :goto_7

    .line 81
    .line 82
    :cond_5
    const v3, 0x4765262b

    .line 83
    .line 84
    .line 85
    invoke-virtual {v5, v3}, Lx0/o;->W(I)V

    .line 86
    .line 87
    .line 88
    sget-object v3, Lj1/n;->a:Lj1/n;

    .line 89
    .line 90
    const/high16 v4, 0x3f800000    # 1.0f

    .line 91
    .line 92
    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/c;->c(Lj1/q;F)Lj1/q;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    const/16 v4, 0x19

    .line 97
    .line 98
    int-to-float v4, v4

    .line 99
    const/4 v6, 0x2

    .line 100
    const/4 v9, 0x0

    .line 101
    invoke-static {v3, v4, v9, v6}, Landroidx/compose/foundation/layout/a;->l(Lj1/q;FFI)Lj1/q;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    sget-object v4, Lj1/c;->k:Lj1/g;

    .line 106
    .line 107
    sget-object v6, Ly/k;->f:Ly/e;

    .line 108
    .line 109
    const/16 v9, 0x36

    .line 110
    .line 111
    invoke-static {v6, v4, v5, v9}, Ly/i1;->a(Ly/f;Lj1/g;Lx0/o;I)Ly/j1;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    invoke-static {v5}, Lx0/v;->q(Lx0/o;)I

    .line 116
    .line 117
    .line 118
    move-result v6

    .line 119
    invoke-virtual {v5}, Lx0/o;->l()Lx0/j1;

    .line 120
    .line 121
    .line 122
    move-result-object v9

    .line 123
    invoke-static {v3, v5}, Lj1/a;->c(Lj1/q;Lx0/o;)Lj1/q;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    sget-object v10, Li2/k;->g0:Li2/j;

    .line 128
    .line 129
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    sget-object v10, Li2/j;->b:Li2/i;

    .line 133
    .line 134
    invoke-virtual {v5}, Lx0/o;->a0()V

    .line 135
    .line 136
    .line 137
    iget-boolean v11, v5, Lx0/o;->S:Z

    .line 138
    .line 139
    if-eqz v11, :cond_6

    .line 140
    .line 141
    invoke-virtual {v5, v10}, Lx0/o;->k(Lic/a;)V

    .line 142
    .line 143
    .line 144
    goto :goto_4

    .line 145
    :cond_6
    invoke-virtual {v5}, Lx0/o;->k0()V

    .line 146
    .line 147
    .line 148
    :goto_4
    sget-object v10, Li2/j;->g:Li2/h;

    .line 149
    .line 150
    invoke-static {v10, v4, v5}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 151
    .line 152
    .line 153
    sget-object v4, Li2/j;->f:Li2/h;

    .line 154
    .line 155
    invoke-static {v4, v9, v5}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 156
    .line 157
    .line 158
    sget-object v4, Li2/j;->j:Li2/h;

    .line 159
    .line 160
    iget-boolean v9, v5, Lx0/o;->S:Z

    .line 161
    .line 162
    if-nez v9, :cond_7

    .line 163
    .line 164
    invoke-virtual {v5}, Lx0/o;->K()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v9

    .line 168
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 169
    .line 170
    .line 171
    move-result-object v10

    .line 172
    invoke-static {v9, v10}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v9

    .line 176
    if-nez v9, :cond_8

    .line 177
    .line 178
    :cond_7
    invoke-static {v6, v5, v6, v4}, Lj2/h0;->s(ILx0/o;ILi2/h;)V

    .line 179
    .line 180
    .line 181
    :cond_8
    sget-object v4, Li2/j;->d:Li2/h;

    .line 182
    .line 183
    invoke-static {v4, v3, v5}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 184
    .line 185
    .line 186
    move v3, v1

    .line 187
    iget-object v1, v2, Lc9/b;->c:Ljava/lang/String;

    .line 188
    .line 189
    const/16 v22, 0x0

    .line 190
    .line 191
    const v23, 0x1fffe

    .line 192
    .line 193
    .line 194
    move-object v4, v2

    .line 195
    const/4 v2, 0x0

    .line 196
    move v6, v3

    .line 197
    move-object v9, v4

    .line 198
    const-wide/16 v3, 0x0

    .line 199
    .line 200
    move v10, v6

    .line 201
    const-wide/16 v5, 0x0

    .line 202
    .line 203
    const/4 v11, 0x1

    .line 204
    const/4 v7, 0x0

    .line 205
    const/4 v12, 0x0

    .line 206
    const/4 v8, 0x0

    .line 207
    move-object v14, v9

    .line 208
    move v13, v10

    .line 209
    const-wide/16 v9, 0x0

    .line 210
    .line 211
    const/4 v15, 0x1

    .line 212
    const/4 v11, 0x0

    .line 213
    const/16 v16, 0x0

    .line 214
    .line 215
    const/4 v12, 0x0

    .line 216
    move/from16 v17, v13

    .line 217
    .line 218
    move-object/from16 v18, v14

    .line 219
    .line 220
    const-wide/16 v13, 0x0

    .line 221
    .line 222
    const/16 v19, 0x1

    .line 223
    .line 224
    const/4 v15, 0x0

    .line 225
    const/16 v20, 0x0

    .line 226
    .line 227
    const/16 v16, 0x0

    .line 228
    .line 229
    move/from16 v21, v17

    .line 230
    .line 231
    const/16 v17, 0x0

    .line 232
    .line 233
    move-object/from16 v24, v18

    .line 234
    .line 235
    const/16 v18, 0x0

    .line 236
    .line 237
    const/16 v25, 0x1

    .line 238
    .line 239
    const/16 v19, 0x0

    .line 240
    .line 241
    move/from16 v26, v21

    .line 242
    .line 243
    const/16 v21, 0x0

    .line 244
    .line 245
    move-object/from16 v20, p4

    .line 246
    .line 247
    move-object/from16 v28, v24

    .line 248
    .line 249
    move/from16 v27, v26

    .line 250
    .line 251
    invoke-static/range {v1 .. v23}, Lm0/z8;->b(Ljava/lang/String;Lj1/q;JJLx2/i;Lx2/k;JLe3/l;Le3/k;JIZIILt2/l0;Lx0/o;III)V

    .line 252
    .line 253
    .line 254
    move-object/from16 v5, v20

    .line 255
    .line 256
    iget-object v1, v0, Lt9/d;->b:Lt9/g;

    .line 257
    .line 258
    invoke-virtual {v5, v1}, Lx0/o;->h(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    move-result v2

    .line 262
    move-object/from16 v14, v28

    .line 263
    .line 264
    invoke-virtual {v5, v14}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    move-result v3

    .line 268
    or-int/2addr v2, v3

    .line 269
    invoke-virtual {v5}, Lx0/o;->K()Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v3

    .line 273
    if-nez v2, :cond_9

    .line 274
    .line 275
    sget-object v2, Lx0/k;->a:Lx0/r0;

    .line 276
    .line 277
    if-ne v3, v2, :cond_a

    .line 278
    .line 279
    :cond_9
    new-instance v3, La9/d;

    .line 280
    .line 281
    const/16 v2, 0x1a

    .line 282
    .line 283
    invoke-direct {v3, v2, v1, v14}, La9/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v5, v3}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 287
    .line 288
    .line 289
    :cond_a
    move-object v1, v3

    .line 290
    check-cast v1, Lic/a;

    .line 291
    .line 292
    const/16 v6, 0x6000

    .line 293
    .line 294
    const/16 v7, 0xe

    .line 295
    .line 296
    const/4 v2, 0x0

    .line 297
    const/4 v3, 0x0

    .line 298
    sget-object v4, Lt9/i;->a:Lf1/f;

    .line 299
    .line 300
    invoke-static/range {v1 .. v7}, Lm0/p3;->a(Lic/a;Lj1/q;ZLic/n;Lx0/o;II)V

    .line 301
    .line 302
    .line 303
    const/4 v11, 0x1

    .line 304
    invoke-virtual {v5, v11}, Lx0/o;->p(Z)V

    .line 305
    .line 306
    .line 307
    iget-object v1, v0, Lt9/d;->a:Lj7/b;

    .line 308
    .line 309
    invoke-virtual {v1}, Lj7/b;->c()I

    .line 310
    .line 311
    .line 312
    move-result v1

    .line 313
    sub-int/2addr v1, v11

    .line 314
    move/from16 v10, v27

    .line 315
    .line 316
    if-eq v10, v1, :cond_b

    .line 317
    .line 318
    const v1, 0x698922b0

    .line 319
    .line 320
    .line 321
    invoke-virtual {v5, v1}, Lx0/o;->W(I)V

    .line 322
    .line 323
    .line 324
    const/4 v7, 0x0

    .line 325
    const/16 v8, 0xf

    .line 326
    .line 327
    const/4 v1, 0x0

    .line 328
    const-wide/16 v2, 0x0

    .line 329
    .line 330
    const/4 v4, 0x0

    .line 331
    const/4 v5, 0x0

    .line 332
    move-object/from16 v6, p4

    .line 333
    .line 334
    invoke-static/range {v1 .. v8}, Lpc/f0;->b(Lj1/q;JFFLx0/o;II)V

    .line 335
    .line 336
    .line 337
    move-object v5, v6

    .line 338
    const/4 v12, 0x0

    .line 339
    :goto_5
    invoke-virtual {v5, v12}, Lx0/o;->p(Z)V

    .line 340
    .line 341
    .line 342
    goto :goto_6

    .line 343
    :cond_b
    const/4 v12, 0x0

    .line 344
    const v1, 0x693a9ef1

    .line 345
    .line 346
    .line 347
    invoke-virtual {v5, v1}, Lx0/o;->W(I)V

    .line 348
    .line 349
    .line 350
    goto :goto_5

    .line 351
    :goto_6
    invoke-virtual {v5, v12}, Lx0/o;->p(Z)V

    .line 352
    .line 353
    .line 354
    goto :goto_7

    .line 355
    :cond_c
    invoke-virtual {v5}, Lx0/o;->Q()V

    .line 356
    .line 357
    .line 358
    :goto_7
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 359
    .line 360
    return-object v1
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
.end method
