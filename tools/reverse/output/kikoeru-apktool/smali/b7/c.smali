.class public final synthetic Lb7/c;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lb7/c2;

.field public final synthetic c:Lb7/t1;


# direct methods
.method public synthetic constructor <init>(Lb7/c2;Lb7/t1;I)V
    .locals 0

    .line 1
    iput p3, p0, Lb7/c;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lb7/c;->b:Lb7/c2;

    .line 4
    .line 5
    iput-object p2, p0, Lb7/c;->c:Lb7/t1;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
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


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Lb7/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lb7/c;->b:Lb7/c2;

    .line 7
    .line 8
    iget-object v0, v0, Lb7/c2;->g:Lb7/q3;

    .line 9
    .line 10
    new-instance v1, Lb5/a;

    .line 11
    .line 12
    const/16 v2, 0x15

    .line 13
    .line 14
    invoke-direct {v1, v2}, Lb5/a;-><init>(I)V

    .line 15
    .line 16
    .line 17
    invoke-static {v1}, Lb7/q3;->I0(Lp4/g;)Landroidx/media3/exoplayer/offline/g;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget-object v2, p0, Lb7/c;->c:Lb7/t1;

    .line 22
    .line 23
    const/high16 v3, -0x80000000

    .line 24
    .line 25
    const/4 v4, 0x7

    .line 26
    invoke-virtual {v0, v2, v3, v4, v1}, Lb7/q3;->G0(Lb7/t1;IILb7/p3;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_0
    iget-object v0, p0, Lb7/c;->b:Lb7/c2;

    .line 31
    .line 32
    iget-object v0, v0, Lb7/c2;->g:Lb7/q3;

    .line 33
    .line 34
    new-instance v1, Lb5/a;

    .line 35
    .line 36
    const/16 v2, 0x19

    .line 37
    .line 38
    invoke-direct {v1, v2}, Lb5/a;-><init>(I)V

    .line 39
    .line 40
    .line 41
    invoke-static {v1}, Lb7/q3;->I0(Lp4/g;)Landroidx/media3/exoplayer/offline/g;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    iget-object v2, p0, Lb7/c;->c:Lb7/t1;

    .line 46
    .line 47
    const/high16 v3, -0x80000000

    .line 48
    .line 49
    const/16 v4, 0x9

    .line 50
    .line 51
    invoke-virtual {v0, v2, v3, v4, v1}, Lb7/q3;->G0(Lb7/t1;IILb7/p3;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :pswitch_1
    iget-object v0, p0, Lb7/c;->b:Lb7/c2;

    .line 56
    .line 57
    iget-object v0, v0, Lb7/c2;->g:Lb7/q3;

    .line 58
    .line 59
    new-instance v1, Lb5/a;

    .line 60
    .line 61
    const/16 v2, 0x10

    .line 62
    .line 63
    invoke-direct {v1, v2}, Lb5/a;-><init>(I)V

    .line 64
    .line 65
    .line 66
    invoke-static {v1}, Lb7/q3;->I0(Lp4/g;)Landroidx/media3/exoplayer/offline/g;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    iget-object v2, p0, Lb7/c;->c:Lb7/t1;

    .line 71
    .line 72
    const/high16 v3, -0x80000000

    .line 73
    .line 74
    const/4 v4, 0x1

    .line 75
    invoke-virtual {v0, v2, v3, v4, v1}, Lb7/q3;->G0(Lb7/t1;IILb7/p3;)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :pswitch_2
    iget-object v0, p0, Lb7/c;->b:Lb7/c2;

    .line 80
    .line 81
    iget-object v0, v0, Lb7/c2;->g:Lb7/q3;

    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    new-instance v1, Lb7/i0;

    .line 87
    .line 88
    const/16 v2, 0xa

    .line 89
    .line 90
    iget-object v3, p0, Lb7/c;->c:Lb7/t1;

    .line 91
    .line 92
    invoke-direct {v1, v2, v0, v3}, Lb7/i0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    invoke-static {v1}, Lb7/q3;->I0(Lp4/g;)Landroidx/media3/exoplayer/offline/g;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    const/high16 v2, -0x80000000

    .line 100
    .line 101
    const/4 v4, 0x1

    .line 102
    invoke-virtual {v0, v3, v2, v4, v1}, Lb7/q3;->G0(Lb7/t1;IILb7/p3;)V

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :pswitch_3
    iget-object v0, p0, Lb7/c;->b:Lb7/c2;

    .line 107
    .line 108
    iget-object v0, v0, Lb7/c2;->g:Lb7/q3;

    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    new-instance v1, Lb7/i0;

    .line 114
    .line 115
    const/16 v2, 0xa

    .line 116
    .line 117
    iget-object v3, p0, Lb7/c;->c:Lb7/t1;

    .line 118
    .line 119
    invoke-direct {v1, v2, v0, v3}, Lb7/i0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    invoke-static {v1}, Lb7/q3;->I0(Lp4/g;)Landroidx/media3/exoplayer/offline/g;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    const/high16 v2, -0x80000000

    .line 127
    .line 128
    const/4 v4, 0x1

    .line 129
    invoke-virtual {v0, v3, v2, v4, v1}, Lb7/q3;->G0(Lb7/t1;IILb7/p3;)V

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :pswitch_4
    iget-object v0, p0, Lb7/c;->b:Lb7/c2;

    .line 134
    .line 135
    iget-object v0, v0, Lb7/c2;->g:Lb7/q3;

    .line 136
    .line 137
    new-instance v1, Lb5/a;

    .line 138
    .line 139
    const/16 v2, 0x10

    .line 140
    .line 141
    invoke-direct {v1, v2}, Lb5/a;-><init>(I)V

    .line 142
    .line 143
    .line 144
    invoke-static {v1}, Lb7/q3;->I0(Lp4/g;)Landroidx/media3/exoplayer/offline/g;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    iget-object v2, p0, Lb7/c;->c:Lb7/t1;

    .line 149
    .line 150
    const/high16 v3, -0x80000000

    .line 151
    .line 152
    const/4 v4, 0x1

    .line 153
    invoke-virtual {v0, v2, v3, v4, v1}, Lb7/q3;->G0(Lb7/t1;IILb7/p3;)V

    .line 154
    .line 155
    .line 156
    return-void

    .line 157
    :pswitch_5
    iget-object v0, p0, Lb7/c;->b:Lb7/c2;

    .line 158
    .line 159
    iget-object v0, v0, Lb7/c2;->g:Lb7/q3;

    .line 160
    .line 161
    new-instance v1, Lb7/c3;

    .line 162
    .line 163
    const/4 v2, 0x1

    .line 164
    invoke-direct {v1, v2}, Lb7/c3;-><init>(I)V

    .line 165
    .line 166
    .line 167
    invoke-static {v1}, Lb7/q3;->I0(Lp4/g;)Landroidx/media3/exoplayer/offline/g;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    iget-object v2, p0, Lb7/c;->c:Lb7/t1;

    .line 172
    .line 173
    const/high16 v3, -0x80000000

    .line 174
    .line 175
    const/4 v4, 0x3

    .line 176
    invoke-virtual {v0, v2, v3, v4, v1}, Lb7/q3;->G0(Lb7/t1;IILb7/p3;)V

    .line 177
    .line 178
    .line 179
    return-void

    .line 180
    :pswitch_6
    iget-object v0, p0, Lb7/c;->b:Lb7/c2;

    .line 181
    .line 182
    iget-object v0, v0, Lb7/c2;->g:Lb7/q3;

    .line 183
    .line 184
    new-instance v1, Lb5/a;

    .line 185
    .line 186
    const/16 v2, 0x13

    .line 187
    .line 188
    invoke-direct {v1, v2}, Lb5/a;-><init>(I)V

    .line 189
    .line 190
    .line 191
    invoke-static {v1}, Lb7/q3;->I0(Lp4/g;)Landroidx/media3/exoplayer/offline/g;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    iget-object v2, p0, Lb7/c;->c:Lb7/t1;

    .line 196
    .line 197
    const/high16 v3, -0x80000000

    .line 198
    .line 199
    const/16 v4, 0xb

    .line 200
    .line 201
    invoke-virtual {v0, v2, v3, v4, v1}, Lb7/q3;->G0(Lb7/t1;IILb7/p3;)V

    .line 202
    .line 203
    .line 204
    return-void

    .line 205
    :pswitch_7
    iget-object v0, p0, Lb7/c;->b:Lb7/c2;

    .line 206
    .line 207
    iget-object v0, v0, Lb7/c2;->g:Lb7/q3;

    .line 208
    .line 209
    new-instance v1, Lb5/a;

    .line 210
    .line 211
    const/16 v2, 0x18

    .line 212
    .line 213
    invoke-direct {v1, v2}, Lb5/a;-><init>(I)V

    .line 214
    .line 215
    .line 216
    invoke-static {v1}, Lb7/q3;->I0(Lp4/g;)Landroidx/media3/exoplayer/offline/g;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    iget-object v2, p0, Lb7/c;->c:Lb7/t1;

    .line 221
    .line 222
    const/high16 v3, -0x80000000

    .line 223
    .line 224
    const/16 v4, 0xc

    .line 225
    .line 226
    invoke-virtual {v0, v2, v3, v4, v1}, Lb7/q3;->G0(Lb7/t1;IILb7/p3;)V

    .line 227
    .line 228
    .line 229
    return-void

    .line 230
    :pswitch_8
    iget-object v0, p0, Lb7/c;->b:Lb7/c2;

    .line 231
    .line 232
    invoke-virtual {v0}, Lb7/c2;->h()Z

    .line 233
    .line 234
    .line 235
    move-result v1

    .line 236
    if-eqz v1, :cond_0

    .line 237
    .line 238
    goto :goto_0

    .line 239
    :cond_0
    iget-boolean v1, v0, Lb7/c2;->A:Z

    .line 240
    .line 241
    if-eqz v1, :cond_2

    .line 242
    .line 243
    iget-object v1, p0, Lb7/c;->c:Lb7/t1;

    .line 244
    .line 245
    invoke-static {v1}, Lb7/c2;->i(Lb7/t1;)Z

    .line 246
    .line 247
    .line 248
    move-result v2

    .line 249
    if-eqz v2, :cond_1

    .line 250
    .line 251
    goto :goto_0

    .line 252
    :cond_1
    invoke-virtual {v0, v1}, Lb7/c2;->g(Lb7/t1;)Z

    .line 253
    .line 254
    .line 255
    move-result v1

    .line 256
    if-eqz v1, :cond_2

    .line 257
    .line 258
    const/4 v1, 0x0

    .line 259
    iput-boolean v1, v0, Lb7/c2;->A:Z

    .line 260
    .line 261
    :cond_2
    iget-object v0, v0, Lb7/c2;->e:Lpe/d;

    .line 262
    .line 263
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    :goto_0
    return-void

    .line 267
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
