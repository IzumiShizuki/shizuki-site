.class public final synthetic Lp5/w;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lp5/y;


# direct methods
.method public synthetic constructor <init>(Lp5/y;IJ)V
    .locals 0

    .line 1
    const/4 p2, 0x3

    iput p2, p0, Lp5/w;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp5/w;->b:Lp5/y;

    return-void
.end method

.method public synthetic constructor <init>(Lp5/y;JI)V
    .locals 0

    .line 2
    const/4 p2, 0x4

    iput p2, p0, Lp5/w;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp5/w;->b:Lp5/y;

    return-void
.end method

.method public synthetic constructor <init>(Lp5/y;Ljava/lang/Object;I)V
    .locals 0

    .line 3
    iput p3, p0, Lp5/w;->a:I

    iput-object p1, p0, Lp5/w;->b:Lp5/y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lp5/y;Ljava/lang/String;JJ)V
    .locals 0

    .line 4
    const/4 p2, 0x0

    iput p2, p0, Lp5/w;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp5/w;->b:Lp5/y;

    return-void
.end method

.method public synthetic constructor <init>(Lp5/y;Lm4/q;Lv4/g;)V
    .locals 0

    .line 5
    const/4 p2, 0x6

    iput p2, p0, Lp5/w;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp5/w;->b:Lp5/y;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Lp5/w;->a:I

    .line 2
    .line 3
    const/16 v1, 0x14

    .line 4
    .line 5
    iget-object v2, p0, Lp5/w;->b:Lp5/y;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, v2, Lp5/y;->c:Lv4/s;

    .line 11
    .line 12
    sget v1, Lp4/c0;->a:I

    .line 13
    .line 14
    iget-object v0, v0, Lv4/s;->a:Lv4/v;

    .line 15
    .line 16
    iget-object v0, v0, Lv4/v;->s:Lw4/d;

    .line 17
    .line 18
    invoke-virtual {v0}, Lw4/d;->Z()Lw4/a;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    new-instance v2, Lw4/b;

    .line 23
    .line 24
    const/16 v3, 0x1b

    .line 25
    .line 26
    invoke-direct {v2, v3}, Lw4/b;-><init>(I)V

    .line 27
    .line 28
    .line 29
    const/16 v3, 0x3f9

    .line 30
    .line 31
    invoke-virtual {v0, v1, v3, v2}, Lw4/d;->a0(Lw4/a;ILp4/k;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :pswitch_0
    iget-object v0, v2, Lp5/y;->c:Lv4/s;

    .line 36
    .line 37
    sget v1, Lp4/c0;->a:I

    .line 38
    .line 39
    iget-object v0, v0, Lv4/s;->a:Lv4/v;

    .line 40
    .line 41
    iget-object v0, v0, Lv4/v;->s:Lw4/d;

    .line 42
    .line 43
    invoke-virtual {v0}, Lw4/d;->Z()Lw4/a;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    new-instance v2, Lw4/c;

    .line 48
    .line 49
    const/4 v3, 0x1

    .line 50
    invoke-direct {v2, v3}, Lw4/c;-><init>(I)V

    .line 51
    .line 52
    .line 53
    const/16 v3, 0x3f7

    .line 54
    .line 55
    invoke-virtual {v0, v1, v3, v2}, Lw4/d;->a0(Lw4/a;ILp4/k;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :pswitch_1
    iget-object v0, v2, Lp5/y;->c:Lv4/s;

    .line 60
    .line 61
    sget v2, Lp4/c0;->a:I

    .line 62
    .line 63
    iget-object v0, v0, Lv4/s;->a:Lv4/v;

    .line 64
    .line 65
    iget-object v0, v0, Lv4/v;->s:Lw4/d;

    .line 66
    .line 67
    iget-object v2, v0, Lw4/d;->d:Lb7/b1;

    .line 68
    .line 69
    iget-object v2, v2, Lb7/b1;->f:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v2, Lj5/d0;

    .line 72
    .line 73
    invoke-virtual {v0, v2}, Lw4/d;->W(Lj5/d0;)Lw4/a;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    new-instance v3, Lw4/b;

    .line 78
    .line 79
    invoke-direct {v3, v1}, Lw4/b;-><init>(I)V

    .line 80
    .line 81
    .line 82
    const/16 v1, 0x3fd

    .line 83
    .line 84
    invoke-virtual {v0, v2, v1, v3}, Lw4/d;->a0(Lw4/a;ILp4/k;)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :pswitch_2
    iget-object v0, v2, Lp5/y;->c:Lv4/s;

    .line 89
    .line 90
    sget v1, Lp4/c0;->a:I

    .line 91
    .line 92
    iget-object v0, v0, Lv4/s;->a:Lv4/v;

    .line 93
    .line 94
    iget-object v0, v0, Lv4/v;->s:Lw4/d;

    .line 95
    .line 96
    iget-object v1, v0, Lw4/d;->d:Lb7/b1;

    .line 97
    .line 98
    iget-object v1, v1, Lb7/b1;->f:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v1, Lj5/d0;

    .line 101
    .line 102
    invoke-virtual {v0, v1}, Lw4/d;->W(Lj5/d0;)Lw4/a;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    new-instance v2, Lw4/b;

    .line 107
    .line 108
    const/16 v3, 0x11

    .line 109
    .line 110
    invoke-direct {v2, v3}, Lw4/b;-><init>(I)V

    .line 111
    .line 112
    .line 113
    const/16 v3, 0x3fa

    .line 114
    .line 115
    invoke-virtual {v0, v1, v3, v2}, Lw4/d;->a0(Lw4/a;ILp4/k;)V

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :pswitch_3
    iget-object v0, v2, Lp5/y;->c:Lv4/s;

    .line 120
    .line 121
    sget v1, Lp4/c0;->a:I

    .line 122
    .line 123
    iget-object v0, v0, Lv4/s;->a:Lv4/v;

    .line 124
    .line 125
    iget-object v0, v0, Lv4/v;->s:Lw4/d;

    .line 126
    .line 127
    invoke-virtual {v0}, Lw4/d;->Z()Lw4/a;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    new-instance v2, Lm4/d1;

    .line 132
    .line 133
    const/16 v3, 0x1c

    .line 134
    .line 135
    invoke-direct {v2, v3}, Lm4/d1;-><init>(I)V

    .line 136
    .line 137
    .line 138
    const/16 v3, 0x3fb

    .line 139
    .line 140
    invoke-virtual {v0, v1, v3, v2}, Lw4/d;->a0(Lw4/a;ILp4/k;)V

    .line 141
    .line 142
    .line 143
    return-void

    .line 144
    :pswitch_4
    iget-object v0, v2, Lp5/y;->c:Lv4/s;

    .line 145
    .line 146
    sget v2, Lp4/c0;->a:I

    .line 147
    .line 148
    iget-object v0, v0, Lv4/s;->a:Lv4/v;

    .line 149
    .line 150
    iget-object v0, v0, Lv4/v;->s:Lw4/d;

    .line 151
    .line 152
    invoke-virtual {v0}, Lw4/d;->Z()Lw4/a;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    new-instance v3, Lw4/c;

    .line 157
    .line 158
    invoke-direct {v3, v1}, Lw4/c;-><init>(I)V

    .line 159
    .line 160
    .line 161
    const/16 v1, 0x406

    .line 162
    .line 163
    invoke-virtual {v0, v2, v1, v3}, Lw4/d;->a0(Lw4/a;ILp4/k;)V

    .line 164
    .line 165
    .line 166
    return-void

    .line 167
    :pswitch_5
    iget-object v0, v2, Lp5/y;->c:Lv4/s;

    .line 168
    .line 169
    sget v1, Lp4/c0;->a:I

    .line 170
    .line 171
    iget-object v0, v0, Lv4/s;->a:Lv4/v;

    .line 172
    .line 173
    iget-object v0, v0, Lv4/v;->s:Lw4/d;

    .line 174
    .line 175
    invoke-virtual {v0}, Lw4/d;->Z()Lw4/a;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    new-instance v2, Lw4/b;

    .line 180
    .line 181
    const/16 v3, 0x8

    .line 182
    .line 183
    invoke-direct {v2, v3}, Lw4/b;-><init>(I)V

    .line 184
    .line 185
    .line 186
    const/16 v3, 0x3f8

    .line 187
    .line 188
    invoke-virtual {v0, v1, v3, v2}, Lw4/d;->a0(Lw4/a;ILp4/k;)V

    .line 189
    .line 190
    .line 191
    return-void

    .line 192
    nop

    .line 193
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
