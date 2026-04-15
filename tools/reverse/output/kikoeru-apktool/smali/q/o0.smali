.class public final Lq/o0;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/k;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lq/p0;


# direct methods
.method public synthetic constructor <init>(Lq/p0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lq/o0;->b:I

    .line 2
    .line 3
    iput-object p1, p0, Lq/o0;->c:Lq/p0;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    .line 7
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
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lq/o0;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lr/k1;

    .line 7
    .line 8
    sget-object v0, Lq/f0;->a:Lq/f0;

    .line 9
    .line 10
    sget-object v1, Lq/f0;->b:Lq/f0;

    .line 11
    .line 12
    invoke-interface {p1, v0, v1}, Lr/k1;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lq/o0;->c:Lq/p0;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    iget-object p1, v2, Lq/p0;->s:Lq/q0;

    .line 21
    .line 22
    iget-object p1, p1, Lq/q0;->a:Lq/y1;

    .line 23
    .line 24
    iget-object p1, p1, Lq/y1;->b:Lq/w1;

    .line 25
    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    iget-object p1, p1, Lq/w1;->b:Lr/u1;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    sget-object p1, Lq/l0;->c:Lr/z0;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    sget-object v0, Lq/f0;->c:Lq/f0;

    .line 35
    .line 36
    invoke-interface {p1, v1, v0}, Lr/k1;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-eqz p1, :cond_3

    .line 41
    .line 42
    iget-object p1, v2, Lq/p0;->t:Lq/r0;

    .line 43
    .line 44
    iget-object p1, p1, Lq/r0;->a:Lq/y1;

    .line 45
    .line 46
    iget-object p1, p1, Lq/y1;->b:Lq/w1;

    .line 47
    .line 48
    if-eqz p1, :cond_2

    .line 49
    .line 50
    iget-object p1, p1, Lq/w1;->b:Lr/u1;

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    sget-object p1, Lq/l0;->c:Lr/z0;

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_3
    sget-object p1, Lq/l0;->c:Lr/z0;

    .line 57
    .line 58
    :goto_0
    return-object p1

    .line 59
    :pswitch_0
    check-cast p1, Lr/k1;

    .line 60
    .line 61
    sget-object v0, Lq/f0;->a:Lq/f0;

    .line 62
    .line 63
    sget-object v1, Lq/f0;->b:Lq/f0;

    .line 64
    .line 65
    invoke-interface {p1, v0, v1}, Lr/k1;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    const/4 v2, 0x0

    .line 70
    iget-object v3, p0, Lq/o0;->c:Lq/p0;

    .line 71
    .line 72
    if-eqz v0, :cond_4

    .line 73
    .line 74
    iget-object p1, v3, Lq/p0;->s:Lq/q0;

    .line 75
    .line 76
    iget-object p1, p1, Lq/q0;->a:Lq/y1;

    .line 77
    .line 78
    iget-object p1, p1, Lq/y1;->c:Lq/z;

    .line 79
    .line 80
    if-eqz p1, :cond_6

    .line 81
    .line 82
    iget-object v2, p1, Lq/z;->c:Lr/x;

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_4
    sget-object v0, Lq/f0;->c:Lq/f0;

    .line 86
    .line 87
    invoke-interface {p1, v1, v0}, Lr/k1;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    if-eqz p1, :cond_5

    .line 92
    .line 93
    iget-object p1, v3, Lq/p0;->t:Lq/r0;

    .line 94
    .line 95
    iget-object p1, p1, Lq/r0;->a:Lq/y1;

    .line 96
    .line 97
    iget-object p1, p1, Lq/y1;->c:Lq/z;

    .line 98
    .line 99
    if-eqz p1, :cond_6

    .line 100
    .line 101
    iget-object v2, p1, Lq/z;->c:Lr/x;

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_5
    sget-object v2, Lq/l0;->d:Lr/z0;

    .line 105
    .line 106
    :cond_6
    :goto_1
    if-nez v2, :cond_7

    .line 107
    .line 108
    sget-object v2, Lq/l0;->d:Lr/z0;

    .line 109
    .line 110
    :cond_7
    return-object v2

    .line 111
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
