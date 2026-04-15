.class public final synthetic Lb7/e;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/io/Serializable;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lb0/w1;Lb7/g;Ljava/util/concurrent/atomic/AtomicBoolean;Lb7/h;Ljava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lb7/e;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb7/e;->b:Ljava/lang/Object;

    iput-object p2, p0, Lb7/e;->c:Ljava/lang/Object;

    iput-object p3, p0, Lb7/e;->d:Ljava/io/Serializable;

    iput-object p4, p0, Lb7/e;->f:Ljava/lang/Object;

    iput-object p5, p0, Lb7/e;->e:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lb7/p1;Lb7/v1;Ljava/lang/String;Landroid/os/Bundle;Lb7/d0;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lb7/e;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb7/e;->b:Ljava/lang/Object;

    iput-object p2, p0, Lb7/e;->c:Ljava/lang/Object;

    iput-object p3, p0, Lb7/e;->d:Ljava/io/Serializable;

    iput-object p4, p0, Lb7/e;->e:Ljava/lang/Object;

    iput-object p5, p0, Lb7/e;->f:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    iget v0, p0, Lb7/e;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lb7/e;->f:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Lb7/e;->e:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, Lb7/e;->d:Ljava/io/Serializable;

    .line 8
    .line 9
    iget-object v4, p0, Lb7/e;->c:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, p0, Lb7/e;->b:Ljava/lang/Object;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast v5, Lb7/p1;

    .line 17
    .line 18
    check-cast v3, Ljava/lang/String;

    .line 19
    .line 20
    check-cast v2, Landroid/os/Bundle;

    .line 21
    .line 22
    check-cast v1, Lb7/d0;

    .line 23
    .line 24
    iget-object v0, v5, Lb7/p1;->b:Lk9/c;

    .line 25
    .line 26
    iget v0, v0, Lk9/c;->a:I

    .line 27
    .line 28
    const/4 v4, 0x0

    .line 29
    packed-switch v0, :pswitch_data_1

    .line 30
    .line 31
    .line 32
    goto :goto_1

    .line 33
    :pswitch_0
    const-string v0, "extras"

    .line 34
    .line 35
    invoke-static {v2, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const-string v0, "subtitle"

    .line 39
    .line 40
    invoke-virtual {v3, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    const/4 v6, 0x1

    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    sget-object v0, Lj9/d;->a:Lj9/d;

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    sget-boolean v0, Lj9/d;->e:Z

    .line 53
    .line 54
    if-eqz v0, :cond_0

    .line 55
    .line 56
    invoke-static {}, La9/i;->a()Lcom/cnl/kikoeru/MainApplication;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-static {v0}, Lj9/d;->d(Lcom/cnl/kikoeru/MainApplication;)V

    .line 61
    .line 62
    .line 63
    :goto_0
    const/4 v4, 0x1

    .line 64
    goto :goto_1

    .line 65
    :cond_0
    invoke-static {}, La9/i;->a()Lcom/cnl/kikoeru/MainApplication;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-static {v0}, Lj9/d;->b(Lcom/cnl/kikoeru/MainApplication;)V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_1
    const-string v0, "favorite"

    .line 74
    .line 75
    invoke-virtual {v3, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_2

    .line 80
    .line 81
    sget-object v0, Lhf/l0;->a:Lpf/e;

    .line 82
    .line 83
    sget-object v0, Lpf/d;->c:Lpf/d;

    .line 84
    .line 85
    invoke-static {v0}, Lhf/a0;->b(Lyb/h;)Lnf/d;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    new-instance v4, Lk9/b;

    .line 90
    .line 91
    const/4 v7, 0x2

    .line 92
    const/4 v8, 0x0

    .line 93
    invoke-direct {v4, v7, v8}, Lac/i;-><init>(ILyb/c;)V

    .line 94
    .line 95
    .line 96
    const/4 v7, 0x3

    .line 97
    invoke-static {v0, v8, v8, v4, v7}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_2
    :goto_1
    if-nez v4, :cond_3

    .line 102
    .line 103
    iget-object v0, v5, Lb7/p1;->e:Lb7/k1;

    .line 104
    .line 105
    new-instance v4, Lb5/m;

    .line 106
    .line 107
    invoke-direct {v4, v5, v1, v3, v2}, Lb5/m;-><init>(Lb7/p1;Lb7/d0;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, v4}, Lb7/k1;->execute(Ljava/lang/Runnable;)V

    .line 111
    .line 112
    .line 113
    :cond_3
    return-void

    .line 114
    :pswitch_1
    check-cast v5, Lb0/w1;

    .line 115
    .line 116
    check-cast v4, Lb7/g;

    .line 117
    .line 118
    check-cast v3, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 119
    .line 120
    check-cast v1, Lb7/h;

    .line 121
    .line 122
    check-cast v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 123
    .line 124
    invoke-interface {v4}, Lb7/g;->run()Lcb/y;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    new-instance v4, Lb7/f;

    .line 129
    .line 130
    invoke-direct {v4, v5, v3, v1, v2}, Lb7/f;-><init>(Lb0/w1;Ljava/util/concurrent/atomic/AtomicBoolean;Lb7/h;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    .line 131
    .line 132
    .line 133
    sget-object v1, Lcb/r;->a:Lcb/r;

    .line 134
    .line 135
    invoke-interface {v0, v4, v1}, Lcb/y;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 136
    .line 137
    .line 138
    return-void

    .line 139
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch

    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
