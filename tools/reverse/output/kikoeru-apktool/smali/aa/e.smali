.class public final synthetic Laa/e;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/k;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lhf/y;


# direct methods
.method public synthetic constructor <init>(Lhf/y;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput v0, p0, Laa/e;->a:I

    sget-object v0, Lj9/u;->a:Lj9/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Laa/e;->b:Lhf/y;

    return-void
.end method

.method public synthetic constructor <init>(Lhf/y;I)V
    .locals 0

    .line 2
    iput p2, p0, Laa/e;->a:I

    iput-object p1, p0, Laa/e;->b:Lhf/y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Laa/e;->a:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const-string v2, "it"

    .line 5
    .line 6
    sget-object v3, Lub/a0;->a:Lub/a0;

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    iget-object v5, p0, Laa/e;->b:Lhf/y;

    .line 10
    .line 11
    const/4 v6, 0x2

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p1, Lka/g;

    .line 16
    .line 17
    invoke-static {p1, v2}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    sget-object p1, Lhf/l0;->a:Lpf/e;

    .line 21
    .line 22
    sget-object p1, Lpf/d;->c:Lpf/d;

    .line 23
    .line 24
    new-instance v0, La0/c0;

    .line 25
    .line 26
    const/16 v1, 0x10

    .line 27
    .line 28
    invoke-direct {v0, v6, v4, v1}, La0/c0;-><init>(ILyb/c;I)V

    .line 29
    .line 30
    .line 31
    invoke-static {v5, p1, v4, v0, v6}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    .line 32
    .line 33
    .line 34
    return-object v3

    .line 35
    :pswitch_0
    check-cast p1, Ljava/util/List;

    .line 36
    .line 37
    invoke-static {p1, v2}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    new-instance v0, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    const-string v2, "\u5f00\u59cb\u5bfc\u5165\u6570\u636e\u5e93\u6587\u4ef6 db:"

    .line 43
    .line 44
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    const/4 v11, 0x0

    .line 55
    const/16 v12, 0x1ff

    .line 56
    .line 57
    const-wide/16 v8, 0x0

    .line 58
    .line 59
    const/4 v10, 0x0

    .line 60
    invoke-static/range {v7 .. v12}, Lka/n;->c(Ljava/io/Serializable;JLic/k;Ljava/lang/String;I)V

    .line 61
    .line 62
    .line 63
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eqz v0, :cond_0

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_0
    sget-object v0, Lpf/d;->c:Lpf/d;

    .line 71
    .line 72
    new-instance v2, Ld9/q;

    .line 73
    .line 74
    invoke-direct {v2, p1, v4, v1}, Ld9/q;-><init>(Ljava/util/List;Lyb/c;I)V

    .line 75
    .line 76
    .line 77
    invoke-static {v5, v0, v4, v2, v6}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    .line 78
    .line 79
    .line 80
    :goto_0
    return-object v3

    .line 81
    :pswitch_1
    check-cast p1, Ljava/util/List;

    .line 82
    .line 83
    invoke-static {p1, v2}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    new-instance v0, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    const-string v1, "\u5f00\u59cb\u5bfc\u5165\u914d\u7f6e\u6587\u4ef6:"

    .line 89
    .line 90
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v7

    .line 100
    const/4 v11, 0x0

    .line 101
    const/16 v12, 0x1ff

    .line 102
    .line 103
    const-wide/16 v8, 0x0

    .line 104
    .line 105
    const/4 v10, 0x0

    .line 106
    invoke-static/range {v7 .. v12}, Lka/n;->c(Ljava/io/Serializable;JLic/k;Ljava/lang/String;I)V

    .line 107
    .line 108
    .line 109
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-eqz v0, :cond_1

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_1
    sget-object v0, Lpf/d;->c:Lpf/d;

    .line 117
    .line 118
    new-instance v1, Ld9/q;

    .line 119
    .line 120
    invoke-direct {v1, p1, v4, v6}, Ld9/q;-><init>(Ljava/util/List;Lyb/c;I)V

    .line 121
    .line 122
    .line 123
    invoke-static {v5, v0, v4, v1, v6}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    .line 124
    .line 125
    .line 126
    :goto_1
    return-object v3

    .line 127
    :pswitch_2
    check-cast p1, Lka/g;

    .line 128
    .line 129
    invoke-static {p1, v2}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    sget-object p1, Lhf/l0;->a:Lpf/e;

    .line 133
    .line 134
    sget-object p1, Lpf/d;->c:Lpf/d;

    .line 135
    .line 136
    new-instance v0, La0/c0;

    .line 137
    .line 138
    const/16 v1, 0xd

    .line 139
    .line 140
    invoke-direct {v0, v6, v4, v1}, La0/c0;-><init>(ILyb/c;I)V

    .line 141
    .line 142
    .line 143
    invoke-static {v5, p1, v4, v0, v6}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    .line 144
    .line 145
    .line 146
    return-object v3

    .line 147
    :pswitch_3
    check-cast p1, Lka/g;

    .line 148
    .line 149
    invoke-static {p1, v2}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    sget-object p1, Lhf/l0;->a:Lpf/e;

    .line 153
    .line 154
    sget-object p1, Lpf/d;->c:Lpf/d;

    .line 155
    .line 156
    new-instance v0, La0/c0;

    .line 157
    .line 158
    const/16 v1, 0xc

    .line 159
    .line 160
    invoke-direct {v0, v6, v4, v1}, La0/c0;-><init>(ILyb/c;I)V

    .line 161
    .line 162
    .line 163
    invoke-static {v5, p1, v4, v0, v6}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    .line 164
    .line 165
    .line 166
    return-object v3

    .line 167
    :pswitch_4
    sget-object v0, Lj9/u;->a:Lj9/u;

    .line 168
    .line 169
    check-cast p1, La0/j;

    .line 170
    .line 171
    const-string v0, "$this$LazyColumn"

    .line 172
    .line 173
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    sget-object v0, Lj9/u;->c:Lx0/e1;

    .line 177
    .line 178
    invoke-virtual {v0}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    check-cast v0, Ljava/util/List;

    .line 183
    .line 184
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 185
    .line 186
    .line 187
    move-result v2

    .line 188
    new-instance v7, Lba/v;

    .line 189
    .line 190
    invoke-direct {v7, v6, v0}, Lba/v;-><init>(ILjava/util/List;)V

    .line 191
    .line 192
    .line 193
    new-instance v6, Lfa/s;

    .line 194
    .line 195
    invoke-direct {v6, v0, v5}, Lfa/s;-><init>(Ljava/util/List;Lhf/y;)V

    .line 196
    .line 197
    .line 198
    new-instance v0, Lf1/f;

    .line 199
    .line 200
    const v5, -0x410876af

    .line 201
    .line 202
    .line 203
    invoke-direct {v0, v6, v5, v1}, Lf1/f;-><init>(Ljava/lang/Object;IZ)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {p1, v2, v4, v7, v0}, La0/j;->m(ILic/k;Lic/k;Lf1/f;)V

    .line 207
    .line 208
    .line 209
    return-object v3

    .line 210
    :pswitch_5
    check-cast p1, Lka/g;

    .line 211
    .line 212
    invoke-static {p1, v2}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    sget-object p1, Lhf/l0;->a:Lpf/e;

    .line 216
    .line 217
    sget-object p1, Lpf/d;->c:Lpf/d;

    .line 218
    .line 219
    new-instance v0, La0/c0;

    .line 220
    .line 221
    const/4 v1, 0x7

    .line 222
    invoke-direct {v0, v6, v4, v1}, La0/c0;-><init>(ILyb/c;I)V

    .line 223
    .line 224
    .line 225
    invoke-static {v5, p1, v4, v0, v6}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    .line 226
    .line 227
    .line 228
    return-object v3

    .line 229
    :pswitch_6
    check-cast p1, Landroid/net/Uri;

    .line 230
    .line 231
    if-nez p1, :cond_2

    .line 232
    .line 233
    goto :goto_2

    .line 234
    :cond_2
    sget-object v0, Lhf/l0;->a:Lpf/e;

    .line 235
    .line 236
    sget-object v0, Lpf/d;->c:Lpf/d;

    .line 237
    .line 238
    new-instance v1, La9/k;

    .line 239
    .line 240
    invoke-direct {v1, v6, p1, v4}, La9/k;-><init>(ILjava/lang/Object;Lyb/c;)V

    .line 241
    .line 242
    .line 243
    invoke-static {v5, v0, v4, v1, v6}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    .line 244
    .line 245
    .line 246
    :goto_2
    return-object v3

    .line 247
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
