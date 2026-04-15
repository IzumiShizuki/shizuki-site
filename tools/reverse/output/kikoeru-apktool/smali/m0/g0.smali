.class public final Lm0/g0;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lf1/f;


# direct methods
.method public synthetic constructor <init>(Lf1/f;I)V
    .locals 0

    .line 1
    iput p2, p0, Lm0/g0;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lm0/g0;->b:Lf1/f;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
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
.method public final q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lm0/g0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lx0/o;

    .line 7
    .line 8
    check-cast p2, Ljava/lang/Number;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    and-int/lit8 v0, p2, 0x3

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    const/4 v2, 0x1

    .line 18
    if-eq v0, v1, :cond_0

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    :goto_0
    and-int/2addr p2, v2

    .line 24
    invoke-virtual {p1, p2, v0}, Lx0/o;->N(IZ)Z

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    if-eqz p2, :cond_1

    .line 29
    .line 30
    sget-object p2, Lj2/l1;->n:Lx0/o2;

    .line 31
    .line 32
    sget-object v0, Lf3/m;->a:Lf3/m;

    .line 33
    .line 34
    invoke-virtual {p2, v0}, Lx0/o2;->a(Ljava/lang/Object;)Lx0/n1;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    new-instance v0, Lm0/g0;

    .line 39
    .line 40
    const/4 v1, 0x5

    .line 41
    iget-object v2, p0, Lm0/g0;->b:Lf1/f;

    .line 42
    .line 43
    invoke-direct {v0, v2, v1}, Lm0/g0;-><init>(Lf1/f;I)V

    .line 44
    .line 45
    .line 46
    const v1, 0x55a83b49

    .line 47
    .line 48
    .line 49
    invoke-static {v1, v0, p1}, Lf1/g;->f(ILub/e;Lx0/o;)Lf1/f;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    const/16 v1, 0x38

    .line 54
    .line 55
    invoke-static {p2, v0, p1, v1}, Lx0/v;->a(Lx0/n1;Lic/n;Lx0/o;I)V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    invoke-virtual {p1}, Lx0/o;->Q()V

    .line 60
    .line 61
    .line 62
    :goto_1
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 63
    .line 64
    return-object p1

    .line 65
    :pswitch_0
    check-cast p1, Lx0/o;

    .line 66
    .line 67
    check-cast p2, Ljava/lang/Number;

    .line 68
    .line 69
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 70
    .line 71
    .line 72
    move-result p2

    .line 73
    and-int/lit8 v0, p2, 0x3

    .line 74
    .line 75
    const/4 v1, 0x2

    .line 76
    const/4 v2, 0x1

    .line 77
    const/4 v3, 0x0

    .line 78
    if-eq v0, v1, :cond_2

    .line 79
    .line 80
    const/4 v0, 0x1

    .line 81
    goto :goto_2

    .line 82
    :cond_2
    const/4 v0, 0x0

    .line 83
    :goto_2
    and-int/2addr p2, v2

    .line 84
    invoke-virtual {p1, p2, v0}, Lx0/o;->N(IZ)Z

    .line 85
    .line 86
    .line 87
    move-result p2

    .line 88
    if-eqz p2, :cond_3

    .line 89
    .line 90
    const p2, -0x1c809f45

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1, p2}, Lx0/o;->W(I)V

    .line 94
    .line 95
    .line 96
    iget-object p2, p0, Lm0/g0;->b:Lf1/f;

    .line 97
    .line 98
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-virtual {p2, p1, v0}, Lf1/f;->q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1, v3}, Lx0/o;->p(Z)V

    .line 106
    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_3
    invoke-virtual {p1}, Lx0/o;->Q()V

    .line 110
    .line 111
    .line 112
    :goto_3
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 113
    .line 114
    return-object p1

    .line 115
    :pswitch_1
    check-cast p1, Lx0/o;

    .line 116
    .line 117
    check-cast p2, Ljava/lang/Number;

    .line 118
    .line 119
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 120
    .line 121
    .line 122
    move-result p2

    .line 123
    and-int/lit8 v0, p2, 0x3

    .line 124
    .line 125
    const/4 v1, 0x2

    .line 126
    const/4 v2, 0x0

    .line 127
    const/4 v3, 0x1

    .line 128
    if-eq v0, v1, :cond_4

    .line 129
    .line 130
    const/4 v0, 0x1

    .line 131
    goto :goto_4

    .line 132
    :cond_4
    const/4 v0, 0x0

    .line 133
    :goto_4
    and-int/2addr p2, v3

    .line 134
    invoke-virtual {p1, p2, v0}, Lx0/o;->N(IZ)Z

    .line 135
    .line 136
    .line 137
    move-result p2

    .line 138
    if-eqz p2, :cond_8

    .line 139
    .line 140
    sget-object p2, Ly/k;->c:Ly/o0;

    .line 141
    .line 142
    sget-object v0, Lj1/c;->m:Lj1/f;

    .line 143
    .line 144
    invoke-static {p2, v0, p1, v2}, Ly/u;->a(Ly/h;Lj1/f;Lx0/o;I)Ly/v;

    .line 145
    .line 146
    .line 147
    move-result-object p2

    .line 148
    invoke-static {p1}, Lx0/v;->q(Lx0/o;)I

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    invoke-virtual {p1}, Lx0/o;->l()Lx0/j1;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    sget-object v2, Lj1/n;->a:Lj1/n;

    .line 157
    .line 158
    invoke-static {v2, p1}, Lj1/a;->c(Lj1/q;Lx0/o;)Lj1/q;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    sget-object v4, Li2/k;->g0:Li2/j;

    .line 163
    .line 164
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    sget-object v4, Li2/j;->b:Li2/i;

    .line 168
    .line 169
    invoke-virtual {p1}, Lx0/o;->a0()V

    .line 170
    .line 171
    .line 172
    iget-boolean v5, p1, Lx0/o;->S:Z

    .line 173
    .line 174
    if-eqz v5, :cond_5

    .line 175
    .line 176
    invoke-virtual {p1, v4}, Lx0/o;->k(Lic/a;)V

    .line 177
    .line 178
    .line 179
    goto :goto_5

    .line 180
    :cond_5
    invoke-virtual {p1}, Lx0/o;->k0()V

    .line 181
    .line 182
    .line 183
    :goto_5
    sget-object v4, Li2/j;->g:Li2/h;

    .line 184
    .line 185
    invoke-static {v4, p2, p1}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 186
    .line 187
    .line 188
    sget-object p2, Li2/j;->f:Li2/h;

    .line 189
    .line 190
    invoke-static {p2, v1, p1}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 191
    .line 192
    .line 193
    sget-object p2, Li2/j;->j:Li2/h;

    .line 194
    .line 195
    iget-boolean v1, p1, Lx0/o;->S:Z

    .line 196
    .line 197
    if-nez v1, :cond_6

    .line 198
    .line 199
    invoke-virtual {p1}, Lx0/o;->K()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 204
    .line 205
    .line 206
    move-result-object v4

    .line 207
    invoke-static {v1, v4}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result v1

    .line 211
    if-nez v1, :cond_7

    .line 212
    .line 213
    :cond_6
    invoke-static {v0, p1, v0, p2}, Lj2/h0;->s(ILx0/o;ILi2/h;)V

    .line 214
    .line 215
    .line 216
    :cond_7
    sget-object p2, Li2/j;->d:Li2/h;

    .line 217
    .line 218
    invoke-static {p2, v2, p1}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 219
    .line 220
    .line 221
    const/4 p2, 0x6

    .line 222
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 223
    .line 224
    .line 225
    move-result-object p2

    .line 226
    iget-object v0, p0, Lm0/g0;->b:Lf1/f;

    .line 227
    .line 228
    sget-object v1, Ly/w;->a:Ly/w;

    .line 229
    .line 230
    invoke-virtual {v0, v1, p1, p2}, Lf1/f;->g(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    invoke-virtual {p1, v3}, Lx0/o;->p(Z)V

    .line 234
    .line 235
    .line 236
    goto :goto_6

    .line 237
    :cond_8
    invoke-virtual {p1}, Lx0/o;->Q()V

    .line 238
    .line 239
    .line 240
    :goto_6
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 241
    .line 242
    return-object p1

    .line 243
    :pswitch_2
    check-cast p1, Lx0/o;

    .line 244
    .line 245
    check-cast p2, Ljava/lang/Number;

    .line 246
    .line 247
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 248
    .line 249
    .line 250
    move-result p2

    .line 251
    and-int/lit8 v0, p2, 0x3

    .line 252
    .line 253
    const/4 v1, 0x2

    .line 254
    const/4 v2, 0x1

    .line 255
    if-eq v0, v1, :cond_9

    .line 256
    .line 257
    const/4 v0, 0x1

    .line 258
    goto :goto_7

    .line 259
    :cond_9
    const/4 v0, 0x0

    .line 260
    :goto_7
    and-int/2addr p2, v2

    .line 261
    invoke-virtual {p1, p2, v0}, Lx0/o;->N(IZ)Z

    .line 262
    .line 263
    .line 264
    move-result p2

    .line 265
    if-eqz p2, :cond_a

    .line 266
    .line 267
    sget-object p2, Lm0/e9;->b:Lx0/o2;

    .line 268
    .line 269
    invoke-virtual {p1, p2}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object p2

    .line 273
    check-cast p2, Lm0/d9;

    .line 274
    .line 275
    iget-object p2, p2, Lm0/d9;->k:Lt2/l0;

    .line 276
    .line 277
    new-instance v0, Lm0/g0;

    .line 278
    .line 279
    iget-object v1, p0, Lm0/g0;->b:Lf1/f;

    .line 280
    .line 281
    const/4 v2, 0x2

    .line 282
    invoke-direct {v0, v1, v2}, Lm0/g0;-><init>(Lf1/f;I)V

    .line 283
    .line 284
    .line 285
    const v1, -0x64827d25

    .line 286
    .line 287
    .line 288
    invoke-static {v1, v0, p1}, Lf1/g;->f(ILub/e;Lx0/o;)Lf1/f;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    const/16 v1, 0x30

    .line 293
    .line 294
    invoke-static {p2, v0, p1, v1}, Lm0/z8;->a(Lt2/l0;Lic/n;Lx0/o;I)V

    .line 295
    .line 296
    .line 297
    goto :goto_8

    .line 298
    :cond_a
    invoke-virtual {p1}, Lx0/o;->Q()V

    .line 299
    .line 300
    .line 301
    :goto_8
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 302
    .line 303
    return-object p1

    .line 304
    :pswitch_3
    check-cast p1, Lx0/o;

    .line 305
    .line 306
    check-cast p2, Ljava/lang/Number;

    .line 307
    .line 308
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 309
    .line 310
    .line 311
    move-result p2

    .line 312
    and-int/lit8 v0, p2, 0x3

    .line 313
    .line 314
    const/4 v1, 0x2

    .line 315
    const/4 v2, 0x1

    .line 316
    const/4 v3, 0x0

    .line 317
    if-eq v0, v1, :cond_b

    .line 318
    .line 319
    const/4 v0, 0x1

    .line 320
    goto :goto_9

    .line 321
    :cond_b
    const/4 v0, 0x0

    .line 322
    :goto_9
    and-int/2addr p2, v2

    .line 323
    invoke-virtual {p1, p2, v0}, Lx0/o;->N(IZ)Z

    .line 324
    .line 325
    .line 326
    move-result p2

    .line 327
    if-eqz p2, :cond_f

    .line 328
    .line 329
    sget-object p2, Lj1/n;->a:Lj1/n;

    .line 330
    .line 331
    sget v0, Lm0/n3;->a:F

    .line 332
    .line 333
    invoke-static {p2, v0, v0}, Landroidx/compose/foundation/layout/c;->a(Lj1/q;FF)Lj1/q;

    .line 334
    .line 335
    .line 336
    move-result-object p2

    .line 337
    sget-object v0, Lj1/c;->e:Lj1/h;

    .line 338
    .line 339
    invoke-static {v0, v3}, Ly/p;->d(Lj1/h;Z)Lg2/v0;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    invoke-static {p1}, Lx0/v;->q(Lx0/o;)I

    .line 344
    .line 345
    .line 346
    move-result v1

    .line 347
    invoke-virtual {p1}, Lx0/o;->l()Lx0/j1;

    .line 348
    .line 349
    .line 350
    move-result-object v4

    .line 351
    invoke-static {p2, p1}, Lj1/a;->c(Lj1/q;Lx0/o;)Lj1/q;

    .line 352
    .line 353
    .line 354
    move-result-object p2

    .line 355
    sget-object v5, Li2/k;->g0:Li2/j;

    .line 356
    .line 357
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 358
    .line 359
    .line 360
    sget-object v5, Li2/j;->b:Li2/i;

    .line 361
    .line 362
    invoke-virtual {p1}, Lx0/o;->a0()V

    .line 363
    .line 364
    .line 365
    iget-boolean v6, p1, Lx0/o;->S:Z

    .line 366
    .line 367
    if-eqz v6, :cond_c

    .line 368
    .line 369
    invoke-virtual {p1, v5}, Lx0/o;->k(Lic/a;)V

    .line 370
    .line 371
    .line 372
    goto :goto_a

    .line 373
    :cond_c
    invoke-virtual {p1}, Lx0/o;->k0()V

    .line 374
    .line 375
    .line 376
    :goto_a
    sget-object v5, Li2/j;->g:Li2/h;

    .line 377
    .line 378
    invoke-static {v5, v0, p1}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 379
    .line 380
    .line 381
    sget-object v0, Li2/j;->f:Li2/h;

    .line 382
    .line 383
    invoke-static {v0, v4, p1}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 384
    .line 385
    .line 386
    sget-object v0, Li2/j;->j:Li2/h;

    .line 387
    .line 388
    iget-boolean v4, p1, Lx0/o;->S:Z

    .line 389
    .line 390
    if-nez v4, :cond_d

    .line 391
    .line 392
    invoke-virtual {p1}, Lx0/o;->K()Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object v4

    .line 396
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 397
    .line 398
    .line 399
    move-result-object v5

    .line 400
    invoke-static {v4, v5}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 401
    .line 402
    .line 403
    move-result v4

    .line 404
    if-nez v4, :cond_e

    .line 405
    .line 406
    :cond_d
    invoke-static {v1, p1, v1, v0}, Lj2/h0;->s(ILx0/o;ILi2/h;)V

    .line 407
    .line 408
    .line 409
    :cond_e
    sget-object v0, Li2/j;->d:Li2/h;

    .line 410
    .line 411
    invoke-static {v0, p2, p1}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 412
    .line 413
    .line 414
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 415
    .line 416
    .line 417
    move-result-object p2

    .line 418
    iget-object v0, p0, Lm0/g0;->b:Lf1/f;

    .line 419
    .line 420
    invoke-virtual {v0, p1, p2}, Lf1/f;->q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    invoke-virtual {p1, v2}, Lx0/o;->p(Z)V

    .line 424
    .line 425
    .line 426
    goto :goto_b

    .line 427
    :cond_f
    invoke-virtual {p1}, Lx0/o;->Q()V

    .line 428
    .line 429
    .line 430
    :goto_b
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 431
    .line 432
    return-object p1

    .line 433
    :pswitch_4
    check-cast p1, Lx0/o;

    .line 434
    .line 435
    check-cast p2, Ljava/lang/Number;

    .line 436
    .line 437
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 438
    .line 439
    .line 440
    move-result p2

    .line 441
    and-int/lit8 v0, p2, 0x3

    .line 442
    .line 443
    const/4 v1, 0x2

    .line 444
    const/4 v2, 0x1

    .line 445
    if-eq v0, v1, :cond_10

    .line 446
    .line 447
    const/4 v0, 0x1

    .line 448
    goto :goto_c

    .line 449
    :cond_10
    const/4 v0, 0x0

    .line 450
    :goto_c
    and-int/2addr p2, v2

    .line 451
    invoke-virtual {p1, p2, v0}, Lx0/o;->N(IZ)Z

    .line 452
    .line 453
    .line 454
    move-result p2

    .line 455
    if-eqz p2, :cond_14

    .line 456
    .line 457
    sget-object p2, Landroidx/compose/foundation/layout/c;->b:Landroidx/compose/foundation/layout/FillElement;

    .line 458
    .line 459
    sget-object v0, Ly/k;->b:Ly/o0;

    .line 460
    .line 461
    sget-object v1, Lj1/c;->k:Lj1/g;

    .line 462
    .line 463
    const/16 v3, 0x36

    .line 464
    .line 465
    invoke-static {v0, v1, p1, v3}, Ly/i1;->a(Ly/f;Lj1/g;Lx0/o;I)Ly/j1;

    .line 466
    .line 467
    .line 468
    move-result-object v0

    .line 469
    invoke-static {p1}, Lx0/v;->q(Lx0/o;)I

    .line 470
    .line 471
    .line 472
    move-result v1

    .line 473
    invoke-virtual {p1}, Lx0/o;->l()Lx0/j1;

    .line 474
    .line 475
    .line 476
    move-result-object v3

    .line 477
    invoke-static {p2, p1}, Lj1/a;->c(Lj1/q;Lx0/o;)Lj1/q;

    .line 478
    .line 479
    .line 480
    move-result-object p2

    .line 481
    sget-object v4, Li2/k;->g0:Li2/j;

    .line 482
    .line 483
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 484
    .line 485
    .line 486
    sget-object v4, Li2/j;->b:Li2/i;

    .line 487
    .line 488
    invoke-virtual {p1}, Lx0/o;->a0()V

    .line 489
    .line 490
    .line 491
    iget-boolean v5, p1, Lx0/o;->S:Z

    .line 492
    .line 493
    if-eqz v5, :cond_11

    .line 494
    .line 495
    invoke-virtual {p1, v4}, Lx0/o;->k(Lic/a;)V

    .line 496
    .line 497
    .line 498
    goto :goto_d

    .line 499
    :cond_11
    invoke-virtual {p1}, Lx0/o;->k0()V

    .line 500
    .line 501
    .line 502
    :goto_d
    sget-object v4, Li2/j;->g:Li2/h;

    .line 503
    .line 504
    invoke-static {v4, v0, p1}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 505
    .line 506
    .line 507
    sget-object v0, Li2/j;->f:Li2/h;

    .line 508
    .line 509
    invoke-static {v0, v3, p1}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 510
    .line 511
    .line 512
    sget-object v0, Li2/j;->j:Li2/h;

    .line 513
    .line 514
    iget-boolean v3, p1, Lx0/o;->S:Z

    .line 515
    .line 516
    if-nez v3, :cond_12

    .line 517
    .line 518
    invoke-virtual {p1}, Lx0/o;->K()Ljava/lang/Object;

    .line 519
    .line 520
    .line 521
    move-result-object v3

    .line 522
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 523
    .line 524
    .line 525
    move-result-object v4

    .line 526
    invoke-static {v3, v4}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 527
    .line 528
    .line 529
    move-result v3

    .line 530
    if-nez v3, :cond_13

    .line 531
    .line 532
    :cond_12
    invoke-static {v1, p1, v1, v0}, Lj2/h0;->s(ILx0/o;ILi2/h;)V

    .line 533
    .line 534
    .line 535
    :cond_13
    sget-object v0, Li2/j;->d:Li2/h;

    .line 536
    .line 537
    invoke-static {v0, p2, p1}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 538
    .line 539
    .line 540
    const/4 p2, 0x6

    .line 541
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 542
    .line 543
    .line 544
    move-result-object p2

    .line 545
    iget-object v0, p0, Lm0/g0;->b:Lf1/f;

    .line 546
    .line 547
    sget-object v1, Ly/l1;->a:Ly/l1;

    .line 548
    .line 549
    invoke-virtual {v0, v1, p1, p2}, Lf1/f;->g(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 550
    .line 551
    .line 552
    invoke-virtual {p1, v2}, Lx0/o;->p(Z)V

    .line 553
    .line 554
    .line 555
    goto :goto_e

    .line 556
    :cond_14
    invoke-virtual {p1}, Lx0/o;->Q()V

    .line 557
    .line 558
    .line 559
    :goto_e
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 560
    .line 561
    return-object p1

    .line 562
    :pswitch_5
    check-cast p1, Lx0/o;

    .line 563
    .line 564
    check-cast p2, Ljava/lang/Number;

    .line 565
    .line 566
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 567
    .line 568
    .line 569
    move-result p2

    .line 570
    and-int/lit8 v0, p2, 0x3

    .line 571
    .line 572
    const/4 v1, 0x2

    .line 573
    const/4 v2, 0x1

    .line 574
    if-eq v0, v1, :cond_15

    .line 575
    .line 576
    const/4 v0, 0x1

    .line 577
    goto :goto_f

    .line 578
    :cond_15
    const/4 v0, 0x0

    .line 579
    :goto_f
    and-int/2addr p2, v2

    .line 580
    invoke-virtual {p1, p2, v0}, Lx0/o;->N(IZ)Z

    .line 581
    .line 582
    .line 583
    move-result p2

    .line 584
    if-eqz p2, :cond_18

    .line 585
    .line 586
    sget-object p2, Lm0/h1;->a:Lx0/z;

    .line 587
    .line 588
    sget-object v0, Lm0/j1;->a:Lx0/z;

    .line 589
    .line 590
    invoke-virtual {p1, v0}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 591
    .line 592
    .line 593
    move-result-object v0

    .line 594
    check-cast v0, Lq1/q;

    .line 595
    .line 596
    iget-wide v0, v0, Lq1/q;->a:J

    .line 597
    .line 598
    sget-object v2, Lm0/c1;->a:Lx0/o2;

    .line 599
    .line 600
    invoke-virtual {p1, v2}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 601
    .line 602
    .line 603
    move-result-object v2

    .line 604
    check-cast v2, Lm0/b1;

    .line 605
    .line 606
    invoke-virtual {v2}, Lm0/b1;->j()Z

    .line 607
    .line 608
    .line 609
    move-result v2

    .line 610
    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    .line 611
    .line 612
    if-eqz v2, :cond_16

    .line 613
    .line 614
    invoke-static {v0, v1}, Lq1/h0;->r(J)F

    .line 615
    .line 616
    .line 617
    move-result v0

    .line 618
    float-to-double v0, v0

    .line 619
    cmpl-double v2, v0, v3

    .line 620
    .line 621
    if-lez v2, :cond_17

    .line 622
    .line 623
    goto :goto_10

    .line 624
    :cond_16
    invoke-static {v0, v1}, Lq1/h0;->r(J)F

    .line 625
    .line 626
    .line 627
    move-result v0

    .line 628
    float-to-double v0, v0

    .line 629
    cmpg-double v2, v0, v3

    .line 630
    .line 631
    if-gez v2, :cond_17

    .line 632
    .line 633
    :goto_10
    const/high16 v0, 0x3f800000    # 1.0f

    .line 634
    .line 635
    goto :goto_11

    .line 636
    :cond_17
    const v0, 0x3f5eb852    # 0.87f

    .line 637
    .line 638
    .line 639
    :goto_11
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 640
    .line 641
    .line 642
    move-result-object v0

    .line 643
    invoke-virtual {p2, v0}, Lx0/z;->a(Ljava/lang/Object;)Lx0/n1;

    .line 644
    .line 645
    .line 646
    move-result-object p2

    .line 647
    iget-object v0, p0, Lm0/g0;->b:Lf1/f;

    .line 648
    .line 649
    const/16 v1, 0x8

    .line 650
    .line 651
    invoke-static {p2, v0, p1, v1}, Lx0/v;->a(Lx0/n1;Lic/n;Lx0/o;I)V

    .line 652
    .line 653
    .line 654
    goto :goto_12

    .line 655
    :cond_18
    invoke-virtual {p1}, Lx0/o;->Q()V

    .line 656
    .line 657
    .line 658
    :goto_12
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 659
    .line 660
    return-object p1

    .line 661
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method
