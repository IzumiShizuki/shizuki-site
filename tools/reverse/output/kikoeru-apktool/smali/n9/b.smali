.class public abstract Ln9/b;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final synthetic a:[Lpc/u;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ljc/n;

    .line 2
    .line 3
    const-string v1, "documentUri"

    .line 4
    .line 5
    const-string v2, "<v#0>"

    .line 6
    .line 7
    const-class v3, Ln9/b;

    .line 8
    .line 9
    invoke-direct {v0, v3, v1, v2}, Ljc/n;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    sget-object v1, Ljc/z;->a:Ljc/a0;

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Ljc/a0;->d(Ljc/n;)Lpc/i;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v1, 0x1

    .line 19
    new-array v1, v1, [Lpc/u;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    aput-object v0, v1, v2

    .line 23
    .line 24
    sput-object v1, Ln9/b;->a:[Lpc/u;

    .line 25
    .line 26
    return-void
    .line 27
    .line 28
    .line 29
.end method

.method public static final a(Lr9/c;Lx0/o;I)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v4, p1

    .line 4
    .line 5
    move/from16 v15, p2

    .line 6
    .line 7
    const-string v1, "page"

    .line 8
    .line 9
    invoke-static {v0, v1}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const v1, -0x457f8c58    # -9.800093E-4f

    .line 13
    .line 14
    .line 15
    invoke-virtual {v4, v1}, Lx0/o;->Y(I)Lx0/o;

    .line 16
    .line 17
    .line 18
    and-int/lit8 v1, v15, 0x6

    .line 19
    .line 20
    const/4 v7, 0x2

    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {v4, v0}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    const/4 v1, 0x4

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v1, 0x2

    .line 32
    :goto_0
    or-int/2addr v1, v15

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move v1, v15

    .line 35
    :goto_1
    and-int/lit8 v2, v1, 0x3

    .line 36
    .line 37
    const/4 v8, 0x1

    .line 38
    const/4 v9, 0x0

    .line 39
    if-eq v2, v7, :cond_2

    .line 40
    .line 41
    const/4 v2, 0x1

    .line 42
    goto :goto_2

    .line 43
    :cond_2
    const/4 v2, 0x0

    .line 44
    :goto_2
    and-int/2addr v1, v8

    .line 45
    invoke-virtual {v4, v1, v2}, Lx0/o;->N(IZ)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_e

    .line 50
    .line 51
    invoke-static {v4}, Lj4/a;->a(Lx0/o;)Landroidx/lifecycle/x0;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    if-eqz v1, :cond_d

    .line 56
    .line 57
    instance-of v2, v1, Landroidx/lifecycle/k;

    .line 58
    .line 59
    if-eqz v2, :cond_3

    .line 60
    .line 61
    move-object v2, v1

    .line 62
    check-cast v2, Landroidx/lifecycle/k;

    .line 63
    .line 64
    invoke-interface {v2}, Landroidx/lifecycle/k;->c()Li4/e;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    goto :goto_3

    .line 69
    :cond_3
    sget-object v2, Li4/a;->b:Li4/a;

    .line 70
    .line 71
    :goto_3
    const-class v3, Ln9/e;

    .line 72
    .line 73
    sget-object v5, Ljc/z;->a:Ljc/a0;

    .line 74
    .line 75
    invoke-virtual {v5, v3}, Ljc/a0;->b(Ljava/lang/Class;)Lpc/c;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    const/4 v5, 0x0

    .line 80
    invoke-static {v1, v3, v5, v2}, Lg8/a;->w(Landroidx/lifecycle/x0;Lpc/c;Landroidx/lifecycle/u0;Li4/b;)Landroidx/lifecycle/s0;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    move-object v10, v1

    .line 85
    check-cast v10, Ln9/e;

    .line 86
    .line 87
    invoke-virtual {v4}, Lx0/o;->K()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    sget-object v11, Lx0/k;->a:Lx0/r0;

    .line 92
    .line 93
    if-ne v1, v11, :cond_4

    .line 94
    .line 95
    sget-object v1, Llf/e;->b:Llf/e;

    .line 96
    .line 97
    invoke-static {v1}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-virtual {v4, v1}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    :cond_4
    check-cast v1, Lx0/w0;

    .line 105
    .line 106
    iget-object v2, v0, Lr9/c;->e:Lx0/w0;

    .line 107
    .line 108
    invoke-interface {v2}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    check-cast v2, Ljava/lang/Boolean;

    .line 113
    .line 114
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    iget-object v3, v0, Lr9/c;->f:Lx0/w0;

    .line 119
    .line 120
    invoke-interface {v3}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    check-cast v3, Ljava/lang/String;

    .line 125
    .line 126
    move-object v4, v1

    .line 127
    move v1, v2

    .line 128
    move-object v2, v3

    .line 129
    iget-object v3, v10, Ln9/e;->b:Llf/j0;

    .line 130
    .line 131
    const/4 v6, 0x0

    .line 132
    move-object/from16 v5, p1

    .line 133
    .line 134
    invoke-static/range {v1 .. v6}, Lla/l;->g(ZLjava/lang/String;Llf/f;Lx0/w0;Lx0/o;I)V

    .line 135
    .line 136
    .line 137
    move-object v1, v4

    .line 138
    move-object v4, v5

    .line 139
    invoke-interface {v1}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    check-cast v1, Llf/f;

    .line 144
    .line 145
    invoke-static {v1, v4}, Lj7/d;->a(Llf/f;Lx0/o;)Lj7/b;

    .line 146
    .line 147
    .line 148
    move-result-object v12

    .line 149
    invoke-static {v4}, Llc/b;->L(Lx0/o;)Lc0/z;

    .line 150
    .line 151
    .line 152
    move-result-object v13

    .line 153
    invoke-virtual {v4}, Lx0/o;->K()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    if-ne v1, v11, :cond_5

    .line 158
    .line 159
    invoke-static {v4}, Lx0/v;->m(Lx0/o;)Lhf/y;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    invoke-virtual {v4, v1}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    :cond_5
    move-object v14, v1

    .line 167
    check-cast v14, Lhf/y;

    .line 168
    .line 169
    invoke-static {v4}, Lna/c;->n(Lx0/o;)Lic/k;

    .line 170
    .line 171
    .line 172
    move-result-object v21

    .line 173
    sget-object v3, Landroidx/compose/foundation/layout/c;->c:Landroidx/compose/foundation/layout/FillElement;

    .line 174
    .line 175
    sget-object v1, Lj1/c;->a:Lj1/h;

    .line 176
    .line 177
    invoke-static {v1, v9}, Ly/p;->d(Lj1/h;Z)Lg2/v0;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    invoke-static {v4}, Lx0/v;->q(Lx0/o;)I

    .line 182
    .line 183
    .line 184
    move-result v2

    .line 185
    invoke-virtual {v4}, Lx0/o;->l()Lx0/j1;

    .line 186
    .line 187
    .line 188
    move-result-object v5

    .line 189
    invoke-static {v3, v4}, Lj1/a;->c(Lj1/q;Lx0/o;)Lj1/q;

    .line 190
    .line 191
    .line 192
    move-result-object v6

    .line 193
    sget-object v16, Li2/k;->g0:Li2/j;

    .line 194
    .line 195
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    const/16 v22, 0x1

    .line 199
    .line 200
    sget-object v8, Li2/j;->b:Li2/i;

    .line 201
    .line 202
    invoke-virtual {v4}, Lx0/o;->a0()V

    .line 203
    .line 204
    .line 205
    iget-boolean v7, v4, Lx0/o;->S:Z

    .line 206
    .line 207
    if-eqz v7, :cond_6

    .line 208
    .line 209
    invoke-virtual {v4, v8}, Lx0/o;->k(Lic/a;)V

    .line 210
    .line 211
    .line 212
    goto :goto_4

    .line 213
    :cond_6
    invoke-virtual {v4}, Lx0/o;->k0()V

    .line 214
    .line 215
    .line 216
    :goto_4
    sget-object v7, Li2/j;->g:Li2/h;

    .line 217
    .line 218
    invoke-static {v7, v1, v4}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 219
    .line 220
    .line 221
    sget-object v1, Li2/j;->f:Li2/h;

    .line 222
    .line 223
    invoke-static {v1, v5, v4}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 224
    .line 225
    .line 226
    sget-object v1, Li2/j;->j:Li2/h;

    .line 227
    .line 228
    iget-boolean v5, v4, Lx0/o;->S:Z

    .line 229
    .line 230
    if-nez v5, :cond_7

    .line 231
    .line 232
    invoke-virtual {v4}, Lx0/o;->K()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v5

    .line 236
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 237
    .line 238
    .line 239
    move-result-object v7

    .line 240
    invoke-static {v5, v7}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    move-result v5

    .line 244
    if-nez v5, :cond_8

    .line 245
    .line 246
    :cond_7
    invoke-static {v2, v4, v2, v1}, Lj2/h0;->s(ILx0/o;ILi2/h;)V

    .line 247
    .line 248
    .line 249
    :cond_8
    sget-object v1, Li2/j;->d:Li2/h;

    .line 250
    .line 251
    invoke-static {v1, v6, v4}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v12}, Lj7/b;->c()I

    .line 255
    .line 256
    .line 257
    move-result v1

    .line 258
    if-nez v1, :cond_9

    .line 259
    .line 260
    const v1, 0x52b6b531

    .line 261
    .line 262
    .line 263
    invoke-virtual {v4, v1}, Lx0/o;->W(I)V

    .line 264
    .line 265
    .line 266
    const v1, 0x7f0c015a

    .line 267
    .line 268
    .line 269
    invoke-static {v1}, Lna/q;->g(I)Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    const/16 v5, 0x180

    .line 274
    .line 275
    const/4 v6, 0x2

    .line 276
    const/4 v2, 0x0

    .line 277
    move-object/from16 v7, v21

    .line 278
    .line 279
    invoke-static/range {v1 .. v6}, Lka/b;->k(Ljava/lang/String;Ljava/lang/Object;Lj1/q;Lx0/o;II)V

    .line 280
    .line 281
    .line 282
    :goto_5
    invoke-virtual {v4, v9}, Lx0/o;->p(Z)V

    .line 283
    .line 284
    .line 285
    goto :goto_6

    .line 286
    :cond_9
    move-object/from16 v7, v21

    .line 287
    .line 288
    const v1, 0x5293a654

    .line 289
    .line 290
    .line 291
    invoke-virtual {v4, v1}, Lx0/o;->W(I)V

    .line 292
    .line 293
    .line 294
    goto :goto_5

    .line 295
    :goto_6
    const v1, 0x7f0c005a

    .line 296
    .line 297
    .line 298
    invoke-static {v1}, Lna/q;->g(I)Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v1

    .line 302
    const v2, 0x7f0c00c4

    .line 303
    .line 304
    .line 305
    invoke-static {v2}, Lna/q;->g(I)Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v2

    .line 309
    invoke-virtual {v4}, Lx0/o;->K()Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v3

    .line 313
    if-ne v3, v11, :cond_a

    .line 314
    .line 315
    new-instance v3, Lla/x0;

    .line 316
    .line 317
    invoke-static {}, Lnh/b;->v()Lw1/f;

    .line 318
    .line 319
    .line 320
    move-result-object v5

    .line 321
    invoke-direct {v3, v5, v1}, Lla/x0;-><init>(Lw1/f;Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    new-instance v5, Lla/x0;

    .line 325
    .line 326
    invoke-static {}, Llc/b;->z()Lw1/f;

    .line 327
    .line 328
    .line 329
    move-result-object v6

    .line 330
    invoke-direct {v5, v6, v2}, Lla/x0;-><init>(Lw1/f;Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    const/4 v6, 0x2

    .line 334
    new-array v6, v6, [Lla/x0;

    .line 335
    .line 336
    aput-object v3, v6, v9

    .line 337
    .line 338
    aput-object v5, v6, v22

    .line 339
    .line 340
    invoke-static {v6}, Lud/b;->x([Ljava/lang/Object;)Ljava/util/List;

    .line 341
    .line 342
    .line 343
    move-result-object v3

    .line 344
    invoke-virtual {v4, v3}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 345
    .line 346
    .line 347
    :cond_a
    move-object v8, v3

    .line 348
    check-cast v8, Ljava/util/List;

    .line 349
    .line 350
    invoke-virtual {v4, v1}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 351
    .line 352
    .line 353
    move-result v3

    .line 354
    invoke-virtual {v4, v10}, Lx0/o;->h(Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    move-result v5

    .line 358
    or-int/2addr v3, v5

    .line 359
    invoke-virtual {v4, v2}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 360
    .line 361
    .line 362
    move-result v5

    .line 363
    or-int/2addr v3, v5

    .line 364
    invoke-virtual {v4, v14}, Lx0/o;->h(Ljava/lang/Object;)Z

    .line 365
    .line 366
    .line 367
    move-result v5

    .line 368
    or-int/2addr v3, v5

    .line 369
    invoke-virtual {v4, v7}, Lx0/o;->h(Ljava/lang/Object;)Z

    .line 370
    .line 371
    .line 372
    move-result v5

    .line 373
    or-int/2addr v3, v5

    .line 374
    invoke-virtual {v4}, Lx0/o;->K()Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object v5

    .line 378
    if-nez v3, :cond_b

    .line 379
    .line 380
    if-ne v5, v11, :cond_c

    .line 381
    .line 382
    :cond_b
    new-instance v16, Lm0/d4;

    .line 383
    .line 384
    move-object/from16 v17, v1

    .line 385
    .line 386
    move-object/from16 v19, v2

    .line 387
    .line 388
    move-object/from16 v21, v7

    .line 389
    .line 390
    move-object/from16 v18, v10

    .line 391
    .line 392
    move-object/from16 v20, v14

    .line 393
    .line 394
    invoke-direct/range {v16 .. v21}, Lm0/d4;-><init>(Ljava/lang/String;Ln9/e;Ljava/lang/String;Lhf/y;Lic/k;)V

    .line 395
    .line 396
    .line 397
    move-object/from16 v5, v16

    .line 398
    .line 399
    invoke-virtual {v4, v5}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 400
    .line 401
    .line 402
    :cond_c
    move-object v10, v5

    .line 403
    check-cast v10, Lic/n;

    .line 404
    .line 405
    move-object v1, v13

    .line 406
    const/4 v13, 0x0

    .line 407
    const/16 v14, 0x37c

    .line 408
    .line 409
    const/4 v3, 0x0

    .line 410
    const/4 v4, 0x0

    .line 411
    const/4 v5, 0x0

    .line 412
    const/4 v6, 0x0

    .line 413
    const/4 v7, 0x0

    .line 414
    const/4 v9, 0x0

    .line 415
    move-object v2, v1

    .line 416
    move-object v1, v12

    .line 417
    const/16 v12, 0x8

    .line 418
    .line 419
    move-object/from16 v11, p1

    .line 420
    .line 421
    const/4 v0, 0x1

    .line 422
    invoke-static/range {v1 .. v14}, Lla/l;->d(Lj7/b;Lc0/z;Lj1/q;Lic/n;FLj1/q;Ly/d1;Ljava/util/List;Lic/a;Lic/n;Lx0/o;III)V

    .line 423
    .line 424
    .line 425
    move-object v1, v2

    .line 426
    sget-object v2, Lj1/c;->i:Lj1/h;

    .line 427
    .line 428
    sget-object v3, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    .line 429
    .line 430
    sget-object v4, Lj1/n;->a:Lj1/n;

    .line 431
    .line 432
    invoke-virtual {v3, v4, v2}, Landroidx/compose/foundation/layout/b;->a(Lj1/q;Lj1/d;)Lj1/q;

    .line 433
    .line 434
    .line 435
    move-result-object v2

    .line 436
    const/16 v3, 0x19

    .line 437
    .line 438
    int-to-float v3, v3

    .line 439
    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/a;->j(Lj1/q;F)Lj1/q;

    .line 440
    .line 441
    .line 442
    move-result-object v2

    .line 443
    const/16 v5, 0x180

    .line 444
    .line 445
    const/4 v6, 0x0

    .line 446
    const/4 v3, 0x5

    .line 447
    move-object/from16 v4, p1

    .line 448
    .line 449
    invoke-static/range {v1 .. v6}, Lka/b;->e(Lc0/z;Lj1/q;ILx0/o;II)V

    .line 450
    .line 451
    .line 452
    invoke-virtual {v4, v0}, Lx0/o;->p(Z)V

    .line 453
    .line 454
    .line 455
    goto :goto_7

    .line 456
    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 457
    .line 458
    const-string v1, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    .line 459
    .line 460
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 461
    .line 462
    .line 463
    throw v0

    .line 464
    :cond_e
    const/4 v0, 0x1

    .line 465
    invoke-virtual {v4}, Lx0/o;->Q()V

    .line 466
    .line 467
    .line 468
    :goto_7
    invoke-virtual {v4}, Lx0/o;->r()Lx0/p1;

    .line 469
    .line 470
    .line 471
    move-result-object v1

    .line 472
    if-eqz v1, :cond_f

    .line 473
    .line 474
    new-instance v2, Lla/y0;

    .line 475
    .line 476
    move-object/from16 v3, p0

    .line 477
    .line 478
    invoke-direct {v2, v3, v15, v0}, Lla/y0;-><init>(Lr9/c;II)V

    .line 479
    .line 480
    .line 481
    iput-object v2, v1, Lx0/p1;->d:Lic/n;

    .line 482
    .line 483
    :cond_f
    return-void
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
.end method

.method public static final b(Ly/k1;Lr9/c;Lx0/o;I)V
    .locals 10

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "page"

    .line 7
    .line 8
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const v0, 0x60ee59e5    # 1.3740008E20f

    .line 12
    .line 13
    .line 14
    invoke-virtual {p2, v0}, Lx0/o;->Y(I)Lx0/o;

    .line 15
    .line 16
    .line 17
    and-int/lit8 v0, p3, 0x30

    .line 18
    .line 19
    const/16 v1, 0x10

    .line 20
    .line 21
    const/16 v2, 0x20

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {p2, p1}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    const/16 v0, 0x20

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/16 v0, 0x10

    .line 35
    .line 36
    :goto_0
    or-int/2addr v0, p3

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    move v0, p3

    .line 39
    :goto_1
    and-int/lit8 v3, v0, 0x11

    .line 40
    .line 41
    const/4 v4, 0x1

    .line 42
    const/4 v5, 0x0

    .line 43
    if-eq v3, v1, :cond_2

    .line 44
    .line 45
    const/4 v1, 0x1

    .line 46
    goto :goto_2

    .line 47
    :cond_2
    const/4 v1, 0x0

    .line 48
    :goto_2
    and-int/lit8 v3, v0, 0x1

    .line 49
    .line 50
    invoke-virtual {p2, v3, v1}, Lx0/o;->N(IZ)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_9

    .line 55
    .line 56
    invoke-virtual {p2}, Lx0/o;->K()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    sget-object v3, Lx0/k;->a:Lx0/r0;

    .line 61
    .line 62
    if-ne v1, v3, :cond_3

    .line 63
    .line 64
    invoke-static {p2}, Lx0/v;->m(Lx0/o;)Lhf/y;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-virtual {p2, v1}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    :cond_3
    check-cast v1, Lhf/y;

    .line 72
    .line 73
    invoke-static {p2}, Lna/c;->n(Lx0/o;)Lic/k;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    invoke-static {}, Llc/b;->z()Lw1/f;

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    invoke-virtual {p2, v1}, Lx0/o;->h(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v8

    .line 85
    invoke-virtual {p2, v6}, Lx0/o;->h(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v9

    .line 89
    or-int/2addr v8, v9

    .line 90
    invoke-virtual {p2}, Lx0/o;->K()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v9

    .line 94
    if-nez v8, :cond_4

    .line 95
    .line 96
    if-ne v9, v3, :cond_5

    .line 97
    .line 98
    :cond_4
    new-instance v9, Lfa/l;

    .line 99
    .line 100
    const/4 v8, 0x1

    .line 101
    invoke-direct {v9, v1, v6, v8}, Lfa/l;-><init>(Lhf/y;Lic/k;I)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p2, v9}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    :cond_5
    check-cast v9, Lic/a;

    .line 108
    .line 109
    invoke-static {v7, v9, p2, v5}, Lna/c;->b(Lw1/f;Lic/a;Lx0/o;I)V

    .line 110
    .line 111
    .line 112
    invoke-static {}, Lu3/x0;->s()Lw1/f;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    and-int/lit8 v0, v0, 0x70

    .line 117
    .line 118
    if-ne v0, v2, :cond_6

    .line 119
    .line 120
    goto :goto_3

    .line 121
    :cond_6
    const/4 v4, 0x0

    .line 122
    :goto_3
    invoke-virtual {p2}, Lx0/o;->K()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    if-nez v4, :cond_7

    .line 127
    .line 128
    if-ne v0, v3, :cond_8

    .line 129
    .line 130
    :cond_7
    new-instance v0, Ln9/a;

    .line 131
    .line 132
    const/4 v2, 0x0

    .line 133
    invoke-direct {v0, p1, v2}, Ln9/a;-><init>(Lr9/c;I)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p2, v0}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    :cond_8
    check-cast v0, Lic/a;

    .line 140
    .line 141
    invoke-static {v1, v0, p2, v5}, Lna/c;->b(Lw1/f;Lic/a;Lx0/o;I)V

    .line 142
    .line 143
    .line 144
    goto :goto_4

    .line 145
    :cond_9
    invoke-virtual {p2}, Lx0/o;->Q()V

    .line 146
    .line 147
    .line 148
    :goto_4
    invoke-virtual {p2}, Lx0/o;->r()Lx0/p1;

    .line 149
    .line 150
    .line 151
    move-result-object p2

    .line 152
    if-eqz p2, :cond_a

    .line 153
    .line 154
    new-instance v0, Lf1/b;

    .line 155
    .line 156
    const/4 v1, 0x2

    .line 157
    invoke-direct {v0, p0, p1, p3, v1}, Lf1/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 158
    .line 159
    .line 160
    iput-object v0, p2, Lx0/p1;->d:Lic/n;

    .line 161
    .line 162
    :cond_a
    return-void
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

.method public static final c(Lhf/y;Lic/k;Lba/q0;)V
    .locals 10

    .line 1
    invoke-static {}, Lgg/c;->a()Lhg/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {v1}, Ljc/z;->a(Ljava/lang/Class;)Lpc/v;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "documentUri"

    .line 12
    .line 13
    const-string v3, ""

    .line 14
    .line 15
    invoke-static {v0, v2, v3, v1}, Lpc/f0;->P(Lhg/a;Ljava/lang/String;Ljava/lang/Object;Lpc/v;)Lhg/b;

    .line 16
    .line 17
    .line 18
    move-result-object v7

    .line 19
    new-instance v4, Lcg/g;

    .line 20
    .line 21
    const/4 v9, 0x2

    .line 22
    const/4 v8, 0x0

    .line 23
    move-object v5, p1

    .line 24
    move-object v6, p2

    .line 25
    invoke-direct/range {v4 .. v9}, Lcg/g;-><init>(Lic/k;Lub/e;Lhg/b;Lyb/c;I)V

    .line 26
    .line 27
    .line 28
    const/4 p1, 0x3

    .line 29
    invoke-static {p0, v8, v8, v4, p1}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    .line 30
    .line 31
    .line 32
    return-void
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
