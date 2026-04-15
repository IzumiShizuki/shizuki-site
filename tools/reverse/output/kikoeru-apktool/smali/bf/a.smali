.class public final Lbf/a;
.super Lbf/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/io/Serializable;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/io/Serializable;I)V
    .locals 0

    .line 1
    iput p3, p0, Lbf/a;->b:I

    iput-object p1, p0, Lbf/a;->c:Ljava/lang/Object;

    iput-object p2, p0, Lbf/a;->d:Ljava/io/Serializable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljc/y;Lic/k;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lbf/a;->b:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lbf/a;->d:Ljava/io/Serializable;

    iput-object p2, p0, Lbf/a;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, Lbf/a;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    check-cast p1, Lyc/c;

    .line 8
    .line 9
    const-string v0, "current"

    .line 10
    .line 11
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lbf/a;->d:Ljava/io/Serializable;

    .line 15
    .line 16
    check-cast v0, Ljc/y;

    .line 17
    .line 18
    iget-object v1, v0, Ljc/y;->a:Ljava/lang/Object;

    .line 19
    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    iget-object v1, p0, Lbf/a;->c:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, Lic/k;

    .line 25
    .line 26
    invoke-interface {v1, p1}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Ljava/lang/Boolean;

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_0

    .line 37
    .line 38
    iput-object p1, v0, Ljc/y;->a:Ljava/lang/Object;

    .line 39
    .line 40
    :cond_0
    return-void

    .line 41
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
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
.end method

.method public final c(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    iget v0, p0, Lbf/a;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lyc/e;

    .line 7
    .line 8
    iget-object v0, p0, Lbf/a;->d:Ljava/io/Serializable;

    .line 9
    .line 10
    check-cast v0, Ljc/y;

    .line 11
    .line 12
    const-string v1, "javaClassDescriptor"

    .line 13
    .line 14
    invoke-static {p1, v1}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lbf/a;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {p1, v1}, Lua/j;->y(Lyc/e;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    sget-object v1, Lxc/o;->b:Ljava/util/LinkedHashSet;

    .line 26
    .line 27
    invoke-interface {v1, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    sget-object p1, Lxc/k;->a:Lxc/k;

    .line 34
    .line 35
    iput-object p1, v0, Ljc/y;->a:Ljava/lang/Object;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    sget-object v1, Lxc/o;->d:Ljava/util/LinkedHashSet;

    .line 39
    .line 40
    invoke-interface {v1, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    sget-object p1, Lxc/k;->b:Lxc/k;

    .line 47
    .line 48
    iput-object p1, v0, Ljc/y;->a:Ljava/lang/Object;

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    sget-object v1, Lxc/o;->c:Ljava/util/LinkedHashSet;

    .line 52
    .line 53
    invoke-interface {v1, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_2

    .line 58
    .line 59
    sget-object p1, Lxc/k;->c:Lxc/k;

    .line 60
    .line 61
    iput-object p1, v0, Ljc/y;->a:Ljava/lang/Object;

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    sget-object v1, Lxc/o;->a:Ljava/util/LinkedHashSet;

    .line 65
    .line 66
    invoke-interface {v1, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    if-eqz p1, :cond_3

    .line 71
    .line 72
    sget-object p1, Lxc/k;->e:Lxc/k;

    .line 73
    .line 74
    iput-object p1, v0, Ljc/y;->a:Ljava/lang/Object;

    .line 75
    .line 76
    :cond_3
    :goto_0
    iget-object p1, v0, Ljc/y;->a:Ljava/lang/Object;

    .line 77
    .line 78
    if-nez p1, :cond_4

    .line 79
    .line 80
    const/4 p1, 0x1

    .line 81
    goto :goto_1

    .line 82
    :cond_4
    const/4 p1, 0x0

    .line 83
    :goto_1
    return p1

    .line 84
    :pswitch_0
    check-cast p1, Lyc/c;

    .line 85
    .line 86
    const-string v0, "current"

    .line 87
    .line 88
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    iget-object p1, p0, Lbf/a;->d:Ljava/io/Serializable;

    .line 92
    .line 93
    check-cast p1, Ljc/y;

    .line 94
    .line 95
    iget-object p1, p1, Ljc/y;->a:Ljava/lang/Object;

    .line 96
    .line 97
    if-nez p1, :cond_5

    .line 98
    .line 99
    const/4 p1, 0x1

    .line 100
    goto :goto_2

    .line 101
    :cond_5
    const/4 p1, 0x0

    .line 102
    :goto_2
    return p1

    .line 103
    :pswitch_1
    iget-object v0, p0, Lbf/a;->d:Ljava/io/Serializable;

    .line 104
    .line 105
    check-cast v0, [Z

    .line 106
    .line 107
    iget-object v1, p0, Lbf/a;->c:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v1, Lic/k;

    .line 110
    .line 111
    invoke-interface {v1, p1}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    check-cast p1, Ljava/lang/Boolean;

    .line 116
    .line 117
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    const/4 v1, 0x1

    .line 122
    const/4 v2, 0x0

    .line 123
    if-eqz p1, :cond_6

    .line 124
    .line 125
    aput-boolean v1, v0, v2

    .line 126
    .line 127
    :cond_6
    aget-boolean p1, v0, v2

    .line 128
    .line 129
    xor-int/2addr p1, v1

    .line 130
    return p1

    .line 131
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public final j()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lbf/a;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lbf/a;->d:Ljava/io/Serializable;

    .line 7
    .line 8
    check-cast v0, Ljc/y;

    .line 9
    .line 10
    iget-object v0, v0, Ljc/y;->a:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lxc/k;

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    sget-object v0, Lxc/k;->d:Lxc/k;

    .line 17
    .line 18
    :cond_0
    return-object v0

    .line 19
    :pswitch_0
    iget-object v0, p0, Lbf/a;->d:Ljava/io/Serializable;

    .line 20
    .line 21
    check-cast v0, Ljc/y;

    .line 22
    .line 23
    iget-object v0, v0, Ljc/y;->a:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Lyc/c;

    .line 26
    .line 27
    return-object v0

    .line 28
    :pswitch_1
    iget-object v0, p0, Lbf/a;->d:Ljava/io/Serializable;

    .line 29
    .line 30
    check-cast v0, [Z

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    aget-boolean v0, v0, v1

    .line 34
    .line 35
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    return-object v0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method
