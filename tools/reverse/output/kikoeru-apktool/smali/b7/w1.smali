.class public final synthetic Lb7/w1;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lb7/c2;


# direct methods
.method public synthetic constructor <init>(Lb7/c2;I)V
    .locals 0

    .line 1
    iput p2, p0, Lb7/w1;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lb7/w1;->b:Lb7/c2;

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
.method public final run()V
    .locals 9

    .line 1
    iget v0, p0, Lb7/w1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lb7/w1;->b:Lb7/c2;

    .line 7
    .line 8
    invoke-virtual {v0}, Lb7/c2;->s()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    iget-object v1, p0, Lb7/w1;->b:Lb7/c2;

    .line 13
    .line 14
    iget-object v2, v1, Lb7/c2;->a:Ljava/lang/Object;

    .line 15
    .line 16
    monitor-enter v2

    .line 17
    :try_start_0
    iget-boolean v0, v1, Lb7/c2;->y:Z

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    monitor-exit v2

    .line 22
    goto :goto_2

    .line 23
    :catchall_0
    move-exception v0

    .line 24
    goto :goto_3

    .line 25
    :cond_0
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    iget-object v0, v1, Lb7/c2;->t:Lb7/z3;

    .line 27
    .line 28
    invoke-virtual {v0}, Lb7/z3;->g()Lb7/h4;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    iget-object v0, v1, Lb7/c2;->c:Lb7/z1;

    .line 33
    .line 34
    const/4 v2, 0x1

    .line 35
    invoke-virtual {v0, v2}, Landroid/os/Handler;->hasMessages(I)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_2

    .line 40
    .line 41
    iget-object v0, v1, Lb7/c2;->s:Lb7/v3;

    .line 42
    .line 43
    iget-object v0, v0, Lb7/v3;->c:Lb7/h4;

    .line 44
    .line 45
    invoke-static {v4, v0}, Lb7/s3;->d(Lb7/h4;Lb7/h4;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    iget-object v0, v1, Lb7/c2;->g:Lb7/q3;

    .line 52
    .line 53
    iget-object v0, v0, Lb7/q3;->g:Lb0/w1;

    .line 54
    .line 55
    invoke-virtual {v0}, Lb0/w1;->L()Lya/i0;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    const/4 v3, 0x0

    .line 60
    :goto_0
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    if-ge v3, v5, :cond_1

    .line 65
    .line 66
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    check-cast v5, Lb7/t1;

    .line 71
    .line 72
    const/16 v6, 0x10

    .line 73
    .line 74
    invoke-virtual {v0, v5, v6}, Lb0/w1;->T(Lb7/t1;I)Z

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    const/16 v7, 0x11

    .line 79
    .line 80
    invoke-virtual {v0, v5, v7}, Lb0/w1;->T(Lb7/t1;I)Z

    .line 81
    .line 82
    .line 83
    move-result v7

    .line 84
    new-instance v8, Lb7/x1;

    .line 85
    .line 86
    invoke-direct {v8, v4, v6, v7, v5}, Lb7/x1;-><init>(Lb7/h4;ZZLb7/t1;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1, v5, v8}, Lb7/c2;->b(Lb7/t1;Lb7/b2;)V

    .line 90
    .line 91
    .line 92
    add-int/lit8 v3, v3, 0x1

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_1
    :try_start_1
    iget-object v0, v1, Lb7/c2;->h:Lb7/o2;

    .line 96
    .line 97
    iget-object v2, v0, Lb7/o2;->i:Lb7/l2;

    .line 98
    .line 99
    const/4 v6, 0x1

    .line 100
    const/4 v7, 0x0

    .line 101
    const/4 v3, 0x0

    .line 102
    const/4 v5, 0x1

    .line 103
    invoke-virtual/range {v2 .. v7}, Lb7/l2;->i(ILb7/h4;ZZI)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :catch_0
    move-exception v0

    .line 108
    const-string v2, "MediaSessionImpl"

    .line 109
    .line 110
    const-string v3, "Exception in using media1 API"

    .line 111
    .line 112
    invoke-static {v2, v3, v0}, Lp4/c;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 113
    .line 114
    .line 115
    :cond_2
    :goto_1
    invoke-virtual {v1}, Lb7/c2;->s()V

    .line 116
    .line 117
    .line 118
    :goto_2
    return-void

    .line 119
    :goto_3
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 120
    throw v0

    .line 121
    :pswitch_1
    iget-object v0, p0, Lb7/w1;->b:Lb7/c2;

    .line 122
    .line 123
    iget-object v1, v0, Lb7/c2;->w:Lb0/c1;

    .line 124
    .line 125
    if-eqz v1, :cond_3

    .line 126
    .line 127
    iget-object v0, v0, Lb7/c2;->k:Lb7/v1;

    .line 128
    .line 129
    iget-object v1, v1, Lb0/c1;->b:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v1, Lcom/cnl/kikoeru/MainService;

    .line 132
    .line 133
    const/4 v2, 0x0

    .line 134
    invoke-virtual {v1, v0, v2}, Lcom/cnl/kikoeru/MainService;->i(Lb7/v1;Z)Z

    .line 135
    .line 136
    .line 137
    :cond_3
    return-void

    .line 138
    :pswitch_2
    iget-object v0, p0, Lb7/w1;->b:Lb7/c2;

    .line 139
    .line 140
    iget-object v1, v0, Lb7/c2;->v:Lb7/a2;

    .line 141
    .line 142
    if-eqz v1, :cond_4

    .line 143
    .line 144
    iget-object v0, v0, Lb7/c2;->t:Lb7/z3;

    .line 145
    .line 146
    invoke-virtual {v0}, Lb7/z3;->r0()V

    .line 147
    .line 148
    .line 149
    iget-object v2, v0, Lb7/z3;->a:Landroidx/media3/exoplayer/ExoPlayer;

    .line 150
    .line 151
    new-instance v3, Lm4/r;

    .line 152
    .line 153
    invoke-direct {v3, v0, v1}, Lm4/r;-><init>(Lb7/z3;Lm4/w0;)V

    .line 154
    .line 155
    .line 156
    check-cast v2, Lv4/v;

    .line 157
    .line 158
    invoke-virtual {v2, v3}, Lv4/v;->U1(Lm4/w0;)V

    .line 159
    .line 160
    .line 161
    :cond_4
    return-void

    .line 162
    nop

    .line 163
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
