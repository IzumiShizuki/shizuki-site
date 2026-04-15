.class public final Ll0/x0;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/k;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lf3/c;

.field public final synthetic d:Lx0/w0;


# direct methods
.method public synthetic constructor <init>(Lf3/c;Lx0/w0;I)V
    .locals 0

    .line 1
    iput p3, p0, Ll0/x0;->b:I

    .line 2
    .line 3
    iput-object p1, p0, Ll0/x0;->c:Lf3/c;

    .line 4
    .line 5
    iput-object p2, p0, Ll0/x0;->d:Lx0/w0;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
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
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Ll0/x0;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lic/a;

    .line 7
    .line 8
    new-instance v0, Ll0/w0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1, p1}, Ll0/w0;-><init>(ILic/a;)V

    .line 12
    .line 13
    .line 14
    new-instance p1, Ll0/x0;

    .line 15
    .line 16
    iget-object v1, p0, Ll0/x0;->d:Lx0/w0;

    .line 17
    .line 18
    const/4 v2, 0x2

    .line 19
    iget-object v3, p0, Ll0/x0;->c:Lf3/c;

    .line 20
    .line 21
    invoke-direct {p1, v3, v1, v2}, Ll0/x0;-><init>(Lf3/c;Lx0/w0;I)V

    .line 22
    .line 23
    .line 24
    invoke-static {}, Ls/u0;->a()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 31
    .line 32
    const/16 v2, 0x1c

    .line 33
    .line 34
    if-ne v1, v2, :cond_0

    .line 35
    .line 36
    sget-object v1, Ls/g1;->b:Ls/g1;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    sget-object v1, Ls/g1;->c:Ls/g1;

    .line 40
    .line 41
    :goto_0
    invoke-static {v0, p1, v1}, Ls/u0;->b(Lic/k;Lic/k;Ls/e1;)Lj1/q;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    return-object p1

    .line 46
    :cond_1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 47
    .line 48
    const-string v0, "Magnifier is only supported on API level 28 and higher."

    .line 49
    .line 50
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    :pswitch_0
    check-cast p1, Lf3/h;

    .line 55
    .line 56
    iget-wide v0, p1, Lf3/h;->a:J

    .line 57
    .line 58
    invoke-static {v0, v1}, Lf3/h;->b(J)F

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    iget-object v2, p0, Ll0/x0;->c:Lf3/c;

    .line 63
    .line 64
    invoke-interface {v2, p1}, Lf3/c;->a0(F)I

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    invoke-static {v0, v1}, Lf3/h;->a(J)F

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    invoke-interface {v2, v0}, Lf3/c;->a0(F)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    int-to-long v1, p1

    .line 77
    const/16 p1, 0x20

    .line 78
    .line 79
    shl-long/2addr v1, p1

    .line 80
    int-to-long v3, v0

    .line 81
    const-wide v5, 0xffffffffL

    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    and-long/2addr v3, v5

    .line 87
    or-long/2addr v1, v3

    .line 88
    new-instance p1, Lf3/l;

    .line 89
    .line 90
    invoke-direct {p1, v1, v2}, Lf3/l;-><init>(J)V

    .line 91
    .line 92
    .line 93
    iget-object v0, p0, Ll0/x0;->d:Lx0/w0;

    .line 94
    .line 95
    invoke-interface {v0, p1}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 99
    .line 100
    return-object p1

    .line 101
    :pswitch_1
    check-cast p1, Lic/a;

    .line 102
    .line 103
    new-instance v0, Ll0/w0;

    .line 104
    .line 105
    const/4 v1, 0x0

    .line 106
    invoke-direct {v0, v1, p1}, Ll0/w0;-><init>(ILic/a;)V

    .line 107
    .line 108
    .line 109
    new-instance p1, Ll0/x0;

    .line 110
    .line 111
    iget-object v1, p0, Ll0/x0;->d:Lx0/w0;

    .line 112
    .line 113
    const/4 v2, 0x0

    .line 114
    iget-object v3, p0, Ll0/x0;->c:Lf3/c;

    .line 115
    .line 116
    invoke-direct {p1, v3, v1, v2}, Ll0/x0;-><init>(Lf3/c;Lx0/w0;I)V

    .line 117
    .line 118
    .line 119
    invoke-static {}, Ls/u0;->a()Z

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    if-eqz v1, :cond_3

    .line 124
    .line 125
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 126
    .line 127
    const/16 v2, 0x1c

    .line 128
    .line 129
    if-ne v1, v2, :cond_2

    .line 130
    .line 131
    sget-object v1, Ls/g1;->b:Ls/g1;

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_2
    sget-object v1, Ls/g1;->c:Ls/g1;

    .line 135
    .line 136
    :goto_1
    invoke-static {v0, p1, v1}, Ls/u0;->b(Lic/k;Lic/k;Ls/e1;)Lj1/q;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    return-object p1

    .line 141
    :cond_3
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 142
    .line 143
    const-string v0, "Magnifier is only supported on API level 28 and higher."

    .line 144
    .line 145
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    throw p1

    .line 149
    :pswitch_2
    check-cast p1, Lf3/h;

    .line 150
    .line 151
    iget-wide v0, p1, Lf3/h;->a:J

    .line 152
    .line 153
    invoke-static {v0, v1}, Lf3/h;->b(J)F

    .line 154
    .line 155
    .line 156
    move-result p1

    .line 157
    iget-object v2, p0, Ll0/x0;->c:Lf3/c;

    .line 158
    .line 159
    invoke-interface {v2, p1}, Lf3/c;->a0(F)I

    .line 160
    .line 161
    .line 162
    move-result p1

    .line 163
    invoke-static {v0, v1}, Lf3/h;->a(J)F

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    invoke-interface {v2, v0}, Lf3/c;->a0(F)I

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    int-to-long v1, p1

    .line 172
    const/16 p1, 0x20

    .line 173
    .line 174
    shl-long/2addr v1, p1

    .line 175
    int-to-long v3, v0

    .line 176
    const-wide v5, 0xffffffffL

    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    and-long/2addr v3, v5

    .line 182
    or-long/2addr v1, v3

    .line 183
    new-instance p1, Lf3/l;

    .line 184
    .line 185
    invoke-direct {p1, v1, v2}, Lf3/l;-><init>(J)V

    .line 186
    .line 187
    .line 188
    iget-object v0, p0, Ll0/x0;->d:Lx0/w0;

    .line 189
    .line 190
    invoke-interface {v0, p1}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 194
    .line 195
    return-object p1

    .line 196
    nop

    .line 197
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
