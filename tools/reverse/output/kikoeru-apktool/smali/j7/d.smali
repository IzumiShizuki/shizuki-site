.class public abstract Lj7/d;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final a:Li7/c0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Li7/a0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Li7/b0;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    new-instance v1, Li7/c0;

    .line 8
    .line 9
    sget-object v2, Li7/z;->b:Li7/z;

    .line 10
    .line 11
    invoke-direct {v1, v2, v0, v0}, Li7/c0;-><init>(Li7/b0;Li7/b0;Li7/b0;)V

    .line 12
    .line 13
    .line 14
    sput-object v1, Lj7/d;->a:Li7/c0;

    .line 15
    .line 16
    return-void
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
.end method

.method public static final a(Llf/f;Lx0/o;)Lj7/b;
    .locals 6

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const v0, 0x172138fe

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, v0}, Lx0/o;->X(I)V

    .line 10
    .line 11
    .line 12
    const v0, 0x3e5fc273

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, v0}, Lx0/o;->X(I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, p0}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    invoke-virtual {p1}, Lx0/o;->K()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    sget-object v2, Lx0/k;->a:Lx0/r0;

    .line 27
    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    if-ne v1, v2, :cond_1

    .line 31
    .line 32
    :cond_0
    new-instance v1, Lj7/b;

    .line 33
    .line 34
    invoke-direct {v1, p0}, Lj7/b;-><init>(Llf/f;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, v1}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    check-cast v1, Lj7/b;

    .line 41
    .line 42
    const/4 p0, 0x0

    .line 43
    invoke-virtual {p1, p0}, Lx0/o;->p(Z)V

    .line 44
    .line 45
    .line 46
    const v0, 0x3e5fc2c1

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, v0}, Lx0/o;->X(I)V

    .line 50
    .line 51
    .line 52
    sget-object v0, Lyb/i;->a:Lyb/i;

    .line 53
    .line 54
    invoke-virtual {p1, v0}, Lx0/o;->h(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    invoke-virtual {p1, v1}, Lx0/o;->h(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    or-int/2addr v3, v4

    .line 63
    invoke-virtual {p1}, Lx0/o;->K()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    const/4 v5, 0x0

    .line 68
    if-nez v3, :cond_2

    .line 69
    .line 70
    if-ne v4, v2, :cond_3

    .line 71
    .line 72
    :cond_2
    new-instance v4, Lj7/c;

    .line 73
    .line 74
    const/4 v3, 0x1

    .line 75
    invoke-direct {v4, v1, v5, v3}, Lj7/c;-><init>(Lj7/b;Lyb/c;I)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1, v4}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    :cond_3
    check-cast v4, Lic/n;

    .line 82
    .line 83
    invoke-virtual {p1, p0}, Lx0/o;->p(Z)V

    .line 84
    .line 85
    .line 86
    invoke-static {v4, v1, p1}, Lx0/v;->e(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 87
    .line 88
    .line 89
    const v3, 0x3e5fc3ce

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1, v3}, Lx0/o;->X(I)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1, v0}, Lx0/o;->h(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    invoke-virtual {p1, v1}, Lx0/o;->h(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    or-int/2addr v0, v3

    .line 104
    invoke-virtual {p1}, Lx0/o;->K()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    if-nez v0, :cond_4

    .line 109
    .line 110
    if-ne v3, v2, :cond_5

    .line 111
    .line 112
    :cond_4
    new-instance v3, Lj7/c;

    .line 113
    .line 114
    const/4 v0, 0x3

    .line 115
    invoke-direct {v3, v1, v5, v0}, Lj7/c;-><init>(Lj7/b;Lyb/c;I)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1, v3}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    :cond_5
    check-cast v3, Lic/n;

    .line 122
    .line 123
    invoke-virtual {p1, p0}, Lx0/o;->p(Z)V

    .line 124
    .line 125
    .line 126
    invoke-static {v3, v1, p1}, Lx0/v;->e(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p1, p0}, Lx0/o;->p(Z)V

    .line 130
    .line 131
    .line 132
    return-object v1
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
.end method
